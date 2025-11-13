package br.com.gabriel.springai.text;

import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.gabriel.springai.services.OpenAiService;

import reactor.core.publisher.Flux;

@RestController
public class AnswerAnyThingStreamingController {

	@Autowired
	private OpenAiService service;

	@GetMapping("/stream")
	public Flux<ChatResponse> askAnything(@RequestParam("message") String message) {
		return service.streamAnswer(message);
	}
}