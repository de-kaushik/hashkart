package com.orderService.order.model;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;
@Data
@Entity
@Table(name = "orderDetails")
public class orderDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    Integer id;

    @Column(name = "user_id")
    Integer userId;

    @Column(name = "total")
    Integer total;

    @Column(name = "payment_id")
    String paymentId;

    @Column(name = "date")
    Date date;

    @Column(name = "cart_id")
    Integer cartId;

}
