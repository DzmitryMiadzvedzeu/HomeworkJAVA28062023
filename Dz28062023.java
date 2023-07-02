package homeworks;

public class Dz28062023 {
    public static void main(String[] args) {
//        Разработайте алгоритм с помощью цикла for, который
//        смог бы вывести в консоль такую последовательность чисел:
//        1 2 4 8 16 32 64 128 256 512

        int[] a = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512};
        System.out.println(a.length);

        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }


    }
}
