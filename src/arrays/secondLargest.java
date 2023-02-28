package arrays;

public class secondLargest {
    public static void main(String[] args) {
        int s[] = {12,5,6,33,45,87,99};
        for(int i=0;i<s.length;i++){
            for(int j=i+1;j<s.length;j++){
                if(s[i]<s[j]){
                   int temp = s[i];
                   s[i] = s[j];
                   s[j] = temp;
                }
            }
            System.out.println(s[1]);
            for(int c=0;c< s.length;c++){
                System.out.println(s[c]);
            }
        }
    }
}
