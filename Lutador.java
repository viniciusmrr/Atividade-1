
package atividadecombat;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    // duvida: tem equivalente ao FORMAT no java??
    public void apresentar(){
        System.out.println("Apresentamos o lutador :"+this.getNome());
        System.out.println("Diretamente de "+this.getNacionalidade());
        System.out.println("Com " +this.getIdade()+ " anos");
        System.out.println("Pesando " +this.getPeso() + " kg");
        System.out.println("Ganhou " +this.getVitorias() + " vezes");
        System.out.println("Perdeu " +this.getDerrotas() + " vezes");
        System.out.println("Empatou "+this.getEmpates() + " vezes");
    }
    
    private void ganharLuta(){
        this.setVitorias(this.getVitorias()+1);
    }
    private void perderLuta() {
                this.setDerrotas(this.getDerrotas()+1);

    }
    private void empatarLuta(){
                this.setEmpates(this.getEmpates()+1);

    }

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() { //para que o peso já determine a categoria, tem que estar vazio o ()
if (this.peso <50) {
    this.categoria = "Peso insuficiente";
    } else if (this.peso < 70) {
        this.categoria = "Leve";
    } else if (this.peso < 80) {
        this.categoria = "Médio";
    } else if (this.peso < 110) {
        this.categoria = "Pesado";
    }        else {
        this.categoria = "Peso acima dos parâmetros de categoria";
    }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
}
    
