package com.cg.terminsurancecustomer.service;
/*
 * @author - Shahanaz
 */
import java.util.List;

import com.cg.terminsurancecustomer.entity.Customer;
import com.cg.terminsurancecustomer.exception.ResourceNotFoundException;

public interface CustomerService {
	public List<Customer> getAllCustomers();

	public Customer findCustomerById(Integer customerId) throws ResourceNotFoundException;

	public boolean deleteCustomerById(Integer customerId) throws ResourceNotFoundException;

	public Customer saveCustomer(Customer customer);

	public Customer updateCustomer(Integer customerId, Customer customer) throws ResourceNotFoundException;
	// public List<customerPolicy> findByCustomerIdAndPolicyId(int customerId,int
	// policyId);
}
