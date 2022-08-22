package buem.darovykh.summerschool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"buem.darovykh.summerschool.service", "buem.darovykh.summerschool.repository",
        "buem.darovykh.summerschool.controller"})
public class SummerSchoolApplication {

    public static void main(String[] args) {
        SpringApplication.run(SummerSchoolApplication.class, args);
    }

}
