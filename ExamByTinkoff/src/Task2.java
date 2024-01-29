import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean stop = false;
        while(!stop){
            System.out.println("secret code for stopping it is my birth date");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            if(a>1&&a<10&&b>1&&b<10&&c>1&&c<10){
                System.out.println("YES");
            }
            else if(a ==28 && b ==1 &&c==2006){
                stop = true;
                System.out.println("you goddamn right");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
