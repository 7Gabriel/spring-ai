package br.com.gabriel.springai;

import org.springframework.ai.chat.memory.ChatMemory;
import org.springframework.ai.chat.memory.MessageWindowChatMemory;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class Config {
	
	@Bean
	ChatMemory chatmemory() {
		return MessageWindowChatMemory.builder().build();
	}

}
