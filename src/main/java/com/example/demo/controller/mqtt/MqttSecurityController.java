package com.example.demo.controller.mqtt;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lyk
 * @date 2022/9/13 14:09
 */
@RestController
@RequestMapping("/mqtt/security")
public class MqttSecurityController {

    /**
     * 认证
     * EMQX配置:
     * URL:http://127.0.0.1:8080/mqtt/security/authn
     * Body: {
     * "username": "${username}",
     * "password": "${password}"
     * }
     *
     * @param res
     * @return
     */
    @PostMapping("/authn")
    public Object authn(@RequestBody Map<String, Object> res) {
        System.out.println(res);

        Map<String, Object> resp = new HashMap<>();
        resp.put("result", "allow");
        resp.put("is_superuser", "false");

        // result:
        // allow deny ignore

        // is_superuser:
        // true false

        return resp;
    }


    /**
     * 授权
     * EMQX配置:
     * URL:http://127.0.0.1:8080/mqtt/security/authz
     * 权限控制设置
     * No Match: deny
     *
     * @param res
     * @return
     */
    @PostMapping("/authz")
    public Object authz(@RequestBody Map<String, Object> res) {
        System.out.println(res);

        Map<String, Object> resp = new HashMap<>();
        resp.put("result", "allow");
        // result:
        // allow deny ignore

        return resp;
    }

}
