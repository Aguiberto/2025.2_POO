public class testeEmpresa{
    public static void main(String[] args){

        Cliente joao = new Cliente("João","059.392.293-66",10527.34);
        Cliente hazan = new Cliente("Hazan","764.681.223-42",10523.34);
        Cliente coriu = new Cliente("Coriu","123,345,987-36",503482.99);

        Empresa AGC_Consultoria = new Empresa();

        AGC_Consultoria.Inserir(coriu);
        AGC_Consultoria.Inserir(hazan);
        AGC_Consultoria.Inserir(joao);

        AGC_Consultoria.listar();
    }
}