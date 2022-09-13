package com.example.demo.emqx;

import lombok.Data;

/**
 * @author lyk
 * @date 2022/9/13 13:02
 */
@Data
public class ClientConnect {

    private String username;

    private String event;

    private Long connected_at;
    private Long disconnected_at;

    private String clientid;
}
