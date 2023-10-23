package com.product.Controller;

import com.product.Dto.CustomerDto;
import com.product.service.CustomerService;


public class CustomerInsertController{
	public static void main(String[] args) {
		CustomerDto customerDto=new CustomerDto();
		customerDto.setId(5);
		customerDto.setName("Dhoni");
		customerDto.setEmail("dhoni@mail.com");
		
		CustomerService customerService=new CustomerService();
		CustomerDto c=customerService.saveCustomer(customerDto);
		if(c!=null) {
		
		System.out.println(c.getId() + " Saved Successfully");
		}
	}	
}
/*
5 Saved Successfully
mysql customer table data inserted

id  name    email   
1	Ram		ram@mail.com
2	Sachin	sachin@mail.com
3	Rohit	rohit@mail.com
4	Virat	virat@mail.com
5	Dhoni	dhoni@mail.com
*/