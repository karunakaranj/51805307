package com.ing.PersonalLoan.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.ing.PersonalLoan.Model.Customer;
import com.ing.PersonalLoan.Service.CustomerServiceImpl;
@RestController
public class CustomerController {

	@Autowired
	CustomerServiceImpl custService;
	@PostMapping("/getCust")
	public String getCustDetails(@RequestBody Customer customer) {
		return custService.getCustomerDetails(customer);
	}
}
