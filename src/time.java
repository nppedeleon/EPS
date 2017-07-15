import javax.swing.*;
import java.sql.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sony
 */
public class time extends javax.swing.JFrame {
      Connection cn;
      PreparedStatement ps;
      ResultSet res;
    /**
     * Creates new form terminate
     */
    public time() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        time_empid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        time_search = new javax.swing.JButton();
        time_cancel = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        time_name = new javax.swing.JLabel();
        time_lastname = new javax.swing.JLabel();
        time_dept = new javax.swing.JLabel();
        time_save = new javax.swing.JButton();
        time_job = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        time_clear = new javax.swing.JButton();
        time_timein = new javax.swing.JComboBox();
        time_timeout = new javax.swing.JComboBox();
        time_month = new javax.swing.JComboBox();
        time_day = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        time_status = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Cambria", 0, 48)); // NOI18N
        jLabel2.setText("TIME IN/ TIME OUT");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel3.setText("Please enter Employee ID:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jLabel4.setText("Employee ID:");

        jLabel5.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jLabel5.setText("Name:");

        jLabel6.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jLabel6.setText("Last Name:");

        time_search.setText("Search");
        time_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                time_searchActionPerformed(evt);
            }
        });

        time_cancel.setText("CANCEL");
        time_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                time_cancelActionPerformed(evt);
            }
        });

        jLabel7.setText("Department:");

        jLabel8.setText("Job/Position:");

        time_save.setText("SAVE");
        time_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                time_saveActionPerformed(evt);
            }
        });

        jLabel9.setText("Time IN:");

        jLabel10.setText("Time OUT:");

        jLabel11.setText("Date:");

        time_clear.setText("CLEAR");
        time_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                time_clearActionPerformed(evt);
            }
        });

        time_timein.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "12 AM", "1 AM", "2 AM", "3 AM", "4 AM", "5 AM", "6 AM", "7 AM", "8 AM", "9 AM", "10 AM", "11 AM", "12 PM", "1 PM", "2 PM", "3 PM", "4 PM", "5 PM", "6 PM", "7 PM", "8 PM", "9 PM", "10 PM", "11 PM", "12 AM" }));
        time_timein.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                time_timeinActionPerformed(evt);
            }
        });

        time_timeout.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "12 AM", "1 AM", "2 AM", "3 AM", "4 AM", "5 AM", "6 AM", "7 AM", "8 AM", "9 AM", "10 AM", "11 AM", "12 PM", "1 PM", "2 PM", "3 PM", "4 PM", "5 PM", "6 PM", "7 PM", "8 PM", "9 PM", "10 PM", "11 PM", "12 AM" }));

        time_month.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "March" }));

        time_day.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" }));

        jLabel12.setText("Status:");

        time_status.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "ON-TIME", "LATE", "ABSENT" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(time_name)
                            .addComponent(time_job)
                            .addComponent(time_lastname)
                            .addComponent(time_dept))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(time_status, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(time_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(time_day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(time_timein, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(time_timeout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(132, 132, 132))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(time_empid, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(time_search))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(time_save, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(time_cancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(time_clear)))
                .addContainerGap(228, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(time_empid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(time_search))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(time_name)
                    .addComponent(jLabel11)
                    .addComponent(time_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(time_day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(time_lastname)
                    .addComponent(jLabel12)
                    .addComponent(time_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(time_dept)
                    .addComponent(jLabel9)
                    .addComponent(time_timein, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(time_job)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(time_timeout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(time_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(time_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(time_save, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 660, 350));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sony\\Desktop\\CCS\\Systems\\Backgrounds\\time.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 880, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void time_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_time_searchActionPerformed
        Function f = new Function();
        ResultSet res = null;

        res = f.find(time_empid.getText());
        try{
            if(res.next()){
                time_name.setText(res.getString("name"));
                time_lastname.setText(res.getString("lastname"));
                time_dept.setText(res.getString("department"));
                time_job.setText(res.getString("job"));
              


            }
            else{
                JOptionPane.showMessageDialog(null, "Employee ID do not exist!");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_time_searchActionPerformed

    private void time_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_time_cancelActionPerformed
        dispose();
        main b = new main();
        b.setVisible(true);
    }//GEN-LAST:event_time_cancelActionPerformed

    private void time_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_time_saveActionPerformed
         cn=sql.myConnection();
        String ins="INSERT INTO time Values (?,?,?,?,?,?,?,?,?,?,?)";
      int x = (time());
      int y = (timeout());
        try{
            ps=cn.prepareStatement(ins);
            ps.setString(1, time_empid.getText());
            String firstname = time_name.getText().toString();
            ps.setString(2, firstname);
            String surname = time_lastname.getText().toString();
            ps.setString(3, surname);
            ps.setString(4, time_dept.getText());
            ps.setString(5, time_job.getText());
            String datemonth = time_month.getSelectedItem().toString();
            ps.setString(6, datemonth);
            String dateday = time_day.getSelectedItem().toString();
            ps.setString(7, dateday);
            String status = time_status.getSelectedItem().toString();
            ps.setString(8,status);
            String timein = time_timein.getSelectedItem().toString();       
            ps.setString(9, timein);
            String timeout = time_timeout.getSelectedItem().toString();
            ps.setString(10, timeout);
            int z = y - x;
            int a = 0;
            ps.setInt(11, z);
            if(time_status.getSelectedItem() == "ABSENT"){
                ps.setInt(11, a);
            }
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Saved!");
            time_empid.setText(" ");
            time_name.setText(" ");
            time_lastname.setText(" ");
            time_dept.setText(" ");
            time_job.setText(" ");
            time_month.setSelectedItem(" ");
            time_day.setSelectedItem(" ");
            time_timein.setSelectedItem(" ");
            time_timeout.setSelectedItem(" ");
            time_status.setSelectedItem(" ");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Please fill up correct information");
           

        }
    }//GEN-LAST:event_time_saveActionPerformed

    private void time_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_time_clearActionPerformed
      time_empid.setText(" ");
      time_name.setText(" ");
      time_lastname.setText(" ");
      time_dept.setText(" ");
      time_job.setText(" ");
      time_month.setSelectedItem(" ");
      time_day.setSelectedItem(" ");
      time_timein.setSelectedItem(" ");
      time_timeout.setSelectedItem(" ");
      time_status.setSelectedItem(" ");
  
      
    }//GEN-LAST:event_time_clearActionPerformed

    private void time_timeinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_time_timeinActionPerformed
       
    }//GEN-LAST:event_time_timeinActionPerformed
   public int time(){
       int time = 0;
        
        if(time_timein.getSelectedItem() == "1 AM"){
           time = 2; }
        if(time_timein.getSelectedItem() == "2 AM"){
           time = 3; }
        if(time_timein.getSelectedItem() == "3 AM"){
           time = 4; }
        if(time_timein.getSelectedItem() == "4 AM"){
           time = 5; }
        if(time_timein.getSelectedItem() == "5 AM"){
           time = 6; }
        if(time_timein.getSelectedItem() == "6 AM"){
           time = 7; }
        if(time_timein.getSelectedItem() == "7 AM"){
           time = 8; }
        if(time_timein.getSelectedItem() == "8 AM"){
           time = 9; }
        if(time_timein.getSelectedItem() == "9 AM"){
           time = 10; }
        if(time_timein.getSelectedItem() == "10 AM"){
           time = 11; }
        if(time_timein.getSelectedItem() == "11 AM"){
           time = 12; }
        if(time_timein.getSelectedItem() == "12 PM"){
           time = 13; }
        if(time_timein.getSelectedItem() == "1 PM"){
           time = 14; }
        if(time_timein.getSelectedItem() == "2 PM"){
           time = 15; }
        if(time_timein.getSelectedItem() == "3 PM"){
           time = 16; }
        if(time_timein.getSelectedItem() == "4 PM"){
           time = 17; }
        if(time_timein.getSelectedItem() == "5 PM"){
           time = 18; }
        if(time_timein.getSelectedItem() == "6 PM"){
           time = 19; }
        if(time_timein.getSelectedItem() == "7 PM"){
           time = 20; }
        if(time_timein.getSelectedItem() == "8 PM"){
           time = 21; }
        if(time_timein.getSelectedItem() == "9 PM"){
           time = 22; }
        if(time_timein.getSelectedItem() == "10 PM"){
           time = 23; }
        if(time_timein.getSelectedItem() == "11 PM"){
           time = 24; }
        if(time_timein.getSelectedItem() == "12 AM"){
           time = 1; }
        return time;
   }
   public int timeout(){
       int timeout = 0;
        
        if(time_timeout.getSelectedItem() == "1 AM"){
           timeout = 2; }
        if(time_timeout.getSelectedItem() == "2 AM"){
           timeout = 3; }
        if(time_timeout.getSelectedItem() == "3 AM"){
           timeout = 4; }
        if(time_timeout.getSelectedItem() == "4 AM"){
           timeout = 5; }
        if(time_timeout.getSelectedItem() == "5 AM"){
           timeout = 6; }
        if(time_timeout.getSelectedItem() == "6 AM"){
           timeout = 7; }
        if(time_timeout.getSelectedItem() == "7 AM"){
           timeout = 8; }
        if(time_timeout.getSelectedItem() == "8 AM"){
           timeout = 9; }
        if(time_timeout.getSelectedItem() == "9 AM"){
           timeout = 10; }
        if(time_timeout.getSelectedItem() == "10 AM"){
           timeout = 11; }
        if(time_timeout.getSelectedItem() == "11 AM"){
           timeout = 12; }
        if(time_timeout.getSelectedItem() == "12 PM"){
           timeout = 13; }
        if(time_timeout.getSelectedItem() == "1 PM"){
           timeout = 14; }
        if(time_timeout.getSelectedItem() == "2 PM"){
           timeout = 15; }
        if(time_timeout.getSelectedItem() == "3 PM"){
           timeout = 16; }
        if(time_timeout.getSelectedItem() == "4 PM"){
           timeout = 17; }
        if(time_timeout.getSelectedItem() == "5 PM"){
           timeout = 18; }
        if(time_timeout.getSelectedItem() == "6 PM"){
           timeout = 19; }
        if(time_timeout.getSelectedItem() == "7 PM"){
           timeout = 20; }
        if(time_timeout.getSelectedItem() == "8 PM"){
           timeout = 21; }
        if(time_timeout.getSelectedItem() == "9 PM"){
           timeout = 22; }
        if(time_timeout.getSelectedItem() == "10 PM"){
           timeout = 23; }
        if(time_timeout.getSelectedItem() == "11 PM"){
           timeout = 24; }
        if(time_timeout.getSelectedItem() == "12 AM"){
           timeout = 1; }
        return timeout;
   }
    public class Function{
        Connection cn = null;
        ResultSet res = null;
        PreparedStatement ps = null;
        public ResultSet find(String s){
            try{
                cn=DriverManager.getConnection("jdbc:mysql://localhost/payroll","root","");
                ps = cn.prepareStatement("Select * from employee where employeeid = ?");
                ps.setString(1, s);
                res = ps.executeQuery();
                }      
                catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
            return res;
        }
    }
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
            java.util.logging.Logger.getLogger(time.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(time.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(time.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(time.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new time().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton time_cancel;
    private javax.swing.JButton time_clear;
    private javax.swing.JComboBox time_day;
    private javax.swing.JLabel time_dept;
    private javax.swing.JTextField time_empid;
    private javax.swing.JLabel time_job;
    private javax.swing.JLabel time_lastname;
    private javax.swing.JComboBox time_month;
    private javax.swing.JLabel time_name;
    private javax.swing.JButton time_save;
    private javax.swing.JButton time_search;
    private javax.swing.JComboBox time_status;
    private javax.swing.JComboBox time_timein;
    private javax.swing.JComboBox time_timeout;
    // End of variables declaration//GEN-END:variables
}
