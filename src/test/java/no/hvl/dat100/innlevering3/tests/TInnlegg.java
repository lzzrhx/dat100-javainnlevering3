package no.hvl.dat100.innlevering3.tests;

import no.hvl.dat100.innlevering3.Innlegg;

public class TInnlegg extends Innlegg {

    public TInnlegg(String bruker, String dato) {
        super(bruker,dato);
    }

    public TInnlegg(String bruker, String dato, int likes) {
        super(bruker,dato,likes);
    }

}
