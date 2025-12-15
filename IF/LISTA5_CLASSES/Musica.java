public class Musica{

    // ATRIBUTOS
    protected String titulo;
    private String artista;
    private String album;
    private String dataInclusao;
    protected int duracao;

    // CONSTRUTOR
    /*Ao criar o objeto musica o usuário terá que informar o valor desses parametros
    que será colocado em cada atributo da classe no objeto*/
    public Musica(String titulo, String artista, String album, String dataInclusao, int duracao){
        this.titulo = titulo;
        this.artista = artista;
        this.album = album;
        this.dataInclusao = dataInclusao;
        this.duracao = duracao;
    }

    @Override
    public String toString(){
        return "Musica{" +
                "titulo = " + titulo + " / "+
                "artista = " + artista + " / "+
                "album = " + album + " / " +
                "dataInclusao = " + dataInclusao + " / " +
                "duração = " + duracao + "}";
    }

}