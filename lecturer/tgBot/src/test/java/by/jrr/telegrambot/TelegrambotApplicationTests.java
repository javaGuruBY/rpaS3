package by.jrr.telegrambot;

import by.jrr.telegrambot.config.Mapper;
import by.jrr.telegrambot.service.MessageService;
import by.jrr.telegrambot.service.TelegramBot;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {TelegramBot.class, Mapper.class, MessageService.class})
public class TelegrambotApplicationTests {

	@Test
	void contextLoads() {
	}

}
