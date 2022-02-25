package com.orderService.order.orderRepository;

import com.orderService.order.model.cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface cartRepository extends JpaRepository<cart,Integer> {
}
