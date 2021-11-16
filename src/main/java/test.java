import java.awt.*;
import java.util.Scanner;

/**
 * Project name(项目名称)：算法_双向循环链表的实现_链表的插入
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/16
 * Time(创建时间)： 14:06
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class test
{
    private char ch = 0;
    Scanner input = new Scanner(System.in);
    MyDoubleLinkedList list = new MyDoubleLinkedList();

    public void menu()
    {
        System.out.println("""
                1.在后面添加元素
                2.在索引位置添加元素
                3.取得索引位置的元素
                4.从左到右显示全部元素
                5.从右到左显示全部元素
                6.升序排序
                7.降序排序
                8.退出""");
    }

    public void select(test t)
    {
        System.out.print("请选择：");
        ch = input.next().charAt(0);
        if (ch == '1')
        {
            System.out.println("1.在后面添加元素:");
            int number;
            //控制台输入变量:number
            int errCount = 0;
            while (true)
            {
                try
                {
                    //min:-10000000
                    //max:10000000
                    System.out.print("请输入一个数字：");
                    number = input.nextInt();
                    if (number >= -10000000 && number <= 10000000)
                    {
                        break;
                    }
                    else
                    {
                        errCount++;
                        Toolkit.getDefaultToolkit().beep();
                        if (errCount > 10)
                        {
                            System.err.println("错误次数过多！！！退出");
                            System.exit(1);
                        }
                        System.out.println("输入的数据不在范围内! 范围：[-10000000,10000000]");
                    }
                }
                catch (Exception e)
                {
                    errCount++;
                    if (errCount > 5)
                    {
                        Toolkit.getDefaultToolkit().beep();
                        System.err.println("错误次数过多！！！退出");
                        System.exit(1);
                    }
                    else
                    {
                        Toolkit.getDefaultToolkit().beep();
                        System.out.println("输入错误！！！请重新输入！");
                        input.nextLine();
                    }
                }
            }
            list.add(number);
            System.out.println();
            t.menu();
            t.select(t);
        }
        else if (ch == '2')
        {
            System.out.println("2.在索引位置添加元素");
            int number = 0;
            int index = -1;
            //控制台输入变量:nummer
            int errCount = 0;
            while (true)
            {
                try
                {
                    //min:-1000000
                    //max:1000000
                    System.out.print("请输入数字：");
                    number = input.nextInt();
                    if (number >= -1000000 && number <= 1000000)
                    {
                        break;
                    }
                    else
                    {
                        errCount++;
                        Toolkit.getDefaultToolkit().beep();
                        if (errCount > 10)
                        {
                            System.err.println("错误次数过多！！！退出");
                            System.exit(1);
                        }
                        System.out.println("输入的数据不在范围内! 范围：[-1000000,1000000]");
                    }
                }
                catch (Exception e)
                {
                    errCount++;
                    if (errCount > 5)
                    {
                        Toolkit.getDefaultToolkit().beep();
                        System.err.println("错误次数过多！！！退出");
                        System.exit(1);
                    }
                    else
                    {
                        Toolkit.getDefaultToolkit().beep();
                        System.out.println("输入错误！！！请重新输入！");
                        input.nextLine();
                    }
                }
            }
            //控制台输入变量:index
            errCount = 0;
            while (true)
            {
                try
                {
                    //min:0
                    //max:1000000
                    System.out.print("请输入索引：");
                    index = input.nextInt();
                    if (index >= 0 && index <= 1000000)
                    {
                        break;
                    }
                    else
                    {
                        errCount++;
                        Toolkit.getDefaultToolkit().beep();
                        if (errCount > 10)
                        {
                            System.err.println("错误次数过多！！！退出");
                            System.exit(1);
                        }
                        System.out.println("输入的数据不在范围内! 范围：[0,1000000]");
                    }
                }
                catch (Exception e)
                {
                    errCount++;
                    if (errCount > 5)
                    {
                        Toolkit.getDefaultToolkit().beep();
                        System.err.println("错误次数过多！！！退出");
                        System.exit(1);
                    }
                    else
                    {
                        Toolkit.getDefaultToolkit().beep();
                        System.out.println("输入错误！！！请重新输入！");
                        input.nextLine();
                    }
                }
            }
            list.add(number, index);
            System.out.println();
            t.menu();
            t.select(t);
        }
        else if (ch == '3')
        {
            System.out.println("3.取得索引位置的元素");
            int index;
            //控制台输入变量:index
            int errCount = 0;
            while (true)
            {
                try
                {
                    //min:0
                    //max:1000000
                    System.out.print("请输入索引：");
                    index = input.nextInt();
                    if (index >= 0 && index <= 1000000)
                    {
                        break;
                    }
                    else
                    {
                        errCount++;
                        Toolkit.getDefaultToolkit().beep();
                        if (errCount > 10)
                        {
                            System.err.println("错误次数过多！！！退出");
                            System.exit(1);
                        }
                        System.out.println("输入的数据不在范围内! 范围：[0,1000000]");
                    }
                }
                catch (Exception e)
                {
                    errCount++;
                    if (errCount > 5)
                    {
                        Toolkit.getDefaultToolkit().beep();
                        System.err.println("错误次数过多！！！退出");
                        System.exit(1);
                    }
                    else
                    {
                        Toolkit.getDefaultToolkit().beep();
                        System.out.println("输入错误！！！请重新输入！");
                        input.nextLine();
                    }
                }
            }
            int result;
            result = list.get(index);
            System.out.println("结果：" + result);
            System.out.println();
            t.menu();
            t.select(t);
        }
        else if (ch == '4')
        {
            System.out.println("4.从左到右显示全部元素");
            list.printList(true);
            System.out.println();
            t.menu();
            t.select(t);
        }
        else if (ch == '5')
        {
            System.out.println("5.从右到左显示全部元素");
            list.printList(false);
            System.out.println();
            t.menu();
            t.select(t);
        }
        else if (ch == '6')
        {
            System.out.println("6.升序排序");
            list.sort();
            System.out.println();
            t.menu();
            t.select(t);
        }
        else if (ch == '7')
        {
            System.out.println("7.降序排序");
            list.sort_desc();
            System.out.println();
            t.menu();
            t.select(t);
        }
        else if (ch == '8')
        {
            System.out.println("8.退出");
            System.out.println("再见");
            System.exit(1);

        }
        else
        {
            Toolkit.getDefaultToolkit().beep();
            System.out.println("输入错误！！！自动退出");
            System.exit(0);

        }
    }

    public static void main(String[] args)
    {
        test t = new test();
        if (args.length != 0)
        {
            try
            {
                for (int i = 0; i < args.length; i++)
                {
                    t.list.add(Integer.parseInt(args[i]));
                }
                System.out.println("已传入初始化参数");
            }
            catch (Exception e)
            {
                Toolkit.getDefaultToolkit().beep();
                System.out.println("参数传递异常！！！");
                System.out.println("退出");
                System.exit(0);
            }
        }
        t.menu();
        t.select(t);
    }
}
