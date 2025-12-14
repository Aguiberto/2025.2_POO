import java.util.*;


public class Bingo{

    private int numBolas;
    private List<Integer> selecionados;
    private List<Integer> sacola;

    public Bingo(){                                     // construtor
        selecionados = new ArrayList<>(); 
        sacola = new ArrayList<>();
    }
    public void setBolas( int num){
        if( num > 0){
            this.numBolas = num;
        }
    }

    public void iniciar(){

        sacola.clear();

        for(int i = 1; i < numBolas+1;i++){
            sacola.add(i);
        }
    }

    public int proximo(){

        Collections.shuffle(sacola);

        int escolhido = sacola.get(0);
        this.selecionados.add(escolhido);

        return escolhido;
    }

    public List<Integer> sorteados (){
        return this.selecionados;
    }


}