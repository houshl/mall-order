package com.houshl.mall.service.impl;

import com.github.pagehelper.PageHelper;
import com.houshl.mall.mapper.OrderMapper;
import com.houshl.mall.model.Order;
import com.houshl.mall.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by houshuanglong on 2018/8/20.
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public void save(Order order) throws Exception {
        int res = orderMapper.insert(order);
        log.info(String.valueOf(res));
    }

    @Override
    public List<Order> findAll(int pageNum, int pageSize) throws Exception {
        if (pageNum > 0 && pageSize > 0) {
            PageHelper.startPage(pageNum, pageSize);
        }
        return orderMapper.selectAll();
    }
}
