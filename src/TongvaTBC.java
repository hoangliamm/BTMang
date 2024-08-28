import java.util.Scanner;

public class TongvaTBC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu cua mang: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.print("Nhap cac phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }
        double average = (double) sum / n;
        System.out.println("Tong : " + sum);
        System.out.println("Trung binh cong: " + average);
    }
}


