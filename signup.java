//import statement
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Wrapper;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class NewUser extends JFrame //create class NewUser
{
	private JPanel contentPane; //declare variable
	private JTextField txtUser;
	private JButton btnSignup;
	private JTextField txtPassword;
	protected java.lang.String Spassword;
	
	// database URL
	static final String DB_URL = "jdbc:mysql://localhost/demo";
	
	//  Database credentials
	static final String USER = "root";
	static final String PASS = "root";
	protected static final String String = null;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) // main method
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() //define run method
			{
				try  //try block
				{
					//create NewUser frame object
					NewUser frame = new NewUser();
                                        //set NewUser frame visible
					frame.setVisible(true);
				} 
				catch (Exception e) //catch block
				{
					e.printStackTrace();
				}
			}
		});
	}

	
}
