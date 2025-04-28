package com.aula;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1 - Mais pedido");
        System.out.println("2 - Favoritos da casa");
        System.out.println("3 - Fome burger");
        System.out.println("4 - Amantes de queijo");
        System.out.println("5 - O melhor da cidade");
        System.out.println("Escolha seu combo: ");
        int escolha = in.nextInt();

        ComboFacade facade = new ComboFacade();
        facade.criarCombo(escolha);
        facade.exibirItens();
        System.out.println("Total a ser pago: R$ "+facade.getPrecoTotal());
    }
}