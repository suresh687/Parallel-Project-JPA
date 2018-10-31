package com.cg.parallelproject.dao;

import com.cg.parallelproject.dto.Customer;

public interface WalletRepo {
	public boolean save(Customer customer);
	public Customer findOne(String mobileNo);
	public boolean createNewDetails(Customer pr);
}
