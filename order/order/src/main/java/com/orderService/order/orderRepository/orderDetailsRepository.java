package com.orderService.order.orderRepository;

import com.orderService.order.model.orderDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface orderDetailsRepository extends JpaRepository<orderDetails, Integer> {
}
