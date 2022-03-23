public class Main {
    public static void main(String[] args) {
        long number = 16;
        System.out.println(String.valueOf(number));
        for(int i = 1; i <= 5; i++){
            number = number * number;
            System.out.println(number);
        }
    }
}
