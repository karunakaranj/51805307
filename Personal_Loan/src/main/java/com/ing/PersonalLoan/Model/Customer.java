package com.ing.PersonalLoan.Model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "custmer_info")
public class Customer {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long custId;
	private String custName;
	private Integer custAge;
	private Long creditScore;
	private Double custSalary;
	private String custType;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(Integer custAge,Double custSalary,Long custId, String custName,Long creditScore, String custType) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custType = custType;
		this.custAge = custAge;
		this.custSalary = custSalary;
		this.creditScore = creditScore;
	}
	public Long getCreditScore() {
		return creditScore;
	}
	public void setCreditScore(Long creditScore) {
		this.creditScore = creditScore;
	}
	public Integer getCustAge() {
		return custAge;
	}
	public void setCustAge(Integer custAge) {
		this.custAge = custAge;
	}
	public Double getCustSalary() {
		return custSalary;
	}
	public void setCustSalary(Double custSalary) {
		this.custSalary = custSalary;
	}
	public Long getCustId() {
		return custId;
	}
	public void setCustId(Long custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustType() {
		return custType;
	}
	public void setCustType(String custType) {
		this.custType = custType;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custAge=" + custAge + ", creditScore="
				+ creditScore + ", custSalary=" + custSalary + ", custType=" + custType + "]";
	}
	
}
