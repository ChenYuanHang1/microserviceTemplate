#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages = {"${package}"})
@MapperScan({"${package}.dao"})
@EnableEurekaClient
public class ${serviceName}ServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(${serviceName}ServiceApplication.class, args);
	}
}
