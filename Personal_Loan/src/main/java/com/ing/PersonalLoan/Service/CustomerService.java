package com.ing.PersonalLoan.Service;

import org.springframework.stereotype.Service;

import com.ing.PersonalLoan.Model.Customer;

@Service
public interface CustomerService {

	public String getCustomerDetails(Customer cust);
	
}
