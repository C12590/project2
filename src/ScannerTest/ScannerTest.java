package ScannerTest;

import java.util.Scanner;

class ScannerTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//scanner的实例化
        System.out.println("请输入你的姓名");
        String name = scan.next();
        System.out.println(name);
    }
}