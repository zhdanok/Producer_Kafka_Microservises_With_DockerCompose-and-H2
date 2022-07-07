package com.github.zhdanok.produser.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.github.zhdanok.produser.models.FoodOrder;
import com.github.zhdanok.produser.services.FoodOrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/order")
public class FoodOrderController {

    private final FoodOrderService foodOrderService;

    @PostMapping
    public String createFoodOrder(@RequestBody FoodOrder foodOrder) throws JsonProcessingException {
        log.info("request to create food order received");
        return foodOrderService.createFoodOrder(foodOrder);
    }
}
