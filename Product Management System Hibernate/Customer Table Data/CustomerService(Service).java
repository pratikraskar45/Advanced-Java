package com.product.service;

import com.product.Dto.CustomerDto;
import com.productDao.CustomerDao;

public class CustomerService {
	CustomerDao customerDao = new CustomerDao();

	// insert customer table data
	public CustomerDto saveCustomer(CustomerDto customerDto) {
		CustomerDto c = customerDao.saveCustomer(customerDto);
		return c;
	}

	// delete customer table data
	public boolean deleteCustomerById(int id) {
		return customerDao.deleteCustomerById(id);

	}

	// update customer table data
	public int updateCustomer(int id, String email, String name) {
		return customerDao.updateCustomer(id, email, name);
	}

	// get all record of customer table
	public CustomerDto selectAllDataById(CustomerDto customerDto) {
		CustomerDto c = customerDao.selectAllDataById(customerDto);
		return c;
	}

}
