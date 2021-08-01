package com.CPR.redHome.controller.seller;

import com.CPR.redHome.dto.member.MemberDto;
import com.CPR.redHome.dto.seller.ProductRegistDto;
import com.CPR.redHome.service.product.ProductService;
import com.CPR.redHome.service.seller.SellerService;
import com.CPR.redHome.web.argumentresolver.Login;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Log4j2
@Controller
@RequiredArgsConstructor
public class SellerController {

    private final SellerService sellerService;
    private final ProductService productService;

    @GetMapping("/product/regist")
    public String registProduct(@Login MemberDto loginMember, Model model) {

        model.addAttribute("memberId", loginMember.getMemberId());

        return "seller/productRegistration";
    }

    @PostMapping("/product/regist")
    @ResponseStatus(HttpStatus.OK)
    public void submitRegistProduct(@RequestBody List<ProductRegistDto> productRegistDto) {

        sellerService.registProducts(productRegistDto.get(0));
        sellerService.registImage(productRegistDto);

    }

    // 판매자 페이지 이동.
    @GetMapping("/seller/{memberId}")
    public String goSellerPage(@PathVariable int memberId, Model model){

        return "seller/sellerStore";
    }

}
