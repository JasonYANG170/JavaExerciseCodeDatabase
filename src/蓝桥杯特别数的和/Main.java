package 蓝桥杯特别数的和;

import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int num3=0;
int x=scan.nextInt();
for (int num=1;num<=x;num++){
    String zh=num+"";
    for(int num2=0;num2<zh.length();num2++){
        if (zh.charAt(num2)=='0'||zh.charAt(num2)=='2'||zh.charAt(num2)=='1'||zh.charAt(num2)=='9'){
            num3+=Integer.parseInt(zh);;
            System.out.println(zh.charAt(num2));
        }
    }
}
System.out.print(num3);
        scan.close();
    }
}
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int num3 = 0;
//        int x = scan.nextInt();
//        for (int num = 1; num <= x; num++) {
//            String zh = num + "";
//            boolean flag = false; // 标记该数字是否包含 2、0、1、9
//            for (int num2 = 0; num2 < zh.length(); num2++) {
//                if (zh.charAt(num2) == '0' || zh.charAt(num2) == '2' || zh.charAt(num2) == '1' || zh.charAt(num2) == '9') {
//                    flag = true;
//                    break;
//                }
//            }
//            if (flag) {
//                num3 += num;
//            }
//        }
//        System.out.print(num3);
//        scan.close();
//    }
//}