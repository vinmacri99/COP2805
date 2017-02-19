/** @author Flavio Aquino February 2017*/

package searchEngineProj;

import javax.swing.table.AbstractTableModel;

public class TableModel extends AbstractTableModel{
	
	private static final long serialVersionUID = 1L;

	private String[] columnNames = {"File Name", "Status"};
	// TODO add the rest of the attributes 
	
	public int getRowCount() {
		return 0;
	}
	public void setColumnName(String[] ColumnNames) {
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

	@Override
	public Object getValueAt(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}

}
