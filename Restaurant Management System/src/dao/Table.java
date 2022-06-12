/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import javax.swing.JOptionPane;
/**
 *
 * @author jay
 */
public class Table {
    public static void main(String[]args){
        try{
            String userTable = "creat table user(id int AUTTO_INCREMENT primary key,name varchar(200),email varchar(200),mobile number varchar(10),address varchar(200),password varchar(200),securityQuestion varchar(200),answer varchar(200),status varchar(20),UNIQUE(email))";
            DbOperations.setDataOrDelete(userTable, "User Table Created Successfully");
        
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
