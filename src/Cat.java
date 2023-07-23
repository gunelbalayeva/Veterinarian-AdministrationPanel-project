public class Cat extends Animals {
    private String type;
    private String gender;

    public Cat(String dateOfBrith, boolean registration, String gender) {
        super(dateOfBrith, registration);
        this.type = "Cat";
        this.gender = gender;
    }

    @Override
    public void showInformation() {
        System.out.println(toString()+ " is it registered? "+ isRegistration()+" Date of brith: "+ getDateOfBrith());
    }

    @Override
    public String toString() {
        return "Cat{" +
                "type='" + type + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
