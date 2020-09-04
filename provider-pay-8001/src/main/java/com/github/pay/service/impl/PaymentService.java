package com.github.pay.service.impl;

import com.github.pay.entities.Payment;
import com.github.pay.repository.PaymentRepository;
import com.github.pay.service.IPaymentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @className: PaymentService
 * @description: 支付业务处理
 * @author: Hanson
 * @version: V1.0
 * @create: 2020-09-03 23:48
 **/
@Transactional
@Service("paymentService")
public class PaymentService implements IPaymentService {

    private final PaymentRepository paymentRepository;


    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }


    @Override
    public Payment getPaymentById(Long id) {
        return paymentRepository.getOne(id);
    }

    @Override
    public Payment createPayment(Payment payment) {
        return paymentRepository.save(payment);
    }


}
