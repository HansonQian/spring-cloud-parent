package com.github.pay.web.controller;

import com.github.pay.service.IPaymentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: PaymentController
 * @description: 支付接口
 * @author: Hanson
 * @version: V1.0
 * @create: 2020-09-03 23:54
 **/
@RestController
@RequestMapping("/api/apy")
public class PaymentController {
    private final IPaymentService paymentService;

    public PaymentController(IPaymentService paymentService) {
        this.paymentService = paymentService;
    }
}
