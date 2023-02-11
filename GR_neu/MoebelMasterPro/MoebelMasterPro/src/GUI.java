public class GUI {

    private Frame f;
    private Painting painting;

    public GUI() {
        this.f = new Frame("MöbelMasterPro", -1, -1, 1000, 800);
        this.painting = new Painting(this.f);
        this.f.getContentPane().add(this.painting);
        this.f.setupFrame();
    }
}
