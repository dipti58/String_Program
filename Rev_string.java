package String;

public class Rev_string {
     public static void main(String[] args) {
        String str="program";
        String str1="";
         
        for(int i=str.length()-1; i>=0; i--){
            str1=str1+str.charAt(i);
        }
        System.out.println("Reverse string is : "+ str1);
     }
}

