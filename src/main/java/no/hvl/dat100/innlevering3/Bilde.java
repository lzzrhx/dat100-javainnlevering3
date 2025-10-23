package no.hvl.dat100.innlevering3;

public class Bilde extends Tekst {

    // Objektvariabler
    private String url;

    // Konstruktør
    public Bilde(String bruker, String dato, String tekst, String url) {
        this(bruker, dato, 0, tekst, url);
    }

    // Konstruktør
    public Bilde(String bruker, String dato, int likes, String tekst, String url) {
        super(bruker, dato, likes, url);
        this.url = url;
    }

    // Getter for url
    public String url() {
        return url;
    }

    // Setter for url
    public void url(String url) {
        this.url = url;
    }

    // Stringrepresentasjon av klassen
    public String toString() {
        return "BILDE\n" + super.id() + super.bruker() + "\n" + super.dato() + "\n" + super.likes() + "\n" + super.tekst() + url + "\n";
    }

    // TODO:
    public String toHTML() {
        return null;
    }
}
