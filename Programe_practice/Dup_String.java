class Dup_String{
    public static void main(String[] args) {
        String str="programming";
        
        char[] str1=str.toCharArray();

        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<str.length(); j++){
                if(str1[i]==str1[j]){
                   System.out.println(str1[i]);
                   break;
                }
            }
        }
    }
}
