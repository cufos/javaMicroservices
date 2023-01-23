package com.pizzarestaurant.store.service;

import com.pizzarestaurant.store.model.Restaurant;

public interface RestaurantService extends GenericService<Restaurant,Long> {
  Restaurant addPizzasToRestaurant(Restaurant restaurant);

   Restaurant addPizzaById(Long restaurantId, Long pizzaId);
}
