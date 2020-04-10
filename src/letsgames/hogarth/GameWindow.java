package letsgames.hogarth;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class GameWindow extends JFrame {
    private static GameWindow game_window;
    private static Image main_backgr;

    public static void main(String[] args) throws IOException {
        main_backgr = ImageIO.read(GameWindow.class.getResourceAsStream("fon1.PNG"));
        game_window = new GameWindow();
        game_window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        game_window.setLocation(500, 50);
        game_window.setSize(489,619);
        game_window.setResizable(false);
        GameField game_field = new GameField();
        game_window.add(game_field);
        game_window.setVisible(true);
    }

    private static void onRepaint(Graphics g){
        g.drawImage(main_backgr,0,0,null);
    }

    private static class GameField extends JPanel {
        @Override
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            onRepaint(g);
        }
    }
}
