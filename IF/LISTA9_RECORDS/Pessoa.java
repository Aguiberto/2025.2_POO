record Pessoa(String nome, int idade){

    Pessoa{
        if(idade < 0){
            throw new IllegalArgumentException("Idade inválida, valor não pode ser negativo");
        }
    }

    public String saudacao(){
        return "Olá, tudo bem com você?";
    }

}