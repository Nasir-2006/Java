// 1. Abstract Class
abstract class Fooditem {
    String name;
    double price;

    Fooditem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    abstract void prepare();

    public void bill() {
        System.out.println("Name: " + this.name);
        System.out.println("Price: " + this.price + " Rs");
    }
}

// 2. Interface (Spelling Corrected)
interface Delieverable {
    void deliveryDetail(String address); 
}

// 3. Class Pizza
class Pizza extends Fooditem implements Delieverable {
    
    Pizza(String name, double price) {
        super(name, price);
    }

    @Override
    public void prepare() {
        System.out.println("Baking Pizza in Oven at 200 degrees... 🔥");
    }

    @Override
    public void deliveryDetail(String address) {
        System.out.println("Delivering pizza to " + address + ". Delivery charge : 50 Rs");
    }

    public void addtopping(String t1) {
        System.out.println("Added " + t1);
    }

    public void addtopping(String t1, String t2) {
        System.out.println("Added " + t1 + " " + t2);
    }
}

// 4. Class Burger
class Burger extends Fooditem implements Delieverable {
    
    Burger(String name, double price) {
        super(name, price);
    }

    @Override
    public void prepare() {
        System.out.println("Grilling Burger patty and adding cheese... 🧀");
    }

    @Override
    public void deliveryDetail(String address) {
        System.out.println("Delivering burger to " + address + ". Delivery charge: 30 Rs");
    }
}

// 5. Main Class (Iska naam aur File ka naam SAME hona chahiye)
 class Resturant_project {
    public static void main(String[] args) {
        
        System.out.println("--- ORDER 1 ---");
        Fooditem f1 = new Pizza("Fajita", 1200);
        f1.prepare();
        f1.bill();
        
        ((Pizza)f1).addtopping("Cheese");
        ((Pizza)f1).deliveryDetail("Johar Town");

        System.out.println("\n--- ORDER 2 ---");
        Fooditem f2 = new Burger("Zinger", 500);
        f2.prepare();
        f2.bill();
        ((Burger)f2).deliveryDetail("DHA Phase 6");
    }
}