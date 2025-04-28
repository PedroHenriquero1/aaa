package com.aula;

public class ComboFacade {

    private Combo combo;

 
    public void criarCombo(int codigo){
        switch (codigo){
            case 1:
                combo = new Combo(
                    new Burger("Big Boss", 20),
                    new Bebida("Coca-Cola", 10),
                    new Sobremesa("Casquinha de Baunilha", 5)
                    );
                break;
            case 2:
                combo = new Combo(
                    new Burger("X-Chicken", 19.90),
                    new Bebida("Coca-Cola", 7.90),
                    new Sobremesa("Sundae de morango", 5.70)
                );
                break;
            case 3:
                combo = new Combo(
                    new Burger("Big-boss", 25.90),
                    new Bebida("Sprite", 8.90),
                    new Sobremesa("Tortinha de maça", 10)
                );
            case 4: 
                combo = new Combo(
                    new Burger("Chesse Lover", 19.99),
                    new Bebida("Suco de laranja", 12),
                    new Sobremesa("Casquinha de baunilha", 5) 
                    );
            case 5:
                combo = new Combo(
                    new Burger("Mr. Smash", 21.90),
                    new Bebida("Suco de Uva", 12.50),
                    new Sobremesa("Tortinha de banana com sorvete de baunilha", 16.10)
                );
                break;
            default:
            System.out.println("Combo não encontrado!");
            combo = null;
        }

    }

    public void exibirItens(){
        if(combo != null){
            System.out.println("Itens do Combo");
            System.out.println(" "+combo.getBurger());
            System.out.println(" "+combo.getBebida());
            System.out.println(" "+combo.getSobremesa());
        }
    }

    public double getPrecoTotal(){

        return combo!=null ? combo.getPrecoTotal() : 0.0;
        
    }
}
