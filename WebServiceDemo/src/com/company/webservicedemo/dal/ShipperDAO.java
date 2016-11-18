
package com.company.webservicedemo.dal;

import com.xdev.dal.JPADAO;
import com.company.webservicedemo.entities.Shipper;
import java.lang.Integer;

/**
 * Home object for domain model class Shipper.
 * 
 * @see Shipper
 */
public class ShipperDAO extends JPADAO<Shipper, Integer> {
	public ShipperDAO() {
		super(Shipper.class);
	}
}