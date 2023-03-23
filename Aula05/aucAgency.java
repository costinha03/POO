package Aula05;


import java.util.ArrayList;

public class aucAgency {
    private ArrayList <reality> realities;

    public  aucAgency(){
        realities = new ArrayList<>();
    }

    public  void addRealEstate(reality RealEstate){
        realities.add(RealEstate);
    }
    public void removeRealEstate(int id){
        for (reality RealEstate : realities){
            if(RealEstate.getId() == id){
                realities.remove(RealEstate);
                System.out.println("Real estate removed.");
                return;
            }
            
        }
        System.out.println("Real estate not found.");
    }
    public void placeAuction(int id, dateGen start, dateGen end){
        for (reality RealEstate : realities){
            if(RealEstate.getId() == id){
                RealEstate.setAuction(start, end);
                return;
            }
        }
             System.out.println("Real estate " + id + " not found");
        
    }
    public void sellRE(int id){
        for (reality RealEstate : realities){
            if(RealEstate.getId() == id){
                RealEstate.sell();
                return;
            }
             
        }System.out.println("Real estate " + id + " not found");
    }
    public void unavailable(int id){
        for (reality RealEstate : realities){
            if(RealEstate.getId() == id){
                RealEstate.becomeUnavailable();
                return;
            }
            
        }
         {System.out.println("Real estate " + id + " not found");}
    }
    public void listRE(){
        System.out.println("List of real estate: ");
        for (reality RealEstate : realities){
            System.out.println(RealEstate);
                
            }
    }
}
