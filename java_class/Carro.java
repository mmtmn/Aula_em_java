import java.util.Scanner;

public class Carro{
    String nome;
    int quilometragem;
    int tanque;
    int capacidade_tanque;
    boolean documentos_pagos;
    char tipo_de_combustivel;

    void display() {
        System.out.println(
            "Nome: " + nome + '\n'
            + "Quilimetragem: " + quilometragem + '\n'
            + "Tanque: " + tanque + '\n'
            + "Documentos: " + documentos_pagos + '\n'
            + "tipo de combustivel: " + tipo_de_combustivel + '\n'
            );
    }

    void falta() {
        int lack;
        
        if (tanque<capacidade_tanque) {
            int falta = capacidade_tanque - tanque;
            System.out.println(
                "O seu carro tem um total de" 
                + " " + tanque
                + " litros de gasolina," + '\n'
                + "uma capacidade total de"
                + " " +  capacidade_tanque
                + " litros," + "\n"
                + "no momento faltam"
                + " " + falta
                + " " + "Litros."
                );
        }
        else {
            System.out.println("O tanque já esta completo.");
        }
    }



} // fim da classe carro