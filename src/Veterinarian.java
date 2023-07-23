import java.util.ArrayList;

public class Veterinarian extends Person {
    private String university;
    private int seniority;
    private ArrayList<Buyer> buyers;
    private int buyerNum;


    public Veterinarian(String name, String passportIndex, String university, int seniority) {
        super(name, passportIndex);
        this.university = university;
        this.seniority = seniority;
        buyers = new ArrayList<>();
       this.buyerNum = 1;
    }

    public void buyerAdd(Buyer buyer) {
        buyers.add(buyer);
        buyerNum++;
    }
    public void buyerList(Buyer buyer2){
        for (Buyer b : buyers){
            b.show();
        }
    }

    @Override
    public void show() {
        System.out.println(toString() + " I am Veterinarian");
    }

    @Override
    public String toString() {
        return "name: "+ getName()+ " passportIndex: "+getPassportIndex()+ " university: "+university+
                " seniority: "+ seniority+"buyers: "+buyers+ " buyersNum: "+ buyerNum;

    }
}

