package com.github.pay.controller;

import com.github.entities.Payment;
import com.github.pay.service.IPaymentService;
import com.github.util.result.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
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
@Api(tags = "支付接口")
public class PaymentController {

    @Value("${server.port}")
    private int port;

    private final IPaymentService paymentService;

    public PaymentController(IPaymentService paymentService) {
        this.paymentService = paymentService;
    }


    @PostMapping("/save")
    @ApiOperation(value = "新增支付实体", notes = "新增支付实体")
    public CommonResult<Payment> addPayment(@RequestBody Payment payment) {
        Payment data = paymentService.createPayment(payment);
        if (null == data) {
            return new CommonResult<>(500, "保存失败");
        } else {
            return new CommonResult<>(200, "保存成功", data);
        }

    }

    @GetMapping("/{id}")
    @ApiOperation(value = "根据ID获取支付实体信息", notes = "根据ID获取支付实体信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "支付标识", required = true, dataType = "long")
    })
    public CommonResult<Payment> getPaymentById(@PathVariable("id") long id) {
        Payment data = paymentService.getPaymentById(id);
        if (null == data) {
            return new CommonResult<>(200, "根据：" + id + " 未找到支付实体信息! 来自:" + port);
        } else {
            return new CommonResult<>(200, "获取成功! 来自:" + port, data);
        }

    }
}
