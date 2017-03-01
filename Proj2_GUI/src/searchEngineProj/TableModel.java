/** @author Flavio Aquino, Sharon Tender, Frank Castillo,
 * Vinny Macri February 2017*/

package searchEngineProj;

import javax.swing.table.AbstractTableModel;
import java.io.IOException;

public class TableModel extends AbstractTableModel{
	
	private static final long serialVersionUID = 1L;

	private String[] columnNames = {"File Name", "Status"};
	String files;
    
//    // constructor
//    public TableModel() {
//        try {
//            files = fileNameList.getAll();   //need to create a fileNameList.txt file 
//        } catch (Exception e) {
//            System.out.println(e);
//        } 
//    }
	
	public int getRowCount() {
		return 0;
	}
	public void setColumnName(String[] ColumnNames)  {
		this.columnNames = ColumnNames;
	}
	
	public String getColumnName(int col) {
		return columnNames[col];
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 2;
	}
    
    // this is for getting file selection
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		
        switch (columnIndex) {
            case 0: 
                return "a/file/test.txt";   //files.get(rowIndex).getFileName();
            case 1:
                return  "a/file/test2.txt";   //files.get(rowIndex).getStatus();
            default:
                return null;
        }
		//return null;
	}

}
