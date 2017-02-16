package com.niit.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.model.Product;

@Repository
@Transactional
public class ProductDaoImpl implements ProductDao{
	@Autowired
	private SessionFactory sessionFactory;
	public ProductDaoImpl(SessionFactory sessionFactory){
		super();
		this.sessionFactory=sessionFactory;

	}
	public void saveProduct(Product product) {
		sessionFactory.getCurrentSession().save(product);
	}
	@Override
	public List<Product> getProductById(){
		return null;
	}

}


