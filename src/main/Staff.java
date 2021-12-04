/*
POS SYSTEM STAFF MANAGEMENT
 */
package main;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import dbconnection.DBconnect;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableCellRenderer;
/**
 *
 * @author Per$ival
 */
public class Staff extends javax.swing.JFrame {
        Connection con = null;
        PreparedStatement pst = null;
        Statement stmt = null;
        ResultSet rs = null;
        DefaultTableModel model = new DefaultTableModel();
        
    
    public Staff() {
        initComponents();
        con = DBconnect.connect();
        getTableDetails();
        showallpost();
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtxtPost = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxtFname = new javax.swing.JTextField();
        jtxtEmpoyeeID = new javax.swing.JTextField();
        jtxtLname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtxtAddress = new javax.swing.JTextField();
        jtxtCity = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jtxtPassword = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jtxtEnrollDate = new javax.swing.JTextField();
        jtxtLeaveDate = new javax.swing.JTextField();
        jComboBox = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtxtBasicSalary = new javax.swing.JTextField();
        jtxtBonus = new javax.swing.JTextField();
        jtxtEPF = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtxtETF = new javax.swing.JTextField();
        jbtnAdd = new javax.swing.JButton();
        jbtnClear = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jbtnUpdate = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jbtnDelete = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0));
        jtxtSearch = new javax.swing.JTextField();
        jbtnSearch = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();
        jbtnPrint = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setText("STAFF");

        jtxtPost.setBackground(new java.awt.Color(204, 204, 204));
        jtxtPost.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Employee Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel1.setText("Employee ID");

        jLabel6.setText("Employee Name");

        jtxtFname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtFnameActionPerformed(evt);
            }
        });

        jLabel7.setText("Address");

        jtxtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCityActionPerformed(evt);
            }
        });

        jLabel8.setText("City");

        jLabel10.setText("Enroll/Leave Date ");

        jLabel11.setText("Post");

        jtxtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtPasswordActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel12.setText("Password");

        jLabel13.setForeground(new java.awt.Color(255, 0, 51));
        jLabel13.setText("FirstName");

        jLabel14.setForeground(new java.awt.Color(255, 0, 51));
        jLabel14.setText("LastName");

        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jLabel15.setText("LeaveDate");

        jLabel16.setForeground(new java.awt.Color(255, 0, 0));
        jLabel16.setText("EnrollDate");

        jComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jtxtPostLayout = new javax.swing.GroupLayout(jtxtPost);
        jtxtPost.setLayout(jtxtPostLayout);
        jtxtPostLayout.setHorizontalGroup(
            jtxtPostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jtxtPostLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jtxtPostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jtxtPostLayout.createSequentialGroup()
                        .addGroup(jtxtPostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11))
                        .addGap(64, 64, 64)
                        .addGroup(jtxtPostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtPassword)
                            .addComponent(jComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jtxtPostLayout.createSequentialGroup()
                        .addGroup(jtxtPostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1))
                        .addGap(27, 27, 27)
                        .addGroup(jtxtPostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jtxtPostLayout.createSequentialGroup()
                                .addComponent(jtxtFname, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jtxtLname))
                            .addComponent(jtxtEmpoyeeID)))
                    .addGroup(jtxtPostLayout.createSequentialGroup()
                        .addGroup(jtxtPostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))
                        .addGap(15, 15, 15)
                        .addGroup(jtxtPostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jtxtPostLayout.createSequentialGroup()
                                .addComponent(jtxtEnrollDate, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                                .addComponent(jtxtLeaveDate, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8))
                            .addComponent(jtxtCity)
                            .addComponent(jtxtAddress))))
                .addContainerGap())
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jtxtPostLayout.createSequentialGroup()
                .addContainerGap(204, Short.MAX_VALUE)
                .addGroup(jtxtPostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jtxtPostLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(183, 183, 183)
                        .addComponent(jLabel14)
                        .addGap(105, 105, 105))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jtxtPostLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(190, 190, 190)
                        .addComponent(jLabel15)
                        .addGap(93, 93, 93))))
            .addGroup(jtxtPostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jtxtPostLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jtxtPostLayout.setVerticalGroup(
            jtxtPostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jtxtPostLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jtxtPostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jtxtEmpoyeeID, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jtxtPostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jtxtPostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtxtFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtxtLname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addGroup(jtxtPostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jtxtPostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jtxtPostLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel8))
                    .addGroup(jtxtPostLayout.createSequentialGroup()
                        .addGroup(jtxtPostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jtxtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jtxtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addGroup(jtxtPostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jtxtPostLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel10))
                    .addGroup(jtxtPostLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jtxtPostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtEnrollDate)
                            .addComponent(jtxtLeaveDate))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jtxtPostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addGroup(jtxtPostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jtxtPostLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel11))
                    .addGroup(jtxtPostLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox)))
                .addGap(27, 27, 27)
                .addGroup(jtxtPostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jtxtPostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jtxtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12))
                .addGap(18, 18, 18))
            .addGroup(jtxtPostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jtxtPostLayout.createSequentialGroup()
                    .addContainerGap(300, Short.MAX_VALUE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(23, 23, 23)))
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Payment Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13))); // NOI18N

        jLabel3.setText("BasicSalary");

        jLabel4.setText("Bonus");

        jLabel5.setText("EPF");

        jtxtBasicSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtBasicSalaryActionPerformed(evt);
            }
        });

        jtxtBonus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtBonusActionPerformed(evt);
            }
        });

        jtxtEPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtEPFActionPerformed(evt);
            }
        });

        jLabel9.setText("ETF");

        jbtnAdd.setBackground(new java.awt.Color(0, 0, 0));
        jbtnAdd.setFont(new java.awt.Font("Sylfaen", 1, 13)); // NOI18N
        jbtnAdd.setText("Add");
        jbtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAddActionPerformed(evt);
            }
        });

        jbtnClear.setBackground(new java.awt.Color(0, 0, 0));
        jbtnClear.setFont(new java.awt.Font("Sylfaen", 1, 13)); // NOI18N
        jbtnClear.setText("Clear");
        jbtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtxtBonus, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(jtxtBasicSalary)
                    .addComponent(jtxtEPF)
                    .addComponent(jtxtETF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnClear, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                .addGap(78, 78, 78))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtxtBasicSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jtxtBonus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtEPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(40, 40, 40))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jbtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jtxtETF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "Fname", "Lname", "Address", "City", "EnrollDate", "LeaveDate", "Post", "BasicSalary", "Bonus", "EPF", "ETF", "Password"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jbtnUpdate.setBackground(new java.awt.Color(0, 0, 0));
        jbtnUpdate.setFont(new java.awt.Font("Sylfaen", 1, 13)); // NOI18N
        jbtnUpdate.setText("Update");
        jbtnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnUpdateMouseClicked(evt);
            }
        });
        jbtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUpdateActionPerformed(evt);
            }
        });

        jbtnDelete.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jbtnDelete.setText("Delete");
        jbtnDelete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 1007, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbtnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1019, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jbtnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jbtnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        jtxtSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jbtnSearch.setFont(new java.awt.Font("Sylfaen", 1, 13)); // NOI18N
        jbtnSearch.setText("Search");
        jbtnSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbtnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSearchActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Sylfaen", 1, 13)); // NOI18N
        jButton1.setText("Report");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jbtnExit.setBackground(new java.awt.Color(0, 0, 0));
        jbtnExit.setFont(new java.awt.Font("Sylfaen", 1, 13)); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.setBorder(new javax.swing.border.MatteBorder(null));
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });

        jbtnPrint.setBackground(new java.awt.Color(204, 204, 204));
        jbtnPrint.setFont(new java.awt.Font("Sylfaen", 1, 13)); // NOI18N
        jbtnPrint.setText("Print Details");
        jbtnPrint.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbtnPrint.setMargin(new java.awt.Insets(1, 14, 2, 14));
        jbtnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(287, 287, 287))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtPost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 12, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(jLabel2)
                        .addContainerGap(862, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jtxtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtnExit)
                            .addComponent(jbtnPrint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(14, 14, 14)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jbtnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jtxtPost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(346, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1714, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 892, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCityActionPerformed

    private void jtxtBasicSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtBasicSalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtBasicSalaryActionPerformed

    private void jtxtEPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtEPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtEPFActionPerformed

    private JFrame frame;
    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        frame=new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit!!","POS SYSTEM",
        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
        System.exit(0);
    }//GEN-LAST:event_jbtnExitActionPerformed
    }
    private void jbtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnClearActionPerformed
        jtxtEmpoyeeID.setText(null);
        jtxtFname.setText(null);
        jtxtLname.setText(null);
        jtxtAddress.setText(null);
        jtxtCity.setText(null);
        jtxtBasicSalary.setText(null);
        jtxtBonus.setText(null);
        jtxtEPF.setText(null);
        jtxtETF.setText(null);
        jtxtPassword.setText(null);
    }//GEN-LAST:event_jbtnClearActionPerformed

    private void jtxtBonusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtBonusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtBonusActionPerformed

    private void jbtnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPrintActionPerformed
        MessageFormat header=new MessageFormat("Printing in process");
        MessageFormat footer=new MessageFormat("Page {0,number,integer}");
        
        try
        {
            jTable1.print(JTable.PrintMode.NORMAL,header,footer);
            
            
        }
        catch(java.awt.print.PrinterException e)
        {
            
            System.err.format("No Printer found", e.getMessage());
        }
    }//GEN-LAST:event_jbtnPrintActionPerformed

    
    
      public ArrayList<Employee> GetEmployeeDetails(){
               
                ArrayList<Employee> GetEmp=null;
                
                
                GetEmp=new ArrayList<Employee>();
       
        try {
            con = DBconnect.connect();
            String qry="select * from employee";
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(qry);
            Employee list;
            while (rs.next()) {
               list =new Employee(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6), rs.getString(7),rs.getString(8),
                        rs.getString(9),rs.getString(10), rs.getString(11),rs.getString(12),rs.getString(13));
                        
                GetEmp.add(list);
              }
           
        }   catch (Exception e) {
            System.out.println(e);
        }
       return GetEmp; 
    }
      
      
      public void getTableDetails(){
        ArrayList<Employee> GetEmp=GetEmployeeDetails();
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        model.setRowCount(0);
        Object[] row=new Object[13];
        for (int a = 0; a < GetEmp.size(); a++) {
            row[0]=GetEmp.get(a).getId();
            row[1]=GetEmp.get(a).getfName();
            row[2]=GetEmp.get(a).getlName();
            row[3]=GetEmp.get(a).getaddress();
            row[4]=GetEmp.get(a).getcity();
            row[5]=GetEmp.get(a).getenrollDate();                                   
            row[6]=GetEmp.get(a).getleaveDate();
            row[7]=GetEmp.get(a).getpost();
            row[8]=GetEmp.get(a).getbasicSalary();
            row[9]=GetEmp.get(a).getbonus();
            row[10]=GetEmp.get(a).getEPF();
            row[11]=GetEmp.get(a).getETF();                                   
            row[12]=GetEmp.get(a).getpassword();
                                                       
            model.addRow(row);
        }
      
      }
      
      public void showDetails(int Value){
        jtxtEmpoyeeID.setText(GetEmployeeDetails().get( Value).getId());
        jtxtFname.setText(GetEmployeeDetails().get( Value).getfName());
        jtxtLname.setText(GetEmployeeDetails().get( Value).getlName());
        jtxtAddress.setText(GetEmployeeDetails().get( Value).getaddress());
        jtxtCity.setText(GetEmployeeDetails().get( Value).getcity()); 
        jtxtEnrollDate.setText(GetEmployeeDetails().get( Value).getenrollDate());
        jtxtLeaveDate.setText(GetEmployeeDetails().get( Value).getleaveDate());
          
        
	
        
        jtxtBasicSalary.setText(GetEmployeeDetails().get( Value).getbasicSalary());
        jtxtBonus.setText(GetEmployeeDetails().get( Value).getbonus());
        jtxtEPF.setText(GetEmployeeDetails().get( Value).getEPF());
        jtxtETF.setText(GetEmployeeDetails().get( Value).getETF());
        jtxtPassword.setText(GetEmployeeDetails().get(Value).getpassword());
        
      
      }    
    private void jbtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUpdateActionPerformed
            int x = JOptionPane.showConfirmDialog(null,"DO YOU WANT TO UPDATE");
         
         if (x==0){
             
         
        if (jtxtEmpoyeeID.getText().toString().equals("") ||jtxtFname.getText().toString().equals("") ||
            jtxtFname.getText().toString().equals("") ||
            jtxtAddress.getText().toString().equals("") ||
            jtxtCity.getText().toString().equals("")||
            jtxtEnrollDate.getText().toString().equals("")||
            jtxtLeaveDate.getText().toString().equals("")||
                    
            jtxtBasicSalary.getText().toString().equals("") ||
            jtxtBonus.getText().toString().equals("") ||
            jtxtEPF.getText().toString().equals("")||
            jtxtETF.getText().toString().equals("")||
            jtxtPassword.toString().equals("")) {

            JOptionPane.showMessageDialog(null, "All fields must filed");

        }else{
                

            try{
               String qry="update employee set fName=?,lName=?,address=?,city=?,enrollDate=?,leaveDate=?,post=?,basicSalary=?,bonus=?,EPF=?,ETF=?,password=? where empId=?";
                PreparedStatement pst=con.prepareStatement(qry);

                
                pst.setString(1,jtxtFname.getText().toString());
                pst.setString(2,jtxtLname.getText().toString());
                pst.setString(3,jtxtAddress.getText().toString());
                pst.setString(4,jtxtCity.getText().toString());
                pst.setString(5,jtxtEnrollDate.getText().toString());
                pst.setString(6,jtxtLeaveDate.getText().toString());
            
                String values=jComboBox.getSelectedItem().toString();
                pst.setString(7, values);
                
                pst.setString(8,jtxtBasicSalary.getText().toString());
                pst.setString(9,jtxtBonus.getText().toString());
                pst.setString(10,jtxtEPF.getText().toString());
                pst.setString(11,jtxtETF.getText().toString());
                pst.setString(12,jtxtPassword.getText().toString());
                pst.setString(13,jtxtEmpoyeeID.getText().toString());
                int result=pst.executeUpdate();
                getTableDetails(); 
                if (result>=1) {
                  
                    JOptionPane.showMessageDialog(null,result+"  Updated Successfully");
                }else{
                    JOptionPane.showMessageDialog(null,"  Updation failed");
                }
                if (pst!=null) {
                    pst.close();
                }
                if (con!=null) {
                    con.close();
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error in Update "+e);
            }
           
            jtxtEmpoyeeID.setText("");
            jtxtFname.setText("");
            jtxtLname.setText("");
            jtxtAddress.setText("");
            jtxtCity.setText("");
            jtxtEnrollDate.setText("");
            jtxtLeaveDate.setText("");
            jtxtBasicSalary.setText("");
            jtxtBonus.setText("");
            jtxtEPF.setText("");
            jtxtETF.setText("");
            jtxtPassword.setText("");
             }
         }
    
    
    }//GEN-LAST:event_jbtnUpdateActionPerformed


    private void jbtnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnUpdateMouseClicked
       
                
    }//GEN-LAST:event_jbtnUpdateMouseClicked
    
    private void jtxtFnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtFnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtFnameActionPerformed

    private void jtxtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtPasswordActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
          int sd=jTable1.getSelectedRow();
        showDetails(sd);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jbtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeleteActionPerformed
        
         int x = JOptionPane.showConfirmDialog(null,"DO YOU WANT TO DELETE");
         if(x==0){
             
         
        if (jtxtEmpoyeeID.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please Enter ID");
        }else{
            try{
                String qry="delete from employee where empId=?";
                 con = DBconnect.connect();
                PreparedStatement pst=con.prepareStatement(qry);
                pst.setInt(1, Integer.parseInt(jtxtEmpoyeeID.getText().toString()));
                int res=pst.executeUpdate();
               getTableDetails();
                if (res>=1) {
                    JOptionPane.showMessageDialog(null, "Employee Deleted Successfully");
                }else
                JOptionPane.showMessageDialog(null, "Failed To Delete Employee");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }
    }//GEN-LAST:event_jbtnDeleteActionPerformed

    private void jbtnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSearchActionPerformed
         ArrayList<Employee> GetEmp=null;
        GetEmp=new ArrayList<Employee>();
        String val=jtxtSearch.getText().toString();
        try {
            con = DBconnect.connect();
            String qry="select * from employee where empId like '%"+val+"%'";
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(qry);
            Employee emp;
            while (rs.next()) {
               emp =new Employee(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6), rs.getString(7),rs.getString(8),
                        rs.getString(9),rs.getString(10), rs.getString(11),rs.getString(12),rs.getString(13));
                GetEmp.add(emp);
            }

            DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
            model.setRowCount(0); 
            Object[] row=new Object[13];
            for (int a = 0; a < GetEmp.size(); a++) {
             row[0]=GetEmp.get(a).getId();
            row[1]=GetEmp.get(a).getfName();
            row[2]=GetEmp.get(a).getlName();
            row[3]=GetEmp.get(a).getaddress();
            row[4]=GetEmp.get(a).getcity();
            row[5]=GetEmp.get(a).getenrollDate();                                   
            row[6]=GetEmp.get(a).getleaveDate();
            row[7]=GetEmp.get(a).getpost();
            row[8]=GetEmp.get(a).getbasicSalary();
            row[9]=GetEmp.get(a).getbonus();
            row[10]=GetEmp.get(a).getEPF();
            row[11]=GetEmp.get(a).getETF();                                   
            row[12]=GetEmp.get(a).getpassword();  
                model.addRow(row);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jbtnSearchActionPerformed

    private void jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxActionPerformed

    private void jbtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddActionPerformed

        int x = JOptionPane.showConfirmDialog(null,"DO YOU WANT TO DELETE");
         if(x==0){
             
         
        if (jtxtEmpoyeeID.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please Enter ID");
        }else{
            try{
                String qry="delete from employee where empId=?";
                 con = DBconnect.connect();
                PreparedStatement pst=con.prepareStatement(qry);
                pst.setInt(1, Integer.parseInt(jtxtEmpoyeeID.getText().toString()));
                int res=pst.executeUpdate();
               getTableDetails();
                if (res>=1) {
                    JOptionPane.showMessageDialog(null, "Employee Deleted Successfully");
                }else
                JOptionPane.showMessageDialog(null, "Failed To Delete Employee");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }
    }//GEN-LAST:event_jbtnAddActionPerformed
    
    
    public void showallpost() {
        
        try {
            
            stmt = con.createStatement();
            String sql = "select DISTINCT post from employee";
            
            rs = stmt.executeQuery(sql);
            
            while(rs.next()) {
                jComboBox.addItem(rs.getString("post"));
            }
            
        } catch (Exception e) {
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Staff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtnAdd;
    private javax.swing.JButton jbtnClear;
    private javax.swing.JButton jbtnDelete;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnPrint;
    private javax.swing.JButton jbtnSearch;
    private javax.swing.JButton jbtnUpdate;
    private javax.swing.JTextField jtxtAddress;
    private javax.swing.JTextField jtxtBasicSalary;
    private javax.swing.JTextField jtxtBonus;
    private javax.swing.JTextField jtxtCity;
    private javax.swing.JTextField jtxtEPF;
    private javax.swing.JTextField jtxtETF;
    private javax.swing.JTextField jtxtEmpoyeeID;
    private javax.swing.JTextField jtxtEnrollDate;
    private javax.swing.JTextField jtxtFname;
    private javax.swing.JTextField jtxtLeaveDate;
    private javax.swing.JTextField jtxtLname;
    private javax.swing.JTextField jtxtPassword;
    private javax.swing.JPanel jtxtPost;
    private javax.swing.JTextField jtxtSearch;
    // End of variables declaration//GEN-END:variables
}
