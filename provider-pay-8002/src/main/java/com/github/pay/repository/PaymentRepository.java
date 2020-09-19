package com.github.pay.repository;

import com.github.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @className: PaymentRepository
 * @description: 支付持久层
 * @author: Hanson
 * @version: V1.0
 * @create: 2020-09-03 23:46
 **/
public interface PaymentRepository extends JpaRepository<Payment,Long> {

    Optional<Payment> findPaymentById(long id);
}
