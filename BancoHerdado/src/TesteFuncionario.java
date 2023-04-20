public class TesteFuncionario {
    public static void main(String[] args) throws Exception {
        Funcionario gabriel = new Gerente();
        gabriel.setNome("Gabriel");
        gabriel.setCpf("11111111111");
        gabriel.setSalario(5000);

        System.out.println(gabriel.getNome());
        System.out.println(gabriel.getSalario());
        System.out.println(gabriel.getBonificacao());

        Gerente gerente = new Gerente();
        gerente.setSalario(50000);
        System.out.println(gerente.getBonificacao()); 

    }

}
