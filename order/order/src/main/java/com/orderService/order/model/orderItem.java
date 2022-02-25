package com.orderService.order.model;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;
@Data
@Entity
@Table(name = "order_item")
public class orderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    Integer id;

    @Column(name = "product_id")
    Integer productID;

    @Column(name = "order_details")
    Integer orderDetailsId;



}
