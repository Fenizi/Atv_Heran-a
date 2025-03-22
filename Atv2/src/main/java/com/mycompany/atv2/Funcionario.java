package com.mycompany.atv2;

public class Funcionario extends Pessoa {

    //Declarar variaveis de Pessoa
    public String cargo;
    public int RGM;

    //Constructor para chamar as variveis de Pessoa e declarar as novas
    Funcionario(String nome, String CPF, int dta,String cargo,int RGM) {
        super(nome, CPF, dta);
        this.cargo = cargo;
        this.RGM = RGM;
    }

    //Funcao para exibir as informacoes
    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Cargo" + this.cargo);
        System.out.println("RGM: " + this.RGM);
    }
    
}
