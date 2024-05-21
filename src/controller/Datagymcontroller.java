
package controller;
import java.util.List;
import DAOdatagym.datagymDAO;
import DAOImplement.datagymimplement;
import model.*;
import view.MainView;

public class Datagymcontroller {
    MainView frame;
    datagymimplement impldatagym;
    List<datagym> gym;
    
    public Datagymcontroller(MainView frame){
        this.frame = frame;
        impldatagym = new datagymDAO();
        gym = impldatagym.getAll();
    }
    public void isitabel(){
        gym= impldatagym.getAll();
        modeltabeldatagym mp = new modeltabeldayagym(gym);
        frame.getTabelDatagym().setModel(mp);
    }
    
    public void insert(){
        try {
            datagym gym = new datagym();
            gym.setPemilik(frame.getFpenyewa().getText());
            gym.setPemilik(frame.getFpenyewa().getText());
            gym.setPemilik(frame.getFpenyewa().getText());
        } //CONTROLLER NYA BELOM SELESAII
    }
}
