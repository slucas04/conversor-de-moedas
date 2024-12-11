package br.com.alura.conversordemoedas;

import java.io.IOException;
import java.util.Scanner;

public class MenuInicial {
    private String opcao;

    public String getOpcao() {
        return opcao;
    }

    public void setOpcao(String opcao) {
        this.opcao = opcao;
    }

    public void menuInicial() throws IOException, InterruptedException {
        Scanner entrada = new Scanner(System.in);
        System.out.println("****************************************************");
        System.out.println("Seja bem-vindo ao Conversor de Moedas!");
        System.out.println(" ");
        System.out.println("1) Real brasileiro =>> Rand sul-africano");
        System.out.println("2) Rand sul-africano =>> Real brasileiro");
        System.out.println("3) Real brasileiro =>> Naira nigeriana");
        System.out.println("4) Naira nigeriana =>> Real brasileiro");
        System.out.println("5) Real brasileiro =>> Peso filipino");
        System.out.println("6) Peso filipino =>> Real brasileiro");
        System.out.println("7) Sair");
        System.out.println("Digite o número de uma das opções acima:");
        setOpcao(entrada.nextLine());
        System.out.println(" ");
        System.out.println("****************************************************");
        decide();
    }

    public void decide() throws IOException, InterruptedException {

        if(getOpcao().equals("1")){
            Conversor conversor = new Conversor();
            conversor.recebe("BRL", "ZAR");
            menuInicial();
        } else if (getOpcao().equals("2")) {
            Conversor conversor = new Conversor();
            conversor.recebe("ZAR", "BRL");
            menuInicial();
        } else if (getOpcao().equals("3")) {
            Conversor conversor = new Conversor();
            conversor.recebe("BRL", "NGN");
            menuInicial();
        } else if (getOpcao().equals("4")) {
            Conversor conversor = new Conversor();
            conversor.recebe("NGN", "BRL");
            menuInicial();
        } else if (getOpcao().equals("5")) {
            Conversor conversor = new Conversor();
            conversor.recebe("BRL", "PHP");
            menuInicial();
        } else if (getOpcao().equals("6")) {
            Conversor conversor = new Conversor();
            conversor.recebe("PHP", "BRL");
            menuInicial();
        } else if (getOpcao().equals("7")) {
            System.out.println("Encerrando o conversor! Obrigado por nos escolher. :)");
        } else {
            System.out.println("Opção inválida, tente novamente!");
            menuInicial();

        }
    }
}
