package com.lx.business;

import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.client.producer.SendStatus;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    @RequestMapping("/say")
    public String say(){
        rocketMQTemplate.convertAndSend("order-topic", "1");
        return "1";
    }

    @GetMapping(value = "/feignTest")
    public String feignTest(@RequestParam String id){
        SendResult sendResult = rocketMQTemplate.syncSend("sale-topic", "2" + id);
        SendStatus sendStatus = sendResult.getSendStatus();
        return sendStatus.toString();
    }


}
