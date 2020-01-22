
public abstract class Product implements Comparable{ 
//implements Comparable to order by product name
 protected String name;
 protected int fashion,comfort, worktime,materialcosts,value ;
 static int numberofmaintenances;//total number of coupons for free maintenance service I provide 
 //two constructors:
 public Product(String n){
     name=n;         //name of model
     fashion=0;      //level of fashion
     comfort=0;      //level of comfort
     worktime=0;     //work time needed
     materialcosts=0;  //cost of materials
     
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
 
 public final void addlinen(){ //lining increases level of comfort, material costs and worktime
     comfort=comfort+10;
     materialcosts=materialcosts+50; 
     worktime=worktime+30;
 }
 public final void adddecorations(){//decorations increase level of fashion, material costs and worktime
     fashion=fashion+80;
     materialcosts=materialcosts+40;
     worktime=worktime+50;    
 }
 abstract void discountmaintenance();//I will implement differently in each child classes
 
  public void addfeatures(){  //I will extend differently in each child class
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
