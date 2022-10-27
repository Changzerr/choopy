package cn.changzer.choppy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author lingqu
 * @date 2022/10/25
 * @apiNote
 */
@EnableDiscoveryClient
@SpringBootApplication
public class AuthorityApplication {
    public static void main(String[] args) {
        SpringApplication.run(AuthorityApplication.class, args);
    }
}
