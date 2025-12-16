import java.util.*;

public class PlayList{

    private String nome;
    private  String descricao;
    
    /*Variável chamada lista_de_musicas
    que é um array de objetos do tipo
    Musica.
     */
    private LinkedList<Musica> lista_de_musicas;

    /*CONSTRUTOR
    essa recebe duas strings no parametro.
    uma para informar o nome e outra a descrição */
    PlayList(String nome, String descricao){ 
        this.nome = nome;
        this.descricao = descricao;
        this.lista_de_musicas = new LinkedList<>();
    }   

    public boolean Inserir(Musica nova_musica){
     lista_de_musicas.add(nova_musica);

        return true;
    }
    
    public void Listar(){
        System.out.println("Músicas dessa playlist: ");
        int i = 1;
        for(Musica m: lista_de_musicas){
            System.out.println(i + ". " + m.titulo);
            i++;
        }
        System.out.println("----------------------------");
    }

    public int TempoTotal(){
        int total = 0;
        for(Musica m: lista_de_musicas){
            total += m.duracao;
        }
        return total;
    }

    /*Metodo que informa quais são os atributos
    e os seus respectivos valores no momento atual*/
    @Override
    public String toString(){
        return "{nome = " + nome + " / " +
                "descrição = " + descricao + "}";
    }
}