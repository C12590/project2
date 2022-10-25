package Hello.java;

import java.util.Scanner;

class Hello {
    public static void main(String[] args) {
        System.out.println("I LOve U");
        char c3 = '7';
        System.out.println("c3");
        boolean bb1 = true;
        System.out.println(bb1);
        int number = 10086;
        String numberStr = "学号：";
        boolean b1 = true;
        String info = numberStr + number + b1; //String可以和8种数据类型变量类型做运算，且运算只能是连接运算： +
        System.out.println(info);//运算结果仍然是String
        String str2 = 3306 + "";
        System.out.println(str2);
    }
}

class IfTest {
    public static  void main (String[] args) {
        //举例子
        int heartbeats=99;
        if(heartbeats < 100 || heartbeats > 80){
            System.out.println("需要做进一步检查");
        }else {
            System.out.println("检查结束");
        }

        int num1 = 10,num2 = 20,num3 = 30;
        int max;
        if (num1 >= num2 && num1 >= num3){
            max = num1;
        }else if(num2 >= num1 && num2 >= num3){
            max = num2;
        }else {
            max = num3;
        }
        System.out.println("三个数中最大的是：" + max);
    }
}


class Test2{
    public static void main (String[] args){
        //定义变量
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生成绩");
        double Score = sc.nextDouble();
        //输出结果
        if(Score > 90){
            System.out.println("A");
        }
        else if (Score >= 60 && Score <= 89) {
            System.out.println("B");
        }
        else {
          System.out.println("C");
        }
        }
    }
