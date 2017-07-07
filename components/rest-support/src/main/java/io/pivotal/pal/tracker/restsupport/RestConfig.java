package io.pivotal.pal.tracker.restsupport;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RestConfig {

<<<<<<< HEAD
<<<<<<< HEAD
//    @Bean
//    @LoadBalanced
//    public RestOperations restOperations() {
//        return new RestTemplate();
//    }

=======
>>>>>>> ca6ee5a... Add security
=======
>>>>>>> ca6ee5a... Add security
    @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return mapper;
    }
}
