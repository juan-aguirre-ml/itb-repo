package com.meli.morse;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class MorseTranslator {

    ObjectMapper mapper = new ObjectMapper();

    private Map<String, String> stringDictionary;
    private Map<String,String> morseDictionary = new HashMap<>();

    public MorseTranslator() throws JsonProcessingException {
        String jsonStr = "{\n  \" \": \"   \",\n  \"0\": \"-----\",\n  \"1\": \".----\",\n  \"2\": \"..---\",\n  \"3\": \"...--\",\n  \"4\": \"....-\",\n  \"5\": \".....\",\n  \"6\": \"-....\",\n  \"7\": \"--...\",\n  \"8\": \"---..\",\n  \"9\": \"----.\",\n  \"a\": \".-\",\n  \"b\": \"-...\",\n  \"c\": \"-.-.\",\n  \"d\": \"-..\",\n  \"e\": \".\",\n  \"f\": \"..-.\",\n  \"g\": \"--.\",\n  \"h\": \"....\",\n  \"i\": \"..\",\n  \"j\": \".---\",\n  \"k\": \"-.-\",\n  \"l\": \".-..\",\n  \"m\": \"--\",\n  \"n\": \"-.\",\n  \"o\": \"---\",\n  \"p\": \".--.\",\n  \"q\": \"--.-\",\n  \"r\": \".-.\",\n  \"s\": \"...\",\n  \"t\": \"-\",\n  \"u\": \"..-\",\n  \"v\": \"...-\",\n  \"w\": \".--\",\n  \"x\": \"-..-\",\n  \"y\": \"-.--\",\n  \"z\": \"--..\",\n  \".\": \".-.-.-\",\n  \",\": \"--..--\",\n  \"?\": \"..--..\",\n  \"!\": \"-.-.--\",\n  \"-\": \"-....-\",\n  \"/\": \"-..-.\",\n  \"@\": \".--.-.\",\n  \"(\": \"-.--.\",\n  \")\": \"-.--.-\"\n}";
        this.stringDictionary = mapper.readValue(jsonStr, new TypeReference<Map<String, String>>(){});

        String[] keys = this.stringDictionary.keySet().toArray(new String[0]);
        for (String key:keys){
            this.morseDictionary.put(this.stringDictionary.get(key),key);
        }
        System.out.println(this.morseDictionary.toString());
    }
    public String translateString2Morse(String str){
        StringBuilder emptyStr = new StringBuilder();
        for (int i = 0; i<str.length();i++){
            emptyStr.append(this.stringDictionary.get(("" + str.charAt(i))));
        }
        return emptyStr.toString();
    }

    public String translateMorse2String(String str){
        String strSplit[] = str.split("   ");
        String emptyStr = "";
        return "";

    }

}
