package Medium;

import Test.Run;

import java.util.List;

/**
 * Created by zhang on 2017/1/21.
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class Subject2 implements Run {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ret=new ListNode(add(l1.val,l2.val));
        ListNode temp=ret;
        while ((l1=l1.next)!=null|( l2=l2.next)!=null){
            if(l1==null) {
                do{
                    temp.next=new ListNode(add(0,l2.val));
                    temp=temp.next;
                }while ((l2=l2.next)!=null);
                break;
            }
            if(l2==null){
                do{
                    temp.next=new ListNode(add(0,l1.val));
                    temp=temp.next;
                }while ((l1=l1.next)!=null);
                break;
            }
            temp.next=new ListNode(add(l1.val,l2.val));
            temp=temp.next;
        }
        if(flagZ!=0){
            temp.next=new ListNode(flagZ);
        }
        return ret;
    }
    int flagZ=0;
    int add(int a1,int a2){
        int ret=a1+a2+flagZ;
        flagZ=ret/10;
        return ret%10;
    }


    @Override
    public void run() {

    }
}
