
package com.control_citas.proyecto_final;


import java.awt.Dimension;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;




public class Listas extends javax.swing.JPanel {

    /**
     * Creates new form Lista
     */
    public Listas() {
        initComponents();
    }

  
    /*
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setMaximumSize(new java.awt.Dimension(1370, 720));
        setPreferredSize(new java.awt.Dimension(1370, 720));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
    }// </editor-fold>//GEN-END:initComponents
    */
      @SuppressWarnings("unchecked")
    private void initComponents(){
              //Dimension size = new Dimension(555, 312);
          
          
      
        horaLabel = new javax.swing.JLabel();
        fechaLabel = new javax.swing.JLabel();
        horaComboBox = new javax.swing.JComboBox<>();
        peinadoLabel = new javax.swing.JLabel();
        tinte1RadioButton = new javax.swing.JRadioButton();
        tinte2RadioButton = new javax.swing.JRadioButton();
        tinte3RadioButton = new javax.swing.JRadioButton();
        tinteXRadioButton = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        manicureLabel = new javax.swing.JLabel();
        tinteLabel = new javax.swing.JLabel();
        peinado1RadioButton = new javax.swing.JRadioButton();
        peinado2RadioButton = new javax.swing.JRadioButton();
        peinado3RadioButton = new javax.swing.JRadioButton();
        peinadoXRadioButton = new javax.swing.JRadioButton();
        manicure1RadioButton = new javax.swing.JRadioButton();
        manicure2RadioButton = new javax.swing.JRadioButton();
        manicure3RadioButton = new javax.swing.JRadioButton();
        manicureXRadioButton = new javax.swing.JRadioButton();
        corteLabel = new javax.swing.JLabel();
        corte1RadioButton = new javax.swing.JRadioButton();
        corte2RadioButton = new javax.swing.JRadioButton();
        corte3RadioButton = new javax.swing.JRadioButton();
        corteXRadioButton = new javax.swing.JRadioButton();
        bloqueoButton = new javax.swing.JButton();
        corteComboBox = new javax.swing.JComboBox<>();
        jSeparator5 = new javax.swing.JSeparator();
        nombreLabel = new javax.swing.JLabel();
        nombreTextField = new javax.swing.JTextField();
        telefonoLabel = new javax.swing.JLabel();
        telefonoTextField = new javax.swing.JTextField();        
        correoTextField = new javax.swing.JTextField();
        correoLabel = new javax.swing.JLabel();
        domicilioLabel = new javax.swing.JLabel();
        domicilioTextField = new javax.swing.JTextField();
        totalLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        totalTextArea = new javax.swing.JTextArea();
        jSeparator2 = new javax.swing.JSeparator();       
        bloquearSesionLabel = new javax.swing.JLabel();
        agnadirButton = new javax.swing.JButton();
        grupoPeinado = new ButtonGroup();
        grupoTinte = new ButtonGroup();
        grupoCorte = new ButtonGroup();
        grupoManicure = new ButtonGroup();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jDateChooser = new com.toedter.calendar.JDateChooser();  
        guardarButton = new javax.swing.JButton();
        eliminarButton = new javax.swing.JButton();
        cancelarButton = new javax.swing.JButton();
        agnadirButton = new javax.swing.JButton();
 /////////////////////////////////////////////////////////7       
        
         setMaximumSize(new java.awt.Dimension(1370, 720));
        setPreferredSize(new java.awt.Dimension(1370, 720));

        /*
         revisarCitasRadioButton = new javax.swing.JRadioButton();
        crearCitaRadioButton = new javax.swing.JRadioButton();
        eliminarModificarCitasRadioButton = new javax.swing.JRadioButton();
        */
        
        
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        
     

      
        horaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        horaLabel.setText("Hora");
        add(horaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 40, 43));

        fechaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fechaLabel.setText("Fecha");
        add(fechaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 60, 43));

        horaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "00:00", "00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30" }));
        add(horaComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 103, 33));

        peinadoLabel.setText("Peinado");
        add(peinadoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, -1, 40));
        
        tinte1RadioButton.setText("1");
        tinte1RadioButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tinte1RadioButtonActionPerformed(evt);
            }
        });
        add(tinte1RadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 70, -1, -1));
        grupoTinte.add(tinte1RadioButton);
        
        
        tinte2RadioButton.setText("2");
        tinte2RadioButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tinte2RadioButtonActionPerformed(evt);
            }
        });
        add(tinte2RadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, -1, -1));
        grupoTinte.add(tinte2RadioButton);
        
        
        tinte3RadioButton.setText("3");
        add(tinte3RadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 70, -1, -1));
        grupoTinte.add(tinte3RadioButton);
        
        tinteXRadioButton.setText("X");
        tinteXRadioButton.setSelected(true);
        tinteXRadioButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tinteXRadioButtonActionPerformed(evt);
            }
        });
        add(tinteXRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 70, -1, -1));
        grupoTinte.add(tinteXRadioButton);
        
        
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 10, 110));

        manicureLabel.setText("Manicure");
        add(manicureLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 20, -1, 40));

        tinteLabel.setText("Tinte");
        add(tinteLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, -1, 40));

        peinado1RadioButton.setText("1");
        peinado1RadioButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peinado1RadioButtonActionPerformed(evt);
            }
        });
        add(peinado1RadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, -1, -1));
        grupoPeinado.add(peinado1RadioButton);
        
        
        peinado2RadioButton.setText("2");
        peinado2RadioButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peinado2RadioButtonActionPerformed(evt);
            }
        });
        add(peinado2RadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, -1, -1));
        grupoPeinado.add(peinado2RadioButton);
        
        
        peinado3RadioButton.setText("3");
        add(peinado3RadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, -1, -1));
        grupoPeinado.add(peinado3RadioButton);
        
        
        peinadoXRadioButton.setText("X");
        peinadoXRadioButton.setSelected(true);
        peinadoXRadioButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peinadoXRadioButtonActionPerformed(evt);
            }
        });
        add(peinadoXRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, -1, -1));
        grupoPeinado.add(peinadoXRadioButton);
        
        
        manicure1RadioButton.setText("1");
        manicure1RadioButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manicure1RadioButtonActionPerformed(evt);
            }
        });
        add(manicure1RadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 70, -1, -1));
        grupoManicure.add(manicure1RadioButton);
        
        
        manicure2RadioButton.setText("2");
        manicure2RadioButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manicure2RadioButtonActionPerformed(evt);
            }
        });
        add(manicure2RadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 70, -1, -1));
        grupoManicure.add(manicure2RadioButton);
        
        
        manicure3RadioButton.setText("3");
        add(manicure3RadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 70, -1, -1));
        grupoManicure.add(manicure3RadioButton);
        
        
        manicureXRadioButton.setText("X");
        manicureXRadioButton.setSelected(true);
        manicureXRadioButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manicureXRadioButtonActionPerformed(evt);
            }
        });
        add(manicureXRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 70, -1, -1));
        grupoManicure.add(manicureXRadioButton);
        
        corteLabel.setText("Corte");
        add(corteLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 10, -1, 40));
        
        
        corte1RadioButton.setText("1");
        corte1RadioButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corte1RadioButtonActionPerformed(evt);
            }
        });
        add(corte1RadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 80, -1, -1));
        grupoCorte.add(corte1RadioButton);
        
        
        corte2RadioButton.setText("2");
        corte2RadioButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corte2RadioButtonActionPerformed(evt);
            }
        });
        add(corte2RadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 80, -1, -1));
        grupoCorte.add(corte2RadioButton);
        
        
        corte3RadioButton.setText("3");
        add(corte3RadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 80, -1, -1));
        grupoCorte.add(corte3RadioButton);
        
        
        corteXRadioButton.setText("X");
        corteXRadioButton.setSelected(true);
        corteXRadioButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corteXRadioButtonActionPerformed(evt);
            }
        });
        add(corteXRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 80, -1, -1));
        grupoCorte.add(corteXRadioButton);
        
        
        bloqueoButton.setText("...");
        bloqueoButton.setActionCommand("Bloquear \nsesión");
        bloqueoButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloqueoButtonActionPerformed(evt);
            }
        });
        add(bloqueoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 40, 70, 30));

        corteComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Default", "Masculino", "Femenino" }));
        corteComboBox.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corteComboBoxActionPerformed(evt);
            }
        });
        add(corteComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 50, 110, -1));
         add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 110, 380, 40));

       
        nombreLabel.setText("Nombre");
        add(nombreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1149, 140, -1, -1));

        nombreTextField.setText("Juanito");
        add(nombreTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 160, 360, 20));

        telefonoLabel.setText("Teléfono");
        add(telefonoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 200, -1, -1));

        telefonoTextField.setText("3344556677");
        add(telefonoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 220, 360, 20));

        correoLabel.setText("Correo");
        add(correoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 260, -1, -1));

        correoTextField.setText("juanito@gmail.com");
        add(correoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 280, 360, -1));
        
        domicilioLabel.setText("Domicilio");
        add(domicilioLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 320, -1, -1));

        domicilioTextField.setText("casa 2233");
        add(domicilioTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 340, 360, -1));

        
        totalLabel.setText("Total $");
        add(totalLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 380, -1, -1));

        totalTextArea.setEditable(false);
        totalTextArea.setColumns(20);
        totalTextArea.setRows(5);
        jScrollPane2.setViewportView(totalTextArea);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 420, 360, 180));        
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 630, 380, 10));
        
        bloquearSesionLabel.setFont(new java.awt.Font("DialogInput", 1, 11)); // NOI18N
        bloquearSesionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bloquearSesionLabel.setText("Bloquear sesión");
        add(bloquearSesionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1239, 10, 120, 20));

        guardarButton.setText("Guardar cambios");
        guardarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarButtonActionPerformed(evt);
            }
        });
        add(guardarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 690, 230, 40));
        
         eliminarButton.setText("Eliminar");
        add(eliminarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 640, 160, 40));

        cancelarButton.setText("Cancelar");
        add(cancelarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 690, 120, 40));

        agnadirButton.setText("Añadir");
        add(agnadirButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 640, 190, 40));

        
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Fecha", "Hora", "Peinado", "Tinte", "Manicure", "Corte", "Telefono", "Domicilio", "Total"
            }
        ));
        jScrollPane3.setViewportView(jTable);
        if (jTable.getColumnModel().getColumnCount() > 0) {
            jTable.getColumnModel().getColumn(0).setResizable(false);
            jTable.getColumnModel().getColumn(1).setResizable(false);
            jTable.getColumnModel().getColumn(2).setResizable(false);
            jTable.getColumnModel().getColumn(3).setResizable(false);
            jTable.getColumnModel().getColumn(4).setResizable(false);
            jTable.getColumnModel().getColumn(5).setResizable(false);
            jTable.getColumnModel().getColumn(6).setResizable(false);
            jTable.getColumnModel().getColumn(7).setResizable(false);
            jTable.getColumnModel().getColumn(8).setResizable(false);
            jTable.getColumnModel().getColumn(9).setResizable(false);
        }

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 980, 620));
        
        //add(jDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 200, -1));
         add(jDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 210, 30));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables


    private void tinte1RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

    private void tinte2RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

    private void tinteXRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

    private void peinado1RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
    }                                                   

    private void peinado2RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
    }                                                   

    private void peinadoXRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
    }                                                   

    private void manicure1RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        // TODO add your handling code here:
    }                                                    

    private void manicure2RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        // TODO add your handling code here:
    }                                                    

    private void manicureXRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        // TODO add your handling code here:
    }                                                    

    private void corte1RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

    private void corte2RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

    private void corteXRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

    
    private void guardarButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }     
    
    private void bloqueoButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        
    
         java.awt.EventQueue.invokeLater(new Runnable(){
     public void run(){
        
         Estetica.inicioSesion.setVisible(true);
         Estetica.lista.setVisible(false);

          }
     });
     

    }                                             

    private void corteComboBoxActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void revisarCitasRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                        
        // TODO add your handling code here:
    }                                                       

    private void manicure3RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        // TODO add your handling code here:
    }                                                    


    // Variables declaration - do not modify                     
    private javax.swing.JButton guardarButton;
    private javax.swing.JButton cancelarButton;
    private javax.swing.JButton agnadirButton;
    private javax.swing.JButton eliminarButton;    
    private javax.swing.JLabel bloquearSesionLabel;
    private javax.swing.JButton bloqueoButton;
    private javax.swing.JRadioButton corte1RadioButton;
    private javax.swing.JRadioButton corte2RadioButton;
    private javax.swing.JRadioButton corte3RadioButton;
    private javax.swing.JComboBox<String> corteComboBox;
    private javax.swing.JLabel corteLabel;
    private javax.swing.JRadioButton corteXRadioButton;
    private javax.swing.JLabel domicilioLabel;
    private javax.swing.JTextField domicilioTextField;  
    private javax.swing.JLabel fechaLabel;
    private javax.swing.JComboBox<String> horaComboBox;
    private javax.swing.JLabel horaLabel;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTable jTable;
    private javax.swing.JRadioButton manicure1RadioButton;
    private javax.swing.JRadioButton manicure2RadioButton;
    private javax.swing.JRadioButton manicure3RadioButton;
    private javax.swing.JLabel manicureLabel;
    private javax.swing.JRadioButton manicureXRadioButton;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JTextField nombreTextField;
    private javax.swing.JRadioButton peinado1RadioButton;
    private javax.swing.JRadioButton peinado2RadioButton;
    private javax.swing.JRadioButton peinado3RadioButton;
    private javax.swing.JLabel peinadoLabel;
    private javax.swing.JRadioButton peinadoXRadioButton;
    private javax.swing.JLabel telefonoLabel;
    private javax.swing.JTextField telefonoTextField;
    private javax.swing.JRadioButton tinte1RadioButton;
    private javax.swing.JRadioButton tinte2RadioButton;
    private javax.swing.JRadioButton tinte3RadioButton;
    private javax.swing.JLabel tinteLabel;
    private javax.swing.JRadioButton tinteXRadioButton;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JTextArea totalTextArea;
    private javax.swing.JLabel correoLabel;
    private javax.swing.JTextField correoTextField;
    // End of variables declaration                   
    private ButtonGroup grupoPeinado, grupoTinte, grupoManicure, grupoCorte;
    private String [] nombreColumnas = {"Nombre", "Fecha", "Hora", "Peinado", "Tinte", "Manicure", "Corte", "Telefono", "Domicilio", "Total"};
}






