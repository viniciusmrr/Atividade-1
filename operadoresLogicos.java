package javaapplication1;

public class operadoresLogicos {
      static  String nome1 = "Felipe";
      static   String nome2 = "felipe";

    public static String getNome1() {
        return nome1;
    }

    public static void setNome1(String nome1) {
        operadoresLogicos.nome1 = nome1;
    }

    public static String getNome2() {
        return nome2;
    }

    public static void setNome2(String nome2) {
        operadoresLogicos.nome2 = nome2;
    }
                

    public static void main(String[] args) {

        if (getNome1().equals(getNome2())) {
            System.out.println(nome1 + " é igual a " + nome2);
        } else {
            System.out.println(nome1 + " é diferente de " + nome2);
        }

        if (nome1.equalsIgnoreCase(nome2)) {
            System.out.println(nome1 + " é igual a " + nome2);
        } else {
            System.out.println(nome1 + " é diferente de " + nome2);

        }
    }
}
