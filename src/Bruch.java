/**
 *
 * Description
 *
 * @version 1.0 from 11.08.2023
 * @author 
 */

public class Bruch {
  
  // start attributes
  private int nenner;
  private int zaehler;
  // end attributes
  
  public Bruch(int pZaehler, int pNenner) {
    this.nenner = pNenner;
    this.zaehler = pZaehler;
  }

  public int getNenner() {
    return nenner;
  }

  // start methods
  public String toString() {
    // TODO add your code here
     return zaehler + "/" + nenner;
  }

  public int getZaehler() {
    return zaehler;
  }

  // end methods
} // end of Bruch
