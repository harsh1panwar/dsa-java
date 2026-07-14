
import java.util.Arrays;
public class array_basic_problems {
//    TO GET AVERAGE OF AN ARRAY
//        static double getAverage(int[] arr) {
//            if (arr.length == 0) {
//                return 0;
//            }
//            double sum = 0;
//            for (int i : arr) {
//                sum += i;
//            }
//            double avg = sum / arr.length;
//            return avg;
//        }
//            MULTIPLY EACH ELEMENT OF ARRAY BY 10
//            static int[] multiplyBy10(int[] arr) {
//                int[] newarr = new int[arr.length];
//
//                for (int i = 0; i < arr.length; i++) {
//                    newarr[i] = arr[i] * 10;
//                }
//
//                return newarr;
//            }
//    SEARCH FOR AN ELEMENT IN AN ARRAY
//        static int searchElement(int[] arr, int target) {
//            for (int i = 0; i < arr.length; i++) {
//                if (arr[i] == target) {
//                    return i;
//                }
//            }
//            return -1;
//        }

    //    COUNT THE NUMBER OF 0s AND 1s
//    static int[] Count01(int[] arr){
//        int zero =0;
//        int one =0 ;
//
//        for (int i = 0; i < arr.length; i++) {
//            if ( arr[i]==0)
//                zero+=1;
//            else if (arr[i]==1)
//                one+=1;
//        }
//        return new int[]{zero,one};
//}


//        static int Unsortedelement(int[] arr) {
//
//            if (arr[1] > arr[0]) {          // Ascending array
//                for (int i = 0; i < arr.length - 1; i++) {
//                    if (arr[i + 1] < arr[i]) {
//                        return arr[i + 1];
//                    }
//                }
//            } else {                        // Descending array
//                for (int i = 0; i < arr.length - 1; i++) {
//                    if (arr[i + 1] > arr[i]) {
//                        return arr[i + 1];
//                    }
//                }
//            }
//
//            return -1;
//        }
    static int [] swap (int [] arr){
        int [] new1 = new int[arr.length];
        for (int i = 0; i < arr.length-1; i+=2) {
            new1 [i+1] = arr[i];
        }
        for (int i = 1; i <= arr.length-1; i+=2) {
            new1 [i-1] = arr[i];
        }
        if (arr.length%2!=0){
            new1[arr.length-1]=arr[arr.length-1];
        }
       return new1;

    }

        public static void main(String[] args) {
            int[] arr = {3,4,5,6,1};
            System.out.println("swapped array is " + Arrays.toString(swap(arr)));
           
        }
    }