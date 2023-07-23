import java.util.ArrayList;

public class CityVeterinarian {
    private String city;
    private ArrayList<Veterinarian> veterinarianCity;
    private int veterinarianNum;

    public CityVeterinarian(String city) {
        this.city = city;
        veterinarianCity = new ArrayList<>();
        veterinarianNum = 0;
    }

    public void cityVeterinarianAdd( Veterinarian veterinarian){
        veterinarianNum++;
        veterinarianCity.add(veterinarian);
    }

    public void veterinarianCityNumResult(){
        System.out.println("Result : "+ veterinarianCity);
    }
}
