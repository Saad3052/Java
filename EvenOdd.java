import java.util.Random;
class Square extends Thread
{
    int x;
    Square(int x)
    {
        this.x=x;
    }
    public void run()
    {
        System.out.println("Square of "+x+" is "+x*x);
    }
}
class Cube extends Thread
{
    int x;
    Cube(int x)
    {
        this.x=x;
    }
    public void run()
    {
        System.out.println("Cube of "+x+" is "+x*x*x);
    }
}
class EvenOdd extends Thread
{
    public void run()
    {
        Random rd=new Random();
        for(int i=0;i<5;i++)
        {
            int x=rd.nextInt(50);
            try
            {
                sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
            if(x%2==0)
            {
                Square sq=new Square(x); 
                sq.start();
            }
            else
            {
                Cube c=new Cube(x);
                c.start();
            }
        }
    }
    public static void main(String[] args)
    {
        EvenOdd e=new EvenOdd();
        e.start();
    }
}