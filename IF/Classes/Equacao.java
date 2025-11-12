/*Classe que calcula uma Equação do 2º grau
Deve calcular o delta
Calcular as raízes
Mostrar os atributos
Permitir alterar os valores dos atributos
Mostrar quais são os atributos
Ter um construtor */

public class Equacao{
    
    private int a;
    private int b;
    private int c;

    public Equacao( int a,int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(int a){
        if(a >= 0){
            this.a = a;
        }
    }
    public void setB(int b){
        if(b >= 0){
            this.b = b;
        }
    }
    public void setC(int c){
        if(c >= 0){
            this.c = c;
        }
    }

    public String toString(){
        String atributos = "Os atributos são: A, B, C";
        return atributos;
    }

    public int getA(){
        return this.a;
    }
    public int getB(){
        return this.b;
    }
    public int getC(){
        return this.c;
    }

    public int delta(){
        return ((b*b)-4*a*c);
    }
    public double xI(){
        double raiz1 = (-b + Math.sqrt(this.delta())) / (2*a);
        return raiz1;
    }
    public double xII(){
        double raiz2 = (-b - Math.sqrt(this.delta())) / (2*a);
        return raiz2; 
    }
}
