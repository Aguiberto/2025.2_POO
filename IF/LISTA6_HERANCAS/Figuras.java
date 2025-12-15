public class Figuras{
    
    // ATRIBUTOS
    protected double base;
    protected double altura;

    // CONSTRUTOR
    public Figuras(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double getBase(){
        return base;
    }

    public double getAltura(){
        return altura;
    }

    public double CalcArea(){
        return base * altura;
    }

    public double CalcDiagonal(){
    double hipotenusa = Math.sqrt(base*base + altura*altura);
        return hipotenusa;
    }

    @Override
    public String toString(){
        return "{base = " + base + " / " + 
                "altura = " + altura + "}";
    }

}