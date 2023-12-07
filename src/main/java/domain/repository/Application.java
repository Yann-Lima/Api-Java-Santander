package domain.repository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan
@EnableJpaRepositories(basePackages = "me.dio.service.impl.UserServiceImpl")
@ComponentScan
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
//import org.springdoc.core.GroupedOpenApi;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Import;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//
//@Configuration
//@EnableWebMvc
//@Import(springdocSwaggerUiConfiguration.class)
//public class OpenApiConfig {
//
//    @Bean
//    public GroupedOpenApi customOpenAPI() {
//        return GroupedOpenApi.builder()
//            .group("users")
//            .pathsToMatch("/users/**")
//            .build();
//    }
//}
