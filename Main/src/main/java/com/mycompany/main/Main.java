package com.mycompany.main;

public class Main {

    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("Fiat" , "Cronos" , 2022);
       
        Carro c1 = new Carro("Toyota" , "Mitsubisgi" , 2015, "Gasolina");
      
        CarroEletrico ce1 = new CarroEletrico("BYD" , "Sedan" , 2022, 74);
       
        System.out.println("=== Informações do Veículo ===");
        v1.exibirInfo();
        
        System.out.println("\n=== Informações do Carro ===");
        c1.exibirInfo();

        System.out.println("\n=== Informações do Carro Elétrico ===");
        ce1.exibirInfo();
    }
}
