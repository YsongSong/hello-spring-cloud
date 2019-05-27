package top.lwaiting.hello.spring.cloud.web.admin.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName AdminService
 * @Description TODO
 * @Author Yang Song
 * @Date 2019/5/14 15:33
 */
@Service
public class AdminService {

    @Autowired
    public RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "getMessageError")
    public String getMessage(String message) {
        return restTemplate.getForObject("http://hello-spring-cloud-service-admin/getMessage?message=" + message, String.class);
    }

    public String getMessageError(String message) {
        return String.format("Hi your message is : %s, but request error", message);
    }
}
