package com.meli.morse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MorseService {

    @GetMapping("/morse/{str}")
    public String translate(@PathVariable String str){
        try {
            MorseTranslator morseTranslator = new MorseTranslator();
            return morseTranslator.translateMorse2String(str);
        }catch (Exception e){
            System.out.println("Failed to parse json");
            return "";
        }
    }


}
