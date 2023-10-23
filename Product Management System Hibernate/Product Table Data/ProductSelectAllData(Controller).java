package com.product.Controller;

import com.product.Dto.ProductDto;
import com.product.service.ProductService;

public class ProductSelectAllDataController {
	public static void main(String[] args) {
		ProductService productService=new ProductService();
	ProductDto productDto = null;
	ProductDto p=	productService.selectAllDataById(productDto);
	if(p!=null) {
	System.out.println(p);
	}
	}

}
/*
Output=
1
Watch
999.0
1
=========================================================
3
Jeans
999.0
7
=========================================================
4
Bag
799.0
1
=========================================================
*/