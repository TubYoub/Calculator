/**
 *
 * Description
 *
 * @version 1.0 from 09.08.2023
 * @author 
 */

public class Rechner {
  
  // start attributes
  // end attributes
  
  // start methods
  public Bruch addieren(Bruch pA, Bruch pB) {
     int newZaehler = Math.addExact(Math.multiplyExact(pA.getZaehler(), pB.getNenner()),Math.multiplyExact(pB.getZaehler(), pA.getNenner()));
     int newNenner = Math.multiplyExact(pA.getNenner(), pB.getNenner());
     return new Bruch(newZaehler,newNenner);
  }

  public Bruch subtrahieren(Bruch pA, Bruch pB) {
      int newZaehler = Math.subtractExact(Math.multiplyExact(pA.getZaehler(), pB.getNenner()),Math.multiplyExact(pB.getZaehler(), pA.getNenner()));
      int newNenner = Math.multiplyExact(pA.getNenner(), pB.getNenner());
     return new Bruch(newZaehler,newNenner);
  }

  public Bruch dividieren(Bruch pA, Bruch pB) {
     int newZaehler = Math.multiplyExact(pA.getZaehler(), pB.getNenner());
     int newNenner = Math.multiplyExact(pB.getZaehler(), pA.getNenner());
     return new Bruch(newZaehler,newNenner);
  }

  public Bruch multiplizieren(Bruch pA, Bruch pB) {
      int newNenner = Math.multiplyExact(pA.getNenner(), pB.getNenner());
      int newZaehler = Math.multiplyExact(pA.getZaehler(), pB.getZaehler());
      return new Bruch(newZaehler,newNenner);
  }
  public Bruch kuerzen(Bruch bruch) {
        int zaehler = bruch.getZaehler();
        int nenner = bruch.getNenner();
        int ggT = ggT(zaehler, nenner);

        int neuerZaehler = zaehler / ggT;
        int neuerNenner = nenner / ggT;

        return new Bruch(neuerZaehler, neuerNenner);
    }
    public int ggT(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a); // Der ggT sollte immer positiv sein
    }


  // end methods
} // end of Rechner
