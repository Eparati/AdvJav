/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package weddingrental;
import javax.swing.JOptionPane;
/**
 *
 * @author landr3615
 */
public class WeddingRental {
    public static void main(String[] args) {
//        // TODO code application logic here
//    }
//    
//}

//package org.landr3615.weddRental;
////Vast majority of this is experimental from trying to make it more advanced. 
////Doesn't work, but leaving it to show the attempt.
////What it would do, is it would launch a second instance of the IDE.
////Couldn't figure out why it was doing it or how to stop it, so simpler version.
///*import java.awt.FlowLayout;
//*import java.awt.event.ActionEvent;
//*import java.awt.event.ActionListener;
//*import javax.swing.JButton;
//*import javax.swing.JFrame;
////*/
////
////public class WeddingRental {
//    public static void main(String[] args) {
        int TABLE_COST = 20;
        int CHAIR_COST = 10;
        int EXAMPLE_TABLE = 39;
        int EXAMPLE_CHAIR = 134;
        String input;
        int inputChairs;
        int inputTables;
        boolean validInput = false;
        while (!validInput) {
            
            String modeInput = JOptionPane.showInputDialog("Press 1 for default demonstration or press 2 for custom, 3 to end. Program will repeat until closed.");
            //int modeCheck = Integer.parseInt(modeInput);
            try {
                int modeCheck = Integer.parseInt(modeInput);
            
         
            switch (modeCheck) {
                case 1:
                    int totalCost = (EXAMPLE_TABLE * TABLE_COST) + (EXAMPLE_CHAIR * CHAIR_COST);
                    int tableCost = (EXAMPLE_TABLE * TABLE_COST);
                    int chairCost = (EXAMPLE_CHAIR * CHAIR_COST);
                    JOptionPane.showMessageDialog(null, "Chair cost: $"+chairCost+"\n"+"Table cost: $"+tableCost+"\n"+"Total cost: $" + totalCost);
                    validInput = false;
                    break;
                case 2:
                    input = JOptionPane.showInputDialog("Enter number of chairs.");
                    inputChairs = Integer.parseInt(input);
                    input = JOptionPane.showInputDialog("Enter number of Tables.");
                    inputTables = Integer.parseInt(input);
                    // Custom calculation logic
                    // You can prompt the user for the number of tables and chairs using JOptionPane
                    // Perform the necessary calculations based on user input
                    // Display the result using JOptionPane
                    totalCost = (inputChairs*CHAIR_COST+inputTables*TABLE_COST);
                    chairCost = (inputChairs*CHAIR_COST);
                    tableCost = (inputTables*TABLE_COST);
                    JOptionPane.showMessageDialog(null, "Chair cost: $"+chairCost+"\n"+"Table cost: $"+tableCost+"\n"+"Total cost: $" + totalCost);
                    validInput = false;
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Ending program.");
                    validInput = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid input! Please enter 1, 2, or 3.");
                    break;
                }
            }
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input! Please enter a valid integer.");
            }
            }
        }
    }

            /* public class WeddingRental extends JFrame implements ActionListener {
            private final JButton tablesButton;
            private final JButton chairsButton;
            private final JButton bothButton;
            public WeddingRental() {
            // Set up the JFrame
            setTitle("Wedding Rental Calculator");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLayout(new FlowLayout());
            // Create the buttons
            tablesButton = new JButton("Tables");
            chairsButton = new JButton("Chairs");
            bothButton = new JButton("Both");
            // Add action listeners to the buttons
            tablesButton.addActionListener(this);
            chairsButton.addActionListener(this);
            bothButton.addActionListener(this);
            // Add the buttons to the JFrame
            add(tablesButton);
            add(chairsButton);
            add(bothButton);
            // Set the size and visibility of the JFrame
            setSize(300, 100);
            setVisible(true);
            }
            public void actionPerformed(ActionEvent e) {
            // Your actionPerformed logic here
            }
            public static void main(String[] args) {
            new WeddingRental();*/
