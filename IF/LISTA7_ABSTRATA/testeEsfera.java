public class testeEsfera{
    public static void main(String [] arg){

        Esfera do_dragao = new Esfera(5.0);

        double volume = do_dragao.getVolume();

        System.out.println("O volume dessa esfera vale = " + volume);

    }
}