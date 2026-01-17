class Player
{
private String name;
private int health;
private boolean isAlive;
Player(String Name,int Health)
{
    name = Name;
    health = Health;
    isAlive = true;
}
public void takedamage(int damage)
{
    health-=damage;
    if(health<=40)
    {
        System.out.println(name+" Need to heal!");
    }
    if(health<=0)
    {
        health = 0;
        isAlive = false;
        System.out.println("Player is Knocked out!!!!");
    }
}
public void heal(int amount)
{
    if(!isAlive)
    {
        System.out.println("Player is dead and cannot be healed!");
        return;
    }
    health+=amount;
    if(health>100)
    {
        health = 100;
        System.out.println("Sorry! Health can't exceed 100%");
    }
    
}
public void showStatus()
{
    System.out.println("Name:"+name);
    System.out.println("Health:"+health);
    if(isAlive)
    {
        System.out.println("Bankai!!!");
    }
    else
    {
        System.out.println("Arise!!!");
    }
}
} 
public class day8_Game_Character_system {
    public static void main(String[] args) {
        Player Nasir = new Player("Igris", 100);
        Nasir.takedamage(20);
        Nasir.showStatus();
        Nasir.heal(20);
        Nasir.showStatus();
        Nasir.takedamage(90);
        Nasir.showStatus();
    }
}
