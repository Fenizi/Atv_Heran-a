package com.mycompany.main;

public class CarroEletrico extends Veiculo {
      //Classe CarroEletrico
        public int capacidadeBateria;//variavel

        //Constructor
        public CarroEletrico(String marca, String modelo, int ano, int capacidadedeBateria) {
            super(marca, modelo, ano);
            this.capacidadeBateria = capacidadedeBateria;
        }
        
        //Funcao para exibir as informacoes
        @Override
        public void exibirInfo() {
            super.exibirInfo();
            System.out.println("Capacida da Bateria " + this.capacidadeBateria + "KwM");
        }
    }

