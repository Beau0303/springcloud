package com.beau.productviewservicefeign;

import brave.sampler.Sampler;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients("com.beau.productviewservicefeign.client")
public class ProductViewServiceFeignApplication {

    @Bean
    public Sampler defaultSampler() {
        return Sampler.ALWAYS_SAMPLE;
    }

    public static void main(String[] args) {
//        SpringApplication.run(ProductViewServiceFeignApplication.class, args);
        new SpringApplicationBuilder(ProductViewServiceFeignApplication.class).properties("server.port=" + 8012).run(args);
    }
}
