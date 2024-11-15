/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.swing.JOptionPane;

/**
 *
 * @author Cetecom
 */
public class HelperController {
    
    public void showError(String msg){
        JOptionPane.showMessageDialog(
                null, 
                msg, 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
    }
    
    public void showWarning(String msg){
        JOptionPane.showMessageDialog(
                null, 
                msg, 
                "Advertencia", 
                JOptionPane.WARNING_MESSAGE);
    }
        
    public void showInformation(String msg){
        JOptionPane.showMessageDialog(
                null, 
                msg, 
                "Información", 
                JOptionPane.INFORMATION_MESSAGE);
    }
     
    
    
}
