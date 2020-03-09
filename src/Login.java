import java.awt.BorderLayout;
import java.awt.image.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField_username;
	private JPasswordField passwordField;
	
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	//database connection
	   static final String DB_URL = "jdbc:sqlserver://shahram.database.windows.net:1433;database=dams;user=beyond_innovation@shahram;password={your_password_here};encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;";
	//  Database credentials
	   static final String USER = "beyond_innovation";
	   static final String PASS = "Braveandbold123";
	   private Connection connect = null;
	    private Statement statement = null;
	    private PreparedStatement preparedStatement = null;
	    private ResultSet resultSet = null;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1132, 666);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(30, 144, 255));
		panel.setBounds(0, 0, 511, 629);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("b76de73edf814db22e2ae74c01739b5c-doctor-avatar-stroke-icon-by-vexels.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		
		lblNewLabel.setBounds(10, 10, 491, 469);
		panel.add(lblNewLabel);
		
		JLabel lblAdmin = new JLabel("ADMIN");
		lblAdmin.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 37));
		lblAdmin.setBackground(Color.BLACK);
		lblAdmin.setBounds(211, 479, 138, 46);
		panel.add(lblAdmin);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(512, 0, 606, 629);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblSignUp = new JLabel("Sign In");
		lblSignUp.setForeground(Color.GRAY);
		lblSignUp.setHorizontalAlignment(SwingConstants.CENTER);
		lblSignUp.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 36));
		lblSignUp.setBounds(110, 35, 419, 58);
		panel_1.add(lblSignUp);
		
		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setForeground(Color.GRAY);
		lblUserName.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 25));
		lblUserName.setBounds(23, 119, 167, 39);
		panel_1.add(lblUserName);
		
		textField_username = new JTextField();
		textField_username.setForeground(SystemColor.textText);
		textField_username.setBounds(26, 179, 295, 63);
		panel_1.add(textField_username);
		textField_username.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.GRAY);
		lblPassword.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 25));
		lblPassword.setBounds(23, 303, 167, 39);
		panel_1.add(lblPassword);
		
		JButton loginbtn = new JButton("Login");
		loginbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//button back end coding
				doctor_homepage dhp = new doctor_homepage();
				dhp.setVisible(true);
				setVisible(false);
/*try {
					
					connect = DriverManager.getConnection(DB_URL, USER, PASS);
					statement = connect.createStatement();
					String QUERY = "select * from loginTable where password = '"+ passwordField.getText().toString()+"'";
					resultSet = statement.executeQuery(QUERY);
					
					//Statement statementinfo = connect.createStatement();
					//String QUERYinfo = "select * from login where password = '"+ text_password.getText().toString()+"'";
					//ResultSet resultSetinfo = statement.executeQuery(QUERYinfo);
					
					while (resultSet.next())
					{
						if(textField_username.getText().equals(resultSet.getString(1)) && passwordField.getText().equals(resultSet.getString(2)) )
						{
							
							
							JOptionPane.showMessageDialog(null, "logged in!!");
							//laterupdate
							doctor_homepage dhp = new doctor_homepage();
							dhp.setVisible(true);
							setVisible(false);
							break;
						}
						else
						{
							JOptionPane.showMessageDialog(null, "invalid credentials):");
						}
					}
					connect.close();
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}*/

				
			}
		});
		loginbtn.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 22));
		loginbtn.setForeground(SystemColor.textHighlight);
		loginbtn.setBounds(110, 461, 138, 58);
		panel_1.add(loginbtn);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(23, 360, 298, 63);
		panel_1.add(passwordField);
		
		JLabel lblDontHaveAn = new JLabel("Don't have an account click here");
		lblDontHaveAn.setForeground(SystemColor.textHighlight);
		lblDontHaveAn.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 16));
		lblDontHaveAn.setVerticalAlignment(SwingConstants.BOTTOM);
		lblDontHaveAn.setBounds(86, 529, 240, 20);
		panel_1.add(lblDontHaveAn);
	}
}
