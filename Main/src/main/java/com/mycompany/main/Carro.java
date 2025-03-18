package com.mycompany.main;

public class Carro extends Veiculo {
     //Classe Veiculo herdada de Carro
        public String TipoDeCombustivel;//variavel

        //Constructor
        public Carro(String marca, String modelo, int ano, String TipoDeCombustivel) {
            super(marca, modelo, ano); //Serve para chamar o constructor da classe veiculo
            this.TipoDeCombustivel = TipoDeCombustivel;
        }

        //Funcao para exibir as informacoes
        @Override
        public void exibirInfo() {
            super.exibirInfo();
            System.out.println("Tipo do Combustivel " + this.TipoDeCombustivel);
        }
    }


