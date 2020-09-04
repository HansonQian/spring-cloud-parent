package com.github.pay.web.controller;

import com.github.pay.common.CommonResult;
import com.github.pay.entities.Payment;
import com.github.pay.service.IPaymentService;
import org.springframework.web.bind.annotation.*;

/**
 * @className: PaymentController
 * @description: 支付接口
 * @author: Hanson
 * @version: V1.0
 * @create: 2020-09-03 23:54
 **/
@RestController
@RequestMapping("/api/pay")
public class PaymentController {
    private final IPaymentService paymentService;

    public PaymentController(IPaymentService paymentService) {
        this.paymentService = paymentService;
    }


    @PostMapping("/save")
    public CommonResult<Payment> addPayment(Payment payment) {
        Payment data = paymentService.createPayment(payment);
        return new CommonResult<>(200, "保存成功", data);
    }

    @GetMapping("/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") long id) {
        Payment data = paymentService.getPaymentById(id);
        return new CommonResult<>(200, "获取成功", data);
    }
}
