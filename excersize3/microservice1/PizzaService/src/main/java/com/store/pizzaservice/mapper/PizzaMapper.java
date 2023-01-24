package com.store.pizzaservice.mapper;

import com.store.pizzaservice.dto.PizzaDTO;
import com.store.pizzaservice.model.Pizza;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PizzaMapper extends GenericMapper<Pizza, PizzaDTO> {

}
