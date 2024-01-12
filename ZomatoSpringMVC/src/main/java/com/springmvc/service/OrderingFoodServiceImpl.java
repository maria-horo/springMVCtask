package com.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.bean.OrderingFood;
import com.springmvc.entity.OrderingFoodEntity;
import com.springmvc.repository.FoodRepository;

@Service
public class OrderingFoodServiceImpl implements OrderingFoodService{

	@Autowired
	private FoodRepository foodRepository;

	@Override
	public void save(OrderingFood orderingFood) {
		OrderingFoodEntity orderingFoodEntity = new OrderingFoodEntity();
		orderingFoodEntity.setFoodName(orderingFood.getFoodName());
		orderingFoodEntity.setAddress(orderingFood.getAddress());
		foodRepository.save(orderingFoodEntity);	
	}

	@Override
	public void update(OrderingFood orderingFood) {

		OrderingFoodEntity orderingFoodEntity = new OrderingFoodEntity();
		orderingFoodEntity.setId(orderingFood.getId());
		orderingFoodEntity.setFoodName(orderingFood.getFoodName());
		orderingFoodEntity.setAddress(orderingFood.getAddress());
		foodRepository.update(orderingFoodEntity);
	}

}
