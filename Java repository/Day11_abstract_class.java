interface RemoteControl
{
    public void PowerOn();
    public void PowerOff();
}
class Tv implements RemoteControl{
public void PowerOn()
{
    System.out.println("TV started!");
}
public void PowerOff()
{
    System.out.println("TV off!");
}
}
class AC implements RemoteControl{
    public void PowerOff()
    {
        System.out.println("Ac is off!");
    }
    public void PowerOn()
    {
        System.out.println("Ac is ON!");
    }
}
public class Day11_abstract_class {
    public static void main(String[] args) {
        RemoteControl r1 = new Tv();
        RemoteControl r2 = new AC();
        r1.PowerOn();
        r2.PowerOff();
        r1.PowerOff();
        r2.PowerOn();
    }
    
}
