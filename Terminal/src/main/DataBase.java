/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Danya
 */
public class DataBase {
    
    private static DataBase instance = new DataBase();
    
    public static DataBase getInstance() {
        return instance;
    }
    
    private String card = "";
    private String pin = "";
    
    public void setLogin(String card, String pin){
        if (card!=null) this.card = card;
        if (pin!=null) this.pin = pin;
    }
    
    private Connection connection = null;
    
    
    
    public void reconnect(){
        instance = new DataBase();
    }
    
    
    public float moneyTransfer(int dst_bill, float amount, String info){
        if (card.equals("") || pin.equals("")) return -1;
        try {
            int bill_no=-1;
            Statement  s = connection.createStatement();
            String query = "select \"Card\".\"bill_id\" from \"Card\" where \"Card\".\"number\" = "+card;
            ResultSet rs = s.executeQuery(query);
            if (rs.next() && rs.getInt(1)>=0) {
                bill_no = rs.getInt(1);
            } else return-1;
            s = connection.createStatement();
            rs = s.executeQuery("SELECT * FROM LOCALMONEYTRANSFER(\'"+info+"\', "+amount+", "+dst_bill+", "+bill_no+")");
            if (rs.next()) return rs.getFloat(1);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return -1; 
    }
    
    public boolean checkPasswd(){
        if (card.equals("") || pin.equals("")) return false;
        try {
            Statement  s = connection.createStatement();
            ResultSet rs = s.executeQuery("select * from checkPasswd(" + card + ", " + pin + ")");
            if (rs.next() && rs.getInt(1)!=0) return true;
        } catch (SQLException ex) {
        }
        return false;
    }
        
    /* Всегда в рублях */
    public float getBalance(){
        try {
            Statement  s = connection.createStatement();
            ResultSet rs = s.executeQuery("select * from getBalanceRur(" + card + ", " + pin + ")");
            if (rs.next()) return rs.getFloat(1);
        } catch (SQLException ex) {
            return 0;
        }
        return 0;
    }
    
    /*возвращает комиссию */
    public float withdraw(int amount){
        try {
            Statement  s = connection.createStatement();
            String query = "select * from WITHDRAWRUR(" + card + ", " + pin + ", " + amount + ")";
            ResultSet rs = s.executeQuery(query);
            if (rs.next() && rs.getFloat(1)>0) {
                return rs.getFloat(1);
            } else return -1;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return -1;
    }

    public String getOperations(){
        try { 
            int bill_no=-1;
            Statement  s = connection.createStatement();
            String query = "select \"Card\".\"bill_id\" from \"Card\" where \"Card\".\"number\" = "+card;
            ResultSet rs = s.executeQuery(query);
            if (rs.next() && rs.getInt(1)>=0) {
                bill_no = rs.getInt(1);
            } else return "";
            
            query = "select * from GETOPERATIONS("+bill_no+")";
            rs = s.executeQuery(query);
            
            String result = "";
            for (int n=0; rs.next() && n<10; n++){
                if (rs.getInt(5)==0)
                    result += "Снято: " + rs.getInt(1)+" "+rs.getString(2)+" дата/время: "+rs.getTimestamp(3)+" ("+ rs.getString(4)+")\n";
                else  
                    result += ru_conv_optype(rs.getInt(5)) + rs.getInt(1)+" "+rs.getString(2)+" дата/время: "+rs.getTimestamp(3)+" ("+ rs.getString(4)+") стороне ("+rs.getString(7)+")\n";
            }
            return result;
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return "";
    }
    
    public String ru_conv_optype(int optype){
        switch (optype){
            case 1:
                return "Доход от депозита: ";
            case 2:
                return "Переведено: ";
            case 3:
                return "Получено: ";
        }
        return "";
    }
    
    private DataBase() {
        String databasepath = "C:/Users/Danya/Documents/BD/BANK_TERM.fdb";
        String host = "localhost";
        String user = "SYSDBA";
        String passwd = "masterkey";
        
        String URL = "jdbc:firebirdsql:"+host+":"+databasepath;

        try{
            Class.forName("org.firebirdsql.jdbc.FBDriver").newInstance();
            connection = DriverManager.getConnection(URL, user, passwd);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e){
            
        }
    }
   
}
