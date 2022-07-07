package com.github.zhdanok.produser.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.github.zhdanok.produser.components.Producer;
import com.github.zhdanok.produser.models.FoodOrder;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
@Slf4j
@Service
@RequiredArgsConstructor
public class FoodOrderService {

    private final Producer producer;

    public String createFoodOrder(FoodOrder foodOrder) throws JsonProcessingException {
        return producer.sendMessage(foodOrder);
    }



}
