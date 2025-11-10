public class disciplinaTeste{
    public static void main( String[] args){

        Disciplina disciplina = new Disciplina();

        disciplina.nome = "Science";
        disciplina.setNota1(70);
        disciplina.setNota2(80);

        System.out.println("A média parcial vale: " + disciplina.media_parcial());
    }
}