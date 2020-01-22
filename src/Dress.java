
public  class Dress extends Product{  //first child
 protected int easytoiron=0; //additional property of this child
 //two constructors:
 public Dress (String n){
     super(n + " dress");
     
 }
 public Dress(){
     super();
 }
 public void setName(String n){
     name=n + " dress";
 }
 @Override public int getEasytoiron(){
     return easytoiron;
 }
 @Override //riscrivo abstract method
 public void discountmaintenance(){ //overrides abstract method in parent
                                    //adds coupon for maintenance service
 easytoiron=easytoiron+20;
 numberofmaintenances++;
}
 public void addfeatures(){//extends method in parent
                            //uses no-iron tissue for dress
    super.addfeatures();
    easytoiron=easytoiron+50;
}
 @Override
  public int sumworth(){//overrides method in parent
                        //calculate total worth of product
     return (fashion+comfort+worktime+materialcosts+easytoiron);
 }

        @Override
        public int getworth(){//overrides method in parent
            return easytoiron;
        }
        
        
   // @Override
    public int getSafetoclose() {return 0;}
        
    
 
}
