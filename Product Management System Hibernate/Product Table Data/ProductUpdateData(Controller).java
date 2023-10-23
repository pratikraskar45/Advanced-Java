package com.product.Controller;

import com.product.service.ProductService;

public class ProductUpdateController {
	public static void main(String[] args) {
		ProductService productService=new ProductService();
	int p=	productService.updateProduct(3, 7, "Jeans");
	System.out.println(p);
	}

}
/*
Output=
1

mysql product data updated

id  name    price   quantity
1	Watch	999		1
3	Jeans	999		7
4	Bag		799		1
			
*/