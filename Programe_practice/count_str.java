package String;
// count the string length without using length()
public class count_str {

    public static void main(String[] args) {
        String str1="hello";
        int count=0;
        for(int i=0; i<str1.length(); i++){
            count ++;
        }
        System.out.println(count);
    }
}

