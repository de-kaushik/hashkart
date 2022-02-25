package com.payement.paymentService.controlle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/payment")
public class paymentControl {

    @GetMapping(value = "/payment-process")
    public String paymentProcess(){
        return "payment successful";
    }

}
