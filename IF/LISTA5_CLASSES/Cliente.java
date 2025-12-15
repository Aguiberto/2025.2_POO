public class Cliente{

    protected String nome;
    private String cpf;
    private Double limite;
    private Cliente socio;

    public Cliente(String nome, String cpf, Double limite){
        this.nome = nome;
        this.cpf = cpf;
        this.limite = limite;
    }

    public void setSocio(Cliente b){
        Cliente a = this;
        a.socio = b;
        b.socio = a;
    }
    public Double getLimite(){
        if (socio == null){
             return limite;
        }
        return limite + socio.limite;
    }
    @Override
    public String toString(){
        return "{ nome = " + nome + " / " +
                "cpf = " + cpf + " / " +
                "limite = " + limite + " / " +
                "socio = " + socio +"}";
    }
}