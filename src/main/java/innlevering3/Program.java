package innlevering3;

public class Program {
    public static void main (String[] args) {
        System.out.println();
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println(" INNLEVERING 3");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println();
        Tekst t = new Tekst(1, "bruker", "23-10", "tekst");
        Bilde b = new Bilde(2, "bruker", "23-10", "bildetekst", "url.com");
        System.out.println(t);
        System.out.println(b);
        Blogg blogg = new Blogg(10);
        blogg.leggTil(t);
        blogg.leggTilUtvid(b);
        Blogg bloggLest = LesBlogg.les(System.getProperty("user.dir") + "/src/test/java/innlevering3/tests/", "bloggkorrekt.dat");
        System.out.println(bloggLest.samling().length);
        System.out.println(bloggLest.toString());
    }
}
