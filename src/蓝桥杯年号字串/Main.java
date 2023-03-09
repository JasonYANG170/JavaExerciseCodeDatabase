package 蓝桥杯年号字串;
// 题目描述
//https://www.lanqiao.cn/problems/605/learning/?page=2&first_category_id=1&sort=students_count
public class Main {
    //年号字串

    public static void main(String[] args) {
        char x = 2019 % 26 + 64;
        char y = 2019 / 26 % 26 + 64;
        char z = 2019 / 26 / 26 + 64;
        System.out.println("" + z + y + x);
    }
}
//ASCI表