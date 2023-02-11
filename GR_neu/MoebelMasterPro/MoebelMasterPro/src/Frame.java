import javax.swing.JFrame;

public class Frame extends JFrame{

    private String title;
    private int x;
    private int y;
    private int width;
    private int height;

    public Frame(String title, int x, int y, int width, int height){
        this.title = title;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    public void setupFrame() {
        setTitle(this.title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(this.width, this.height);
        if(this.x==-1 && this.y == -1) {
            setLocationRelativeTo(null); //centers the jFrame on the screen
        }else {
            setLocation(this.x, this.y);
        }
        setVisible(true);
    }

    public String getTitle() {
        return title;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

}
