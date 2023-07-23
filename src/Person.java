abstract public class Person {
    private  String name;
    private String passportIndex;

    public Person(String name, String passportIndex) {
        this.name = name;
        this.passportIndex = passportIndex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassportIndex() {
        return passportIndex;
    }

    public void setPassportIndex(String passportIndex) {
        this.passportIndex = passportIndex;
    }
   abstract public void show();
    @Override
    public String toString() {
        return " name: "+ name + "paspportIndex: "+passportIndex;
    }
}
