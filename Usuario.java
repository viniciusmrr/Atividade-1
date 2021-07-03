package javaapplication1.Entidades;

public class Usuario {
    private String nome;
    private String email;
    private double debito;
private int idade;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public String getEmail() {
        return email;
    }

    
    public void setEmail(String email) {
        this.email = email;
    }

    
    public double getDebito() {
        return debito;
    }

    
    public void setDebito(double debito) {
        this.debito = debito;
    }
}
