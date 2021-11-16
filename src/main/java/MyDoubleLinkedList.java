import java.awt.*;
import java.util.Arrays;

/**
 * Project name(项目名称)：算法_双向循环链表的实现_链表的插入
 * Package(包名): PACKAGE_NAME
 * Class(类名): MyDoubleLinkedList
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/16
 * Time(创建时间)： 13:33
 * Version(版本): 1.0
 * Description(描述)：
 * 调用对象的add(int item)方法向链表中添加数据；
 * 调用对象的printList(boolean flag)方法正反方向输出链表；
 * 接着根据程序的输出判断程序是否正确。
 */

public class MyDoubleLinkedList
{

    private Node head;//头结点
    private Node tail;//指向链表的尾结点
    private int size;

    public MyDoubleLinkedList()
    {
        head = new Node(null, Integer.MIN_VALUE, null);
        head.next = head.prev = head;
        tail = head;
        size = 0;
    }

    /**
     * 添加元素到表尾
     *
     * @param item
     */
    public void add(int item)
    {
        /********** Begin *********/
        Node node = tail;
        Node node1 = new Node(node, item, head);
        node.next = node1;
        head.prev = node1;
        tail = node1;
        size++;
        /********** End *********/
    }

    public void add(int item, int index)
    {
        if (index < 0 || index > size)
        {
            Toolkit.getDefaultToolkit().beep();
            System.out.println("索引异常！！！" + "索引为" + index + ",大小为" + size);
            return;
        }
        if (index == size)
        {
            Node node = tail;
            Node node1 = new Node(node, item, head);
            node.next = node1;
            head.prev = node1;
            tail = node1;
            size++;
            return;
        }
        if (index == 0)
        {
            Node node1 = new Node(head, item, head.next);
            head.next = node1;
            head.next.next.prev = node1;
            size++;
            return;
        }
        Node node = head;
        for (int i = 0; i < index; i++)
        {
            node = node.next;
        }
        Node node1 = new Node(node, item, node.next);
        node.next.prev = node1;
        node.next = node1;
        size++;
    }

    /**
     * 打印双向链表
     *
     * @param flag true从左向右顺序打印, false从右向左顺序打印
     */
    public void printList(boolean flag)
    {
        System.out.println("数量：" + size);
        Node node = head;
        if (flag)
        {//向右
            while (node.next != head)
            {
                node = node.next;
                System.out.print(node.item + " ");
            }
        }
        else
        {//向左
            while (node.prev != head)
            {
                node = node.prev;
                System.out.print(node.item + " ");
            }
        }
        System.out.println();
    }

    public int size()
    {
        return size;
    }

    public int get(int index)
    {
        if (index < 0 || index >= size)
        {
            Toolkit.getDefaultToolkit().beep();
            System.out.println("索引异常！！！" + "索引为" + index + ",大小为" + size);
            return Integer.MIN_VALUE;
        }
        Node node = head;
        for (int i = 0; i < index; i++)
        {
            node = node.next;
        }
        return node.next.item;
    }

    public void sort()
    {
        //------------------------------------------------------
        long startTime = System.nanoTime();   //获取开始时间
        //------------------------------------------------------
        int[] array = new int[size];
        Node node = head;
        node = node.next;
        for (int i = 0; i < size; i++)
        {
            array[i] = node.item;
            node = node.next;
        }
        /*
        for (int s : array)
        {
            System.out.print(s + " ");
        }
         */
        Arrays.sort(array);
        node = head;
        node = node.next;
        for (int i = 0; i < size; i++)
        {
            node.item = array[i];
            node = node.next;
        }
        //------------------------------------------------------
        long endTime = System.nanoTime(); //获取结束时间
        if ((endTime - startTime) < 1000000)
        {
            double final_runtime;
            final_runtime = (endTime - startTime);
            final_runtime = final_runtime / 1000;
            System.out.println("排序算法运行时间： " + final_runtime + "微秒");
        }
        else if ((endTime - startTime) >= 1000000 && (endTime - startTime) < 10000000000L)
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 1000;
            final_runtime = final_runtime / 1000;
            System.out.println("排序算法运行时间： " + final_runtime + "毫秒");
        }
        else
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 10000;
            final_runtime = final_runtime / 100000;
            System.out.println("排序算法运行时间： " + final_runtime + "秒");
        }
        //------------------------------------------------------
    }

    public void sort_desc()
    {
        long startTime = System.nanoTime();   //获取开始时间
        int[] array = new int[size];
        Node node = head;
        node = node.next;
        for (int i = 0; i < size; i++)
        {
            array[i] = node.item;
            node = node.next;
        }
        /*
        for (int s : array)
        {
            System.out.print(s + " ");
        }
         */
        q_sort qSort = new q_sort();
        qSort.quickSort(array, 0, array.length - 1);
        node = head;
        node = node.next;
        for (int i = 0; i < size; i++)
        {
            node.item = array[i];
            node = node.next;
        }
        //------------------------------------------------------
        long endTime = System.nanoTime(); //获取结束时间
        if ((endTime - startTime) < 1000000)
        {
            double final_runtime;
            final_runtime = (endTime - startTime);
            final_runtime = final_runtime / 1000;
            System.out.println("排序算法运行时间： " + final_runtime + "微秒");
        }
        else if ((endTime - startTime) >= 1000000 && (endTime - startTime) < 10000000000L)
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 1000;
            final_runtime = final_runtime / 1000;
            System.out.println("排序算法运行时间： " + final_runtime + "毫秒");
        }
        else
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 10000;
            final_runtime = final_runtime / 100000;
            System.out.println("排序算法运行时间： " + final_runtime + "秒");
        }
    }

    //结点内部类
    private static class Node
    {
        int item;
        Node next;//直接后继引用
        Node prev;//直接前驱引用

        Node(Node prev, int item, Node next)
        {
            this.prev = prev;
            this.item = item;
            this.next = next;
        }
    }
}
