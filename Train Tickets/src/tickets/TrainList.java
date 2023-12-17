/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package train.tickets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Mahmud
 */
public class TrainList extends javax.swing.JFrame {

    /**
     * Creates new form TrainList
     */
    String user_mail, fromStation, toStation, train,date,departure_time,SeatType;
    int no_of_seats,fare,seats_AC,seats_Snighdha,seats_Chair,updated_seats;
    public TrainList() {
        initComponents();
    }
    
    public TrainList(String user_mail,String fromStation,String toStation,String date){
        initComponents();
        
        this.user_mail = user_mail;
        this.fromStation = fromStation;
        this.toStation = toStation;
        this.date=date;
        
         
        setTrainList();
        available_seats();
       
       
    }
     private void Ticket_fare(){
         if(train=="Sundarban Express"){
             if(SeatType=="AC"){
         fare=1156*no_of_seats;
             }
             else if(SeatType=="Snighdha"){
         fare=966*no_of_seats;
             }
             else if(SeatType=="Chair"){
         fare=505*no_of_seats;
             }
         }
         
         else if(train=="Banalata Express"){
             if(SeatType=="AC"){
         fare=865*no_of_seats;
             }
             else if(SeatType=="Snighdha"){
         fare=725*no_of_seats;
             }
             else if(SeatType=="Chair"){
         fare=375*no_of_seats;
             }
         }
         
         else if(train=="Kopotakha Express"){
             if(SeatType=="AC"){
         fare=708*no_of_seats;
             }
             else if(SeatType=="Snighdha"){
         fare=593*no_of_seats;
             }
             else if(SeatType=="Chair"){
         fare=310*no_of_seats;
             }
         }
          
     }
    private void setTrainList(){
        jTextField1.setEditable(false);
        if(((fromStation == "Dhaka")&&(toStation == "Khulna"))){
           jTextField1.setText("Sundarban Express");
           train = "Sundarban Express";
           departure_time= "8:15 AM";
           
        }
        
         if(((fromStation=="Khulna")&&(toStation=="Dhaka"))){
           jTextField1.setText("Sundarban Express");
           train = "Sundarban Express";
           departure_time= "10:15 PM";
           
        }
        if(((fromStation == "Dhaka")&&(toStation == "Rajshahi"))){
            jTextField1.setText("Banalata Express");
            train = "Banalata Express";
            departure_time= "1:30 PM";
    }
        
         if(((fromStation=="Rajshahi")&&(toStation=="Dhaka"))){
            jTextField1.setText("Banalata Express");
            train = "Banalata Express";
            departure_time= "6:00 AM";
    }
        /*if((fromStation == "Khulna")&&(toStation=="Dhaka")){
            jTextField1.setText("Sundarban Express");
        }*/
        /*if((fromStation == "Rajshahi")&&(toStation=="Dhaka")){
            jTextField1.setText("Banlata Express");
        }*/
        if(((fromStation == "Rajshahi")&&(toStation=="Khulna"))){
            jTextField1.setText("Kopotakha Express");
            train = "Kopotakha Express";
             departure_time= "2:15 PM";
        }
        
         if(((fromStation == "Khulna")&&(toStation == "Rajshahi"))){
            jTextField1.setText("Kopotakha Express");
            train = "Kopotakha Express";
             departure_time= "6:15 PM";
        }
    
    }
    
