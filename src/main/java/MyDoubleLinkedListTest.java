import java.util.Scanner;

/**
 * Project name(项目名称)：算法_双向循环链表的实现_链表的插入
 * Package(包名): PACKAGE_NAME
 * Class(类名): MyDoubleLinkedListTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/16
 * Time(创建时间)： 13:34
 * Version(版本): 1.0
 * Description(描述)：
 * 测试输入：1 2 3 4 5
 * 预期输出：
 * <p>
 * 1 2 3 4 5
 * 5 4 3 2 1
 */

public class MyDoubleLinkedListTest

{
    public static void main(String[] args)
    {
        MyDoubleLinkedList list = new MyDoubleLinkedList();
        /*
        Scanner in = new Scanner(System.in);
        while (in.hasNext())
        {
            int item = in.nextInt();
            list.add(item);
        }
        list.printList(true);//从左向右输出链表元素
        System.out.println();
        list.printList(false);//从右向左输出链表元素
         */
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(12);
        list.add(8);
        list.add(9);
        list.printList(true);
        list.printList(false);
        list.add(99, 0);
        list.printList(true);
        System.out.println(list.get(5));
        list.printList(true);
        list.sort();
        list.printList(true);
        list.sort_desc();
        list.printList(true);
    }
}
