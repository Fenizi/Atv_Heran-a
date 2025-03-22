package com.mycompany.atv2;

public class Professor extends Pessoa {

    //Declarar variaveis de Pessoa
    public String disciplina;
    public int RF;

    //Constructor para chamar as variveis de Pessoa e declarar as novas
    Professor(String nome, String CPF, int dta, String disciplina,int RF) {
        super(nome, CPF, dta);
        this.disciplina = disciplina;
        this.RF = RF;
    }
    
    //Funcao para exibir as informacoes
    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Disciplina: " + this.disciplina);
        System.out.println("RF: " + this.RF);
    }
    
}
