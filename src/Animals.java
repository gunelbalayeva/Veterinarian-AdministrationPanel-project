 abstract public class Animals {

    private String dateOfBrith;
    private boolean registration;

    public Animals(String dateOfBrith, boolean registration) {
        this.dateOfBrith = dateOfBrith;
        this.registration = registration;
    }

    public String getDateOfBrith() {
        return dateOfBrith;
    }

    public void setDateOfBrith(String dateOfBrith) {
        this.dateOfBrith = dateOfBrith;
    }

    public boolean isRegistration() {
        return registration;
    }

    public void setRegistration(boolean registration) {
        this.registration = registration;
    }


    public abstract void showInformation();

    @Override
    public String toString() {
        return "Animals{" +
                "dateOfBrith='" + dateOfBrith + '\'' +
                ", registration=" + registration +
                '}';
    }
}
