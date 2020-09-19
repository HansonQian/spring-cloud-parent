package com.github.pay.service.impl;

import com.github.entities.Payment;
import com.github.pay.repository.PaymentRepository;
import com.github.pay.service.IPaymentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

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
        Optional<Payment> optional = paymentRepository.findPaymentById(id);
        return optional.orElse(null);
    }

    @Override
    public Payment createPayment(Payment payment) {
        return paymentRepository.save(payment);
    }


}
