package com.mtc.app.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mtc.app.dbsource.ProductDBStore;
import com.mtc.app.vo.Order;

@Repository
public class OrderDAO implements IOrderDAO {

	@Autowired
	private ProductDBStore productDBStore;
	
	@Override
	public boolean add(Order order) {
		boolean status = productDBStore.getOrders().add(order);
		return status;
	}

	@Override
	public List<Order> getOrders() {
	
		return productDBStore.getOrders();
	}

}
