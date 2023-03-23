package Aula05;



public class ex3 {
    public static void main(String[] args){

        aucAgency agency = new aucAgency();
        dateGen aucDate = null;
        try {
            aucDate = new dateGen(24, 3, 2023);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }   

        reality RE1 = new reality(2, 30000, "Glória");
        reality RE2 = new reality(1, 25000, "Vera Cruz");
        reality RE3 = new reality(3, 32000, "Santa Joana");
        reality RE4 = new reality(2, 24000, "Aradas");
        reality RE5 = new reality(2, 20000, "São Bernardo");

        agency.addRealEstate(RE1);
        agency.addRealEstate(RE2);
        agency.addRealEstate(RE3);
        agency.addRealEstate(RE4);
        agency.addRealEstate(RE5);

        agency.sellRE(1001);
        agency.unavailable(1001);
        agency.sellRE(1010);

        agency.placeAuction(1002, aucDate, aucDate);
        agency.placeAuction(1003, aucDate, aucDate);

        agency.listRE();


    }
}
