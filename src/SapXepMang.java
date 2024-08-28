import java.util.Scanner;
import java.util.Arrays;
public class SapXepMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu cua mangg: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Nhap cac phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        System.out.println("Mang sau khi sap xep tang dan: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
