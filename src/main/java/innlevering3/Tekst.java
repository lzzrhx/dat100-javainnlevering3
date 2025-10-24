package innlevering3;

public class Tekst extends Innlegg {

    // Objektvariabler
    private String tekst;

    // Getter for tekst
    public String tekst() {
        return tekst;
    }

    // Konstruktør
    public Tekst(int id, String bruker, String dato, String tekst) {
        this(id, bruker, dato, 0, tekst);
    }
    
    // Konstruktør
    public Tekst(int id, String bruker, String dato, int likes, String tekst) {
        super(id, bruker, dato, likes);
        this.tekst = tekst;
    }

    // Setter for tekst
    public void tekst(String tekst) {
        this.tekst = tekst;
    }

    // Stringrepresentasjon av klassen
    public String toString() {
        return "TEKST\n" + super.toString() + tekst + "\n";
    }

    // TODO:
    public String toHTML() {
        return null;
    }
}
