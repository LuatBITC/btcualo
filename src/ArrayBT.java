import java.util.ArrayList;
import java.util.Scanner;

public class ArrayBT {
    // Method to calculate the sum of even numbers in an array
    public void SumEvenNumberArrays(int[] array) {
        int sum = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        System.out.println("Sum = " + sum);
    }
    public int maxInArray(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    public void CountOccurrences(int[] array, int elementToFind) {
        int count = 0;
        for (int num : array) {
            if (num == elementToFind) {
                count++;
            }
        }
        System.out.println("Phan tu " + elementToFind + " xuat hien " + count + " lan trong mang");
    }
     public void SumOfSquaresElements() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap cac gia tri vao mang (nhap 'n' de ket thuc):");

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("n")) {
                break;
            }
            try {
                int value = Integer.parseInt(input);
                arrayList.add(value);
            } catch (NumberFormatException e) {
                System.out.println("Gia tri khong hop le, vui long nhap lai:");
            }
        }

        int sumOfSquares = 0;
        for (int num : arrayList) {
            sumOfSquares += num * num;
        }
        System.out.println("Tong binh phuong cac phan tu trong mang = " + sumOfSquares);
    }
}