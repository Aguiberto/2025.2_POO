record Email(String endereco){

    /*Contrutor personalizada para validação de dados*/
    public Email{
        if(endereco == null || !endereco.contains("@")){
            throw new IllegalArgumentException("Endereço de e-mail inválido!");
        }
    }
}