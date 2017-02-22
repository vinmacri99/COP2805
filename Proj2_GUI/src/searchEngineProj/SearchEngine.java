package searchEngineProj;

import javax.swing.JFrame;

import searchEngineProj.searchUtils.GUIFrame;
import searchEngineProj.searchUtils.FileMgmt;
import searchEngineProj.searchUtils.InvertedIndex;

public class SearchEngine extends JFrame {
	public static void main ( String[] args ) {
		GUIFrame frame = new GUIFrame();
		frame.setVisible(true);
	}
}
