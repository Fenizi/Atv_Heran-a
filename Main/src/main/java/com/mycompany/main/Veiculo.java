package com.mycompany.main;

public class Veiculo {

    //Variaveis
    public String marca;
    public String modelo;
    public int ano;

    //Constructor Veiculo
    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    //Funcao para exibir as informacoes da Classe Veiculo
    public void exibirInfo() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
    }
}


    
