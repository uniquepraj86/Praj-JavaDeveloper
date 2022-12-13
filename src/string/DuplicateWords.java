package string;

public class DuplicateWords {
//    public static void main(String[] args) {
//        String arr[] = new String[]{"p","p","r","r"};
//        System.out.println("Duplicate Letter");
//        for(int i=0;i<arr.length;i++){
//            for (int j=i+1; j<arr.length;j++){
//                if(arr[i]==arr[j]){
//                    System.out.println(arr[j]);
//                }
//            }
//        }


    public static void main(String[] args) {

<<<<<<< HEAD
        String str = "prajktprj";
=======
        String str = "welcome to java";
>>>>>>> origin/master
        char[] arr = str.toCharArray();
        System.out.println("Duplicate Letters");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[j] + " ");
                    break;
                }
            }
        }
    }
}
