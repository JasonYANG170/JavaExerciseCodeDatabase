package 蓝桥杯猜生日;

import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int y = 0;
        for (int x = 19000101; x < 20120101; x++) {
            if (x % 2012 == 0 && x % 3 == 0 && x % 12 == 0) {
                String sz =x+"";
                if (sz.charAt(4)=='0'&&sz.charAt(5)=='6'&&sz.charAt(6)>='0'&&sz.charAt(6)<='3'&&sz.charAt(7)>='0'&&sz.charAt(7)<='9')
                y = x;
                break;
            }
        }
        System.out.println(y);
        scan.close();
    }
}


//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int y = 0;
//        for (int x = 19000101; x < 20120101; x++) {
//            if (x % 2012 == 0 && x % 3 == 0 && x % 12 == 0) {
//                String date = String.format("%08d", x);
//                String monthStr = date.substring(4, 6);
//                String dayStr = date.substring(6);
//                if (monthStr.equals("06") && Integer.parseInt(dayStr) <= 39) {
//                    y = x;
//                    break;
//                }
//            }
//        }
//        System.out.println(y);
//        scan.close();
//    }
//}