package searchEngineProj;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import java.awt.Button;
import javax.swing.JInternalFrame;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JList;
import javax.swing.JSeparator;
import java.awt.Component;
import javax.swing.Box;
import java.awt.CardLayout;
import javax.swing.JSplitPane;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JComboBox;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.List;
import javax.swing.JTextField;

public class GUIFrame extends JFrame {

	private JPanel contentPane;
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIFrame frame = new GUIFrame();
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
	public GUIFrame() {
		setResizable(false);
		setTitle("Search Engine");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane);
		
		JPanel searchTab = new JPanel();
		tabbedPane.addTab("Search", null, searchTab, null);
		searchTab.setLayout(null);
		
		List resultsList = new List();
		resultsList.setBounds(0, 65, 429, 429);
		searchTab.add(resultsList);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(95, 500, 80, 23);
		searchTab.add(btnSearch);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(185, 500, 80, 23);
		searchTab.add(btnClear);
		
		JButton btnClose = new JButton("Close");
		btnClose.setBounds(275, 500, 80, 23);
		searchTab.add(btnClose);
		
		JLabel lblSearchResults = new JLabel("Search Results");
		lblSearchResults.setBounds(0, 43, 100, 20);
		searchTab.add(lblSearchResults);
		
		textField = new JTextField();
		textField.setBounds(0, 21, 429, 20);
		searchTab.add(textField);
		textField.setColumns(10);
		
		JLabel lblSearchCriteria = new JLabel("Search Criteria");
		lblSearchCriteria.setBounds(0, 0, 100, 20);
		searchTab.add(lblSearchCriteria);
		
		JPanel adminTab = new JPanel();
		tabbedPane.addTab("Settings", null, adminTab, null);
	}
}
