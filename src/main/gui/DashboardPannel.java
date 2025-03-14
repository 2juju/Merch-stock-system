package main.gui;
import javax.swing.*;
// import main.StockSystem;

public class DashboardPannel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Stock System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(500, 500); 
        frame.setVisible(true);
        
        // main page
        // label with icon
        ImageIcon icon = new ImageIcon("src/main/gui/assets/icon.png");
        icon.setImage(icon.getImage().getScaledInstance(100, 100, 1));
        JLabel mainLabel = new JLabel();
        mainLabel.setText("Merch Inventory System");
        mainLabel.setIcon(icon);
        frame.add(mainLabel);
        mainLabel.setBounds(50, 0, 500, 300);

        JTabbedPane tabbedPane = new JTabbedPane();
        JComponent panel1 = makeTextPanel("Panel #1");
        tabbedPane.addTab("Add Inventory", icon, panel1, "Add new items to the inventory");
        tabbedPane.setMnemonicAt(0, '1');

        JComponent panel2 = makeTextPanel("Panel #2");
        tabbedPane.addTab("Browse Inventory", icon, panel2, "Browse the inventory");
        tabbedPane.setMnemonicAt(1, '2');
        frame.add(tabbedPane);

        // buttons
        // add inventory button
        JButton addInventoryButton = new JButton("Add New Item");
        addInventoryButton.setBounds(150, 200, 200, 50);
        frame.add(addInventoryButton);
        // search inventory button
        JButton searchInventoryButton = new JButton("Browse Inventory");
        searchInventoryButton.setBounds(150, 300, 200, 50);
        frame.add(searchInventoryButton);

    }
    protected static JComponent makeTextPanel(String text) {
        JPanel panel = new JPanel(false);
        JLabel filler = new JLabel(text);
        filler.setHorizontalAlignment(JLabel.CENTER);
        panel.setLayout(new GridLayout(1, 1));
        panel.add(filler);
        return panel;
    }

}
