package com.ing.PersonalLoan.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ing.PersonalLoan.Model.Customer;
public interface CustomerRepository extends JpaRepository<Customer, Long>{
	public Customer findByUserName(Long long1);
}
