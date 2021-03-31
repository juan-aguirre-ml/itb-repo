package com.clase3.calorias.repositories;

import com.clase3.calorias.dtos.CaloriesDTO;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
@Repository
public class FoodRepositoryImpl implements FoodRepository{

    @Override
    public CaloriesDTO obtenerCaloriasPorNombre(String nombreIngrediente) {
        CaloriesDTO ingrediente = null;
        HashMap<String,Integer> ings = loadDatabase();

        if (ings.containsKey(nombreIngrediente)){
            ingrediente = new CaloriesDTO(nombreIngrediente,ings.get(nombreIngrediente));
            return ingrediente;
        }else
            return null;
    }



    private HashMap<String, Integer> loadDatabase(){
        File file = null;
        try {
            file = ResourceUtils.getFile("food.json");

        }catch (Exception e){
            e.printStackTrace();
        }
        ObjectMapper mapper = new ObjectMapper();
        TypeReference<HashMap<String,Integer>> typeRef = new TypeReference<HashMap<String, Integer>>(){};
        HashMap<String,Integer> db = null;

        try {
            db = mapper.readValue(file,typeRef);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return db;
    }
}
