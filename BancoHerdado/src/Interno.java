public  class Interno {
    private double senha = 123;

    public void autentica (FA fa){
       boolean aut = fa.autentica(this.senha);// auntenticando pra entrar nos sistema com uma senha
        if (aut){
            System.out.println("Acesso liberado");
            } else{
                System.out.println("Acesso negado");
            }

    }


    
}
