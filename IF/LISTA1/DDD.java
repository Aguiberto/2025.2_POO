
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DDD{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Map<Integer, String> dddEstado = new HashMap<>();

        dddEstado.put(61,"Brasilia");
        dddEstado.put(71,"Salvador");
        dddEstado.put(11,"Sao Paulo");
        dddEstado.put(21,"Rio de Janeiro");
        dddEstado.put(32,"Juiz de Fora");
        dddEstado.put(19,"Campinas");
        dddEstado.put(27,"Vitoria");
        dddEstado.put(31,"Belo Horizonte");

        int ddd = scanner.nextInt();

        if(dddEstado.containsKey(ddd)){
             System.out.println(dddEstado.get(ddd));
        }else{
            System.out.println("DDD nao cadastrado");
        }

        scanner.close();
    }
}