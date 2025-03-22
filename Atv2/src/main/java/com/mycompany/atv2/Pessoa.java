package com.mycompany.atv2;

public class Pessoa {
    
    //Declaracao das variaveis
    public String nome;
    public String CPF;
    public int dta;
    
    //Constructor
    public Pessoa(String nome, String CPF,int dta){
        this.nome = nome;
        this.CPF = CPF;
        this.dta = dta;
    }
    
    //Funcao para exibir as informacoes
    public void exibirInfo(){
       System.out.println("Nome: " + this.nome);
       System.out.println("CPF: " + this.CPF);
       System.out.println("Data de Nascimento: " + this.dta);
    }
}
