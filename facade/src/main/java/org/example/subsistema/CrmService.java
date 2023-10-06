package org.example.subsistema;

public class CrmService {
    private CrmService(){
        super();
    }
    public static void gravarCLiente(String nome, String cep, String cidade, String estado){
        System.out.println("Cliente salvo no sistema CRM:");
        System.out.println(nome);
        System.out.println(cep);
        System.out.println(cidade);
        System.out.println(estado);
    }
}
