package pe.com.prima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"pe.com.prima.*"})
public class DmAffiliateModuleApplication {

	public static void main(String[] args) {
		SpringApplication.run(DmAffiliateModuleApplication.class, args);
	}

}
