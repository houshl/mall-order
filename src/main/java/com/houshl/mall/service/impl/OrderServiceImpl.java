package com.houshl.mall.service.impl;

import com.github.pagehelper.PageHelper;
import com.houshl.mall.mapper.OrderMapper;
import com.houshl.mall.model.Order;
import com.houshl.mall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by houshuanglong on 2018/8/20.
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public void save(Order order) throws Exception {
        orderMapper.insert(order);
    }

    @Override
    public List<Order> findAll(Order order) throws Exception {
        if (order.getPage() != null && order.getRows() != null) {
            PageHelper.startPage(order.getPage(), order.getRows());
        }
        return orderMapper.selectAll();
    }
}
