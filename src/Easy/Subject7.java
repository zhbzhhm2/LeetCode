package Easy;

import Test.Run;

/**
 * Created by zhang on 17-2-14.
 */
public class Subject7 implements Run {
    @Override
    public void run() {
        System.out.println(reverse(123));

    }
    public int reverse(int x) {

        int flag=x>0?1:-1;
        x=x>0?x:-x;
        long ret=0;
        while (x > 0) {

            ret = ret * 10 + flag*x % 10;
            x /= 10;
        }
        if(ret>Integer.MAX_VALUE||ret<Integer.MIN_VALUE)
            return 0;
        return (int)ret;
    }

}
