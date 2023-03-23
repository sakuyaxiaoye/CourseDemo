package zysy.iflytek.coursedemo.config;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.oas.annotations.EnableOpenApi;

@Configuration
@EnableOpenApi //开启Swagger
@EnableKnife4j
public class SwaggerConfig{
}
