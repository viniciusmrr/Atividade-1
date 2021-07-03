package javaapplication1;

import java.util.InputMismatchException;
import java.util.Scanner;
import javaapplication1.Entidades.Trabalhador;
import javaapplication1.Utilitarios.MensagensDeDebitos;

public class QuestionarioTrabalhador {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Trabalhador trabalhador = new Trabalhador();

        System.out.println(
                "Digite seu nome: ");
        String nome = scan.nextLine(); //APENAS A PRIMEIRA PALAVRA ANTES DO ESPAÇO

        trabalhador.setNome(nome);

        System.out.println(
                "Nome digitado é: " + nome);

        System.out.println(
                "Digite sua idade: ");
        int idade = Integer.parseInt(scan.nextLine().trim()); // trim remove espaços antes e depois do texto. É opcional, prevenção, limpa limpa

        trabalhador.setIdade(idade);

        System.out.println(
                "Digite seu email: ");
        String email = scan.nextLine();

        trabalhador.setEmail(email);

        try {
            System.out.println("Digite seu debito: ");
            double debito = scan.nextDouble();
            trabalhador.setDebito(debito);
        } catch (InputMismatchException e) {
            System.out.println("Use vírgulas e não pontos!");
            double debito = scan.nextDouble();
            trabalhador.setDebito(debito);
        }
        System.out.println("Digite na sua profissão: ");
        String profissao = scan.nextLine();
        trabalhador.setProfissao(profissao);
        
        try {
            System.out.println("Digite seu salário: ");
            double salario = scan.nextDouble();
            trabalhador.setSalario(salario);
        } catch (InputMismatchException e) {
            System.out.println("Use vírgulas e não pontos!");
            double salario = scan.nextDouble();
            trabalhador.setSalario(salario);
    }
        MensagensDeDebitos mensagensDeDebitos = new MensagensDeDebitos();
        String mensagem = mensagensDeDebitos.getMensagemByUsuario(trabalhador);
        System.out.println(mensagem);
        
        String mensagem2 = mensagensDeDebitos.getMensagemByTrabalhador(trabalhador);
        System.out.println(mensagem2);
        
    }
}
