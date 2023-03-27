/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aplicacion6;

/**
 *
 * @author USER
 */
import java.awt.FlowLayout;
import javax.swing.*;

public class Interfaz extends JFrame {
    private JTextField textfield1, textfield2;
    private JLabel label1, label2;
    
    public Interfaz(){
        super("Ventanita");
        FlowLayout distribuidor = new FlowLayout();
        this.setLayout(distribuidor);
        label1 = new JLabel("Pon tu nombre: ");
        label2 = new JLabel("Pon tu edad: ");
        textfield1 = new JTextField(10);
        textfield2 = new JTextField(5);
        add(label1);
        add(textfield1);
        add(label2);
        add(textfield2);    
    }
    
    public static void main(String[] args){
        Interfaz v1 = new Interfaz();
        v1.setSize(600,400);
        //el siguiente metodo es para que no podamos modificar el tamaño de la ventana
        v1.setResizable(false);
        //el siguiente metodo es para que nuestra ventana aparezca en el centro de la pantalla
        v1.setLocationRelativeTo(null);
        //para que cuando cerremos el programa se cierre por completo
        v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //para que nuestra ventana sea visible
        v1.setVisible(true);
    }
    
}
