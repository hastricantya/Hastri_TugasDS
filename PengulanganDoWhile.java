public class PengulanganDoWhile {
    public static void main(String[] args) {

        System.out.println("Ini adalah awal program");
        int a = 0;
        boolean kondisi = true;
        do {
            a++;
            System.out.println("do ke-" + a);
            if (a == 3) {
                kondisi = false;
            }
        } while (kondisi);
        System.out.println("Ini adalah akhir program");
        }
    }

