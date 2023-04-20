public class Cliente implements FA{
    private int senha;   

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
       
    }

    @Override
    public boolean autentica(double senha2){
        if(this.senha == senha2) {
            return true;
        } else {
            return false; 
        }
    }
    


  
}
