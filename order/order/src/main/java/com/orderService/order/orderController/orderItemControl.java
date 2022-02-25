package com.orderService.order.orderController;

import com.orderService.order.model.orderItem;
import com.orderService.order.orderRepository.orderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/order")
public class orderItemControl {

    @Autowired
    orderItemRepository orderitemrepository;

    @GetMapping(value = "/book")
    public String getOrder(){
        System.out.println(" -- in order");
        return "order";
    }

    @PostMapping(value = "/place-order",params = "productId")
    public orderItem placeOrder(@RequestParam Integer id){
      orderItem item = null;
      item.setProductID(id);
    //  item.setOrderDetailsId(234);
        orderItem i= orderitemrepository.save(item);
        return  i;
    }
}
