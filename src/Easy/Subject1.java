package Easy;

/**
 * Created by zhang on 2017/1/21.
 */

import java.util.HashMap;
import java.util.HashSet;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

    You may assume that each input would have exactly one solution.
 */
import java.util.HashMap;
public class Subject1 {
    int targ;
    HashMap<Integer,Integer> map=null;
    int nums[]=null;
    public int[] twoSum(int[] nums, int target) {
        targ=target;
        map=new HashMap<>();
        this.nums=nums;
        for(int i=0;i<nums.length;i++)
        {
            Integer temp=add(nums[i],i);
            if(temp!=null)
                return new int[]{temp,i};
        }
        return null;
    }

    Integer add(int a,int index){
        int key=a>targ/2?a:targ-a;
        Integer get=map.get(key);
        if(get!=null&&nums[get]+a==targ)
            return get;
        map.put(key,index);
        return null;
    }

}
