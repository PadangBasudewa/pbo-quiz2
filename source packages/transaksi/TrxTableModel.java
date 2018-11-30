/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transaksi;
import javax.swing.table.*;
/**
 *
 * @author WINDOWS 10
 */
public class TrxTableModel extends DefaultTableModel{
    private String[] columns; // columns String array var to store column name
    
    // Constructor
    public TrxTableModel() {
        this.columns = new String[] {
            "Nama", "Harga", "Jumlah"
        };
    }
    
    // Columname getter
    public String[] getColumnName() {
        return this.columns;
    }
}
