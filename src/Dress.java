
public  class Dress extends Product{
 protected int easytoiron=0;
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
 public void discountmaintenance(){
 easytoiron=easytoiron+20;
 numberofmaintenances++;
}
 public void addfeatures(){
    super.addfeatures();
    easytoiron=easytoiron+50;
}
 @Override
  public int sumworth(){
     return (fashion+comfort+worktime+materialcosts+easytoiron);
 }
//public int getvalue(){
//    value=value+easytoiron;
  //  return value;
//}
        @Override
        public int getworth(){
            return easytoiron;
        }
        
        
   // @Override
    public int getSafetoclose() {return 0;}
        
    
 
}
