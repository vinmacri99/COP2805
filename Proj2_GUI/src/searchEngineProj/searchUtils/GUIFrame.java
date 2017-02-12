package searchEngineProj.searchUtils;

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
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class GUIFrame extends JFrame {

	private JPanel contentPane;
	private static final long serialVersionUID = 1L;
	private JTextField searchField;
	private JTextField searchTextField;
	private final ButtonGroup buttonGroup = new ButtonGroup();
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
		
        // Search Tab controls
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane);
		
		JPanel searchTab = new JPanel();
		tabbedPane.addTab("Search", null, searchTab, null);
		searchTab.setLayout(null);
		
		List resultsList = new List();
		resultsList.setBounds(0, 98, 429, 396);
		searchTab.add(resultsList);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// message box showing that code ran
				
			}
		});
		btnSearch.setBounds(67, 500, 90, 23);
		searchTab.add(btnSearch);
		
		JButton btnSearchClear = new JButton("Clear");
		btnSearchClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Clear search criteria and search results
				
			}
		});
		btnSearchClear.setBounds(167, 500, 90, 23);
		searchTab.add(btnSearchClear);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// Close program
				
			}
		});
		btnClose.setBounds(267, 500, 90, 23);
		searchTab.add(btnClose);
		
		JLabel lblSearchResults = new JLabel("Search Results");
		lblSearchResults.setBounds(0, 72, 100, 20);
		searchTab.add(lblSearchResults);
		
		JLabel lblSearchCriteria = new JLabel("Search Criteria");
		lblSearchCriteria.setBounds(0, 0, 100, 20);
		searchTab.add(lblSearchCriteria);
		
		searchTextField = new JTextField();
		searchTextField.setBounds(0, 22, 429, 20);
		searchTab.add(searchTextField);
		searchTextField.setColumns(10);
		
		JRadioButton rdbtAllTerms = new JRadioButton("All of the terms");
		rdbtAllTerms.setSelected(true);
		buttonGroup.add(rdbtAllTerms);
		rdbtAllTerms.setBounds(0, 42, 115, 23);
		searchTab.add(rdbtAllTerms);
		
		JRadioButton rdbtAnyTerms = new JRadioButton("Any of the terms");
		buttonGroup.add(rdbtAnyTerms);
		rdbtAnyTerms.setBounds(139, 42, 144, 23);
		searchTab.add(rdbtAnyTerms);
		
		JRadioButton rdbtExactTerms = new JRadioButton("Exact Phrase");
		buttonGroup.add(rdbtExactTerms);
		rdbtExactTerms.setBounds(294, 42, 109, 23);
		searchTab.add(rdbtExactTerms);
		
        // Settings Tab controls 
		JPanel adminTab = new JPanel();
		tabbedPane.addTab("Settings", null, adminTab, null);
		adminTab.setLayout(null);
		
		List fileList = new List();
		fileList.setBounds(0, 20, 429, 474);
		adminTab.add(fileList);
		
		JLabel searchableFiles = new JLabel("File List");
		searchableFiles.setBounds(0, 0, 100, 20);
		adminTab.add(searchableFiles);
		
		JButton btnBrowse = new JButton("Browse...");
		btnBrowse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Invokes file management and loads files into files list
				
			}
		});
		btnBrowse.setBounds(118, 500, 90, 23);
		adminTab.add(btnBrowse);
		
		JButton btnSettingsClear = new JButton("Clear...");
		btnSettingsClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Clear file list
				
			}
		});
		btnSettingsClear.setBounds(218, 500, 90, 23);
		adminTab.add(btnSettingsClear);
	}
}