    private void available_seats(){
        if(train=="Sundarban Express"){
        try{
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/train_ticket", "root", "");
        System.out.println("connection established"); 
        PreparedStatement stmt = conn.prepareStatement("select * from available_seats where `Train_name`='Sundarban Express'");
        ResultSet res = stmt.executeQuery();
        while(res.next()){
        
        seats_AC = Integer.parseInt(res.getString(2));
        seats_Snighdha =Integer.parseInt(res.getString(3));
        seats_Chair = Integer.parseInt(res.getString(4));
        jTextField2.setEditable(false);
        jTextField2.setText("AC:"+seats_AC+"\n  Snighdha:"+seats_Snighdha+"\n  Chair:"+seats_Chair);
        
        }
        }
        catch (SQLException ex) {
            
            System.out.println("sorry, connection not established!");
        }
    }
        
      if(train=="Banalata Express"){
        try{
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/train_ticket", "root", "");
        System.out.println("connection established"); 
        PreparedStatement stmt = conn.prepareStatement("select * from available_seats where `Train_name`='Banalata Express'");
        ResultSet res = stmt.executeQuery();
        while(res.next()){
        
        seats_AC = Integer.parseInt(res.getString(2));
        seats_Snighdha =Integer.parseInt(res.getString(3));
        seats_Chair = Integer.parseInt(res.getString(4));
        jTextField2.setEditable(false);
        jTextField2.setText("AC:"+seats_AC+"\n  Snighdha:"+seats_Snighdha+"\n  Chair:"+seats_Chair);
        
        }
        }
        catch (SQLException ex) {
            
            System.out.println("sorry, connection not established!");
        }
    }
      
      if(train=="Kopotakha Express"){
        try{
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/train_ticket", "root", "");
        System.out.println("connection established"); 
        PreparedStatement stmt = conn.prepareStatement("select * from available_seats where `Train_name`='Kopotakha Express'");
        ResultSet res = stmt.executeQuery();
        while(res.next()){
        
        seats_AC = Integer.parseInt(res.getString(2));
        seats_Snighdha =Integer.parseInt(res.getString(3));
        seats_Chair = Integer.parseInt(res.getString(4));
        jTextField2.setEditable(false);
        jTextField2.setText("AC:"+seats_AC+"\n  Snighdha:"+seats_Snighdha+"\n  Chair:"+seats_Chair);
        
        }
        }
        catch (SQLException ex) {
            
            System.out.println("sorry, connection not established!");
        }
    }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Ticket Reservation System");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Train List");

        jLabel3.setText("Available Train");

        jLabel4.setText("Seat Type");

        jLabel5.setText("Number of Seats");

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "Snighdha", "Chair" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jTextField1.setText("jTextField1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Available Seats");

        jTextField2.setText("jTextField2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(37, 37, 37)
                                    .addComponent(jLabel2))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(7, 7, 7)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

       SeatType = jComboBox2.getSelectedItem().toString();
       no_of_seats = Integer.parseInt(jComboBox3.getSelectedItem().toString());
       System.out.println(no_of_seats);
         Ticket_fare();
         if(train=="Sundarban Express"){
          if( (SeatType=="AC") &&((seats_AC!=0)&&(seats_AC-no_of_seats>=0))){
            
              updated_seats=seats_AC-no_of_seats;
             try{
                                 
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/train_ticket", "root", "");
        System.out.println("connection established");
         String sql="UPDATE `available_seats` SET `AC`='"+updated_seats+"' WHERE `Train_name`='Sundarban Express'";

        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.execute();
        }
        catch (SQLException ex) {
            System.out.println("sorry, connection not established!");
        }
              this.dispose(); 
              new Confirmation(user_mail, SeatType,no_of_seats,fromStation,toStation,train,date,departure_time,fare).setVisible(true);   
            }
         
          
          else if( (SeatType=="Snighdha") &&((seats_Snighdha!=0)&&(seats_Snighdha-no_of_seats>=0))){ 
            
              updated_seats=seats_Snighdha-no_of_seats;
             try{
                                 
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/train_ticket", "root", "");
        System.out.println("connection established");
         String sql="UPDATE `available_seats` SET `Snighdha`='"+updated_seats+"' WHERE `Train_name`='Sundarban Express'";

        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.execute();
        }
        catch (SQLException ex) {
            System.out.println("sorry, connection not established!");
        }
              this.dispose(); 
              new Confirmation(user_mail, SeatType,no_of_seats,fromStation,toStation,train,date,departure_time,fare).setVisible(true);  
            }
           else if( (SeatType=="Chair")&&((seats_Chair!=0)&&(seats_Chair-no_of_seats>=0))){
            
               updated_seats=seats_Chair-no_of_seats;
               System.out.println(updated_seats);  
              try{
                                 
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/train_ticket", "root", "");
        System.out.println("connection established");
         String sql="UPDATE `available_seats` SET `Chair`='"+updated_seats+"' WHERE `Train_name`='Sundarban Express'";

        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.execute();
        }
        catch (SQLException ex) {
            System.out.println("sorry, connection not established!");
        }
               this.dispose(); 
               new Confirmation(user_mail, SeatType,no_of_seats,fromStation,toStation,train,date,departure_time,fare).setVisible(true);              
            }
          
            else{   
              jLabel7.setText("Invalid number of seats!!!");
            
            }
    }//GEN-LAST:event_jButton1ActionPerformed
    
