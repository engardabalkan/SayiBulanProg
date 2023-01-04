import java.util.Scanner;
import java.util.Arrays;

public class SayiBulanProgram {
    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int sayi = input.nextInt();
        int[] newList = {15, 12, 788, 1, -1, -778, 2, 0, sayi};
        Arrays.sort(newList);

        int x = Arrays.binarySearch(newList, sayi);
        if(x == 0){
            System.out.println("En yakın en küçük: " + newList[x+1]);
            System.out.println("En yakın en büyük: " + newList[x+2]);
        }
        else if ( x == newList.length-1) {
            System.out.println("En yakın en küçük: " + newList[x-1]);
            System.out.println("En yakın en büyük: " + newList[x-2]);
        }

        else {
            System.out.println("En yakın en küçük: " + newList[x - 1]);
            System.out.println("En yakın en büyük: " + newList[x + 1]);
        }



    }
}
