// 1. Classe abstraite Animal
abstract class Animal {
    private String nom;

    public Animal(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    // Méthode abstraite à implémenter dans les sous-classes
    public abstract void faireDuBruit();
}

// 2. Classe Mammifere héritant d'Animal
class Mammifere extends Animal {

    public Mammifere(String nom) {
        super(nom);
    }

    @Override
    public void faireDuBruit() {
        System.out.println(getNom() + " grogne.");
    }
}

// 3. Classe Oiseau héritant d'Animal
class Oiseau extends Animal {

    public Oiseau(String nom) {
        super(nom);
    }

    @Override
    public void faireDuBruit() {
        System.out.println(getNom() + " chante.");
    }

    // ✅ Méthode ajoutée (Question 5)
    public void voler() {
        System.out.println(getNom() + " : L'oiseau vole.");
    }
}

// 4. Classe principale avec polymorphisme
public class Zoo {
    public static void main(String[] args) {

        // Polymorphisme : tigre et perroquet déclarés comme Animal
        Animal tigre = new Mammifere("Tigre");
        Animal perroquet = new Oiseau("Perroquet");

        tigre.faireDuBruit();      // Tigre grogne.
        perroquet.faireDuBruit();  // Perroquet chante.

        System.out.println();

        // ✅ Question 6 : utiliser voler() → on déclare en tant qu'Oiseau
        Oiseau perroquet2 = new Oiseau("Perroquet");
        perroquet2.faireDuBruit(); // Perroquet chante.
        perroquet2.voler();        // Perroquet : L'oiseau vole.
    }
}