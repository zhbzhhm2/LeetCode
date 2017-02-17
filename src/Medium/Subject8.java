package Medium;

import Test.Run;

/**
 * Created by zhang on 17-2-15.
 */
public class Subject8 implements Run {
    @Override
    public void run() {
        System.out.println(myAtoi("9223372036854775809"));
    }

    public int myAtoi(String str) {
        long ret = 0, flag = 1;
        int i = 0;
        for (; i < str.length(); i++)
            if (str.charAt(i) != ' ')
                break;
        if (i < str.length() && str.charAt(i) == '-') {
            flag = -1;
            i++;
        } else if (i < str.length() && str.charAt(i) == '+')
            i++;
        for (; i < str.length(); i++) {
            if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                break;
            }
            ret = ret * 10 + (str.charAt(i) - '0') * flag;
            if(ret>Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            if(ret<Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
        }
        return (int)ret;
    }
}
