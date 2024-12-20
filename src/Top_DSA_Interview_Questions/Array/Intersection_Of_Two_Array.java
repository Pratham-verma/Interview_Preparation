package Top_DSA_Interview_Questions.Array;

import java.util.*;

public class Intersection_Of_Two_Array {
    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i : nums1){
            map.put(i, map.getOrDefault(i,0)+1);
        }

        List<Integer> list = new ArrayList<>();

        for(int i : nums2){
            if(map.get(i)!=null && map.get(i)>0){
                list.add(i);
                map.put(i,map.get(i)-1);  // decrementing the value of hashmap
            }
        }
        int n = list.size();
        int[] res = new int[n];
        for(int i = 0;i<n;i++){
            res[i] = list.get(i);
        }
        return res;
    }

    public static void main(String[] args){
        int[] nums1 = {4,9,5};
        int[] nums2 = {4,9,4,7,6};

        int[] result = intersect(nums1, nums2);
        System.out.print(Arrays.toString(result));
    }
}
