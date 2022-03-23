public class Main{
    public static void main(String[] args) {
        String[] grussformeln = {"Hallo", "Guten Tag", "Servus", "Moin Moin"};
        int random = (int) (Math.random()*4);
        System.out.println(grussformeln[random]);
    }
}