package arrays;

public class SmallestElement {
    public static void main(String[] args) {
        int b [] = {12,10,43,67,98,23,76};
        int min =  b [0];
        for(int i=1;i<b.length;i++){

            if(min>b[i]){
                min = b[i];
            }
        }
        System.out.println(min);
    }
}
