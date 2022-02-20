public class Phone {
    public String number;
    public String model;
    public double weight;

    public void reciveCall (String name, String n){
        System.out.println("Звонит " + name + ", номер: " + n);
    }
    public String getNumber () {
        return number;
    }
    public Phone(String n, String m, double w){
        number = n;
        model = m;
        weight = w;
    }
    public Phone(String n, String m){
        number = n;
        model = m;
    }
    public Phone(){    }
    public void sendMessage () {
        System.out.println("Номера телефонов:");
    }
    public String toString () {
        return number + ", " + model + ", " + weight;
    }
}
