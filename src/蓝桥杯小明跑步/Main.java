package 蓝桥杯小明跑步;

//【问题描述】
//小明要做一个跑步训练。
//初始时，小明充满体力，体力值计为 10000。如果小明跑步，每分钟损耗
//600 的体力。如果小明休息，每分钟增加 300 的体力。体力的损耗和增加都是均匀变化的。
//小明打算跑一分钟、休息一分钟、再跑一分钟、再休息一分钟……如此循
//环。如果某个时刻小明的体力到达 0，他就停止锻炼。
//请问小明在多久后停止锻炼。为了使答案为整数，请以秒为单位输出答案。
//答案3880（未订正）
public class Main {
    public static void main(String[] args) {
        int power=10000;
        int min=0;
        while (true) {
            min++;

            if (min% 2 == 0) {
                power=power+300;

            } else if (min%2!=0) {
                power =power- 600;

            }if (power==0) {

                break;
            }

        }
        System.out.println(min*60+power/10);
    }
}
//public class Main03 {
//    public static void main(String[] args) {
//        int tl = 10000;
//        boolean b = true;
//        int time = 0;
//        while (true) {
//            //体力为0
//        if (tl<600&&b) {
//            //将剩余的体力转化为时间加起来算总时间
//            System.out.println(time*60+tl/10);
//            break;
//        }
//        if (b) {
//            tl-=600;
//            b=false;
//            time++;
//        }else{
//            tl+=300;
//            b=true;
//            time++;
//        }
//        }
//    }
//}