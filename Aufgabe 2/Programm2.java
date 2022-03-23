import java.math.BigInteger;

public class Programm2 {
    public static void main(String[] args){
        BigInteger number = new BigInteger("16");
        System.out.println(number.toString());
        for(int i = 1; i <= 5; i++){
            number = number.multiply(number);
            System.out.println(number);
        }
    }
}
