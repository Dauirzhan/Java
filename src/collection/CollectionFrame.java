package collection;
import java.util.ArrayList;
import java.util.Collections;

public class  CollectionFrame{
        public static void main(String[] args) {
/*                ArrayList<Integer> list = new ArrayList<Integer>();
                list.add(54);
                list.add(8);
                list.add(0);
                list.add(9);
                list.add(61);
                list.add(110);
                list.add(15);
                list.add(2);
                list.add(48);
                list.add(10);

                int n = list.size();

                for (int i = 0; i<n; i++){
                        System.out.print(list.get(i) + " ");

                }
                System.out.println();
                int max = Collections.max(list);
                System.out.println(max);

                int min = Collections.min(list);
                System.out.println(min);
  */

        int arr[] = {1, 56, 45, 78, 2, 8};
        sort(arr);
        printArray(arr);
        }
        static void sort(int arr[]){
                int n = arr.length;
                for(int i = 1; i<arr.length; i++){
                        int key = arr[i];
                        int j = i-1;

                        while(j>=0 && key<arr[j]){
                                arr[j+1] = arr[j];
                                j = j-1;

                        }
                        arr[j+1] = key;
                }
        }
        static void printArray(int arr[]){
                int n = arr.length;
                for(int i = 0 ; i < arr.length; i++){
                        System.out.println(arr[i] + " ");
                }
                System.out.println();
        }
}
