package String;
// swap two string without using third variable
public class Swap_twostring {
 
    public static void main(String[] args) {
        String str1="hello";
        String str2="hii";

        str1=str1+str2;
        System.out.println(str1);

        str2=str1.substring(0,5);
        str1=str1.substring(5);

        System.out.println(str1);
        System.out.println(str2);
    }
}

