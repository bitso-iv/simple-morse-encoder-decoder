package com.ex.morse.domain;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private static final Map<Character, String> MORSE_MAP = new HashMap<>();
    private static final Map<String, Character> MORSE_DECODE_MAP = new HashMap<>();

    static {
        MORSE_MAP.put('A', ".-");
        MORSE_MAP.put('B', "-...");
        MORSE_MAP.put('C', "-.-.");
        MORSE_MAP.put('D', "-..");
        MORSE_MAP.put('E', ".");
        MORSE_MAP.put('F', "..-.");
        MORSE_MAP.put('G', "--.");
        MORSE_MAP.put('H', "....");
        MORSE_MAP.put('I', "..");
        MORSE_MAP.put('J', ".---");
        MORSE_MAP.put('K', "-.-");
        MORSE_MAP.put('L', ".-..");
        MORSE_MAP.put('M', "--");
        MORSE_MAP.put('N', "-.");
        MORSE_MAP.put('O', "---");
        MORSE_MAP.put('P', ".--.");
        MORSE_MAP.put('Q', "--.-");
        MORSE_MAP.put('R', ".-.");
        MORSE_MAP.put('S', "...");
        MORSE_MAP.put('T', "-");
        MORSE_MAP.put('U', "..-");
        MORSE_MAP.put('V', "...-");
        MORSE_MAP.put('W', ".--");
        MORSE_MAP.put('X', "-..-");
        MORSE_MAP.put('Y', "-.--");
        MORSE_MAP.put('Z', "--..");
        MORSE_MAP.put(' ', "/");

        for (Map.Entry<Character, String> entry : MORSE_MAP.entrySet()) {
            MORSE_DECODE_MAP.put(entry.getValue(), entry.getKey());
        }
    }

    public static String encode(char c) {
        return MORSE_MAP.get(c);
    }

    public static Character decode(String s) {
        return MORSE_DECODE_MAP.get(s);
    }
}
