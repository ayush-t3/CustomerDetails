package com.learn.multipleParaSp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.learn.multipleParaSp.entities.CustomerDetails;

@Repository
public class CustomerDao {
	@Autowired
	private EntityManager eManager;
	
	@SuppressWarnings("unchecked")
	public List<CustomerDetails> getCustomerDetails(String CustGuId) {
		StoredProcedureQuery query = eManager.createStoredProcedureQuery("GetCustomerDetail", "CustomerDetails")
				.registerStoredProcedureParameter("CustGuId", String.class, ParameterMode.IN)
				.setParameter("CustGuId", CustGuId);
		query.execute();
		return query.getResultList();
	}
}
