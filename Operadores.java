package javaapplication1;

public class Operadores {

    public static void main(String[] args) {
        int idade1 = 18;
        int idade2 = 18;
        int idade3 = 18;

        if (idade1 > 18) {
            System.out.println("A idade1 é superior a 18");
        } else {
            System.out.println("A idade1 é infernor a 18");
        }
        if (idade2 == 18) {
            System.out.println("A idade2 é igual a 18");
        } else {
            System.out.println("A idade2 é diferente de 18");
        }
        if (idade3 >= 18) {
            System.out.println("A idade3 é maior ou igual a 18");
        } else {
            System.out.println("A idade3 é diferente de 18");
        }
        
        if (idade2 <= 18) {
            System.out.println("A idade 2 é menor ou igual a 18");
        }
        
        if (idade3 < 18) {
            System.out.println("Idade 2 é menor que 18");
        }
        
        int idade4 = 11;
        if (idade4 >18) {
            System.out.println("MAior de idade");                
    } else if (idade4 == 17) {
            System.out.println("Exataente 18 anos");
    }    else if (idade4 ==16 || idade4==14) {
            System.out.println("16 ou 14 anos");
    } else if (idade4 < 18 && idade4 > 16) {
            System.out.println("17 anos");
    }
    String corDoCarro = "vermelho";
    switch (corDoCarro) {
    case "vermelho":
        System.out.println("é vermelho");
    break;
    case "amarelo":
        System.out.println("é amarelo");
    break;
    case "roxo":
        System.out.println("é roxo");
    break;
    default:
        System.out.println("Então não sei");
    
}
}
}
