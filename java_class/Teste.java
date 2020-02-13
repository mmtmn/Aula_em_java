class Teste{
    public static void main(String[] args){
        Carro opala = new Carro();

        opala.nome = "Opala";
        opala.quilometragem = 100000;
        opala.tanque= 10;
        opala.capacidade_tanque =60;
        opala.documentos_pagos = true;
        opala.tipo_de_combustivel = 'G';

        opala.display();
        opala.falta();
        //opala.completar();
    }
    
}