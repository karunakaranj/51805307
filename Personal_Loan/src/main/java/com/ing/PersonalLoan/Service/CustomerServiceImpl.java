package com.ing.PersonalLoan.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ing.PersonalLoan.Model.Customer;
import com.ing.PersonalLoan.Repository.CustomerRepository;
@Service
public class CustomerServiceImpl implements CustomerService{
@Autowired
CustomerRepository custRepo;
	@Override
	public String getCustomerDetails(Customer cust) {
		
		if(custRepo.findByUserName(cust.getCustId())==null) {
			 if(custRepo.save(cust)==null)
				 return "Customer not created successfully";
			 else
				 return cust.getCustName()+" successfully Fetched cust details";
			}
		 return cust.getCustName();
		
		
	}

	
}
