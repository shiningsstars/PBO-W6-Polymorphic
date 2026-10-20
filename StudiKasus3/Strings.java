import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("\nHow many strings do you want to sort? ");
        int size = scan.nextInt();
        scan.nextLine();

        String[] words = new String[size];

        System.out.println("\nEnter the strings (satu per baris)...");
        for (int i = 0; i < size; i++)
            words[i] = scan.nextLine();

        Sorting.insertionSort(words);

        System.out.println("\nYour strings in sorted order...");
        for (int i = 0; i < size; i++)
            System.out.print(words[i] + " ");
        System.out.println();
    }
}
