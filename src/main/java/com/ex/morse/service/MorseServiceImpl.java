package com.ex.morse.service;

import com.ex.morse.domain.Dictionary;
import org.springframework.stereotype.Service;

@Service
public class MorseServiceImpl implements MorseService {
    @Override
    public String encode(String text) {
        if (text == null || text.isBlank()) return "it is empty";

        text = text.toUpperCase().trim();
        StringBuilder res = new StringBuilder();
        for (char m : text.toCharArray()) res.append(Dictionary.encode(m)).append(" ");

        return res.toString().trim();
    }

    @Override
    public String decode(String morse) {
        if (morse == null || morse.isBlank()) return "it is empty";
        StringBuilder res = new StringBuilder();

        String [] tokens = morse.trim().split(" ");
        for (String m : tokens) res.append(Dictionary.decode(m)).append(" ");

        return res.toString().trim();
    }
}
