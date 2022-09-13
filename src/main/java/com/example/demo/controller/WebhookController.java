package com.example.demo.controller;

import com.example.demo.emqx.ClientConnect;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lyk
 * @date 2022/9/13 10:48
 */
@RestController
@RequestMapping("/webhook")
public class WebhookController {

    @PostMapping("/client_connect")
    public void client_Connect(@RequestBody ClientConnect clientConnect) {
        System.out.println(clientConnect);
    }

}
