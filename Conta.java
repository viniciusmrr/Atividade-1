package atividadebanco;

public class Conta {

    private int num;
    private String tipo;
    private double saldo;
    private String dono;
    private boolean abertaOuFechada;
    private double Taxa;

    

    public void setNum(int a) {
        this.num = a;
    }

    public void setTipo(String b) {
        this.tipo = b;
    }

    public void setSaldo(double c) {
        this.saldo = c;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public void setAbertaOuFechada(boolean e) {
        this.abertaOuFechada = e;
    }

    public int getNum() {
        return num;
    }

    public String getTipo() {
        return tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getDono() {
        return dono;
    }

    public boolean isAbertaOuFechada() {
        return abertaOuFechada;
    }
    
    public Conta() {
        this.setSaldo(0);
        this.setAbertaOuFechada(false);
    }

    public void abrirConta(String t) {
        setTipo(t);
        setAbertaOuFechada(true);
        setSaldo(0);
        System.out.println("Conta aberta!");
    }

    public void fecharConta() {
        if (saldo != 0) {  // não consegui colocar if (setSaldo(!=0))
            System.out.println("O saldo precisa estar zerado para que a conta seja finalizda!");
        } else {
            setAbertaOuFechada(false);
            System.out.println("Conta encerrada!");
        }
    }

        public void depositar(double v) {
        if (isAbertaOuFechada()) { // por que não isAbertaOuFechada(=true)?
            setSaldo(getSaldo() + v);
            System.out.println("Valor de" + this.getSaldo() + " depositado!");
        } else {
            System.out.println("A conta precisa estar aberta para depositar!");
        }
    }
        public void sacar(double v2) {
            if (isAbertaOuFechada()) {
                if (getSaldo()> v2) {
                    setSaldo(getSaldo() - v2);
                                    }
                else {
                    System.out.println("Saldo insuficiente!");
                }
                //else {
                       // System.out.println("A conta precisa estar aberta!");
                   //     }
            }
    }

    
        
    }
