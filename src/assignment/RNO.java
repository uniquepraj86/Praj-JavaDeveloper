package assignment;

public class RNO {
    public static void main(String[] args) {
        int[] arr =
                {
                  1, 2, 3, 4, 5, 1, 4, 2 ,2
                                             };
        System.out.println("Reverse Numbers : ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");

        }
    }
}
