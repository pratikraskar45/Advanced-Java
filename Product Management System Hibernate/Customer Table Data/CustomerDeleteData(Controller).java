package com.product.Controller;

import com.product.service.CustomerService;

public class CustomerDeleteController {
	public static void main(String[] args) {
		CustomerService customerService=new CustomerService();
		
		boolean res=	customerService.deleteCustomerById(4);
		System.out.println(res);
	
	}

}
/*
Output=
true

mysql delete product data id=2

id  name    email
1	Ram		ram@mail.com
2	Sachin	sachin@mail.com
3	Rohit	rohit@mail.com
5	Dhoni	dhoni@mail.com
		
*/		