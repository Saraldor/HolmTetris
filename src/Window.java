import javax.swing.*;

public class Window {
    public static final int WIDTH = 300, HEIGHT = 600;
    private JFrame windows;
private Board board;
    public Window() {
        windows = new JFrame("Tetris");
        windows.setSize(WIDTH, HEIGHT);
        windows.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windows.setResizable(false);
        windows.setLocationRelativeTo(null);
board = new Board();
windows.add(board);

        windows.setVisible(true);
    }

        public static void main(String[]args){
            new Window();


        }
    }
