package top.lwaiting.hello.spring.cloud.web.admin.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.lwaiting.hello.spring.cloud.web.admin.feign.service.AdminService;

/**
 * @ClassName AdminController
 * @Description TODO
 * @Author Yang Song
 * @Date 2019/5/14 16:47
 */
@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("getMessage")
    public String getMessage(String message) {
        return adminService.getMessage(message);
    }
}
