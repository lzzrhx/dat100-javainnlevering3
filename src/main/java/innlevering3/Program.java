package innlevering3;

public class Program {
    public static void main (String[] args) {
        System.out.println("...");
        Tekst t = new Tekst("bruker", "23-10", "tekst");
        Bilde b = new Bilde("bruker", "23-10", "bildetekst", "url.com");
        System.out.println(t);
        System.out.println(b);
        Blogg blogg = new Blogg(10);
        blogg.leggTil(t);
        blogg.leggTilUtvid(b);
    }
}
