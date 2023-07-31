/* Pigeon's Simple Digital Clock V1.1: 
 * Changed title to be less inconspiquious
 * Fixed title being uncentered
 * Added a README.MD
*/

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

class Main {
    
    static JFrame frame = new JFrame("CLOCK");
    static JLabel milTime = new JLabel();
    static JLabel title = new JLabel("Pigeon's Crummy Clock");
    static JPanel timePanel = new JPanel();
    static JPanel btnPanel = new JPanel();
    static JPanel titlePanel = new JPanel();
    static JButton switchBtn = new JButton();
    
    static String militaryTime;
    static boolean isMilitary = false;

    public static void main(String[] args) {
        // Frame Config
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1280, 720);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.DARK_GRAY); 
        frame.add(timePanel);
        frame.add(switchBtn);
        frame.add(titlePanel);

        // Label Config
        
        milTime.setFont(new Font("Serif", Font.PLAIN, 50));
        milTime.setForeground(Color.WHITE);
        milTime.setVisible(true);

        // Title Config
        title.setFont(new Font("Serif", Font.BOLD, 50));
        title.setForeground(Color.WHITE);
        title.setVisible(true);

        
        // Button config
        switchBtn.setBounds(515, 360, 200, 25); // 0, 0, 50, 25
        switchBtn.setVisible(true);
        switchBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                isMilitary = !isMilitary;
            }
        });

        // timePanel Config
        timePanel.setBounds(408, 223, 465, 75); // 640
        timePanel.setBackground(Color.DARK_GRAY);
        timePanel.add(milTime);
        
        //Titlepanel config
        titlePanel.setBounds(315, 30, 610, 95);
        titlePanel.setBackground(Color.DARK_GRAY);
        titlePanel.add(title);
        
        Timer timer = new Timer(1000, event -> {
            clock();
        });
        timer.start();

               
    }

    static void clock() {
            if (isMilitary == true) {
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss yyyy-MM-dd");
                LocalDateTime now = LocalDateTime.now();
                    
                militaryTime = dtf.format(now);
                milTime.setText(militaryTime);
                switchBtn.setText("Switch to 12h Time");
            } else {
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss MM/dd/yyyy");
                LocalDateTime now = LocalDateTime.now();
                    
                militaryTime = dtf.format(now);
                milTime.setText(militaryTime);
                switchBtn.setText("Switch to 24h Time");
            }
                    
            frame.repaint();

            
        }

    
}