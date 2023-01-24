package com.store.pizzaservice.mapper;

import com.store.pizzaservice.dto.ToppingDTO;
import com.store.pizzaservice.model.Topping;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ToppingMapper extends GenericMapper<Topping, ToppingDTO> {

}
