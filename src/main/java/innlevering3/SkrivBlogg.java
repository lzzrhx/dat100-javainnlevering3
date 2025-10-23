package innlevering3;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class SkrivBlogg {
    public static boolean skriv(Blogg blogg, String mappe, String fil){
        try {
            PrintWriter writer = new PrintWriter(fil);
            for (Innlegg innlegg : blogg.samling()) {
                writer.print(innlegg);
            }
            writer.close();
            return true;
        }
        catch(FileNotFoundException e) {
            return false;
        }
    }
}
