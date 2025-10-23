class add
{
    private int a;
    private int b;
    private int sum;

    public add(int a,int b){
        this.a=a;
        this.b=b;
        this.sum=0;
    }

    public void seta(int a)
    {
        this.a=a;
    }

    public void setb(int b)
    {
        this.b=b;
    }

    public int geta(){
        return a;
    }

    public int getb(){
        return b;
    }

    public void display(){
        System.out.println("a+b "+(a+b)); 
    }
}


public class Main
{
    public static void main(String[] args)
    {
        add sadain = new add(5,6);
        sadain.display();
    }
}
