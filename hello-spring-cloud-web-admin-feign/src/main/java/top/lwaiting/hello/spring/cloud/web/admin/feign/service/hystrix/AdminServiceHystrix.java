package top.lwaiting.hello.spring.cloud.web.admin.feign.service.hystrix;

import org.springframework.stereotype.Component;
import top.lwaiting.hello.spring.cloud.web.admin.feign.service.AdminService;

/**
 * @ClassName AdminServiceHystrix
 * @Description TODO
 * @Author Yang Song
 * @Date 2019/5/20 10:18
 */
@Component
public class AdminServiceHystrix implements AdminService {
    @Override
    public String getMessage(String message) {
        return String.format("Hi your message is : %s, but request error", message);
    }
}
