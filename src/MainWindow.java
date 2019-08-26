import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    private boolean inGame;

    public MainWindow(){
        setTitle("Snake");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(355,375);
        setLocation(500, 100);
        add(new gameField(inGame = true));
        setVisible(true);
    }

    public static void main(String[] args){

        MainWindow mw = new MainWindow();
    }
}
