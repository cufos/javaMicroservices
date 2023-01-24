package com.store.pizzaservice.controller.impl;

import com.store.pizzaservice.controller.ToppingController;
import com.store.pizzaservice.dto.ToppingDTO;
import com.store.pizzaservice.mapper.ToppingMapper;
import com.store.pizzaservice.model.Topping;
import com.store.pizzaservice.service.ToppingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/toppings")
@RequiredArgsConstructor
public class ToppingControllerImpl implements ToppingController {

  private final ToppingMapper toppingMapper;
  private final ToppingService toppingService;

  @Override
  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public ToppingDTO save(@RequestBody ToppingDTO toppingDTO) {
    Topping topping = toppingMapper.asEntity(toppingDTO);

    return toppingMapper.asDTO(toppingService.save(topping));
  }

  @Override
  @GetMapping("/{id}")
  @ResponseStatus(HttpStatus.OK)
  public ToppingDTO findById(@PathVariable("id") Long id) {
    Topping topping = toppingService.findById(id).orElse(null);
    return toppingMapper.asDTO(topping);
  }

  @Override
  @DeleteMapping("/{id}")
  @ResponseStatus(HttpStatus.OK)
  public void deleteById(@PathVariable("id") Long id) {
    toppingService.deleteById(id);
  }

  @Override
  @GetMapping
  @ResponseStatus(HttpStatus.OK)
  public List<ToppingDTO> list() {
    return toppingMapper.asDTOList(toppingService.findAll());
  }

  @Override
  @PutMapping("/{id}")
  public ToppingDTO update(@RequestBody ToppingDTO toppingDTO,@PathVariable("id") Long id) {
    Topping topping = toppingMapper.asEntity(toppingDTO);
    return toppingMapper.asDTO(toppingService.update(topping,id));
  }
}
