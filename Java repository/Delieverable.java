abstract class Fooditem{
    String name;
    double price;
    Fooditem(String name,double price)
    {
        this.name = name;
        this.price = price;
    }
    abstract void prepare();
    public void bill()
    {
        System.out.println("Name: "+this.name);
        System.out.println("Price: "+this.price+" Rs");
    }
}
public interface Delieverable {
public void delieveryDetail(String address);
}
class Pizza extends Fooditem implements Delieverable{
    Pizza(String name,double price)
    {
        super(name,price);
    }
@Override
public void prepare()
{
    System.out.println("Baking Pizza in Oven at 200 degrees... 🔥");
}
public void delieveryDetail(String address){
System.out.println("Deleivering pizza to "+address+"Delievery charge : 50 Rs");
}
public void addtopping(String t1)
{
    System.out.println("Added "+t1);
}
public void addtopping(String t1,String t2)
{
    System.out.println("Added "+t1+" "+t2);
}
}
class Burger extends Fooditem implements Delieverable{
    Burger(String name,double price)
    {
        super(name,price);
    }
    @Override
    public void prepare()
    {
        System.out.println("Grilling Burger patty and adding cheese... 🧀");
    }
public void delieveryDetail(String address)
{
    System.out.println("Delievering pizza to "+address+" .Delivery charge: 30 Rs");
}
}
class Resturant_project {
    public static void main(String[] args) {
        Fooditem f1 = new Pizza("Fajita", 1200);
        f1.prepare();
        f1.bill();
        ((Pizza)f1).addtopping("Cheese");
        ((Pizza)f1).addtopping("Cheese", "Chicken");
    }

    
}