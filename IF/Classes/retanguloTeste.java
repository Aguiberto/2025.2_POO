public class retanguloTeste{
    public static void main( String[] args){

        Retangulo meuRetangulo = new Retangulo();

        meuRetangulo.setAltura(10);
        meuRetangulo.setBase(5);

        double diagonal = meuRetangulo.getDiagonal();

        System.out.println(meuRetangulo.toString());
        System.out.println("A altura vale: " + meuRetangulo.getAltura());
        System.out.println("Comprimento da base: " + meuRetangulo.getBase());
        System.out.println("Tamanho da diagonal :" + diagonal);
        System.out.println("Area do retangulo:" + meuRetangulo.getArea());
}