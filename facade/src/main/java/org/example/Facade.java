package org.example;

import org.example.subsistema.CrmService;
import org.example.subsistema2.CepApi;

public class Facade {
    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstance().recuperarCidade();
        String estado = CepApi.getInstance().recuperarEstado();

        CrmService.gravarCLiente(nome,cep,cidade,estado);
    }
}
