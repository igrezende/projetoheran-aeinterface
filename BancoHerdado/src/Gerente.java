public class Gerente extends Funcionario implements FA{
  
    private int senha;
     
public double getBonificacao (){
        return super.getSalario(); // extendo Fa pra ter acesso ao sistema com uma senha
}

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