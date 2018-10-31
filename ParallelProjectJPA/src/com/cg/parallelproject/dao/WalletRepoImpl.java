package com.cg.parallelproject.dao;

import java.util.HashMap;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.parallelproject.dto.Customer;
import com.cg.parallelproject.dto.Wallet;
//import com.cg.mypaymentapp.pl.Datastore;

public class WalletRepoImpl implements WalletRepo {
	EntityManager manager;
	
	public WalletRepoImpl() {
		// TODO Auto-generated constructor stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA-PU");
		manager=emf.createEntityManager();
	}
	
	public boolean createNewDetails(Customer pr) {
		// TODO Auto-generated method stub
		manager.getTransaction().begin();
		manager.persist(pr);
		manager.getTransaction().commit();
		if(pr.getMobileNo()==null)
			return false;
		return true;
	}

	@Override
	public boolean save(Customer customer) {
		// TODO Auto-generated method stub
		//m.put(customer.getMobileNo(), customer);
		manager.getTransaction().begin();
		Customer cu=manager.find(Customer.class, customer.getMobileNo());
		manager.merge(cu);
		manager.getTransaction().commit();
		if(cu==null)
			return false;
		return true;
	}
	public Customer update(Customer cus) {
		// TODO Auto-generated method stub
		manager.getTransaction().begin();
		Customer cu=manager.find(Customer.class, cus.getMobileNo());
		manager.merge(cu);
		manager.getTransaction().commit();
		return cu;
	}



	@Override
	public Customer findOne(String mobileNo) {
		// TODO Auto-generated method stub
		manager.getTransaction().begin();
		Customer cu=manager.find(Customer.class,mobileNo);
		manager.getTransaction().commit();
		return cu;
	}

}
