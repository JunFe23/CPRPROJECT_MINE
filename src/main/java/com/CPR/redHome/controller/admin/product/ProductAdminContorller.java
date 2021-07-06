package com.CPR.redHome.controller.admin.product;

import com.CPR.redHome.dto.product.ProductDto;
import com.CPR.redHome.service.admin.product.ProductAdminService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.websocket.server.PathParam;
import java.util.List;

@Controller
@RequiredArgsConstructor
@Log4j2
public class ProductAdminContorller {

    private final ProductAdminService productAdminService;

    // 상품페이지 조회
    @GetMapping("/admin/product")
    public String adminProduct(Model model){
        List<ProductDto> productDtos = productAdminService.SelectAllProducts();
        model.addAttribute("productDtos", productDtos);
        return "admin/adminProduct";
    }

    // 상품 수정
    @GetMapping("/admin/product/modify")
    public String adminProductModify(){
        return "admin/product/productModify";
    }

    // 상품페이지 통계
    @GetMapping("admin/product/chart")
    public String adminProductChart() {
        return "admin/chart/productChart";
    }


}
