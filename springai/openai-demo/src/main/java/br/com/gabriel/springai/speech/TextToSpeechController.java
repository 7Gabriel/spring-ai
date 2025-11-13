package br.com.gabriel.springai.speech;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.gabriel.springai.services.OpenAiService;

@Controller
public class TextToSpeechController {

    @Autowired
    private OpenAiService service;

    // Display the image upload form
    @GetMapping("/showTextToSpeech")
    public String showUploadForm() throws IOException {
        return "textToSpeech";
    }

    @GetMapping("/textToSpeech")
    public ResponseEntity<byte[]> streamAudio(@RequestParam String text) throws IOException {
    
            // Set headers to indicate streaming audio
            HttpHeaders headers = new HttpHeaders();
            headers.set(HttpHeaders.CONTENT_TYPE, "audio/mpeg");
            headers.set(HttpHeaders.CONTENT_DISPOSITION, "inline; filename=output.mp3");
			return null;

         //   return new ResponseEntity<>(service.textToSpeech(text),headers,HttpStatus.OK);

    
    }
}