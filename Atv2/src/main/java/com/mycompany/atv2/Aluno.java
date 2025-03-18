package com.mycompany.atv2;

public class Aluno extends Pessoa {

    //Declarar variaveis de Pessoa
    public int RA;
    public String curso;

    //Constructor para chamar as variveis de Pessoa e declarar as novas
    public Aluno(String nome, String CPF, int dta, int RA, String curso) {
        super(nome, CPF, dta);
        this.RA = RA;
        this.curso = curso;
    }

    //Funcao para exibir as informacoes
    @Override
    public void exibirInfo() {
        super.exibirInfo();
    }
}
