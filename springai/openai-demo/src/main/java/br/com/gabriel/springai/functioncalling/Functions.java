package br.com.gabriel.springai.functioncalling;

import java.util.function.Function;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

@Configuration
public class Functions {
	
	@Bean
	@Description("Returns the stock price given a symbol")
	Function<StockRetrievalService.Request, StockRetrievalService.Response> stockRetrievalFunction(){
		return new StockRetrievalService();
	}
	



}
