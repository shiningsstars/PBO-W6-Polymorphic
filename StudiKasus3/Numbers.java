import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("\nHow many integers do you want to sort? ");
        int size = scan.nextInt();

        // Integer[] (bukan int[]) karena Comparable[] cuma bisa nerima objek.
        // Autoboxing yang ngurus konversi int -> Integer.
        Integer[] numbers = new Integer[size];

        System.out.println("\nEnter the numbers...");
        for (int i = 0; i < size; i++)
            numbers[i] = scan.nextInt();

        Sorting.insertionSort(numbers);

        System.out.println("\nYour numbers in sorted order...");
        for (int i = 0; i < size; i++)
            System.out.print(numbers[i] + " ");
        System.out.println();
    }
}
