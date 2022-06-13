public class Mythread extends Thread 
{
    public void run()
    {
        System.out.println("This is the thread.");
    }
    public static void main(String args[])
    {
        Mythread a=new Mythread();
        System.out.println("Before setting name : "+a.getName());
        a.setName("MYTHREAD");
        System.out.println("After setting name : "+a.getName());
        System.out.println("Before setting priority : "+a.getPriority());
        a.setPriority(9);
        System.out.println("After setting priority : "+a.getPriority());
        a.start();
    }
}