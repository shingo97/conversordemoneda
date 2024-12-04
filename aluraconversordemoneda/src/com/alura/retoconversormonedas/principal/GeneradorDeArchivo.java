package com.alura.retoconversormonedas.principal;

import com.alura.retoconversormonedas.modelos.MonedaAPI;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;

import java.io.FileWriter;
import java.io.IOException;

import static javax.swing.UIManager.get;

public class GeneradorDeArchivo {


    public void guardarJson() throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
            FileWriter escritura = new FileWriter(MonedaAPI.class + ".json");
        Object MonedaAPI = new Object();
        escritura.write(gson.toJson(MonedaAPI));
            escritura.close();

    }


}
