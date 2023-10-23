package com.product.Controller;

import com.product.service.ProductService;

public class ProductSelectOneDataController {
	public static void main(String[] args) {
		ProductService productService =new ProductService();
		productService.selectOneDataById(1);
	}

}
/*
Output=
1
Watch
999.0
1
=========================================================
*/