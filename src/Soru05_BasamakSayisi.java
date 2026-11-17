
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Bana bir sayi gir");
        Scanner girdi = new Scanner(System.in);
        int sayi = girdi.nextInt();
        int kutu = 0;
        while(sayi >= 10){
            sayi = sayi/10;
            kutu = kutu + 1;
        }
        kutu = kutu + 1;
        System.out.println("Girdiginiz sayi " + kutu + " basamaklidir");

    }
}
