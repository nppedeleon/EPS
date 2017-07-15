import java.sql.*;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author New
 */
public class Add extends javax.swing.JFrame {
      Connection cn;
      PreparedStatement ps;
      ResultSet rs;
     
    /**
     * Creates new form Add
     */
    public Add() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        lastname = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        male_radio = new javax.swing.JRadioButton();
        female_ribbon = new javax.swing.JRadioButton();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        add_button = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel55 = new javax.swing.JLabel();
        empid = new javax.swing.JTextField();
        agecombo = new javax.swing.JComboBox();
        job = new javax.swing.JComboBox();
        department = new javax.swing.JComboBox();
        Clear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        startdate = new javax.swing.JTextField();
        perhour = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel41.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel41.setText("Fill up the following information:");

        jLabel43.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jLabel43.setText("First Name:");

        jLabel44.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jLabel44.setText("Last Name:");

        jLabel45.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jLabel45.setText("Address:");

        jLabel46.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jLabel46.setText("Age:");

        jLabel47.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jLabel47.setText("Gender:");

        jLabel48.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jLabel48.setText("Email:");

        jLabel49.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jLabel49.setText("Contact no:");

        male_radio.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        male_radio.setText("Male");
        male_radio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                male_radioActionPerformed(evt);
            }
        });

        female_ribbon.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        female_ribbon.setText("Female");
        female_ribbon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                female_ribbonActionPerformed(evt);
            }
        });

        jLabel50.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel50.setText("Employee Details");

        jLabel51.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jLabel51.setText("Department:");

        jLabel53.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jLabel53.setText("Job/Position:");

        add_button.setText("Add");
        add_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_buttonActionPerformed(evt);
            }
        });

        jButton8.setText("Cancel");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel55.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jLabel55.setText("Employee ID:");

        empid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                empidKeyTyped(evt);
            }
        });

        agecombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50" }));
        agecombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agecomboActionPerformed(evt);
            }
        });

        job.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Database Administrator", "Computer Programmer", "IT Technician" }));
        job.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jobActionPerformed(evt);
            }
        });

        department.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "IT" }));
        department.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                departmentItemStateChanged(evt);
            }
        });
        department.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departmentActionPerformed(evt);
            }
        });

        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        jLabel1.setText("Salary/hour:");

        jLabel2.setText("Start Date:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel41)
                            .addComponent(jLabel50)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel43)
                        .addGap(28, 28, 28)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(add_button, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel47)
                                    .addComponent(jLabel45)
                                    .addComponent(jLabel46)
                                    .addComponent(jLabel48)
                                    .addComponent(jLabel49))
                                .addGap(27, 27, 27))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel53, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel55, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel51, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(address)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(contact, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                        .addComponent(male_radio)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(female_ribbon))
                                    .addComponent(email, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                    .addComponent(agecombo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(department, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(empid, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                    .addComponent(job, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(startdate, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(perhour))
                                .addGap(0, 4, Short.MAX_VALUE)))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel41)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43)
                    .addComponent(jLabel44)
                    .addComponent(lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(female_ribbon)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel47)
                        .addComponent(male_radio)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel45)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(agecombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel50)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(empid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(department, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(perhour))
                .addGap(13, 13, 13)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(job, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(startdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_button, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 560, 500));

        jLabel14.setFont(new java.awt.Font("Cambria", 0, 70)); // NOI18N
        jLabel14.setText("BECOME ONE OF US!");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 710, 70));

        jLabel42.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sony\\Desktop\\CCS\\Systems\\Backgrounds\\add.jpg")); // NOI18N
        getContentPane().add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        dispose();
        main a = new main();
        a.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void empidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_empidKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_empidKeyTyped

    private void add_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_buttonActionPerformed
        cn=sql.myConnection();
        String ins="INSERT INTO employee Values (?,?,?,?,?,?,?,?,?,?,?,?)";
        
        try{
            ps=cn.prepareStatement(ins);
            String firstname = name.getText().toString();
            ps.setString(1, firstname);
            String surname = lastname.getText().toString();
            ps.setString(2, surname);
            ps.setString(3, gender);
            ps.setString(4, address.getText());
            String value=agecombo.getSelectedItem().toString();
            ps.setString(5, value);
            ps.setString(6, email.getText());
            ps.setString(7, contact.getText());
            ps.setString(8, empid.getText());
            String dep=department.getSelectedItem().toString();
            ps.setString(9, dep);
            String jobs=job.getSelectedItem().toString();
            ps.setString(10, jobs);
            ps.setString(11, perhour.getText());
            ps.setString(12, startdate.getText());
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Successful! Added New Employee!");
            name.setText("");
            lastname.setText("");
            address.setText("");
            email.setText("");
            contact.setText("");
            empid.setText("");
            male_radio.setSelected(false);
            female_ribbon.setSelected(false);
            male_radio.setEnabled(true);
            female_ribbon.setEnabled(true);
            agecombo.setSelectedItem(" ");
            department.setSelectedItem(" ");
            job.setSelectedItem(" ");
            perhour.setText(" ");
            startdate.setText(" ");
        }
        catch(Exception e){
                JOptionPane.showMessageDialog(null,"Please fill up correct information");
                
                }
        
    }//GEN-LAST:event_add_buttonActionPerformed
  
    private void departmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmentActionPerformed

        
    }//GEN-LAST:event_departmentActionPerformed

    private void male_radioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_male_radioActionPerformed

        female_ribbon.setEnabled(false);       
        gender = "male";
    }//GEN-LAST:event_male_radioActionPerformed

    private void female_ribbonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_female_ribbonActionPerformed

        male_radio.setEnabled(false);
        gender = "female";
    }//GEN-LAST:event_female_ribbonActionPerformed

    private void agecomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agecomboActionPerformed
       
    }//GEN-LAST:event_agecomboActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
       name.setText("");
       lastname.setText("");
       male_radio.setSelected(false);
       female_ribbon.setSelected(false);
       address.setText("");
       male_radio.setEnabled(true);
       female_ribbon.setEnabled(true);
       agecombo.setSelectedItem(" ");
       email.setText("");
       contact.setText("");
       empid.setText("");
       department.setSelectedItem(" ");
       job.setSelectedItem(" ");
       perhour.setText(" ");
       startdate.setText(" ");

       
       
    }//GEN-LAST:event_ClearActionPerformed

    private void departmentItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_departmentItemStateChanged

    }//GEN-LAST:event_departmentItemStateChanged

    private void jobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jobActionPerformed
        if(job.getSelectedItem() == "IT Technician"){
            perhour.setText("100");
        }
        if(job.getSelectedItem() == "Computer Programmer"){
            perhour.setText("180");
        }
        if(job.getSelectedItem() == "Database Administrator"){
            perhour.setText("350");
        }
    }//GEN-LAST:event_jobActionPerformed
    
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
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JButton add_button;
    private javax.swing.JTextField address;
    private javax.swing.JComboBox agecombo;
    private javax.swing.JTextField contact;
    private javax.swing.JComboBox department;
    private javax.swing.JTextField email;
    private javax.swing.JTextField empid;
    private javax.swing.JRadioButton female_ribbon;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JComboBox job;
    private javax.swing.JTextField lastname;
    private javax.swing.JRadioButton male_radio;
    private javax.swing.JTextField name;
    private javax.swing.JLabel perhour;
    private javax.swing.JTextField startdate;
    // End of variables declaration//GEN-END:variables
private String gender;

}

