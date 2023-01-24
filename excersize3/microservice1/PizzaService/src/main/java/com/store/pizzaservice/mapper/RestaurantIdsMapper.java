package com.store.pizzaservice.mapper;

import com.store.pizzaservice.dto.RestaurantIdsDTO;
import com.store.pizzaservice.model.RestaurantIds;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RestaurantIdsMapper extends GenericMapper<RestaurantIds, RestaurantIdsDTO>{
}
