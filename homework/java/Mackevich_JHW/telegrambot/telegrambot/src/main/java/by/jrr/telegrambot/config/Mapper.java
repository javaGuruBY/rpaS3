package by.jrr.telegrambot.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Mapper {

    public ObjectMapper objectMapper (){
      ObjectMapper objectMapper = new ObjectMapper();
      return objectMapper;
    }
}
