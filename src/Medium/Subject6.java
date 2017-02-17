package Medium;

import Test.Run;

/**
 * Created by zhang on 17-2-14.
 */
public class Subject6 implements Run {
    @Override
    public void run() {
        System.out.println(
        convert("A", 1));
    }

    public String convert(String s, int numRows) {
        final int  rol=numRows==1?1:2*numRows-2;
        char []sArray=s.toCharArray();
        StringBuffer ret=new StringBuffer();
        for(int i=0;i<numRows;i++){
            int index=i,sec=0;
            if(i==0||i==numRows-1)
            {
                while (index<s.length()){
                    ret.append(sArray[index]);
                    index=index+rol;
                }

            }
            else {
                sec=rol-i;
                while (index<s.length()){
                    ret.append(sArray[index]);
                    int temp=index+rol-2*i;
                    if(temp<s.length())
                        ret.append(sArray[temp]);
                    index=index+rol;

                }
            }
        }
        return ret.toString();
    }
}
