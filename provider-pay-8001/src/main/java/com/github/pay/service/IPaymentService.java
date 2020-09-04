package com.github.pay.service;

import com.github.pay.entities.Payment;

/**
 * @className: IPaymentService
 * @description: 支付业务处理
 * @author: Hanson
 * @version: V1.0
 * @create: 2020-09-03 23:47
 **/
public interface IPaymentService {

    Payment getPaymentById(Long id);

    Payment createPayment(Payment payment);
}
