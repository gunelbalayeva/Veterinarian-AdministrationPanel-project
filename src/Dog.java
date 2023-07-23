public class Dog extends Animals {

    private int age;
    private String type;
    private String gender;
    public Dog(String dateOfBrith, boolean registration,int age, String gender) {
        super(dateOfBrith, registration);
        this.age = age;
        this.type = " Dog ";
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void showInformation() {

        System.out.println(toString()+ " "+ super.toString());
    }


    @Override
    public String toString() {
        return "age:"+age+" type: "+type+ " age: "+ age+"gender:"+ gender;

    }
}
