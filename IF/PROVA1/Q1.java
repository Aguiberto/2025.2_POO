public class Q1{
    public static void main(String[] args) {
        
        int dia = 3;
        String nomeDia = "Dia Inválido";
        if(dia == 1){
            nomeDia = "Domingo";
        }
        if(dia == 2){
            nomeDia = "Segunda";
        }
        if(dia == 3){
            nomeDia = "Terça";
        }
        System.out.println(nomeDia);
    }
}
