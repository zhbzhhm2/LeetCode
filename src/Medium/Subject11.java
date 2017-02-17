package Medium;

import Test.Run;

/**
 * Created by zhang on 17-2-15.
 */
public class Subject11 implements Run{
    @Override
    public void run() {
        System.out.println(        maxArea(new int[]{1,2,10,5,2,1}));
    }
    public int maxArea(int[] height) {
        int begin=0,end=height.length-1,max=0;
        boolean leftHasNext=true,rightHasNext=true;
        while (begin<end&&(leftHasNext||rightHasNext)){
            max=Integer.max(Integer.min(height[begin],height[end])*(end-begin),max);
            if(rightHasNext&&height[begin]>=height[end]){
                int temp=end;
                while (height[--end]<=height[temp]&&begin<end);
                if(begin>end){
                    end=temp;
                    rightHasNext=false;
                }
            }else if(leftHasNext&&height[begin]<=height[end]){
                int temp=begin;
                while (height[++begin]<=height[temp]&&begin<end);
                if(begin>end){
                    begin=temp;
                    leftHasNext=false;
                }
            }
        }
        max=Integer.max(Integer.min(height[begin],height[end])*(end-begin),max);
        return max;
    }
}
