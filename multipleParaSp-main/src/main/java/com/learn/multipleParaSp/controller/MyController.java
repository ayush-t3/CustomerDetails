package com.learn.multipleParaSp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.learn.multipleParaSp.dao.CustomerDao;
import com.learn.multipleParaSp.entities.CustGuId;
import com.learn.multipleParaSp.entities.CustomerDetails;
import com.learn.multipleParaSp.entities.Response;
@RestController
public class MyController {
	@Autowired
	private CustomerDao customerDao;
	
	// get offers
	
	@PostMapping("/customer")
	public Response getCustomerDetails(@RequestBody CustGuId custGuId){
		List<CustomerDetails> customerDetails = customerDao.getCustomerDetails(custGuId.getCustGuId());
		System.out.println(customerDetails);
		Response response = new Response(1, 0, "I", "Success", customerDetails.get(0));
		System.out.println(response.toString());
		return response;
	}

}
