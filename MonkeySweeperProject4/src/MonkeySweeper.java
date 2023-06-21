import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;


public class MonkeySweeper extends JFrame {

    private JLabel statusbar;

    public MonkeySweeper() {
    	
        initUI();
    }

    private void initUI() {
    	
        statusbar = new JLabel("");
        add(statusbar, BorderLayout.SOUTH);

        add(new GameBoard(statusbar));

        setResizable(false);
        pack();

        setTitle("MonkeySweeper");
        
        ImageIcon img = new ImageIcon("\\Users\\Josh\\eclipse-workspace\\MonkeySweeperProject4\\resources/9.png");
        setIconImage(img.getImage());
        
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {

            var monkeystart = new MonkeySweeper();
            monkeystart.setVisible(true);
        }
        );
    }
}
