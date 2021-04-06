import java.util.Scanner;

public class UseString {
    public static void main(String[] args) {
        String nameFull = "Nguyen Van Hoang";
        Scanner input = new Scanner(System.in);
        String keyChar;
        System.out.println("Nhập ký tự kiểm tra");
        keyChar=input.nextLine();
        char char1;
        keyChar.trim();
        char1= keyChar.charAt(0);
        System.out.println(char1);
        System.out.println(nameFull.length());
        int count=0;
        for (int i = 0; i <nameFull.length() ; i++) {
            if (char1 == nameFull.charAt(i)){
                count++;

            }
        }
        System.out.println("Trong chuỗi có "+ count + "ký tự " + char1);

    }
}
