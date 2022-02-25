package com.orderService.order.orderRepository;

import com.orderService.order.model.orderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface orderItemRepository extends JpaRepository<orderItem,Integer> {
}
