import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

public class Laundry {
    private JFrame frame;
    private JButton hanifahLaundryButton;
    private JButton kasirButton;
    private JButton pelangganButton;
    private JButton diskonButton;
    private JButton berandaButton;
    private JButton logoutButton;
    private JButton loginButton;
    private JButton button2;
    private JButton button5;
    private JButton button1;
    private JButton button3;
    private JLabel imageLabel; // JLabel to display the image

    public Laundry() {
        frame = new JFrame("Laundry Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600); // Adjusted size for better image visibility

        JPanel mainPanel = new JPanel(new BorderLayout());

        // Header Panel with image
        JPanel headerPanel = createHeaderPanel();
        mainPanel.add(headerPanel, BorderLayout.NORTH);

        // Buttons Panel
        JPanel buttonsPanel = createButtonsPanel();
        mainPanel.add(buttonsPanel, BorderLayout.CENTER);

        frame.getContentPane().add(mainPanel);
        frame.setVisible(true);
    }

    private JPanel createHeaderPanel() {
        JPanel headerPanel = new JPanel(new BorderLayout());

        // Add image to the header panel
        ImageIcon imageIcon = new ImageIcon("55bdacb9a456b9f09f7bcce1bc0f305b.jpg"); // Adjust the path
        imageLabel = new JLabel(imageIcon);
        headerPanel.add(imageLabel, BorderLayout.CENTER);

        // Add the Hanifah Laundry button below the image
        hanifahLaundryButton = createStyledButton("Hanifah Laundry");
        headerPanel.add(hanifahLaundryButton, BorderLayout.SOUTH);

        return headerPanel;
    }

    private JPanel createButtonsPanel() {
        JPanel buttonsPanel = new JPanel(new GridLayout(2, 3, 20, 20));

        kasirButton = createStyledButton("Kasir");
        pelangganButton = createStyledButton("Pelanggan");
        diskonButton = createStyledButton("Diskon");
        berandaButton = createStyledButton("Beranda");
        loginButton = createStyledButton("Login");
        logoutButton = createStyledButton("Logout");

        // Initially hide the logout button
        logoutButton.setVisible(false);

        buttonsPanel.add(kasirButton);
        buttonsPanel.add(pelangganButton);
        buttonsPanel.add(diskonButton);
        buttonsPanel.add(berandaButton);
        buttonsPanel.add(loginButton);
        buttonsPanel.add(logoutButton);

        // Add ActionListener for login and logout buttons
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Perform login logic here
                JOptionPane.showMessageDialog(frame, "Login Successful!");
                loginButton.setVisible(false);
                logoutButton.setVisible(true);
            }
        });

        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Perform logout logic here
                JOptionPane.showMessageDialog(frame, "Logout Successful!");
                loginButton.setVisible(true);
                logoutButton.setVisible(false);
            }
        });

        return buttonsPanel;
    }

    private JButton createStyledButton(String text) {
        JButton button = new JButton(text);
        button.setFont(new Font("Arial", Font.PLAIN, 16));
        button.setBackground(new Color(135, 206, 250)); // Light Sky Blue
        button.setFocusPainted(false); // Remove the focus border

        return button;
    }

    public static void main(String[] args) {
        // Run the GUI on the Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(Laundry::new);
    }
}
