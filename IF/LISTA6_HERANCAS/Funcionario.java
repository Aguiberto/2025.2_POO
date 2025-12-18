public class Funcionario{

    private String nome;
    private String email;
    private String telefone;

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setFone(String fone){
        this.telefone = fone;
    }
    
    public String getNome(){
        return nome;
    }
    public String getEmail(){
        return email;
    }
    public String getFone(){
        return telefone;
    }
    
    @Override 
    public String toString(){
        return "{nome = " + nome + " / " +
                "email = " + email + " / " +
                "telefone = " + telefone + "}";
    }

}