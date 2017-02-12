package searchEngineProj;

import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class GUIFrame extends JFrame {

	private JPanel contentPane;
	private static final long serialVersionUID = 1L;
	private JTextField searchField;
	private JTextField searchTextField;
	/**
	 * Launch the application. sharon
	 */
	/*public static void main(String[] args) {
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
	}*/

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
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSearch.setBounds(67, 500, 90, 23);
		searchTab.add(btnSearch);
		
		JButton btnSearchClear = new JButton("Clear");
		btnSearchClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSearchClear.setBounds(167, 500, 90, 23);
		searchTab.add(btnSearchClear);
		
		JButton btnClose = new JButton("Close");
		btnClose.setBounds(267, 500, 90, 23);
		searchTab.add(btnClose);
		
		JLabel lblSearchResults = new JLabel("Search Results");
		lblSearchResults.setBounds(0, 43, 100, 20);
		searchTab.add(lblSearchResults);
		
		JLabel lblSearchCriteria = new JLabel("Search Criteria");
		lblSearchCriteria.setBounds(0, 0, 100, 20);
		searchTab.add(lblSearchCriteria);
		
		searchTextField = new JTextField();
		searchTextField.setBounds(0, 22, 429, 20);
		searchTab.add(searchTextField);
		searchTextField.setColumns(10);
		
		JPanel adminTab = new JPanel();
		tabbedPane.addTab("Settings", null, adminTab, null);
		adminTab.setLayout(null);
		
		List list = new List();
		list.setBounds(0, 20, 429, 474);
		adminTab.add(list);
		
		JLabel searchableFiles = new JLabel("File List");
		searchableFiles.setBounds(0, 0, 100, 20);
		adminTab.add(searchableFiles);
		
		JButton btnBrowse = new JButton("Browse...");
		btnBrowse.setBounds(118, 500, 90, 23);
		adminTab.add(btnBrowse);
		
		JButton btnSettingsClear = new JButton("Clear...");
		btnSettingsClear.setBounds(218, 500, 90, 23);
		adminTab.add(btnSettingsClear);
	}
}
