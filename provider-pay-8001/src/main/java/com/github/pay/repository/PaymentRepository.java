package com.github.pay.repository;

import com.github.pay.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @className: PaymentRepository
 * @description: 支付持久层
 * @author: Hanson
 * @version: V1.0
 * @create: 2020-09-03 23:46
 **/
public interface PaymentRepository extends JpaRepository<Payment,Long> {
}
