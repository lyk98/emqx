package com.example.demo.controller.mqtt;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author lyk
 * @date 2022/9/13 15:00
 */
@RestController
@RequestMapping("/mqtt/bridge")
public class MqttBridgeController {

    /**
     * 客户端上下线
     *
     * @param res
     */
    @PostMapping("/clientConnectHook")
    public void clientConnectHook(@RequestBody Map<String, Object> res) {
        System.out.println(res);
        Object event = res.get("event");
        if ("client.disconnected".equals(event)) {
            System.out.println("设备下线");
        } else if ("client.connected".equals(event)) {
            System.out.println("设备上线");
        }
    }
}
