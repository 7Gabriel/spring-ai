package br.com.gabriel.springai.functioncalling;

import java.util.function.Function;
import br.com.gabriel.springai.functioncalling.StockRetrievalService.Request;
import br.com.gabriel.springai.functioncalling.StockRetrievalService.Response;


public class StockRetrievalService implements Function<Request, Response> {
	
	public record Request(String symbol) {
		
	}
	
	public record Response(Double price) {
		
	}

	@Override
	public Response apply(Request request) {
		return new Response(5000D);
	}

}
