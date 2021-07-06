package com.CPR.redHome.mapper.admin.order;

import com.CPR.redHome.dto.product.ProductDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderAdminMapper {

    // 전체 주문 조회
    List<ProductDto> selectAllOrders();
}
