class car{
   float fuel;
   int air;
   int gear;
   public void addfuel(float fuel)
   {
     this.fuel = fuel;
   }
   public void fuelInCar(){
    if(this.fuel==0)
    {
        System.out.println("Car cannot drive bcz there is no fuel");
    }
    else
    {
        System.out.println("Car has started");
        this.fuel--;
        System.out.println("fuel now is:"+this.fuel);
    }
   }
   public void airInCar(int air){
    if(air==0){
        System.out.println("Cannot drive car bcz there is no air in tires fill them will 30");
    }
    else if(air>30)
    {
        System.out.println("Reduce air to 30");
    }
    else
    {
        System.out.println("There is air in tires");
    }
   }
   public void cargear(int gear)
   {
    if(gear==0)
    {
        System.out.println("Car is neutral");
    }
    else if(gear<=1||gear>=5)
    {
        System.out.println("You are all good to go");
    }
    else
    {
        System.out.println("Invalid gear");
    }
   }
}
class Driver{   

}
public class OOP {
public static void main(String[] args) {
    car alto = new car();
    alto.addfuel(30);
    alto.fuelInCar();
    alto.airInCar(32);
    alto.cargear(0);
    car swift = new car();
    swift.addfuel(0);
    swift.fuelInCar();
    swift.airInCar(0);
    swift.cargear(0);

}
}