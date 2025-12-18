public class testeConstrutora{
    public static void main(String[] args){

        Construtora afilho = new Construtora();

        Funcionario  jobador = new Funcionario();

        jobador.setNome("Trabalhador");
        jobador.setEmail("patrãorico@gmail.com");
        jobador.setFone("84 99125-9833");

        Engenheiro ricon = new Engenheiro();

        ricon.setNome("William Zambelim");
        ricon.setEmail("willeng@gmail.com");
        ricon.setFone("+ 64 99 837204");

        //Método da classe ENGENHEIRO
        ricon.setCrea("CREA2124");

        Motorista zezin = new Motorista();

        zezin.setNome("José das chagas");
        zezin.setEmail("zedabodega123@gmail");
        zezin.setFone("84 99134432");

        // Método da classe MOTORISTA
        zezin.setCNH("CNH0495");

        // toString de cada classe
        System.out.println(jobador);
        System.out.println(ricon);
        System.out.println(zezin);

        // Funcionarios da Construtora
        afilho.Inserir(jobador);
        afilho.Inserir(ricon);
        afilho.Inserir(zezin);


        System.out.println(afilho);

        System.out.println("========== DETALHAMENTO FUNCIONÁRIOS =============");
        for(Funcionario cada_um: afilho.Colaboradores()){
            System.out.println(cada_um);
        }
    }
}