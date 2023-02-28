package arrays;

public class LargestElement {
    public static void main(String[] args) {

        int arr[] = {95,43,75,69,13,4};
         int max = arr[0];
            for( int i=1;i<arr.length;i++){
                if(max<arr[i]) {
                    max = arr[i];
                }
            }
        System.out.println("Largest Element "+max);

        }
    }

