
package com.company.webservicedemo.dal;

import com.xdev.dal.JPADAO;
import com.company.webservicedemo.entities.Orderdetail;
import com.company.webservicedemo.entities.OrderdetailId;

/**
 * Home object for domain model class Orderdetail.
 * 
 * @see Orderdetail
 */
public class OrderdetailDAO extends JPADAO<Orderdetail, OrderdetailId> {
	public OrderdetailDAO() {
		super(Orderdetail.class);
	}
}