package spring.demo.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author huazai
 * @date 2020/11/19 14:51
 */
@SpringBootApplication
public class Application {

    /**
     * 密码模式
     * 1、登录 http://127.0.0.1:9013  用户admin 密码 123456
     * 2、获取token
     *      post请求
     *      http://127.0.0.1:9013/oauth/token?
     *      grant_type=password&
     *      username=admin&
     *      password=123456
     *      Authorization  添加 type【Basic Auth】，username【custom_root】， password【root】
     * 3、获取资源  http://127.0.0.1:9012/user/getUserAuthentication
     *       Authorization  添加 type【Bearer token】
     *
     * @param args
     */

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
