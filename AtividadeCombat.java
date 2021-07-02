package atividadecombat;

public class AtividadeCombat {

    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];

        l[0] = new Lutador("Minotauro", "Brasileiro", 31, 1.75f, 68.9f, 11, 2, 1);
        l[1] = new Lutador("Spider", "Americano", 32, 1.74f, 65.6f, 12, 1, 0);
        l[2] = new Lutador("Yago", "Argentino", 34, 1.82f, 80.6f, 10, 0, 3);

        l[0].apresentar();
        l[3].ganharLuta();
        
        
    }

}
 /// PENDENTE: CRIAR CLASSE LUTA PARA FAZER LUTAREM