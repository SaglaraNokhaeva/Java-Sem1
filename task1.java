// Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет строку длины N, 
// которая состоит из чередующихся символов c1 и c2, начиная с c1.

import java.util.Scanner;

public class task1 {
    // public static void main(String[] args) {
    //     Scanner scan=new Scanner(System.in);
    //     System.out.print("\n Введите чётное число: ");
    //     Integer number= scan.nextInt();
    //     System.out.print("\n Введите первый символ: ");
    //     char c1=scan.next().charAt(0);
    //     System.out.print("\n Введите второй символ: ");
    //     char c2=scan.next().charAt(0);
    //     scan.close();
    //     System.out.println(Concat(number,c1,c2));
    // }
    
    
    // public static String Concat (int num, char a, char b) {
    //         StringBuilder sb= new StringBuilder();
    //         for (int i=0; i<num/2;i++){
    //             sb.append(a);
    //             sb.append(b);
    //         }
    //         return sb.toString();
    // }


//второе решение задачи


public static void main(String[] args) {
    Scanner iScanner = new Scanner(System.in);
    System.out.print("Enter N, c1, c2: ");
    String str = iScanner.nextLine();
    iScanner.close();
    String[] arr = str.split(" |,|\\.");

    System.out.println(charString(arr));
}

public static String charString(String[] arr) {

int number = Integer.parseInt(arr[0]);
StringBuilder string = new StringBuilder();
for (int i = 0; i < number / 2; i++) {
string.append(arr[1]).append(arr[2]);
}
return string.toString();
    }


}



