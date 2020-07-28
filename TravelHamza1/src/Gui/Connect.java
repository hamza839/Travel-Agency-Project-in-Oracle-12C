/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Hamza
 */
public class Connect {
    public static java.sql.Connection ConnectDB(){
        try{
            Class.forName( "oracle.jdbc.OracleDriver" );        
            java.sql.Connection conn =  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:trdb","juhm","1234");
            return conn;
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
            return null;
    }
}
