package com.bit_etland.web.mapper;

import java.util.List;
import java.util.Map;

import com.bit_etland.web.domain.CustomerDTO;
import com.bit_etland.web.proxy.Proxy;

import org.springframework.stereotype.Repository;

@Repository
public interface CustomerMapper {
	public void insertCustomer(CustomerDTO cus);
	public CustomerDTO selectCustomers(CustomerDTO cus);
	public List<CustomerDTO> selectCustomersLists(Proxy pxy);
	public int countCustomer(Proxy pxy);
	public boolean existsCustomerID(CustomerDTO cus);
	public void updateCustomer(CustomerDTO cus);
	public Map<String, Object> selectProfile(Proxy pxy);
	public void deleteCustomer(CustomerDTO cus);
	
	public CustomerDTO selectCustomer(CustomerDTO cus);
	public Map<String, Object> selectPhone(Proxy pxy);
}
