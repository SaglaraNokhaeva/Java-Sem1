// Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd.
// Вывод: a4b3c1d2 для примера

import java.util.Scanner;

import javax.lang.model.element.Element;

public class task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String string = scan.nextLine();
        scan.close();
        System.out.println(ZipStr(string));

    }

    public static String ZipStr (String str) {
                StringBuilder zip= new StringBuilder();
                int count=1;
                str=str+" ";
                for (int i=0; i<str.length()-1;i++){
                   if (str.charAt(i)==(str.charAt(i+1)))  {             
                    count++;
                }
                else {
                    zip.append(str.charAt(i)).append(Integer.toString(count));
                    count=1;
                }
            }
                return zip.toString();  
}
}