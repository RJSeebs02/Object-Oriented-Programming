import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class GUI extends Compute {
    //Declare JFrame
    public GUI() {
        JFrame frame = new JFrame("Forever Gems Jewelry Price Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //JPanels
        JPanel panelLogo = new JPanel(new FlowLayout());
        JPanel panelTitle = new JPanel(new FlowLayout());
        JPanel panelOne = new JPanel(new GridLayout(3, 2, 1, 1));
        JPanel panelTwo = new JPanel(new FlowLayout());
        JPanel panelThree = new JPanel(new FlowLayout());
        JButton button = new JButton("Compute!");

        //JButtons
        JButton button1 = new JButton("About");
        JButton button2 = new JButton("Price");

        //JPanel Dimension x Position
        panelLogo.setBounds(0, 10, 250, 50);
        panelTitle.setBounds(75, 65, 350, 70);
        panelOne.setBounds(45, 150, 400, 100);
        panelTwo.setBounds(60, 300, 380, 40);
        panelThree.setBounds(420, 10, 70, 80);

        //App Icon
        ImageIcon icon = null;
        java.net.URL imgURL = Main.class.getResource("logo.png");
        if (imgURL != null) {
            icon = new ImageIcon(imgURL);
            frame.setIconImage(icon.getImage());
        } else {
            JOptionPane.showMessageDialog(frame, "Icon image not found.");
        }

        //JFrame Background
        frame.setContentPane(new JLabel(new ImageIcon("src/bg.png")));
        panelLogo.setBackground(new Color(0, 0, 0, 0));
        panelTitle.setBackground(new Color(0, 0, 0, 0));
        panelOne.setBackground(new Color(0, 0, 0, 0));
        panelTwo.setBackground(new Color(0, 0, 0, 0));
        panelThree.setBackground(new Color(0, 0, 0, 0));

        //JLabels
        JLabel labelLogo, labelOne, labelTwo, labelThree, labelTitle, labelTitle2;

        labelLogo = new JLabel("FOREVER GEMS");
        labelTitle = new JLabel("Jewelry Wholesale", JLabel.CENTER);
        labelTitle2 = new JLabel("and Retail Price Calculator", JLabel.CENTER);
        labelOne = new JLabel(" Jewelry Type: ");
        labelTwo = new JLabel(" Main Material: ");
        labelThree = new JLabel(" Gemstone Material: ");

        //JLabel Text Appearances
        labelLogo.setFont(new Font("Monospaced", Font.BOLD, 30));
        labelTitle.setFont(new Font("Arial", Font.BOLD, 20));
        labelTitle2.setFont(new Font("Arial", Font.BOLD, 20));
        labelOne.setFont(new Font("Serif", Font.ITALIC, 20));
        labelTwo.setFont(new Font("Serif", Font.ITALIC, 20));
        labelThree.setFont(new Font("Serif", Font.ITALIC, 20));

        //Dropdown JComboBox
        String[] JewelType = {"Necklace", "Ring", "Earrings", "Bracelet"};
        final JComboBox box1 = new JComboBox(JewelType);
        box1.setBounds(10, 140, 20, 25);

        String[] Material1 = {"Gold", "Silver"};
        final JComboBox box2 = new JComboBox(Material1);
        box2.setBounds(100, 140, 80, 25);

        String[] Material2 = {"Diamond", "Ruby", "Emerald"};
        final JComboBox box3 = new JComboBox(Material2);
        box2.setBounds(100, 140, 80, 25);

        //JLabel Font Colors
        labelLogo.setForeground(Color.BLACK);
        labelTitle.setForeground(Color.decode("#8A75CD"));
        labelTitle2.setForeground(Color.decode("#8A75CD"));
        labelOne.setForeground(Color.BLACK);
        labelTwo.setForeground(Color.BLACK);
        labelThree.setForeground(Color.BLACK);

        //JLabel Dimension x Location
        labelLogo.setBounds(10, 10, 90, 20);
        labelTitle.setBounds(10, 10, 90, 20);
        labelOne.setBounds(10, 10, 90, 20);
        labelTwo.setBounds(10, 10, 90, 20);

        //JComboBox Text Appearances
        box1.setFont(new Font("Serif", Font.ITALIC, 20));
        box2.setFont(new Font("Serif", Font.ITALIC, 20));
        box3.setFont(new Font("Serif", Font.ITALIC, 20));

        //JComboBox BG and FG Color
        box1.setForeground(Color.BLACK);
        box1.setBackground(Color.decode("#FFFFD8"));
        box2.setForeground(Color.BLACK);
        box2.setBackground(Color.decode("#FFFFD8"));
        box3.setForeground(Color.BLACK);
        box3.setBackground(Color.decode("#FFFFD8"));

        //Buttons
        button.setBounds(10,10,90,20);
        button.setForeground(Color.decode("#8A75CD"));
        button.setBackground(Color.decode("#FFFFD8"));
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result = computeItemPrice((String) box1.getSelectedItem(),(String) box2.getSelectedItem(),(String) box3.getSelectedItem());
                displayResult(String.valueOf(result));

            }
        });

        button1.setBounds(0,0,10,40);
        button1.setForeground(Color.decode("#8A75CD"));
        button1.setBackground(Color.decode("#FFFFD8"));
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                JOptionPane.showMessageDialog( null, "Programmed by:\nRomeo Seva III - BSIT 2-A\nElijah Zachary Faeldonea - BSIT 2-A\n\nThis tool is created to calculate the wholesale and\nretail price of a particular customized jewelry item\nbased on Forever Gems' pricing.", "About" , JOptionPane.INFORMATION_MESSAGE );
            }
        });

        button2.setBounds(0,0,10,40);
        button2.setForeground(Color.decode("#8A75CD"));
        button2.setBackground(Color.decode("#FFFFD8"));
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                JOptionPane.showMessageDialog( null, "Material Prices:\n\n---{ JEWELRY TYPE }---\nNecklace - Php 1000\nRing - Php 700\nEarrings - Php 200\nBracelet - Php 300\n\n---{ MAIN MATERIAL }---\nGold - Php 3200\nSilver - Php 1700\n\n---{ GEMSTONE }---\nDiamond - Php 7700\nRuby - Php 4600\nEmerald - Php 3250", "Price Details" , JOptionPane.INFORMATION_MESSAGE );
            }
        });

        //Call JFrame
        panelLogo.add(labelLogo);
        panelTitle.add(labelTitle);
        panelTitle.add(labelTitle2);

        panelOne.add(labelOne);
        panelOne.add(box1);
        panelOne.add(labelTwo);
        panelOne.add(box2);
        panelOne.add(labelThree);
        panelOne.add(box3);

        panelTwo.add(button);

        panelThree.add(button1);
        panelThree.add(button2);

        frame.add(panelLogo);
        frame.add(panelTitle);
        frame.add(panelOne);
        frame.add(panelTwo);
        frame.add(panelThree);
        frame.setSize(500,400);
        frame.setResizable(false);
        frame.setLayout(null);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
