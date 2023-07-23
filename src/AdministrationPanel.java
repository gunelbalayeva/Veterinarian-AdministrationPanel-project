public class AdministrationPanel<T> {

    public void show(T obj) {
        System.out.println(obj);
    }

    public <T extends  Buyer> void myAnimals(T buyer){
        ( (T) buyer).buyerAnimalsShow();
    }


}
