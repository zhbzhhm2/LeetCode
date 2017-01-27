package Medium;

import Test.Run;

/**
 * Created by zhang on 2017/1/21.
 * Given a string, find the length of the longest substring without repeating characters.
 */
public class Subject3 implements Run {

    public int lengthOfLongestSubstring(String s) {
        char[] chars=s.toCharArray();
        int start=0,end=1,length=1,max=1;
        int temp;
        for(;end<chars.length;end++){
            if((temp=contains(chars,start,end,chars[end]))!=-1)
            {
                max=max>end-start?max:end-start;
                start=temp+1;
            }
        }
        return max>end-start?max:end-start;
    }
    int contains(char[] chars,int start,int end,char a){
        for(int i=start;i<end;i++)
            if(a==chars[i])
                return i;
        return -1;
    }
    @Override
    public void run() {
        System.out.println(
        lengthOfLongestSubstring("abcaabcd"));
    }
}
