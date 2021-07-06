package com.CPR.redHome.service.admin.order;

import com.CPR.redHome.dto.cart.OrderDto;
import com.CPR.redHome.dto.product.ProductDto;

import java.util.List;

public interface OrderAdminService {

    // 전체 주문 조회
    List<OrderDto> SelectAllOrders();
}
