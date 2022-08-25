import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Sayi Giriniz: ");
        int sayi=input.nextInt();
        System.out.println(isPalindrom(sayi));
    }

    static boolean isPalindrom(int number){
        int temp=number;
        int reverseNumber=0;
        int lastNumber;

        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp = temp / 10;
        }
            if (reverseNumber==number){
                System.out.println(number+ " Palindrom Sayidir..");
                return true;
            }else {
                System.out.println(number + " Palindrom Sayi Degildir!!");
                return false;
            }
    }
}

