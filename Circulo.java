/*MODELAGEM DE UM CIRCULO*/ 

public class Circulo{
    private double raio;

    /* CONTRUTOR / INICIALIZADOR */
    public Circulo(double r){
        if(r >= 0){
            raio = r;
        }else{
            raio = 1.0;
        }
    }
    /*CONSTRUTOR 2 , desobriga o usuário coloca um valor inicial*/
    public Circulo(){
        raio = 1.0;
    }

    /*controle para alterar o raio*/
    public double setRaio(double r){
        if( r >= 0){
            raio = r;
        }
    }

    public double getRaio(){
        return  raio; 
    }

    public double area(){
        return Math.PI * raio *raio;
    }

    public double circunferencia(){
        return 2 * Math.PI * raio;
    }

    // public static void main (String[] args){
    //     Circulo meuCirculo = new Circulo();
    //     meuCirculo.raio = 5;
    //     System.out.println(meuCirculo.area());
    //     System.out.println(meuCirculo.circunferencia());
        
    // }
}

/* Tornar o atributo raio publico para permitir atribuir um valor
OU ja atribuir um valor ao raio dentro da própria classe*/

/*Metodo interno setRaio permite que o usuário altere o valor do raio
mas tendo o controle das possíveis mudanças (Não pode colocar valor negativo)*/ 