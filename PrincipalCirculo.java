public class PrincipalCirculo{
    public static void main(String[] args) {

        Circulo meuCirculo = new Circulo(2.0);
        var s = IO.readln("digite o valor do raio");
        var raio = Double.parseDouble(s);
        meuCirculo.setRaio(raio);
        System.out.println(meuCirculo.getRaio());
        System.out.println(meuCirculo.area());
        System.out.println(meuCirculo.circunferencia());

    }
}