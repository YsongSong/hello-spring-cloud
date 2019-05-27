package top.lwaiting.hello.spring.cloud.service.admin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName AdminController
 * @Description TODO
 * @Author Yang Song
 * @Date 2019/5/14 11:02
 */
@RestController
public class AdminController {

    @Value("${server.port}")
    private String port;

    @GetMapping("getMessage")
    public String getMessage(String message) {
        return String.format("you message is : %s port : %s", message, port);
    }
}
