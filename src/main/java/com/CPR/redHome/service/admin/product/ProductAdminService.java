package com.CPR.redHome.service.admin.product;

import com.CPR.redHome.dto.product.ProductDto;
import org.json.simple.JSONObject;

import java.util.List;

public interface ProductAdminService {

    // 전체 상품 조회
    List<ProductDto> SelectAllProducts();

    //@@@@@ 상품 통계 @@@@@
    // 가격대 별 상품 수
    JSONObject selectProductByPrice();

    // 카테고리 별 상품 수
    JSONObject selectProductByCategory();

    // 테마 별 상품 수
    JSONObject selectProductByTheme();
}
