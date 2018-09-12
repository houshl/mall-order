package com.houshl.mall.controller;

import com.github.pagehelper.PageInfo;
import com.houshl.mall.model.Order;
import com.houshl.mall.response.ObjectResponse;
import com.houshl.mall.response.ResponseUtils;
import com.houshl.mall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by houshuanglong on 2018/8/20.
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @RequestMapping("/save")
    public void save() throws Exception {
        Order order = new Order();
        order.setTotalPrice(BigDecimal.ONE);
        order.setCreateTime(new Date());
        orderService.save(order);
    }

    @RequestMapping("/list")
    public ObjectResponse list(Order order) throws Exception {
        List<Order> orderList = orderService.findAll(order);
        PageInfo pageInfo = new PageInfo(orderList);
        return ResponseUtils.ok(pageInfo);
    }

    @RequestMapping("/info")
    public ObjectResponse info(Long id) throws Exception {
        Order order = orderService.findById(id);
        return ResponseUtils.ok(order);
    }

}
