public class testeCliente{
    public static void main(String[] args){

        Cliente jao = new Cliente("Jão", "094.325.894-09",3475799.09);
        Cliente Urbano = new Cliente("Urbano","674.309.021-70",379039.10);
        Cliente Irineu = new Cliente("Irineu","049.912.000-65,",650.00);

        jao.setSocio(Urbano);

        System.out.println("Limite de Jão vale: " + jao.getLimite());
        System.out.println("Limite de Irineu: " + Irineu.getLimite());

    }
}