public abstract class Funcionario {
    private String nome;
    protected double salario;
    private String cpf;

    public abstract double getBonificacao ();

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setCpf(int i) {
    }
    public void setNome(Funcionario gabriel) {
    }

}