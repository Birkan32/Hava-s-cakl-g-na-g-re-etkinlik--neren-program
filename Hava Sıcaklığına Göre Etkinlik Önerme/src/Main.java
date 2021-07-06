import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklığı Giriniz :");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.print("Kayak yapabilirsiniz ");

        } else if (heat > 5 && heat < 15) {
            System.out.print("Sinemaya gidebilirsiniz");


        }
        if (heat > 15 && heat < 25) {
            System.out.print("Piknik yapabilirsiniz");
        }
       if(heat>25) {
            System.out.print("Yüzme yapabilirsiniz.");
        }
    }
}