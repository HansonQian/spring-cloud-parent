package com.github.pay.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.*;

/**
 * @className: Payment
 * @description: 支付实体类
 * @author: Hanson
 * @version: V1.0
 * @create: 2020-09-03 23:42
 **/
@Data
@Entity
@Table(name = "payment")
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 60)
    private String serial;
}
