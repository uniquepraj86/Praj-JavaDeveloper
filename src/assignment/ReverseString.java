package assignment;public
class ReverseString {
    public static void main(String[] args) {
        String str= "anna";
        String str1=" ";
        char ch;

        for (int i=0;i<str.length();i++){
//            System.out.print(str);
            ch=str.charAt(i);
            str1=ch+str1;
        }
        System.out.println(str1);

    }
}
