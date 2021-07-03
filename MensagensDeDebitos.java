package javaapplication1.Utilitarios;

import javaapplication1.Entidades.Trabalhador;
import javaapplication1.Entidades.Usuario;

public class MensagensDeDebitos {

    public String getMensagemByUsuario(Usuario usuario) {
        String mensagem = "Bom dia! ";

        mensagem += "O usuário " + usuario.getNome() + " ";
        mensagem += "possui um débito de R$ " + usuario.getDebito() + " ";
        mensagem += "em aberto ainda.";
        return mensagem;
    }

    public String getMensagemByTrabalhador(Trabalhador trabalhador) {
        double valorParcelaMinima = 350;
        double entrada = trabalhador.getDebito() % valorParcelaMinima;
        double depoisDaEntrada = trabalhador.getDebito() - entrada;
        double parcelas = depoisDaEntrada / valorParcelaMinima;

        String mensagem = "Ola, o trabalhador " + trabalhador.getNome()
                + " possui um débito de R$ " + trabalhador.getDebito()
                + " que podemos parcelar em " + parcelas + " x de"
                + " R$ " + valorParcelaMinima + " com uma"
                + "entrada de R$ " + entrada;
        return mensagem;

    }
}
