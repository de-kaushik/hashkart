package com.orderService.order.model;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "cart")
public class cart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    Integer id;

    @Column(name = "product_id")
    Integer productID;

    @Column(name = "user_id")
    Integer userId;



}
