package com.github.pay.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.hibernate.annotations.Proxy;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @className: Payment
 * @description: 支付实体类
 * @author: Hanson
 * @version: V1.0
 * @create: 2020-09-03 23:42
 **/
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@Proxy(lazy = false)//解决LazyInitializationException问题
@Table(name = "payment")
public class Payment implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 60)
    private String serial;
}
