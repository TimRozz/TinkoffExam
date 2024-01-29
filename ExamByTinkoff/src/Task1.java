import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            String me = scanner.nextLine();
            String me1 = "code";
            String me2 = "???";
            String result = me.replaceAll(me1+"[0-9]+",me2);
            System.out.println(result);
            end = me.equals("stop");
        }
    }
}