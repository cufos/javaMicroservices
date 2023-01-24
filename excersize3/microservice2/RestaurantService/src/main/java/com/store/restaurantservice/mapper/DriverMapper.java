package com.store.restaurantservice.mapper;


import com.store.restaurantservice.dto.DriverDTO;
import com.store.restaurantservice.model.Driver;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DriverMapper extends GenericMapper<Driver, DriverDTO> {
}
