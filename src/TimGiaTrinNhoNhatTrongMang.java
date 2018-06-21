import java.util.Scanner;

public class TimGiaTrinNhoNhatTrongMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Độ dài của mảng: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Thêm dữ liệu vào mảng: ");
        for (int i = 0; i < arr.length; i++) {
            int number = sc.nextInt();
            arr[i] = number;
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + minValue(arr));
    }
    static int minValue(int []array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
