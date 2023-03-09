package 查找素数;

public class Main {
    public static void main(String[] args) {

        int[] primes = new int[8]; // 数组存储质数
        int index = 0; // 数组索引

        // 找到20以内的质数
        for (int i = 2; i <= 20; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes[index] = i;
                index++;
            }
        }

        // 输出质数数组
        for (int i = 0; i < primes.length; i++) {
            System.out.print(primes[i] + " ");
        }
            }
        }
