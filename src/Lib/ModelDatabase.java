/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lib;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Client
 */
public class ModelDatabase {
    Connection konek;
    Statement st;
    ResultSet rs;
    
    public ModelDatabase(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            konek = DriverManager.getConnection("jdbc:mysql://localhost:3306/vionaspp","root","");
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public ResultSet ambilData(String sql){
        try {
            st = konek.createStatement();
            rs = st.executeQuery(sql);
            return rs;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    public boolean rubahData(String sql){
        try {
            st = konek.createStatement();
            st.executeUpdate(sql);
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }
}