    if(train=="Banalata Express"){
          if( (SeatType=="AC") &&((seats_AC!=0)&&(seats_AC-no_of_seats>=0))){
            
              updated_seats=seats_AC-no_of_seats;
             try{
                                 
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/train_ticket", "root", "");
        System.out.println("connection established");
         String sql="UPDATE `available_seats` SET `AC`='"+updated_seats+"' WHERE `Train_name`='Banalata Express'";

        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.execute();
        }
        catch (SQLException ex) {
            System.out.println("sorry, connection not established!");
        }
              this.dispose(); 
              new Confirmation(user_mail, SeatType,no_of_seats,fromStation,toStation,train,date,departure_time,fare).setVisible(true);   
            }
         
          
          else if( (SeatType=="Snighdha") &&((seats_Snighdha!=0)&&(seats_Snighdha-no_of_seats>=0))){ 
            
              updated_seats=seats_Snighdha-no_of_seats;
             try{
                                 
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/train_ticket", "root", "");
        System.out.println("connection established");
         String sql="UPDATE `available_seats` SET `Snighdha`='"+updated_seats+"' WHERE `Train_name`='Banalata Express'";

        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.execute();
        }
        catch (SQLException ex) {
            System.out.println("sorry, connection not established!");
        }
              this.dispose(); 
              new Confirmation(user_mail, SeatType,no_of_seats,fromStation,toStation,train,date,departure_time,fare).setVisible(true);  
            }
           else if( (SeatType=="Chair")&&((seats_Chair!=0)&&(seats_Chair-no_of_seats>=0))){
            
               updated_seats=seats_Chair-no_of_seats;
               System.out.println(updated_seats);  
              try{
                                 
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/train_ticket", "root", "");
        System.out.println("connection established");
         String sql="UPDATE `available_seats` SET `Chair`='"+updated_seats+"' WHERE `Train_name`='Banalata Express'";

        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.execute();
        }
        catch (SQLException ex) {
            System.out.println("sorry, connection not established!");
        }
               this.dispose(); 
               new Confirmation(user_mail, SeatType,no_of_seats,fromStation,toStation,train,date,departure_time,fare).setVisible(true);              
            }
          
            else{   
              jLabel7.setText("Invalid number of seats!!!");
            
            }
    }                                        
    
    if(train=="Kopotakha Express"){
          if( (SeatType=="AC") &&((seats_AC!=0)&&(seats_AC-no_of_seats>=0))){
            
              updated_seats=seats_AC-no_of_seats;
             try{
                                 
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/train_ticket", "root", "");
        System.out.println("connection established");
         String sql="UPDATE `available_seats` SET `AC`='"+updated_seats+"' WHERE `Train_name`='Kopotakha Express'";

        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.execute();
        }
        catch (SQLException ex) {
            System.out.println("sorry, connection not established!");
        }
              this.dispose(); 
              new Confirmation(user_mail, SeatType,no_of_seats,fromStation,toStation,train,date,departure_time,fare).setVisible(true);   
            }
         
          
          else if( (SeatType=="Snighdha") &&((seats_Snighdha!=0)&&(seats_Snighdha-no_of_seats>=0))){ 
            
              updated_seats=seats_Snighdha-no_of_seats;
             try{
                                 
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/train_ticket", "root", "");
        System.out.println("connection established");
         String sql="UPDATE `available_seats` SET `Snighdha`='"+updated_seats+"' WHERE `Train_name`='Kopotakha Express'";

        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.execute();
        }
        catch (SQLException ex) {
            System.out.println("sorry, connection not established!");
        }
              this.dispose(); 
              new Confirmation(user_mail, SeatType,no_of_seats,fromStation,toStation,train,date,departure_time,fare).setVisible(true);  
            }
           else if( (SeatType=="Chair")&&((seats_Chair!=0)&&(seats_Chair-no_of_seats>=0))){
            
               updated_seats=seats_Chair-no_of_seats;
               System.out.println(updated_seats);  
              try{
                                 
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/train_ticket", "root", "");
        System.out.println("connection established");
         String sql="UPDATE `available_seats` SET `Chair`='"+updated_seats+"' WHERE `Train_name`='Kopotakha Express'";

        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.execute();
        }
        catch (SQLException ex) {
            System.out.println("sorry, connection not established!");
        }
               this.dispose(); 
               new Confirmation(user_mail, SeatType,no_of_seats,fromStation,toStation,train,date,departure_time,fare).setVisible(true);              
            }
          
            else{   
              jLabel7.setText("Invalid number of seats!!!");
            
            }
    }                                        
    
    }
    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add our handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(TrainList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrainList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrainList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrainList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PageList = new TrainList();
                PageList.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
    static private TrainList PageList;
}
