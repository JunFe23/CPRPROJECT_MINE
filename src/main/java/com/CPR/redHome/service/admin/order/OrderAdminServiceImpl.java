package com.CPR.redHome.service.admin.order;

import com.CPR.redHome.dto.cart.OrderDto;
import com.CPR.redHome.mapper.admin.order.OrderAdminMapper;
import com.CPR.redHome.service.admin.util.MakeJsonForChartServcie;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@Service
@RequiredArgsConstructor
public class OrderAdminServiceImpl implements OrderAdminService{

    private final OrderAdminMapper orderAdminMapper;
    private final MakeJsonForChartServcie makeJsonForChartServcie;

    @Override
    public List<OrderDto> SelectAllOrders() {
        return null;
    }
}
