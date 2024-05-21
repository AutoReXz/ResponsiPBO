package DAOdatagym;
import java.sql.*;
import java.util.*;
import koneksi.connector;
import model.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import DAOImplement.datagymimplement;

public class datagymDAO implements datagymimplement {
    Connection connection;
    final String select = "SELECT * FROM `data_gym";
    final String insert = "INSERT INTO `data_gym`(`nama_pemilik`, `nama_alat`, `no_telefon`, `waktu_sewa`, `biaya_sewa`) VALUES (?, ?, ?, ?, ?);";
    final String update  = "UPDATE `data_gym` SET `nama_pemilik`=?,`nama_alat`=?,`no_telefon`=?,`waktu_sewa`=?,`biaya_sewa`=? WHERE pemilik=?";
    final String delete = "delete from gym where nama_pemilik=?";
    
    public datagymDAO(){
        connection = connector.connection();
    }
    
    @Override
    public void insert(datagym p){
        PreparedStatement statement = null;
        try{
            double biaya = (p.getWaktu_sewa()*50000);
            statement = connection.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, p.getPemilik());
            statement.setString(2, p.getAlat());
            statement.setString(3, p.getNo());
            statement.setDouble(4, p.getWaktu_sewa());
            statement.setDouble(5, p.getBiaya());
            statement.executeUpdate();
        } catch(SQLException ex) {
            ex.printStackTrace();
        } finally{
            try{
                statement.close();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }
    
    @Override
    public void update(datagym p){
        PreparedStatement statement = null;
        try{
            double biaya = (p.getWaktu_sewa()*50000);
            statement = connection.prepareStatement(update);
            statement.setString(1, p.getPemilik());
            statement.setString(2, p.getAlat());
            statement.setString(3, p.getNo());
            statement.setDouble(4, p.getWaktu_sewa());
            statement.setDouble(5, p.getBiaya());
            statement.setString(6, p.getPemilik());
            statement.executeUpdate();
        } catch(SQLException ex) {
            ex.printStackTrace();
        } finally{
            try{
                statement.close();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }
    
    @Override
    public void delete(datagym p){
        PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(delete);
            statement.setString(1, p.getPemilik());
            statement.executeUpdate();
        } catch(SQLException ex) {
            ex.printStackTrace();
        } finally{
            try{
                statement.close();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }
    
    @Override
    public List<datagym> getAll(){
        List<datagym> gym = null;
        
        try{
            gym = new ArrayList<datagym>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while(rs.next()){
                datagym gg = new datagym();
                gg.setPemilik(rs.getString("pemilik"));
                gg.setPemilik(rs.getString("pemilik"));
                gg.setPemilik(rs.getString("pemilik"));
                gg.setPemilik(rs.getString("pemilik"));
                gg.setPemilik(rs.getString("pemilik"));
                gym.add(gg);
            }
        } catch(SQLException ex) {
            Logger.getLogger(datagymDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            return gym;
        }
    }
