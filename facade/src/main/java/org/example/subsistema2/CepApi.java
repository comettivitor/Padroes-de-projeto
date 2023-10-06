package org.example.subsistema2;

public class CepApi {
    private static CepApi instance = new CepApi();

    private CepApi(){
        super();
    }

    public static CepApi getInstance(){
        return instance;
    }

    public String recuperarCidade(){
        return "São Mateus";
    }
    public String recuperarEstado(){
        return "Espírito Santo";
    }
}
