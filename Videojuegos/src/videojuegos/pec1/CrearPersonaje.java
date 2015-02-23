/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videojuegos.pec1;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.logging.Level;
import java.util.logging.Logger;
import videojuegos.pec1.armas.Arma;

/**
 *
 * @author Jorge
 */
public class CrearPersonaje extends javax.swing.JFrame {

    /**
     * Creates new form CrearPersonaje
     * @throws java.io.FileNotFoundException
     */
    public CrearPersonaje() throws FileNotFoundException {
        initComponents();     
        String[] nombres = new String[juego.getArmas().size()];
        System.out.println(nombres.toString());
        for(int i=0;i<juego.getArmas().size();i++){
            
            nombres[i] = juego.getArmas().get(i).getNombre();
        }
        listNombreArma.setListData(nombres);
    }
    Juego juego = new Juego();
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        comboRaza = new javax.swing.JComboBox();
        labelRaza = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        labelPV = new javax.swing.JLabel();
        labelDestreza = new javax.swing.JLabel();
        textPV = new javax.swing.JTextField();
        textDestreza = new javax.swing.JTextField();
        labelMana = new javax.swing.JLabel();
        labelEnergia = new javax.swing.JLabel();
        textMana = new javax.swing.JTextField();
        textEnergia = new javax.swing.JTextField();
        botonOK = new javax.swing.JButton();
        labelPersonaje = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        comboTipoArma = new javax.swing.JComboBox();
        labelTipoArma = new javax.swing.JLabel();
        scrollListNombreArma = new javax.swing.JScrollPane();
        listNombreArma = new javax.swing.JList();
        labelNombreArma = new javax.swing.JLabel();
        labelRecurso = new javax.swing.JLabel();
        labelDanyo = new javax.swing.JLabel();
        textRecursoArma = new javax.swing.JTextField();
        textDanyo = new javax.swing.JTextField();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        comboRaza.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Kender", "Nigromante", "Druida" }));
        comboRaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboRazaActionPerformed(evt);
            }
        });

        labelRaza.setText("Raza:");

        labelNombre.setText("Nombre: ");

        textNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNombreActionPerformed(evt);
            }
        });

        labelPV.setText("PV: ");

        labelDestreza.setText("Destreza:");

        textPV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPVActionPerformed(evt);
            }
        });

        labelMana.setText("Mana: ");

        labelEnergia.setText("Energia: ");

        textMana.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                textManaPropertyChange(evt);
            }
        });

        botonOK.setText("OK");
        botonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOKActionPerformed(evt);
            }
        });

        labelPersonaje.setText("PERSONAJE");

        jLabel1.setText("ARMAMENTO");

        comboTipoArma.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bastón", "Espada", "Arco" }));
        comboTipoArma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoArmaActionPerformed(evt);
            }
        });

        labelTipoArma.setText("Tipo de Arma:");

        listNombreArma.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        scrollListNombreArma.setViewportView(listNombreArma);

        labelNombreArma.setText("Nombre Arma:");

        labelRecurso.setText("Recurso:");

        labelDanyo.setText("Daño: ");

        textRecursoArma.setEditable(false);
        textRecursoArma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textRecursoArmaActionPerformed(evt);
            }
        });

        textDanyo.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelDestreza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelMana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelRaza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(labelPV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(labelEnergia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textMana, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textDestreza)
                            .addComponent(textNombre)
                            .addComponent(textPV)
                            .addComponent(comboRaza, javax.swing.GroupLayout.Alignment.TRAILING, 0, 119, Short.MAX_VALUE)
                            .addComponent(textEnergia)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(labelPersonaje)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(90, 90, 90))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labelTipoArma)
                                    .addComponent(labelNombreArma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelRecurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelDanyo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(scrollListNombreArma, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(comboTipoArma, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(textDanyo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                        .addComponent(textRecursoArma, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(botonOK))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPersonaje)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(1, 1, 1)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNombre)
                            .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelTipoArma))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelPV)
                            .addComponent(textPV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNombreArma))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelDestreza)
                            .addComponent(textDestreza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelRaza))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelMana)
                            .addComponent(textMana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelEnergia)
                            .addComponent(textEnergia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(comboTipoArma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollListNombreArma, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textRecursoArma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelRecurso))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textDanyo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelDanyo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(botonOK)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonOKActionPerformed

    private void textNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNombreActionPerformed

    private void textPVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPVActionPerformed

    private void textManaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_textManaPropertyChange
        //VACIO 
    }//GEN-LAST:event_textManaPropertyChange

    private void comboRazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboRazaActionPerformed
        String seleccion = (String) comboRaza.getSelectedItem().toString();
        switch(seleccion){
            case "Kender":  {
                                textMana.setEditable(false);
                                textMana.setEnabled(false);
                                textEnergia.setEditable(true);
                                textEnergia.setEnabled(true);
                                break;
                            }
            case "Nigromante":  {
                                    textMana.setEditable(true);
                                    textMana.setEnabled(true);
                                    textEnergia.setEditable(false);
                                    textEnergia.setEnabled(false);
                                    break;
                                }              
            case "Druida":  {
                                textMana.setEditable(true);
                                textMana.setEnabled(true);
                                textEnergia.setEditable(true);
                                textEnergia.setEnabled(true);
                                break;
                            }                                
        }
    }//GEN-LAST:event_comboRazaActionPerformed

    private void textRecursoArmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textRecursoArmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textRecursoArmaActionPerformed

    private void comboTipoArmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoArmaActionPerformed
        String seleccion = (String) comboTipoArma.getSelectedItem().toString();
        switch(seleccion){
            case "Bastón":  {
                                labelRecurso.setText("Magia:");
                                break;
                            }
            case "Espada":  {
                                labelRecurso.setText("Resistencia:");
                                break;
                            }              
            case "Arco":    {
                                labelRecurso.setText("Flechas:");
                                break;
                            }                                
        }
    }//GEN-LAST:event_comboTipoArmaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CrearPersonaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearPersonaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearPersonaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearPersonaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CrearPersonaje().setVisible(true);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(CrearPersonaje.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonOK;
    private javax.swing.JComboBox comboRaza;
    private javax.swing.JComboBox comboTipoArma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelDanyo;
    private javax.swing.JLabel labelDestreza;
    private javax.swing.JLabel labelEnergia;
    private javax.swing.JLabel labelMana;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelNombreArma;
    private javax.swing.JLabel labelPV;
    private javax.swing.JLabel labelPersonaje;
    private javax.swing.JLabel labelRaza;
    private javax.swing.JLabel labelRecurso;
    private javax.swing.JLabel labelTipoArma;
    private javax.swing.JList listNombreArma;
    private javax.swing.JScrollPane scrollListNombreArma;
    private javax.swing.JTextField textDanyo;
    private javax.swing.JTextField textDestreza;
    private javax.swing.JTextField textEnergia;
    private javax.swing.JTextField textMana;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textPV;
    private javax.swing.JTextField textRecursoArma;
    // End of variables declaration//GEN-END:variables
}
