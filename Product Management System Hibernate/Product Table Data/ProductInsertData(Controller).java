package com.product.Controller;

import com.product.Dto.ProductDto;
import com.product.service.ProductService;

public class ProductInsertController {
	public static void main(String[] args) {
		ProductDto productDto=new ProductDto();
		productDto.setId(4);
		productDto.setName("Bag");
		productDto.setPrice(799);
		productDto.setQuantity(1);
		
		
		ProductService productService=new ProductService();
		ProductDto p=productService.saveProduct(productDto);
		if(p!=null) {
		
		System.out.println(p.getId() + " Saved Successfully");
		}
	}	
}
/*

mysql product table data inserted

id  name    price   quantity
1	Watch	999		1
2   Mobile  10999	1
3	Shoes	999		4
4	Bag		799		1
*/			