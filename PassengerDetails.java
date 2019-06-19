/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busticket;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;
import java.sql.*;

/**
 *
 * @author pravinewa
 */
public class PassengerDetails extends javax.swing.JDialog {
    static int ivalid = 0, pvalid = 0, snvalid = 0, emailvalid = 0, contactnumbervalid = 0, addressvalid = 0;
    
    /**
     * Creates new form AddStaff
     */
    public PassengerDetails(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jPanel1 = new javax.swing.JPanel();
        staffIdLabel = new javax.swing.JLabel();
        staffIdTextField = new javax.swing.JTextField();
        staffIdSeperator = new javax.swing.JSeparator();
        showValidationOfStaffId = new javax.swing.JLabel();
        staffNameLabel = new javax.swing.JLabel();
        staffNameTextField = new javax.swing.JTextField();
        staffNameSeparator = new javax.swing.JSeparator();
        showValidationOfStaffName = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        staffNameLabel1 = new javax.swing.JLabel();
        staffIdLabel1 = new javax.swing.JLabel();
        staffIdLabel2 = new javax.swing.JLabel();
        staffIdLabel3 = new javax.swing.JLabel();
        staffIdLabel4 = new javax.swing.JLabel();
        staffIdLabel5 = new javax.swing.JLabel();
        staffIdLabel6 = new javax.swing.JLabel();
        staffIdLabel7 = new javax.swing.JLabel();
        staffIdLabel8 = new javax.swing.JLabel();
        staffIdLabel9 = new javax.swing.JLabel();
        staffIdLabel10 = new javax.swing.JLabel();
        staffIdLabel11 = new javax.swing.JLabel();
        staffIdLabel12 = new javax.swing.JLabel();
        staffNameSeparator1 = new javax.swing.JSeparator();
        staffIdLabel13 = new javax.swing.JLabel();
        staffIdLabel30 = new javax.swing.JLabel();
        staffIdLabel27 = new javax.swing.JLabel();
        staffIdLabel28 = new javax.swing.JLabel();
        staffIdLabel29 = new javax.swing.JLabel();
        staffIdLabel31 = new javax.swing.JLabel();
        cancelButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setOpacity(0.9F);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(1, 50, 67));
        jPanel1.setPreferredSize(new java.awt.Dimension(440, 580));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        staffIdLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        staffIdLabel.setForeground(new java.awt.Color(255, 255, 255));
        staffIdLabel.setText("Seats                             ");
        jPanel1.add(staffIdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 170, 20));

        staffIdTextField.setBackground(new java.awt.Color(1, 50, 67));
        staffIdTextField.setForeground(new java.awt.Color(255, 255, 255));
        staffIdTextField.setBorder(null);
        staffIdTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                staffIdTextFieldKeyReleased(evt);
            }
        });
        jPanel1.add(staffIdTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 200, 20));
        jPanel1.add(staffIdSeperator, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 200, 10));

        showValidationOfStaffId.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(showValidationOfStaffId, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 200, 15));

        staffNameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        staffNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        staffNameLabel.setText("(Seat No.  )");
        jPanel1.add(staffNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 270, -1, 20));

        staffNameTextField.setBackground(new java.awt.Color(1, 50, 67));
        staffNameTextField.setForeground(new java.awt.Color(255, 255, 255));
        staffNameTextField.setBorder(null);
        staffNameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                staffNameTextFieldKeyReleased(evt);
            }
        });
        jPanel1.add(staffNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 200, 20));
        jPanel1.add(staffNameSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 660, 10));

        showValidationOfStaffName.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(showValidationOfStaffName, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 200, 15));

        addButton.setBackground(new java.awt.Color(255, 255, 255));
        addButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addButton.setText("Submit");
        addButton.setFocusable(false);
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        jPanel1.add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 130, 30));

        staffNameLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        staffNameLabel1.setForeground(new java.awt.Color(255, 255, 255));
        staffNameLabel1.setText("Mobile No :");
        jPanel1.add(staffNameLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, -1, 20));

        staffIdLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        staffIdLabel1.setForeground(new java.awt.Color(255, 255, 255));
        staffIdLabel1.setText("Name :");
        jPanel1.add(staffIdLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 60, 20));

        staffIdLabel2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        staffIdLabel2.setForeground(new java.awt.Color(255, 255, 255));
        staffIdLabel2.setText("NULL");
        jPanel1.add(staffIdLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 280, 20));

        staffIdLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        staffIdLabel3.setForeground(new java.awt.Color(255, 255, 255));
        staffIdLabel3.setText("Booking Agent             ");
        jPanel1.add(staffIdLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 170, 20));

        staffIdLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        staffIdLabel4.setForeground(new java.awt.Color(255, 255, 255));
        staffIdLabel4.setText("Bus Id                           ");
        jPanel1.add(staffIdLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 170, 20));

        staffIdLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        staffIdLabel5.setForeground(new java.awt.Color(255, 255, 255));
        staffIdLabel5.setText("Source Station             ");
        jPanel1.add(staffIdLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 170, 20));

        staffIdLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        staffIdLabel6.setForeground(new java.awt.Color(255, 255, 255));
        staffIdLabel6.setText("Destination Station      ");
        jPanel1.add(staffIdLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 170, 20));

        staffIdLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        staffIdLabel7.setForeground(new java.awt.Color(255, 255, 255));
        staffIdLabel7.setText("D.O.J                              ");
        jPanel1.add(staffIdLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 170, 20));

        staffIdLabel8.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        staffIdLabel8.setForeground(new java.awt.Color(255, 255, 255));
        staffIdLabel8.setText("NULL");
        jPanel1.add(staffIdLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 280, 20));

        staffIdLabel9.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        staffIdLabel9.setForeground(new java.awt.Color(255, 255, 255));
        staffIdLabel9.setText("NULL");
        jPanel1.add(staffIdLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 280, 20));

        staffIdLabel10.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        staffIdLabel10.setForeground(new java.awt.Color(255, 255, 255));
        staffIdLabel10.setText("NULL");
        jPanel1.add(staffIdLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 280, 20));

        staffIdLabel11.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        staffIdLabel11.setForeground(new java.awt.Color(255, 255, 255));
        staffIdLabel11.setText("NULL");
        jPanel1.add(staffIdLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 280, 20));

        staffIdLabel12.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        staffIdLabel12.setForeground(new java.awt.Color(255, 255, 255));
        staffIdLabel12.setText("NULL");
        jPanel1.add(staffIdLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 280, 20));
        jPanel1.add(staffNameSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 200, 10));

        staffIdLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        staffIdLabel13.setForeground(new java.awt.Color(255, 255, 255));
        staffIdLabel13.setText(":");
        jPanel1.add(staffIdLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 20, 20));

        staffIdLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        staffIdLabel30.setForeground(new java.awt.Color(255, 255, 255));
        staffIdLabel30.setText(":");
        jPanel1.add(staffIdLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 20, 20));

        staffIdLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        staffIdLabel27.setForeground(new java.awt.Color(255, 255, 255));
        staffIdLabel27.setText(":");
        jPanel1.add(staffIdLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 20, 20));

        staffIdLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        staffIdLabel28.setForeground(new java.awt.Color(255, 255, 255));
        staffIdLabel28.setText(":");
        jPanel1.add(staffIdLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 20, 20));

        staffIdLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        staffIdLabel29.setForeground(new java.awt.Color(255, 255, 255));
        staffIdLabel29.setText(":");
        jPanel1.add(staffIdLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 20, 20));

        staffIdLabel31.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        staffIdLabel31.setForeground(new java.awt.Color(255, 255, 255));
        staffIdLabel31.setText(":");
        jPanel1.add(staffIdLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 20, 20));

        cancelButton1.setBackground(new java.awt.Color(255, 255, 255));
        cancelButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancelButton1.setText("Cancel");
        cancelButton1.setFocusable(false);
        cancelButton1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        cancelButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(cancelButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 130, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 380));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void staffIdTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_staffIdTextFieldKeyReleased
        String PATTERN = "^[a-z]{0,4}[0-9]{0,4}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(staffIdTextField.getText());
        if(!match.matches())
        {
            showValidationOfStaffId.setText("Staff ID field is Incorrect");
            staffIdTextField.setForeground(Color.red);
            ivalid = 0;
        }
        if(staffIdTextField.getText().equals(""))
        {
            showValidationOfStaffId.setText("Staff ID field cannot be Empty");
            staffIdTextField.setForeground(Color.white);
            ivalid = 0;
        }
        if(match.matches())
        {
            showValidationOfStaffId.setText(null);
            staffIdTextField.setForeground(Color.white);
            ivalid = 1;
        }
    }//GEN-LAST:event_staffIdTextFieldKeyReleased

    private void staffNameTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_staffNameTextFieldKeyReleased
        String PATTERN = "^[a-zA-Z\\s]{2,22}+$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(staffNameTextField.getText());
        if(!match.matches())
        {
            showValidationOfStaffName.setText("Naming is incorrect!");
            staffNameTextField.setForeground(Color.red);
            snvalid = 0;
        }
        if(staffNameTextField.getText().equals(""))
        {
            showValidationOfStaffName.setText(null);
            staffNameTextField.setForeground(Color.white);
            snvalid = 0;
        }
        if(match.matches())
        {
            showValidationOfStaffName.setText(null);
            staffNameTextField.setForeground(Color.white);
            snvalid = 1;
        }

    }//GEN-LAST:event_staffNameTextFieldKeyReleased

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        TicketPrice dialog = new TicketPrice(new javax.swing.JFrame(), true);
        dialog.setVisible(true);   
        this.dispose();
    }//GEN-LAST:event_addButtonActionPerformed

    private void cancelButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PassengerDetails dialog = new PassengerDetails(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton addButton;
    private javax.swing.JButton cancelButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel showValidationOfStaffId;
    private javax.swing.JLabel showValidationOfStaffName;
    private javax.swing.JLabel staffIdLabel;
    private javax.swing.JLabel staffIdLabel1;
    private javax.swing.JLabel staffIdLabel10;
    private javax.swing.JLabel staffIdLabel11;
    private javax.swing.JLabel staffIdLabel12;
    private javax.swing.JLabel staffIdLabel13;
    private javax.swing.JLabel staffIdLabel2;
    private javax.swing.JLabel staffIdLabel27;
    private javax.swing.JLabel staffIdLabel28;
    private javax.swing.JLabel staffIdLabel29;
    private javax.swing.JLabel staffIdLabel3;
    private javax.swing.JLabel staffIdLabel30;
    private javax.swing.JLabel staffIdLabel31;
    private javax.swing.JLabel staffIdLabel4;
    private javax.swing.JLabel staffIdLabel5;
    private javax.swing.JLabel staffIdLabel6;
    private javax.swing.JLabel staffIdLabel7;
    private javax.swing.JLabel staffIdLabel8;
    private javax.swing.JLabel staffIdLabel9;
    private javax.swing.JSeparator staffIdSeperator;
    private javax.swing.JTextField staffIdTextField;
    private javax.swing.JLabel staffNameLabel;
    private javax.swing.JLabel staffNameLabel1;
    private javax.swing.JSeparator staffNameSeparator;
    private javax.swing.JSeparator staffNameSeparator1;
    private javax.swing.JTextField staffNameTextField;
    // End of variables declaration//GEN-END:variables
}