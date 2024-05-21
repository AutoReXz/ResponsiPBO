package model;
import java.util.List;
import javax.swing.table.AbstractTableModel;
public class modeltabeldatagym extends AbstractTableModel{

    List<datagym> gym;
    
    public modeltabeldatagym(List<datagym> gym){
        this.gym=gym;
    }
    
    @Override
    public int getRowCount() {
        return gym.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }
    
    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0:
                return "Nama Pemilik";
            case 1:
                return "Nama Alat";
            case 2:
                return "Nomor Telefon";
            case 3:
                return "Waktu Sewa";
            case 4:
                return "Biaya Sewa";
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int row, int column) {
        datagym gg = gym.get(row);
        switch(column){
            case 0:
                return gg.getPemilik();
            case 1:
                return gg.getAlat();
            case 2:
                return gg.getNo();
            case 3:
                return gg.getWaktu_sewa();
            case 4:
                return (gg.getWaktu_sewa()*50000);
            default:
                return null;
        }
    }
    
    
}
