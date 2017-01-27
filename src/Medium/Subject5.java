package Medium;

import Test.Run;

/**
 * Created by zhang on 2017/1/27.
 */
public class Subject5 implements Run {
    int sp[];
    char stringToChar[];
    int mm=0;
    public String longestPalindrome(String s) {
        if(s.length()==0)
            return "";
        s=s.replace(""," ");
        sp=new int[s.length()];
        stringToChar=s.toCharArray();
        for (int i=0;i<s.length()/2;i++){
            int di=s.length()/2-i;

            int max=s.length()/2+i;
            int ret=sp[max]=palindromeLength(max);
            if(ret>=di&&ret>=sp[mm])
                return  s.substring(max - sp[max]+1 , max + sp[max]).replace(" ","");
            if(ret>sp[mm])
                mm=max;
            max=s.length()/2-1-i;
            ret=sp[max]=palindromeLength(max);
            if(ret>=di&&ret>=sp[mm])
                return  s.substring(max - sp[max] +1, max + sp[max]).replace(" ","");
            if(ret>sp[mm])
                mm=max;
        }
        return s.substring(mm - sp[mm]+1, mm + sp[mm]).replace(" ","");
    }
    public int palindromeLength(int middle){
        int i=0;
        while (middle+i<stringToChar.length&&i<=middle&&stringToChar[middle+i]==stringToChar[middle-i])i++;
        return i;
    }
    @Override
    public void run() {

        System.out.println(longestPalindrome("acbcb"));
    }
}
