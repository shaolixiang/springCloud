package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author shaolixiang
 * @create 2021-12-14 14:18
 */
@Mapper
public interface PaymentDao {
    int create(Payment p) ;
    Payment getPaymentById(@Param("id") Long id);
}
