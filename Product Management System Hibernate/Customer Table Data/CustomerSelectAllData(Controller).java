package com.product.Controller;

import com.product.Dto.CustomerDto;
import com.product.service.CustomerService;

public class CustomerSelectAllDataController {
	public static void main(String[] args) {
		CustomerService customerService=new CustomerService();
	CustomerDto customerDto = null;
	CustomerDto c=	customerService.selectAllDataById(customerDto);
	if(c!=null) {
	System.out.println(c);
	}
	}

}
/*
Output=
1
Ram
ram@mail.com
=========================================================
2
Sachin
sachin@mail.com
=========================================================
3
Rohit
rohit@mail.com
=========================================================
5
Dhawan
dhawan@mail.com
=========================================================

*/