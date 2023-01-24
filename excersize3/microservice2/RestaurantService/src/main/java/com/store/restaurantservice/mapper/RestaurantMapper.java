package com.store.restaurantservice.mapper;


import com.store.restaurantservice.dto.RestaurantDTO;
import com.store.restaurantservice.model.Restaurant;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RestaurantMapper extends GenericMapper<Restaurant, RestaurantDTO> {
}
