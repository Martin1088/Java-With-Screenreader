package MitarbeiterNotebook2;

public class Notebook {
  private Integer sNr;
  private Tasche hatTashe;

  public Notebook(Integer sNr, Tasche hatTasche) {
    this.sNr = sNr;
    this.hatTashe = hatTasche;
  }

  public Integer getsNr() {
    return sNr;
  }

  public void setsNr(Integer sNr) {
    this.sNr = sNr;
  }
}
