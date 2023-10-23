package com.product.Controller;

import com.product.service.ProductService;

public class ProductDeleteController {
	public static void main(String[] args) {
		ProductService productService=new ProductService();
		
		boolean res=	productService.deleteProductById(2);
		System.out.println(res);
	
	}

}
/*
Output=
true

mysql delete product data id=2

1	Watch	999	1
3	Shoes	999	4
4	Bag	799	1
*/		