 /*Classe para descrever uma disciplina e a nota dos alunos */

    /* Notas : 1º e 2º bimestre
     * Calcular média ponderada
     * 1º peso : 2
     * 2º peso : 3
     * Média parcial : Notas dos bimestres + pesos
     * Média final : média aritmética  entre MÉDIA PARCIAL + PROVA FINAL.
     */

public class Disciplina{

    private float nota_bimestre_1;
    private float nota_bimestre_2;
    private float prova_final;
    private int peso1 = 2;
    private int peso2 = 3;
    public String nome;

    public void setNota1( float n1){
        if(n1 >= 0 && n1 <= 100  ){
            nota_bimestre_1 = n1;
        }else{
            System.out.println("Nota inválida");
        }
    }
    public void setNota2( float n2){
        if(n2 >= 0 && n2 <= 100){
            nota_bimestre_2 = n2;
        }else{
            System.out.println("Nota inválida");
        }
    }

    public void setPF( float n){
        if( n >= 0 && n <= 100){
            prova_final = n;
        }
    }   

    public float media_parcial(){
        float media = ((this.nota_bimestre_1 * peso1) + (this.nota_bimestre_2 * peso2)) / 5;
        return media;
    }

    public float media_final(){
        return ( this.media_parcial() + this.prova_final)/2;
    }
}