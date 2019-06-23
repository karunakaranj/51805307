package com.ing.PersonalLoan.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "loan_info")
public class Loan {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
private Long loanAccNo;
private String loanStatus;
private Double loanAmount;
private Long loanApprovedMngrId;

@ManyToOne
Customer customer;
public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
public Loan() {
	super();
	// TODO Auto-generated constructor stub
}
public Loan(Long loanAccNo, String loanStatus, Double loanAmount, Long loanApprovedMngrId) {
	super();
	this.loanAccNo = loanAccNo;
	this.loanStatus = loanStatus;
	this.loanAmount = loanAmount;
	this.loanApprovedMngrId = loanApprovedMngrId;
}
public Long getLoanAccNo() {
	return loanAccNo;
}
public void setLoanAccNo(Long loanAccNo) {
	this.loanAccNo = loanAccNo;
}
public String getLoanStatus() {
	return loanStatus;
}
public void setLoanStatus(String loanStatus) {
	this.loanStatus = loanStatus;
}
public Double getLoanAmount() {
	return loanAmount;
}
public void setLoanAmount(Double loanAmount) {
	this.loanAmount = loanAmount;
}
public Long getLoanApprovedMngrId() {
	return loanApprovedMngrId;
}
public void setLoanApprovedMngrId(Long loanApprovedMngrId) {
	this.loanApprovedMngrId = loanApprovedMngrId;
}
@Override
public String toString() {
	return "Loan [loanAccNo=" + loanAccNo + ", loanStatus=" + loanStatus + ", loanAmount=" + loanAmount
			+ ", loanApprovedMngrId=" + loanApprovedMngrId + "]";
}


}
