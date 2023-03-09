package 蓝桥杯第几天;
import java.util.Scanner;
public class Main {

// 1:无需package
// 2: 类名必须Main, 不可修改


        public static void main(String[] args) {
            int year = 2000;
            //判断是不是闰年
            boolean flag = false;
            if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
                flag = true;
            }
            //定义总天数 把 5月 的四天加进去，在计算 1~4月的总天数
            int totalday = 4;
            for(int i = 1;i <= 5;i++){
                int day = 0;
                switch(i){
                    case 1:
                    case 3:
                        day = 31;
                        break;
                    case 2:
                        if(flag){
                            day = 29;
                            break;
                        }else{
                            day = 28;
                            break;
                        }
                    case 4:
                        day = 30;
                        break;
                }
                totalday += day;
            }
            System.out.println(totalday);
        }

}
