class Testklasse {
  
  private Rechner derRechner;

  public Testklasse() {
    derRechner = new Rechner();
    
    Bruch bruch1 = new Bruch(4,8);
    Bruch bruch2 = new Bruch(3,4);
    
    Bruch plus = derRechner.addieren(bruch1,bruch2);
    Bruch minus = derRechner.subtrahieren(bruch1,bruch2);
    Bruch mal = derRechner.multiplizieren(bruch1,bruch2);
    Bruch geteilt = derRechner.dividieren(bruch1,bruch2);
    Bruch kuerzen = derRechner.kuerzen(bruch1);

    System.out.println(bruch1.toString() + " + " + bruch2.toString() + " = " + plus.toString());
    System.out.println(bruch1.toString() + " - " + bruch2.toString() + " = " + minus.toString());
    System.out.println(bruch1.toString() + " * " + bruch2.toString() + " = " + mal.toString());
    System.out.println(bruch1.toString() + " / " + bruch2.toString() + " = " + geteilt.toString());
    System.out.println(kuerzen.toString());
  }
  
  
}
