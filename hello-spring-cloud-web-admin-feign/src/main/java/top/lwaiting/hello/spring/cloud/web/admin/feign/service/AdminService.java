package top.lwaiting.hello.spring.cloud.web.admin.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import top.lwaiting.hello.spring.cloud.web.admin.feign.service.hystrix.AdminServiceHystrix;

/**
 * @ClassName AdminService
 * @Description TODO
 * @Author Yang Song
 * @Date 2019/5/14 16:42
 */
@FeignClient(value = "hello-spring-cloud-service-admin", fallback = AdminServiceHystrix.class)
public interface AdminService {

    /**
     * 获取信息
     * @param message
     * @return
     */
    @GetMapping("getMessage")
    String getMessage(@RequestParam(value = "message") String message);
}
