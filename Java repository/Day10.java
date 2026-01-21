class Light{
    public void turnON()
    {
        System.out.println("Light is switched ON!");
    }
}
class Tubelight extends Light{
    @Override
    public void turnON()
    {
        System.out.println("Blinking...Blinking...ON!");
    } 
}
class SmartBulb extends Light{
    @Override
    public void turnON()
    {
        System.out.println("Connected to Wi-fi...Color set to warm... ON!");
    }
}
public class Day10 {
    public static void main(String[] args) {
        Light L1=new Light();
        L1.turnON();
        Tubelight L2 = new Tubelight();
        L2.turnON();
        SmartBulb L3 = new SmartBulb();
        L3.turnON();
        Light MagicBulb = new SmartBulb();
        MagicBulb.turnON();
    }
}
