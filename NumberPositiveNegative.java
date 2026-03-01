public class NumberPositiveNegative {
    public NumberPositiveNegative(int number)
    {
        if(number>0)
            System.out.println("Number is Positive :"+number);
        else if (number<0)
            System.out.println("Number is Negative "+number);
        else
            System.out.println("Number is Zero"+number);
    }
    public static void main(String args[])
    {
        NumberPositiveNegative ob =new NumberPositiveNegative(7);
    }
}
