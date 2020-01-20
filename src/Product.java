
public abstract class Product implements Comparable{ //implements Comparable{
 protected String name;
 protected int fashion,comfort, worktime,materialcosts,value ;
 static int numberofmaintenances;
 public Product(String n){
     name=n;
     fashion=0;
     comfort=0;
     worktime=0;
     materialcosts=0;
     
 }
 
 public Product(){
     name="";
     fashion=0;
     comfort=0;
     worktime=0;
     materialcosts=0;
 }
 public static int getNumberofMaintenance(){
    return numberofmaintenances;
}
 
 public final void addlinen(){
     comfort=comfort+10;
     materialcosts=materialcosts+50; 
     worktime=worktime+30;
 }
 public final void addflowers(){
     fashion=fashion+80;
     materialcosts=materialcosts+40;
     worktime=worktime+50;    
 }
 abstract void discountmaintenance();
 
  public void addfeatures(){
     materialcosts= materialcosts+30;
  }
  public int sumworth(){
          return (fashion+comfort+worktime+materialcosts);
     }
  public int getworth(){
      return 0;
  }
 
 public String getName(){
     return name;
 }
 public int getFashion(){
     return fashion;
 }
 public int getComfort(){
     return comfort;
 }
 public int getWorktime(){
     return worktime;
 }
 public int getMaterialcosts(){
     return materialcosts;
 }
  @Override
  public int compareTo(Object t){
      String othername=((Product)t).getName();
      return this.name.compareTo(othername);
  }

  abstract int getEasytoiron() ;
  abstract int getSafetoclose();
}
