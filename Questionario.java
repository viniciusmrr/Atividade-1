/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.InputMismatchException;
import java.util.Scanner;
import javaapplication1.Entidades.Usuario;
import javaapplication1.Utilitarios.MensagensDeDebitos;
//PARA UTILIZAR SCANNER, TEM QUE IMPORTAR O PACOTE SENÃO VAI DAR ERRO
// CTRL SHIFT I

/**
 *
 * @author java01
 */
public class Questionario {

    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        Scanner scan = new Scanner(System.in); //classe que foi criada para scanear o nome do usuario
        System.out.println("Digite seu nome: ");
        String nome = scan.nextLine(); //APENAS A PRIMEIRA PALAVRA ANTES DO ESPAÇO
usuario.setNome(nome);
        System.out.println("Nome digitado é: " + nome);
        
        System.out.println("Digite sua idade: ");
        int idade = Integer.parseInt(scan.nextLine().trim()); // trim remove espaços antes e depois do texto. É opcional, prevenção, limpa limpa
               usuario.setIdade(idade);

        System.out.println("Digite seu email: ");
        String email = scan.nextLine();
        usuario.setEmail(email);

        try {
            System.out.println("Digite seu debito: ");
            double debito = scan.nextDouble();
            usuario.setDebito(debito);
        } catch (InputMismatchException e) {
            System.out.println("Use vírgulas e não pontos!");
            double debito = scan.nextDouble();
            usuario.setDebito(debito);
        }
   //     System.out.println("nome: " + usuario.getNome());
   //     System.out.println("email: " + usuario.getEmail());
    //    System.out.println("debito: " + usuario.getDebito());
   //             System.out.println("idade: " + usuario.getIdade());
                
        MensagensDeDebitos mensagensDeDebitos = new MensagensDeDebitos();
        String mensagem = mensagensDeDebitos.getMensagemByUsuario(usuario);
        System.out.println(mensagem);
    }
}
