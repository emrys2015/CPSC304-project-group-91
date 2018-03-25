import javax.swing.*;

import java.awt.event.*;
import java.awt.*;

public class Main extends JFrame implements ActionListener{
    private DBDriver dbDriver;
    private JButton employee, client, btnexit;

    public JLabel l1, l4;

    private UIbasic EUIlogin;
    private UIClient UIlogin;


    public static void main(String[] args) {
        new Main();
    }

    public Main(){
        dbDriver = new DBDriver();
        if(!dbDriver.connect()){
            System.out.println("not connected");
        }
        l1 = new JLabel();
        l1.setFont(new Font("Magneto", Font.PLAIN, 28));
        l1.setForeground(Color.RED);
        l1.setText("SF Express Database");
        l1.setBounds(330, 20, 350, 100);

        btnexit = new JButton("Exit");
        btnexit.setBounds(680, 63, 30, 20);
        btnexit.addActionListener(this);

        ImageIcon hearts = new ImageIcon("18.jpg");
        l4 = new JLabel();
        l4.setIcon(hearts);
        l4.setBounds(210, 120, 500, 200);


        //submit names button
        employee = new JButton("Employee");
        employee.setOpaque(true);
        employee.setBackground(Color.PINK);
        employee.setBounds(255, 360, 170, 40);
        employee.addActionListener(this);

        //client names button
        client = new JButton("Client");
        client.setOpaque(true);
        client.setBackground(Color.PINK);
        client.setBounds(499, 360, 170, 40);
        client.addActionListener(this);



        // Declare and initialize JPanel
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.add(l1);

        panel.add(l4);
        panel.add(employee);
        panel.add(client);
        panel.add(btnexit);

        // Set properties of the JFrame
        setContentPane(panel);
        setSize(900, 480);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("SF Express");
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);
        // 2017 Quan Zhang, David Chen all rights reserved
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //check if there are inputs
        if (e.getSource() == employee) {
            EUIlogin = new UIbasic();
        } else if (e.getSource() == client) {
            UIlogin = new UIClient();
        } else if (e.getSource() == btnexit) {
            JOptionPane.showMessageDialog(null, "Thank you, see you again", "JButton",
                    JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
            // 2017 Quan Zhang, David Chen all rights reserved
        }

    }
}
