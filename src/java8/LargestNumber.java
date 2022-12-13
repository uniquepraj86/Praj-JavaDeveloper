package java8;

import java.util.Arrays;
import java.util.List;

public class LargestNumber {


        public static void main(String args[]) {
//            int[] a = new int[] { 20, 30, 50, 4, 71, 100};
//
//            int big = a[0];
//            for(int i = 1; i < a.length;i++)
//            {
//                if(a[i] > big)
//                {
//                    big = a[i];
//                }
//            }
//
//            System.out.println(big);
//        }

            List<Integer> list = Arrays.asList(1, 2, 3, 45, 6);

            int max = 0;
            for (int i = 0; i < list.size(); i++)
            {

                if (list.get(i) > max) {
                    max = list.get(i);
                }
            }

            System.out.println("biggest number" + max);
        }

    }

