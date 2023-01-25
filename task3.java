import java.io.FileWriter;

// Есть строка, нужно её 100 раз повторить в файле, используя Try catch

public class task3 {
    public static void main(String[] args) {
        String text = "TEXT";
        try {
            FileWriter writer=new FileWriter("file.txt");
            for (int i=0; i<100; i++)    {
                writer.write(text);
            }
            System.out.println("Получилось");
            writer.close();
        }
        catch (Exception e){
            System.out.println("что-то не так");
        }
    }
}
