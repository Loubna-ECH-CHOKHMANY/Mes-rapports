class CompteBancaire {
    private String numeroCompte;
    private double solde;

    public CompteBancaire(String numeroCompte, double soldeInitial) {
        this.numeroCompte = numeroCompte;
        this.solde = soldeInitial;
    }

    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
        }
    }

    public void retirer(double montant) {
        if (montant <= solde) {
            solde -= montant;
        }
    }

    public String getNumeroCompte() {
        return numeroCompte;
    }

    public double getSolde() {
        return solde;
    }
}

class CompteEpargne extends CompteBancaire {
    public CompteEpargne(String numeroCompte, double soldeInitial) {
        super(numeroCompte, soldeInitial);
    }

    public void calculerInterets(double taux) {
        double interets = getSolde() * (taux / 100);
        deposer(interets);
    }
}

public class Banque {
    public static void main(String[] args) {
        CompteBancaire cc = new CompteBancaire("CC123", 1000.0);
        cc.deposer(500);
        cc.retirer(200);

        CompteEpargne ce = new CompteEpargne("CE456", 2000.0);
        ce.calculerInterets(5.0);
        
        System.out.println("Solde CC: " + cc.getSolde());
        System.out.println("Solde CE: " + ce.getSolde());
    }
}