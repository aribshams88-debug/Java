import java.util.Scanner;
public class CaseCheck {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        int u=0,l=0,d=0,s=0;
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if(c>='A'&&c<='Z')
                u++;
            else if(c>='a'&&c<='z')
                l++;
            else if(c>='0'&&c<='9')
                d++;
            else if(c==' ')
                s++;
        }
        System.out.println("UpperCase Letter:"+u);
        System.out.println("LowerCase Letter:"+l);
        System.out.println("Digits :"+d);
        System.out.println("Spaces :"+s);

    }
    
}
