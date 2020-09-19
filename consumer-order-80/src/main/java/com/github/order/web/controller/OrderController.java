package com.github.order.web.controller;

import com.github.entities.Payment;
import com.github.util.result.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

/**
 * @className: OrderController
 * @description: 订单处理器
 * @author: Hanson
 * @version: V1.0
 * @create: 2020-09-05 01:38
 **/
@RestController
@RequestMapping("/api/order")
@Api(tags = "订单接口")
public class OrderController {
    private final RestTemplate restTemplate;

    private final DiscoveryClient discoveryClient;

    private static final String SERVICE_ID = "pay-service";

    private static final String URL = "http://" + SERVICE_ID;

    public OrderController(RestTemplate restTemplate, DiscoveryClient discoveryClient) {
        this.restTemplate = restTemplate;
        this.discoveryClient = discoveryClient;
    }


    @PostMapping("/save")
    @ApiOperation(value = "新增支付实体", notes = "新增支付实体")
    public CommonResult<Payment> createPayment(Payment payment) {

        List<ServiceInstance> serviceInstanceList = discoveryClient.getInstances("PAY-SERVICE");
        for (ServiceInstance serviceInstance : serviceInstanceList) {
            String instanceId = serviceInstance.getInstanceId();
            System.out.println(instanceId);
        }
        ResponseEntity<CommonResult> responseEntity = restTemplate.postForEntity(URL + "/api/pay/save", payment, CommonResult.class);
        return responseEntity.getBody();
    }


    @GetMapping("/{id}")
    @ApiOperation(value = "根据ID获取支付实体信息", notes = "根据ID获取支付实体信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "支付标识", required = true, dataType = "long")
    })
    public CommonResult<Payment> getPaymentById(@PathVariable("id") long id) {
        String url = URL + "/api/pay/" + id;
        ResponseEntity<CommonResult> entity = restTemplate.getForEntity(url, CommonResult.class);
        return entity.getBody();
    }

}
