import java.util.Scanner;
public class manavtoplam {
    public static void main(String[] args) {
        //manav satış bilgileri
       double armut , elma, domates , muz, patlican;

       Scanner inp = new Scanner(System.in);

       System.out.print("armut kaç kg aldınız?:");
       armut= inp.nextDouble();

       System.out.print("elmadan kaç kg aldınız?");
       elma= inp.nextDouble();

       System.out.print("domates ka. kg aldınız?:");
       domates=inp.nextDouble();

       System.out.print("muz kaç kg aldınız:");
       muz=inp.nextDouble();

       System.out.print("patlican kaç kg aldınız?:");
       patlican= inp.nextDouble();

       double tutar = (armut*2.14) + (elma*3.67)+ (domates*1.15) + (muz*0.95)+(patlican*2.25);
       System.out.println(tutar);

    }
}
