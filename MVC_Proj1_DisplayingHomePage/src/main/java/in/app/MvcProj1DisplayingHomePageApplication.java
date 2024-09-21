package in.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MvcProj1DisplayingHomePageApplication {

	public static void main(String[] args) {
		ApplicationContext factory =SpringApplication.run(MvcProj1DisplayingHomePageApplication.class, args);
		System.out.println(factory.getClass().getName());
	}

}
