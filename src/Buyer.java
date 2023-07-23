import java.util.ArrayList;

public class Buyer extends Person{
    private  String address;
    ArrayList<Animals> animals ;
    public Buyer(String name, String passportIndex, String address) {
        super(name, passportIndex);
        this.address =address;
        animals = new  ArrayList<>();
    }
    public void addCustomer(Animals a){
        animals.add(a);
        System.out.println("Buyer: "+ a);
    }
    public void buyerAnimalsShow(){
        for (Animals a : animals){
            System.out.println(a);
        }
    }

    @Override
    public void show() {
        super.toString();
        System.out.println(this.toString()+" I am buyer!");
    }

    @Override
    public String toString() {
        super.toString();
        return "name: "+ getName()+ " passportIndex: "+ getPassportIndex()+ " adress: "+address+ " animals: "+ animals;
    }
}