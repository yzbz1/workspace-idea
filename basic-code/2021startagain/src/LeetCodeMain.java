import java.util.*;

public class LeetCodeMain {
    public static void main(String[] args) {


        //1.2数之和
        System.out.println("---2数之和---");
        int[] arr =  {3,2,4};
        int[] res = twoSum(arr, 6);
        System.out.println(Arrays.toString(res));

        Integer a = 10;

        System.out.println(Arrays.toString(twoSum2(arr, 6)));

        /**
         * 输入：l1 = [2,4,3], l2 = [5,6,4]
         * 输出：[7,0,8]
         * 解释：342 + 465 = 807.
         */
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(5);
        l1.next = new ListNode(4);
        l2.next = new ListNode(6);
        l1.next.next = new ListNode(3);
        l2.next.next = new ListNode(4);


        ListNode listNode = addTwoNumbers(l1, l2);
        System.out.println(listNode);


        //main
    }

    /*1.2数之和*/
    public static int[] twoSum(int[] nums, int target) {
        int[] ints = new int[2];
        for (int i = 0; i < nums.length-1; i++) {    //1号位置的数组下标 0~length-2
            for (int i1 = i+1; i1 < nums.length; i1++) {    //2号位置的数组下标1~length-1
                if (nums[i] + nums[i1] == target){
                    ints[0] = i;
                    ints[1] = i1;
                }
            }
        }
        return ints;
    }

    //1.2数之和hash表法
    public static int[] twoSum2(int[] nums, int target) {
        int len = nums.length;
        Map map = new HashMap<Integer,Integer>(len-1);  //hash表存放数据
        map.put(nums[0],0);             //第一个直接放进去
        for (int i = 1; i < len; i++) {    //从第二个开始遍历
            if (map.containsKey(target - nums[i])){    //在hash表中找和当前数组值相加是否能够满足target条件的值
                return new int[]{(int) map.get(target - nums[i]),i};   //存在就输出数组

            }
            map.put(nums[i],i);                     //不存在就将该数组值和下标都存放在hash表中
        }
        return new int[0];

    }



    /*2.2数相加*/
//ListNode类
    public static class ListNode {
     int val;
     ListNode next; //存放下一个元素的地址
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     //实现ListNote的println的方法
     public static String println(ListNode l){
         StringBuilder sb = new StringBuilder();
         while(l != null){
             StringBuilder builder = sb.append(l.val);
             
         }
         return sb.toString();
     }


 }



    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null, tail = null;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int n1 = l1 != null ? l1.val : 0;
            int n2 = l2 != null ? l2.val : 0;
            int sum = n1 + n2 + carry;
            if (head == null) {
                head = tail = new ListNode(sum % 10);
            } else {
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
            }
            carry = sum / 10;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (carry > 0) {
            tail.next = new ListNode(carry);
        }
        return head;
    }

    /*
    * 无重复字符最长子串
    * */
    public int lengthOfLongestSubstring(String s) {
        // 哈希集合，记录每个字符是否出现过
        Set<Character> occ = new HashSet<Character>();
        int n = s.length();
        // 右指针，初始值为 -1，相当于我们在字符串的左边界的左侧，还没有开始移动
        int rk = -1, ans = 0;
        for (int i = 0; i < n; ++i) {
            if (i != 0) {
                // 左指针向右移动一格，移除一个字符
                occ.remove(s.charAt(i - 1));
            }
            while (rk + 1 < n && !occ.contains(s.charAt(rk + 1))) {
                // 不断地移动右指针
                occ.add(s.charAt(rk + 1));
                ++rk;
            }
            // 第 i 到 rk 个字符是一个极长的无重复字符子串
            ans = Math.max(ans, rk - i + 1);
        }
        return ans;
    }





}
