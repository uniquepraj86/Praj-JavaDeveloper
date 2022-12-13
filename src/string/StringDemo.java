package string;

public class StringDemo {
    public static void main(String[] args) {
        String str = "pune";
        String str2 = " pune";
        String str3 = new String("Mumbai");

        String s = str.concat(str2);
        System.out.println(s);
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.charAt(1));
        System.out.println(s.lastIndexOf("p"));
        System.out.println(s.indexOf("p"));
        System.out.println(s.indexOf("p",3));


        String str4 = new String("nashik");
        System.out.println(str4.equals("nasik"));
        System.out.println(str4=="nasik");
    }
}


//string can not be altered but string buffer and string  build builder