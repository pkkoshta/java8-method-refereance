import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {

    //arr = [9, 7, 4, 2, 1], key = 1

    public static int findInde(int arr[], int key){
        int index = 0;
        for (int i=0; i < arr.length; i++){
            if (arr[i] == key){
                index = i;
            }
        }

        return index;
    }

    public static HashMap<Integer, Integer> findFrequency(int arr[]){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int unique = 0;

        for (int  i=0; i < arr.length; i++){
            if(hashMap.containsKey(arr[i])){
               // 1, 2
                hashMap.put(arr[i], hashMap.get(arr[i])+1);//1 ,9


            }else {
                hashMap.put(arr[i], 1); //9, 7, 4, 2, 1, 3,
            }
        }
        return hashMap;
    }


    public static void main(String[] args) {

        System.out.println("Hello world!");
        int[] arr = {9, 7, 4, 2, 1, 1,3,9};
        System.out.println(findFrequency(arr));
        boolean unique = true;
        Set<Integer> integerSet = new HashSet<>();
        for (int i=0; i< arr.length; i++){
          unique = integerSet.add(arr[i]);
          if (unique == false){
              System.out.println("duplicate element "+ arr[i]);
          }
        }


    }
}