public class Address {
    private String name, strasze, ort;
    public Address(String Name, String Strasze, String Ort){
        name = Name;
        strasze = Strasze;
        ort = Ort;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setStrasze(String strasze){
        this.strasze = strasze;
    }
    public String getStrasze(){
        return strasze;
    }
    public void setOrt(String ort){
        this.ort = ort;
    }
    public String getOrt(){
        return ort;
    }

    public String toString(){
        String returnString = "Name: " + name + ", Strasze: " + strasze + ", Ort: " + ort;
        return returnString;
    }

    public static void main(String[] args) {
        Address[] addressen = new Address[5];
        addressen[0] = new Address("Hans Albers", "Große Freiheit 1", "Hamburg");
        addressen[1] = new Address("Liselotte Pulver", "Bergstraße 2", "Bern");
        addressen[2] = new Address("Theo Lingen", "Flußgraben 3", "Hannover");
        addressen[3] = new Address("Hans Moser", "Stephansweg 4", "Wien");
        addressen[4] = new Address("Heinz Erhardt", "Dünenufer 5", "Riga");

        print(addressen);
        System.out.println(search(addressen, "Theo Lingen"));

    }

    public static void print(Address[] addressen){
        for(Address address : addressen){
            System.out.println(address.toString());
        }
    }

    public static int search(Address[] addressen, String name){
        for(int i = 0; i < addressen.length; i++){
            if(addressen[i].getName() == name){
                return i;
            }
        }
        return -1;
    }
}
