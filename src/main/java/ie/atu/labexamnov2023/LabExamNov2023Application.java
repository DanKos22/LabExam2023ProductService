package ie.atu.labexamnov2023;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class LabExamNov2023Application {

    public static void main(String[] args) {
        SpringApplication.run(LabExamNov2023Application.class, args);
    }

}
