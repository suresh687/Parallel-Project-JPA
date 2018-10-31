package com.cg.parallelproject.service;
import java.math.BigDecimal;

import com.cg.parallelproject.dto.Customer;


public interface WalletService {
public Customer createAccount(String name ,String mobileno, double amount);
public Customer showBalance (String mobileno);
public Customer fundTransfer (String sourceMobileNo,String targetMobileNo, double amount);
public Customer depositAmount (String mobileNo,double amount );
public Customer withdrawAmount(String mobileNo, double amount);
public boolean validateName(String name);
public boolean validateNumber(String number);
public boolean validateBalance(double number);
}
