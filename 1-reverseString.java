class Reverse{
    public static String reverseWord(String str){
        //create empty string
        String rev="";
        //traverse given string and add char in rev string
        for(int i=0;i<str.length();i++){
            rev=str.charAt(i)+rev;
        }
        return rev;
    }
}
