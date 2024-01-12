package com.springmvc.repository;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.springmvc.entity.OrderingFoodEntity;

@Repository
@Transactional
public class FoodRepository {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public void save(OrderingFoodEntity orderingfood) {
		hibernateTemplate.save(orderingfood);
	}

	public void update(OrderingFoodEntity roomBooking) {
		hibernateTemplate.update(roomBooking);
	}

}
