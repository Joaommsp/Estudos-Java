package com.projeto.atribuicaoreferencia;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int intA = 1;
        int intB = intA;

        System.out.println("intA = " + intA + " intB = " + intB);

        intA = 2;

        System.out.println("intA = " + intA + " intB = " + intB);


        MeuObjeto objeto1 = new MeuObjeto(1);


        MeuObjeto objeto2 = objeto1;

        System.out.println("Objet1= " + objeto1 + " objeto2=" + objeto2);

        objeto1.setNum(5);

        System.out.println("Objet1= " + objeto1 + " objeto2=" + objeto2);

    }
}