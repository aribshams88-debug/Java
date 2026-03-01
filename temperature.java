public class temperature {
    double celcisus;
    void convert()
    {
        double fahrenhiet =(celcisus*9/5)+32;
    System.out.println("Temperature in fahrenheit is "+fahrenhiet);
    }
    public static void main(String arg[])
    {
        temperature ob= new temperature();
        ob.celcisus=36;
        ob.convert();
    }
    
}
