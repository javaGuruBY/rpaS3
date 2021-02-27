package by.jrr.telegrambot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.ApiContextInitializer;

@SpringBootApplication
public class TelegrambotApplication {

	public static void main(String[] args) {
		System.getProperties().put( "proxySet", "true" );
		System.getProperties().put( "socksProxyHost", "id" );
		System.getProperties().put( "socksProxyPort", "name" );
		ApiContextInitializer.init();
		SpringApplication.run(TelegrambotApplication.class, args);

	}

}
