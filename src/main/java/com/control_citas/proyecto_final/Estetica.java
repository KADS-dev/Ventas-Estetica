
package com.control_citas.proyecto_final;

import java.awt.Dimension;
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
  

  public class Estetica extends JFrame{
 
  public static boolean usuarioCorrecto = false;
  public static Estetica inicioSesion = new Estetica();
  public static Estetica lista = new Estetica();
  
  
  public Estetica(){
      super();
      initComponents();
  }

  private void initComponents(){
    
     addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
  }
  
  

  
  private void cerrarVentana(){
      String botones[] = {"Cerrar", "Cancelar"};
      int eleccion = JOptionPane.showOptionDialog(this, "¿Desea cerrar la aplicación?", "Atención", 0, 0, null, botones, this);
      if(eleccion == JOptionPane.YES_OPTION)
          System.exit(0);
      
  }

  private void formWindowClosing(java.awt.event.WindowEvent evt){
      cerrarVentana();
  }
  
  
  public static void main(String[] args) throws InterruptedException, InvocationTargetException, Exception{
    Dimension size = new Dimension(555, 312);
    Dimension sizeMax = new Dimension(1170, 620);
    
    SwingUtilities.invokeLater(new Runnable(){
      
        @Override
        public void run(){
          
         
          inicioSesion.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
          inicioSesion.setTitle("Estética");
          inicioSesion.setContentPane(new InicioSesion1());
          inicioSesion.setExtendedState(JFrame.MAXIMIZED_BOTH);
          inicioSesion.setMinimumSize(size);
          inicioSesion.setLocationRelativeTo(null);
          inicioSesion.setVisible(true);
          
          lista.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
          lista.setTitle("Estética ");
          lista.setContentPane(new Lista());
          //lista.setSize(sizeMax);
          lista.setExtendedState(JFrame.MAXIMIZED_BOTH);
          lista.setMinimumSize(size);
          lista.setMaximumSize(sizeMax);
          lista.setLocationRelativeTo(null);
          //lista.setVisible(true);
         
      
      }
    });
   /*
    
      try{
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/home/k285/JavaDB/theJavaPath/javaPathDB/");
            
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("selected id_tableA, code from table A"); 
            while(rs.next()){
                
                //Hay dos variantes, nombre de columna o numero de columna (los numeros comienzan en 1):
                int id_tableA = rs.getInt("id_tableA");
                
                String code = rs.getString("code");
                System.out.println("id: " + id_tableA + ", code: " + code);
            }
            rs.close();
            stmt.close();
                  
            conn.close();
        }catch(SQLException e){
            System.out.println(e.getClass().getName() + "genereted: " + e.getMessage());
            
        }
    
    */
    
    }

  
  

}
 

