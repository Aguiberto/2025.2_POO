public class Sequencia2{
    public static void main(String[] args) {

        int i = 1;
        int j = 7;
        int contador = 0;

        while(i <= 9){
            while(j>=5){
                System.out.println("I" + "=" + i + " " + "J"+"="+j);
                j-=1;
            }
            j = 7;
            i+=2;
        }
    }
}