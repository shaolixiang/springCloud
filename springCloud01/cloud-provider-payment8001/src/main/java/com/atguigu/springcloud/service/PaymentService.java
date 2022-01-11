package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author shaolixiang
 * @create 2021-12-14 15:51
 */
public interface PaymentService {
    public int create(Payment p) ;
    public Payment getPaymentById(@Param("id") Long id);
}
