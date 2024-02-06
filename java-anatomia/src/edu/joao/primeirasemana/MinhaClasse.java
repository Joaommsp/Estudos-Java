package edu.joao.primeirasemana;
public class MinhaClasse {

  public static void main(String [] args) {
    
    // final String BR = "Brasil"; // Valor fixo 

    // String meuNome = "João";

    // int anoFabricacao = 2022;

    // boolean verdadeira = true;

    // anoFabricacao = 2023;


    String primeiroNome = "João";
    String segundoNome = "Marcos";

    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
    System.out.println(nomeCompleto);
  }

  public static String nomeCompleto( String primeroNome, String segundoNome) {
    return "Resultado do método " + primeroNome.concat(" ").concat(segundoNome);
  }

}
