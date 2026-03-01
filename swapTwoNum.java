public class swapTwoNum {
    public swapTwoNum(int x, int y)
    {
        System.out.println("Before Swapping Numbers :");
        System.out.println("X :"+x);
        System.out.println("Y :"+y);
        int a;
        a=x;
        x=y;
        y=a;
        System.out.println("After Swapping Numbers :");
        System.out.println("X :"+x);
        System.out.println("Y :"+y);

    }
    public static void main(String args[])
    {
        swapTwoNum ob = new swapTwoNum(25, 78);
    }
}
