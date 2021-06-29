package javaapplication1;

public class tratativasDeErros {

    public static void main(String[] args) {
        String numeroEmString = "teste";

        try {
            double numeroEmDouble = Double.parseDouble(numeroEmString);
            System.out.println("Número convertido com sucesso! " + numeroEmDouble);
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
        }

        double numeroEmDouble = Double.parseDouble(numeroEmString);
        System.out.println("Número convertido com sucesso! " + numeroEmDouble);
    }
}
