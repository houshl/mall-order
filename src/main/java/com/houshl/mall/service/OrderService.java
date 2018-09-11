package com.houshl.mall.service;

import com.houshl.mall.model.Order;

import java.util.List;

/**
 * Created by houshuanglong on 2018/8/20.
 */
public interface OrderService {

    void save(Order order) throws Exception;

    List<Order> findAll(Order order) throws Exception;

}
