package com.tongbora.bakongapiintergration;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BakongApiIntergrationApplication {

    public static void main(String[] args) {
        loadDotenvIntoSystemProperties();
        SpringApplication.run(BakongApiIntergrationApplication.class, args);
    }

    /**
     * Loads {@code .env} from the working directory (project root when run from IDE/Gradle)
     * into system properties so {@code ${BAKONG_*}} placeholders in {@code application.yml} resolve.
     */
    private static void loadDotenvIntoSystemProperties() {
        Dotenv dotenv = Dotenv.configure()
                .ignoreIfMissing()
                .load();
        dotenv.entries().forEach(entry ->
                System.setProperty(entry.getKey(), entry.getValue()));
    }
}
