package demo;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
//Put the Demo Application at the root of the packages so you don't need to use Scan
//@ComponentScan(basePackages = {"model"})
//@EntityScan(basePackages = {"model"})
public class DemoApplication {
    public static void main(String[] args) {
    	//SpringApplication.run(DemoApplication.class, args);
        SpringApplication app = new SpringApplication(DemoApplication.class);
        Environment env = app.run(args).getEnvironment();
        System.out.println("Active Profiles: " + Arrays.toString(env.getActiveProfiles()));
    }
}
