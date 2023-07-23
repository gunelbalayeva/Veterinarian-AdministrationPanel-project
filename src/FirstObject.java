public class FirstObject {
    static void firstObject() {

        //Cat
        Cat cat = new Cat("07-22-2023", true, "Ragdoll");
        Cat cat2 = new Cat("05-22-2023", false, "Sphynx");
        Cat cat3 = new Cat("12-22-2022", true, "Scottish Fold:");


        //Dog
        Dog dog = new Dog("05-01-2020", true, 3, "Golden Retriever");
        Dog dog2 = new Dog("07-02-2019", false, 4, "Beagle");
        Dog dog3 = new Dog("06-03-2018", true, 6, "Rottweiler ");

        //Buyer
        Buyer buyer1 = new Buyer("Gunel ", "AZE:1232342", "Azerbaijan");
        // buyer1.addCustomer(cat);
        Buyer buyer2 = new Buyer(" Nazli ", "AZE:676879", "Azerbaijan");
        Buyer buyer3 = new Buyer("Muzeffer ", "AZE:3425364", "Azerbaijan");
        Buyer buyer4 = new Buyer("Gultac ", "AZE:3243546", "Azerbaijan");

        //Veterinarian
        Veterinarian v1 = new Veterinarian(" Yasemen", "Aze:334798", "Azerbaijan Medical University", 2);
        Veterinarian v2 = new Veterinarian(" Gultac", "Aze:5465776", "Azerbaijan Medical University", 3);

        //CityVeterinarian
        CityVeterinarian baku = new CityVeterinarian("Baku");
        CityVeterinarian sumgait = new CityVeterinarian("Sumgait");

        //Administration panel
        AdministrationPanel<Animals> animalsAdministrationPanel = new AdministrationPanel<>();
        animalsAdministrationPanel.show(dog);
        AdministrationPanel<Buyer> buyerAdministrationPanel = new AdministrationPanel<>();
        buyerAdministrationPanel.show(buyer1);
        animalsAdministrationPanel.myAnimals(buyer1);

    }
}