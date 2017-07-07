package io.pivotal.pal.tracker.registration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
<<<<<<< HEAD
<<<<<<< HEAD
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
=======
>>>>>>> ca6ee5a... Add security
=======
>>>>>>> ca6ee5a... Add security
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

import java.util.TimeZone;

<<<<<<< HEAD
@EnableWebSecurity
@EnableResourceServer
@EnableOAuth2Client
=======

@EnableWebSecurity
@EnableResourceServer
<<<<<<< HEAD
>>>>>>> ca6ee5a... Add security
=======
>>>>>>> ca6ee5a... Add security
@EnableEurekaClient
@SpringBootApplication
@ComponentScan({
    "io.pivotal.pal.tracker.accounts",
    "io.pivotal.pal.tracker.restsupport",
    "io.pivotal.pal.tracker.projects",
    "io.pivotal.pal.tracker.users",
    "io.pivotal.pal.tracker.registration"
})
public class App {
    public static void main(String[] args) {
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        SpringApplication.run(App.class, args);
    }
}
