/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presupuestoefectivo;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.event.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import base.Conexionyfunciones;


public class VentanaInicio extends JFrame implements ActionListener,ItemListener{
    
    private JLabel empreg,empnueva;
    private JPanel Panelsup,PanelInf;
    public String empsel;
    public JComboBox cmbempreg;
    public JButton btnconsultar,btnregistrar;
    private int idsel;
    
    public VentanaInicio(){
        setLayout(new GridLayout(2,1));
      //  cargarPanelSup();
        cargarPanelInf();
        setSize(420,330);
        setVisible(true);
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ); 
        setResizable(false);
    }
    
    public void actionPerformed(ActionEvent ac){
        if(ac.getSource()==btnconsultar){
            
        }
        
        else{
            VentanaRegistroEmp ventReg= new VentanaRegistroEmp();
            dispose();
            
        }
    }
    
    public void itemStateChanged(ItemEvent ev){
        if (ev.getStateChange()== ItemEvent.SELECTED && ev.getSource()==cmbempreg){
            try{
                idsel=cmbempreg.getSelectedIndex() + 1 ;
                empsel=(String)cmbempreg.getSelectedItem();
                System.out.println("Se selecciono empresa: " + empsel + " con id:" + idsel);
                if(btnconsultar.isEnabled()==false)
                    btnconsultar.setEnabled(true);
                
               
            }catch(Exception ex){
                System.out.println("Error en itemstate: " + ex.getMessage());
                
            }
        }
    }
    
    public void cargarPanelSup(){
        Panelsup = new  JPanel();
        Panelsup.setLayout(null);
        empreg = new JLabel("Seleccionar una Empresa ya registrada");
        empreg.setBounds(25, 30, 300, 20);
        Panelsup.add(empreg);
        cmbempreg= new JComboBox();
        cmbempreg.setBounds(45,100, 100 ,20);
        Conexionyfunciones obj = new Conexionyfunciones();
        obj.conectar();
        obj.obtenerEmpresasreg(cmbempreg);
        cmbempreg.addItemListener(this);
        Panelsup.add(cmbempreg);
        btnconsultar= new JButton("Consultar empresa");
        btnconsultar.setEnabled(false);
        btnconsultar.setBounds(185,100,100,20);
        btnconsultar.addActionListener(this);
        Panelsup.add(btnconsultar);
        add(Panelsup);
    }
    
    public void cargarPanelInf(){
        PanelInf = new JPanel();
        PanelInf.setLayout(null);
        empnueva = new JLabel("Programa para la obtencion  de presupesto de una empresa");
        empnueva.setBounds(40,33,350,200);
        PanelInf.add(empnueva);
        btnregistrar = new JButton("Ir al formulario para Calcular");
        btnregistrar.setBounds(75,73,250,40);
        btnregistrar.addActionListener(this);
        PanelInf.add(btnregistrar);
        add(PanelInf);
    }
}
