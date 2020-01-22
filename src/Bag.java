
public class Bag extends Product{ //second child
    protected int safetoclose=0;  //variable exclusive to this child 
    public Bag(String n){
        super(n+" bag");
    }
    public Bag(){
        super();
    }
    public void setName(String n){
        name=n+" bag";
    }
    public int getSafetoclose(){
     return safetoclose;
 }
    @Override
    public void discountmaintenance(){//overrides abstract method in parent
                                  //adds coupon for maintenance service
    safetoclose=safetoclose+20; 
    numberofmaintenances++;
    }
    
    public void addfeatures(){// add safety closure for bag
                              //extends method in parent
        super.addfeatures();
        safetoclose= safetoclose+30;
    }
    @Override
    public int sumworth(){//overrides method in parent
                            //calculate total worth of product
    return (fashion+comfort+worktime+materialcosts+safetoclose);
}
     @Override
    public int getEasytoiron() {return 0;}
    @Override
    public int getworth(){
        return safetoclose;
    }
}
