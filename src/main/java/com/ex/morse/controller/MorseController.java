package com.ex.morse.controller;

import com.ex.morse.dto.EncodeRequest;
import com.ex.morse.dto.EncodeResponse;
import com.ex.morse.service.MorseService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/morse")
public class MorseController {
    private final MorseService morseService;

    public MorseController(MorseService morseService) {
        this.morseService = morseService;
    }

    @PostMapping("/encode")
    public EncodeResponse encode(@RequestBody EncodeRequest request) {
        String encoded = morseService.encode(request.getText());
        return new EncodeResponse(encoded);
    }

    @PostMapping("/decode")
    public EncodeResponse decode(@RequestBody EncodeRequest request) {
        String decoded = morseService.decode(request.getText());
        return new EncodeResponse(decoded);
    }
}
