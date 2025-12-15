public class testePlayList{
    public static void main(String[] args){

        PlayList favoritos = new PlayList("meus favoritos","para relaxar");

        Musica musica_1 = new Musica("Negro Drama", "Racionais MC's", "1000 TRUTAS 1000 TRETAS", "2001",6);
        Musica musica_2 = new Musica("Coração gelado","Djonga", "Não sei", "2022", 4);
        Musica musica_3 = new Musica("To pra ver","Criolo","Ainda há tempo","2017", 3);

        favoritos.Inserir(musica_1);
        favoritos.Inserir(musica_2);

        favoritos.Listar();
        int tempo = favoritos.TempoTotal();
        
        System.out.println(favoritos);

    }
}