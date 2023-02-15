package cour_java;

public class CompteCourant {
    int numeroCompte;
    double montantCompte;
    String intituleCompte;

    public CompteCourant(int numeroCompte, double montantCompte) {
        this.numeroCompte = numeroCompte;
        this.montantCompte = montantCompte;
    }

    public CompteCourant(int numeroCompte) {
        this.numeroCompte = numeroCompte;
        this.montantCompte=0;
    }


    public int getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(int numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public double getMontantCompte() {
        return montantCompte;
    }

    public void setMontantCompte(double montantCompte) {
        this.montantCompte = montantCompte;
    }

    public String getIntituleCompte() {
        return intituleCompte;
    }

    public void setIntituleCompte(String intituleCompte) {
        this.intituleCompte = intituleCompte;
    }

    public String resume(){
        String etatCompte = "le nom de votre compte est "+getIntituleCompte()+"votre slode est"+getMontantCompte();
        return (etatCompte);
    }

    public CompteCourant(int numeroCompte, double montantCompte, String intituleCompte) {
        this.numeroCompte = numeroCompte;
        this.montantCompte = montantCompte;
        this.intituleCompte = intituleCompte;
    }

    public double decouvertMax(double montantCompte){
      double decouvert = 0.5*montantCompte;
       return decouvert;
    }
}
