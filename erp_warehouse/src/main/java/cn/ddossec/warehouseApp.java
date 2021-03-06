package cn.ddossec;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 谷辉  杨洪坤
 */

@SpringBootApplication
@EnableDiscoveryClient //nacos服务
@MapperScan("cn.ddossec.mapper")
public class warehouseApp {
    public static void main(String[] args) {
        SpringApplication.run(warehouseApp.class,args);
    }
}
