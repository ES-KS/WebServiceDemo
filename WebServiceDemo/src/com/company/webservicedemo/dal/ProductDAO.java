
package com.company.webservicedemo.dal;

import com.xdev.dal.JPADAO;
import com.company.webservicedemo.entities.Product;
import java.lang.Integer;

/**
 * Home object for domain model class Product.
 * 
 * @see Product
 */
public class ProductDAO extends JPADAO<Product, Integer> {
	public ProductDAO() {
		super(Product.class);
	}
}