import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.time.LocalDateTime;


// Task 3. Calendar App :
// Build a calendar application that allows users to create, 
// update and delete events.
public class Task_3 extends JFrame {
    private JTextField titleField;
    private JTextField startDateField;
    private JTextField endDateField;
    private JButton createButton;

    public Task_3() {
        setTitle("Calendar Application");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        JLabel titleLabel = new JLabel("Title:");
        titleField = new JTextField();
        JLabel startDateLabel = new JLabel("Start Date:");
        startDateField = new JTextField();
        JLabel endDateLabel = new JLabel("End Date:");
        endDateField = new JTextField();
        createButton = new JButton("Create Event");

        add(titleLabel);
        add(titleField);
        add(startDateLabel);
        add(startDateField);
        add(endDateLabel);
        add(endDateField);
        add(createButton);

        createButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String title = titleField.getText();
                LocalDateTime startDate = LocalDateTime.parse(startDateField.getText());
                LocalDateTime endDate = LocalDateTime.parse(endDateField.getText());

                try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database_name", "root", "")) {
                    PreparedStatement statement = connection.prepareStatement("INSERT INTO events (title, start_date, end_date) VALUES (?, ?, ?)");
                    statement.setString(1, title);
                    statement.setTimestamp(2, Timestamp.valueOf(startDate));
                    statement.setTimestamp(3, Timestamp.valueOf(endDate));
                    statement.executeUpdate();

                    JOptionPane.showMessageDialog(Task_3.this, "Event created successfully!");
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(Task_3.this, "Error creating event.");
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Task_3 app = new Task_3();
                app.setVisible(true);
            }
        });
    }
}
