public class TesteReferncia {

    public static void main(String[] args) {
        Funcionario g1 = new Gerente();
        g1.setNome("Irineu");
       g1.setSalario(10000);

       Funcionario ev = new EditorDeVideo();
       ev.setNome("Andre");
       ev.setSalario(4000);

       Desigener d = new Desigener();
       d.setSalario(2000);

        CotroleBonus cb = new CotroleBonus();
        cb.registra(ev);
        cb.registra(g1);
        cb.registra(d);

        System.out.println(cb.getSoma());
       // testando as bonificaçoes


    }
    
}
