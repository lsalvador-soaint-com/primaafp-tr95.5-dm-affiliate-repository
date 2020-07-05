package pe.com.prima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class DmConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(DmConfigApplication.class, args);
	}

}
