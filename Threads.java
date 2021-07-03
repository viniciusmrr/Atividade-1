package javaapplication1;

public class Threads {

    public static void main(String[] args) {
        Runnable estagio = new Runnable() {
            @Override
            public void run() {
                //aqui vai o que quer que aconteça dentro da thread
                for (int index = 0; index < 10; index++) {
                    System.out.println("Estágio " + index);
                    descansar(5000);
                }
            }
        };
        Runnable estudarProgramacao = new Runnable() {
            @Override
            public void run() {

                for (int index = 0; index < 20; index++) { // ou index+=1, index+=2, etc
                    System.out.println("estudando programação: " + index);
                    descansar(1000); //1000 milisegundos
                }
            }
        };

        Thread estagiar = new Thread(estagio);
        Thread programar = new Thread(estudarProgramacao);

        estagiar.start();
        descansar(3000); // esperando 3 segundos para iniciar o estudo paralelo
        programar.start();
    }

    public static void descansar(int milisegundos) {
        try {
            Thread.sleep(milisegundos);
        } catch (Exception e) {

        }

    }

}
