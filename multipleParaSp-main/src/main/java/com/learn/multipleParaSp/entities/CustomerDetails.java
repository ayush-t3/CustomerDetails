package com.learn.multipleParaSp.entities;

import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;

@Entity
@Table
@SqlResultSetMapping(name="CustomerDetails", classes=@ConstructorResult(targetClass = CustomerDetails.class,columns = {@ColumnResult(name = "SocialClientId",type = String.class),
		@ColumnResult(name = "FirstName", type = String.class),
		@ColumnResult(name = "LastName", type = String.class),
		@ColumnResult(name = "EmailId", type = String.class),
		@ColumnResult(name = "Gender", type = String.class),
		@ColumnResult(name = "MobileNo", type = String.class),
		@ColumnResult(name = "City", type = String.class)}))
//@NamedStoredProcedureQueries({@NamedStoredProcedureQuery(name="getCustomerDetail",procedureName = "GetCustomerDetail",parameters = {@StoredProcedureParameter(mode=ParameterMode.IN,name="@CustGuId", type= String.class)})})

public class CustomerDetails {
	@Id
	private String socialClientId;
	private String fName;
	private String lName;
	private String email;
	private String gender;
	private String mobileNo;
	private String city;
	
	public String getSocialClientId() {
		return socialClientId;
	}
	public void setSocialClientId(String socialClientId) {
		this.socialClientId = socialClientId;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public CustomerDetails(String socialClientId, String fName, String lName, String email, String gender, String mobileNo,
			String city) {
		super();
		this.socialClientId = socialClientId;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.gender = gender;
		this.mobileNo = mobileNo;
		this.city = city;
	}
	
	public CustomerDetails() {
		
	}
	
	@Override
	public String toString() {
		return "CustomerDetails [socialClientId=" + socialClientId + ", fName=" + fName + ", lName=" + lName
				+ ", email=" + email + ", gender=" + gender + ", mobileNo=" + mobileNo + ", city=" + city + "]";
	}
	
	
	
	
	

}
