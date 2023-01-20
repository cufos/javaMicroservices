package com.pizzarestaurant.store.dto;

import com.pizzarestaurant.store.model.Topping;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
public class PizzaDTO {
  private Long id;

  private String name;

  private boolean favorite;

  private Set<Topping> toppings = new HashSet<>();
}
