
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
        static int searchElement(int[] arr, int target) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) {
                    return i;
                }
            }
            return -1;
        }

        public static void main(String[] args) {
            int[] arr = {3, 1, 4, 1, 5, 9};
            int target = 4;
            int result = searchElement(arr, target);

            if (result == -1) {
                System.out.println(target + " not found in array");
            } else {
                System.out.println(target + " found at index " + result);
            }
        }
    }
