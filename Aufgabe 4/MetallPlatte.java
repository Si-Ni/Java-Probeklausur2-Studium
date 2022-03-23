public class MetallPlatte {
    double laenge, breite;

    public MetallPlatte(double laenge, double breite){
        this.laenge = laenge;
        this.breite = breite;
    }

    public Double berechneFlaeche(){
        return laenge * breite;
    }

    public String vergleicheMit(MetallPlatte vergleichsPlatte){
        double flaeche = this.berechneFlaeche();
        double vergleichsFlaeche = vergleichsPlatte.berechneFlaeche();
        return (flaeche > vergleichsFlaeche ? "größer als" : "kleiner als oder gleich");
    }

    public static void main(String[] args){
        MetallPlatte metallPlatte1 = new MetallPlatte(10.3, 20.7);
        MetallPlatte metallPlatte2 = new MetallPlatte(10.3, 20.7);
        MetallPlatte metallPlatte3 = new MetallPlatte(5.2, 3.8);
        String vergleich1 = metallPlatte1.vergleicheMit(metallPlatte2);
        String vergleich2 = metallPlatte1.vergleicheMit(metallPlatte3);
        System.out.println("Platte 1 ist " + vergleich1 + " Platte 2.");
	    System.out.println("Platte 1 ist " + vergleich2 + " Platte 3.");
    }
}
