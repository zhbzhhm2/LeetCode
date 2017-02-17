package Easy;

import Test.Run;

/**
 * Created by zhang on 17-2-15.
 */
public class Subject9 implements Run {
    @Override
    public void run() {
        System.out.println(isPalindrome(123321));
    }

    public boolean isPalindrome(int x) {
        if(x<0)return false;
        int n=0,temp=x,big=1,small=1;
        while(temp!=0)
        {
            n++;
            temp/=10;
            if(temp!=0)big*=10;
        }

        for(int i=0;i<n/2;++i)
        {
            if((x/big)%10!=(x/small)%10)return false;
            big/=10;
            small*=10;
        }
        return true;
    }
}
