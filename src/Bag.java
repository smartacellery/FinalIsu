
public class Bag extends Product{
    protected int safetoclose=0;
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
    public void discountmaintenance(){
    safetoclose=safetoclose+20; 
    numberofmaintenances++;
    }
    
    public void addfeatures(){// add safety
        super.addfeatures();
        safetoclose= safetoclose+30;
    }
    @Override
    public int sumworth(){
    return (fashion+comfort+worktime+materialcosts+safetoclose);
}
     @Override
    public int getEasytoiron() {return 0;}
    @Override
    public int getworth(){
        return safetoclose;
    }
}
