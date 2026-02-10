import java.util.Scanner;
abstract class User{
    private int id;
    private String name;
    private String number;
    User(int id,String name,String number)
    {
        this.id = id;
        this.name = name;
        this.number = number;
    }
    public int getid(){
        return id;
    }
    public String getname(){
        return name;
    }
    public String getnumber(){
        return number;
    }
    public void setid(int id){
        this.id = id;
    }
    public void setname(String name){
        this.name=name;
    }
    public void setnumber(String number){
        this.number = number;
    }
    abstract void printProfile();
}
class Passenger extends User{
    private double walletbalance;
    public double getwalletbalance()
    {
        return walletbalance;
    }
    public void setwalletbalance(double walletbalance){
        this.walletbalance = walletbalance;
    }
    Passenger(int id, String number, String name,double walletbalance)
    {
        super(id,number,name);
        this.walletbalance = walletbalance;
    }
    @Override
    public void printProfile()
    {
     System.out.println("Walletbalance: "+walletbalance);
    }
}
class Driver extends User{
    private String vehicleNumber;
    private double rating;
    Driver(int id, String number, String name,String vehiclenumber,double rating)
    {
        super( id,  number,  name);
        this.vehicleNumber = vehiclenumber;
        this.rating = rating;
    }
    public String getvehicleNumber()
    {
        return vehicleNumber;
    }
    public double getrating()
    {
        return rating;
    }
    public void setvehilcleNumber(String vehicleNumber)
    {
        this.vehicleNumber = vehicleNumber;
    }
    public void setrating(double rating)
    {
        this.rating = rating;
    }
    @Override
    public void printProfile(){
        System.out.println("Vehicle Number: "+vehicleNumber);
        if(rating>=1&&rating<=5)
        {
        switch((int)Math.round(rating))
        {
            case 1:
        System.out.println("Very Poor - We are sorry to hear that.");
        break;
    case 2:
        System.out.println("Poor - We will try to improve.");
        break;
    case 3:
        System.out.println("Average - Thank you for your feedback.");
        break;
    case 4:
        System.out.println("Good - Glad you liked it!");
        break;
    case 5:
        System.out.println("Excellent - Thank you so much!");
        break;
    case 6:
        System.out.println("Outstanding - You're amazing!");
        break;
    case 7:
        System.out.println("Exceptional - Perfect experience!");
        break;
    }
}
        else
            System.out.println("You can give rating only between 1-5!!");
    }
}
public interface RideType {
    double calculateFare();
}

class BikeRide implements RideType {
    private double distance;
    
    public BikeRide(double distance) {
        this.distance = distance;
    }
    
    @Override
    public double calculateFare() {
        return distance * 20;
    }
}

class CarRide implements RideType {
    private double distance;
    
    public CarRide(double distance) {
        this.distance = distance;
    }
    
    @Override
    public double calculateFare() {
        return distance * 50;
    }
}

class LuxuryRide implements RideType {
    private double distance;
    
    public LuxuryRide(double distance) {
        this.distance = distance;
    }
    
    @Override
    public double calculateFare() {
        return distance * 100;
    }
}
class InnerRideType {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("========================================");
        System.out.println("       🚀 WELCOME TO CITY RIDE 🚀       ");
        System.out.println("========================================");

       
        Passenger P1 = new Passenger(0, null, null, 0);
        Driver D1 = new Driver(0, null, null, null, 0);

        System.out.println("Who are you?");
        System.out.println("1. Passenger 🧍");
        System.out.println("2. Driver 🚖");
        int role = sc.nextInt();

        
        if (role == 1) {
            System.out.println("Are you Pakistani or foreigner!");
            System.out.println("Press 1 for Pakistani\nPress 2 for Foreigner");
            int iden = sc.nextInt();

            String name, num;
            int id, bal;

            if (iden == 1) {
                System.out.println("Hi Passenger with which name i should address you!");
                sc.nextLine(); 
                name = sc.nextLine();
                
                System.out.println("Hello! " + name + " Thanks for choosing our Service.");
                System.out.println("We will need Your Any id(CNIC) for further assistance! ");
                System.out.println("Enter Your Id:");
                id = sc.nextInt();
                
                System.out.println("Enter Your Phone number:");
                sc.nextLine(); 
                num = sc.nextLine();
                
                System.out.println("Enter Balance you want to credit:");
                bal = sc.nextInt();
                
                P1 = new Passenger(id, num, name, bal);
            } else {
                System.out.println("Hi Passenger with which name i should address you!");
                sc.nextLine(); 
                name = sc.nextLine();
                
                System.out.println("Hello! " + name + " Thanks for choosing our Service.");
                System.out.println("Enter Your Id (Passport):");
                id = sc.nextInt();
                
                System.out.println("Enter Balance you want to credit:");
                bal = sc.nextInt();
                
                
                P1 = new Passenger(id, null, name, bal);
                System.out.println("Tourist Your Profile Created:");
                P1.printProfile();


            }
            
            
            
            System.out.println("\n--------------------------------");
            System.out.println("How much Kilometers do you want to go:");
            int km = sc.nextInt();
            System.out.println("Which ride you want: (1. Bike, 2. Car, 3. Luxury)");
            int ride = sc.nextInt();

            RideType currentRide = null;

            switch (ride) {
                case 1:
                    currentRide = new BikeRide(km);
                    break;
                case 2:
                    currentRide = new CarRide(km);
                    break;
                case 3:
                    currentRide = new LuxuryRide(km);
                    break;
                default:
                    System.out.println("Invalid Ride Selection");
                    return;
            }

            if (currentRide != null) {
                double bill = currentRide.calculateFare();
                System.out.println("Total Fare: " + bill);

                if (P1.getwalletbalance() >= bill) {
                    System.out.println(" Booking Confirmed! Driver is on the way!");
                } else {
                    System.out.println(" Insufficient Balance! Please recharge.");
                }
            }
        } 
        
       
        else if (role == 2) {
            System.out.println("\n--- DRIVER REGISTRATION ---");
            System.out.println("Enter Your Name:");
            sc.nextLine(); 
            String dName = sc.nextLine();

            System.out.println("Enter Your ID (CNIC):");
            int dId = sc.nextInt();

            System.out.println("Enter Your Phone Number:");
            sc.nextLine(); 
            String dNum = sc.nextLine();

            System.out.println("Enter Your Vehicle Number (e.g. LE-123):");
            String vNum = sc.nextLine();
            D1 = new Driver(dId, dNum, dName, vNum, 5.0);

            System.out.println("\n Driver Registered Successfully!");
            D1.printProfile();
            System.out.println("\nExpected Status: You are now Online and waiting for rides...");
        } 
        
        else {
            System.out.println("Invalid Role Selection!");
        }
    }
}

    
