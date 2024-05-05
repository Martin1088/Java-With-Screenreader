package Verwaltung;

public class Kind extends Person {
    private double noteVorschultest;

    public double getNoteVorschultest() {
        return noteVorschultest;
    }
    public void setNoteVorschultest(double noteVorschultest) {
        this.noteVorschultest = noteVorschultest;
    }

    @Override
    public boolean istGut(double noteVorschultest) {
        if (noteVorschultest > 2.5 ) {
            return  true;
        } else  {
            return  false;
        }
    }
}
