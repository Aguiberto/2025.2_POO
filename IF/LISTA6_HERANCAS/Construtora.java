import java.util.LinkedList;

public class Construtora{

    private LinkedList<Funcionario> funcionarios;

    public Construtora(){
        funcionarios = new LinkedList<>();
    }

    public void Inserir(Funcionario novo_funcionario){
        funcionarios.add(novo_funcionario);
    }

    public LinkedList<Funcionario> Colaboradores(){
        return funcionarios;
    }

    public LinkedList<Engenheiro> getEngenheiros(){
        LinkedList<Engenheiro> lista_engenheiro = new LinkedList<>();

            for(Funcionario f: funcionarios){
                if( f instanceof Engenheiro){
                    lista_engenheiro.add((Engenheiro)f);
                }
            }
            return lista_engenheiro;
    }

    public LinkedList<Motorista> getMotorista(){
        LinkedList<Motorista> lista_motorista = new LinkedList<>();

        for(Funcionario f: funcionarios){
            if(f instanceof Motorista){
                lista_motorista.add((Motorista)f);
            }
        } return lista_motorista;
    }

    @Override
    public String toString(){
        return " A construtora tem: " + funcionarios.size() + " funcionários.";
    }

}