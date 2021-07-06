package com.CPR.redHome.controller.admin.order;

import com.CPR.redHome.service.admin.order.OrderAdminService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
@Log4j2
public class OrderAdminController {

    private final OrderAdminService orderAdminService;

    // 주문 페이지 조회
    @GetMapping("/admin/order")
    public String adminOrder(){
        return "admin/adminOrder";
    }
}
