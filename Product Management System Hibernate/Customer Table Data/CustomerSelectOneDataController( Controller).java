package com.product.Controller;

import com.product.service.CustomerService;

public class CustomerSelectOneDataController {

	public static void main(String[] args) {
		CustomerService customerService=new CustomerService();
		customerService.selectOneDataById(2);

	}

}
/*
Output=
2
Sachin
sachin@mail.com
=========================================================
*/