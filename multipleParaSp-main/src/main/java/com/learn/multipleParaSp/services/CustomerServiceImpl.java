//package com.learn.multipleParaSp.services;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.learn.multipleParaSp.dao.CustomerDao;
//import com.learn.multipleParaSp.entities.CustomerDetails;
//import com.learn.multipleParaSp.entities.Response;
//
//@Service
//public class CustomerServiceImpl implements CustomerService {
//	
//	@Autowired
//	private CustomerDao customerDao;
//
//	@Override
//	public Response getCustomerDetails(String CustGuId) {
//		// TODO Auto-generated method stub
//		CustomerDetails customerDetails = customerDao.getCustomerDetails("CustGuId");
//		Response response = new Response(1, 0, "I", "Success",customerDetails);
//		return response;
//	}
//
//}
