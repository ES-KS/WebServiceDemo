
package com.company.webservicedemo.dal;

import com.xdev.dal.JPADAO;
import com.company.webservicedemo.entities.Customer;

/**
 * Home object for domain model class Customer.
 * 
 * @see Customer
 */
public class CustomerDAO extends JPADAO<Customer, String> {
	public CustomerDAO() {
		super(Customer.class);
	}
}