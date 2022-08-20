import java.awt.*;
import javax.swing.*;
public class GameFrame extends JFrame{


    GameFrame(){
        this.add(new GameScene());
        this.setTitle("Air hockey");
        this.setIconImage(new ImageIcon("hockey_icon.png").getImage());
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}


