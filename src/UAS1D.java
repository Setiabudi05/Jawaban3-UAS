import java.util.Scanner;
import java.util.ArrayList;

public class UAS1D {
    public static void main(String[] args) {
        int jum = 4;
        UAS1D myMessage = new UAS1D();
        Scanner sc = new Scanner(System.in);
        myMessage.setMessageID(sc.nextLine());
        Scanner sc1 = new Scanner(System.in);;
        myMessage.setMessageName(sc1.nextLine());
        ArrayList<String> context = new ArrayList<>();
        for (int index = 0; index < jum; index++) {
            context.add(sc.nextLine());
        }
        myMessage.setContext(String.valueOf(context));
        //buatlah Method FindWords dalam ClassObject
        //untuk mencari kata dalam ArrayList Context
        // dan menampilkan posisi index-nya dalam ArrayList Context
        System.out.print("Kata yang dicari : ");
        String cari = sc.nextLine();
        System.out.println(myMessage.FindWords(context, cari));// output "Index ke 0 1 "
    }

    private Object FindWords(ArrayList<String> context, String cari) {
        return null;
    }

    private void setMessageName(String nextLine) {
    }

    private void setMessageID(String nextLine) {
    }

    private void setContext(String nextLine) {
    }
}