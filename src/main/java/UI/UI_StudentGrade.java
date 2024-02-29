/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import BLL.BLL_StudentGrade;
import BLL.DTO_OnSiteCourse;
import BLL.DTO_OnlineCourse;
import BLL.DTO_Person;
import BLL.DTO_StudentGrade;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class UI_StudentGrade extends javax.swing.JFrame {

    /**
     * Creates new form UI_StudentGrade
     */
    private BLL_StudentGrade bLL_StudentGrade;
    private DefaultTableModel model;
    private  DTO_Person dTO_Person;
    private  DTO_StudentGrade dTO_StudentGrade;
    private String courseID;
    public UI_StudentGrade() {
        
        initComponents();
        setLocationRelativeTo(null);
        bLL_StudentGrade = new BLL_StudentGrade();
        addOnSiteCourseDataToJcomboboxCourse ();
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_Header = new javax.swing.JLabel();
        jLabel_OnOff = new javax.swing.JLabel();
        jComboBox_OnOff = new javax.swing.JComboBox<>();
        jLabel_Course = new javax.swing.JLabel();
        jComboBox_Course = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_StudentGrade = new javax.swing.JTable();
        jPanel_Select = new javax.swing.JPanel();
        jLabel_EnrollmentID = new javax.swing.JLabel();
        jTextField_EnrollmentID = new javax.swing.JTextField();
        jLabel_Grade = new javax.swing.JLabel();
        jTextField_Grade = new javax.swing.JTextField();
        jButton_Luu = new javax.swing.JButton();
        jButton_Xoa = new javax.swing.JButton();
        jLabel_StudentIDText1 = new javax.swing.JLabel();
        jLabel_StudentID = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel_Name = new javax.swing.JLabel();
        jPanel_Add = new javax.swing.JPanel();
        jButton_XemDSSV = new javax.swing.JButton();
        jLabel_StudentIDText2 = new javax.swing.JLabel();
        jTextField_StudentID = new javax.swing.JTextField();
        jButton_ChonStudentdID = new javax.swing.JButton();
        jLabel_FristNameText = new javax.swing.JLabel();
        jLabel_FristName = new javax.swing.JLabel();
        jLabel_LastNameText = new javax.swing.JLabel();
        jLabel_LastName = new javax.swing.JLabel();
        jLabel_EnrollmentDateText = new javax.swing.JLabel();
        jLabel_EnrollmentDate = new javax.swing.JLabel();
        jButton_Them = new javax.swing.JButton();
        jLabel_IDText = new javax.swing.JLabel();
        jLabel_ID = new javax.swing.JLabel();
        jButton_resetThongTin = new javax.swing.JButton();
        jLabel_TimKiem = new javax.swing.JLabel();
        jTextField_TimKiem = new javax.swing.JTextField();
        jButton_TimKiem = new javax.swing.JButton();
        jButton_ResetJtable = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_Header.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Header.setText("Đăng ký khóa học và lưu điểm");

        jLabel_OnOff.setText("On-Off :");

        jComboBox_OnOff.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "On site", "Online" }));
        jComboBox_OnOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_OnOffActionPerformed(evt);
            }
        });

        jLabel_Course.setText("Course :");

        jComboBox_Course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_CourseActionPerformed(evt);
            }
        });

        jTable_StudentGrade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Enrollment ID", "Student ID", "Name", "Grade", "Enrollment Date"
            }
        ));
        jTable_StudentGrade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_StudentGradeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_StudentGrade);

        jPanel_Select.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel_EnrollmentID.setText("Enrollment ID :");

        jTextField_EnrollmentID.setEditable(false);

        jLabel_Grade.setText("Grade :");

        jButton_Luu.setText("Lưu");
        jButton_Luu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LuuActionPerformed(evt);
            }
        });

        jButton_Xoa.setText("Xóa");
        jButton_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_XoaActionPerformed(evt);
            }
        });

        jLabel_StudentIDText1.setText("Student ID :");

        jLabel_StudentID.setText("001");

        jLabel1.setText("Name :");

        jLabel_Name.setText("Nguyễn Văn A");

        javax.swing.GroupLayout jPanel_SelectLayout = new javax.swing.GroupLayout(jPanel_Select);
        jPanel_Select.setLayout(jPanel_SelectLayout);
        jPanel_SelectLayout.setHorizontalGroup(
            jPanel_SelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_SelectLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel_SelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_SelectLayout.createSequentialGroup()
                        .addGroup(jPanel_SelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_Grade)
                            .addComponent(jLabel_EnrollmentID)
                            .addComponent(jLabel_StudentIDText1)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_SelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_EnrollmentID)
                            .addComponent(jTextField_Grade, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_StudentID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_Name, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel_SelectLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jButton_Xoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(jButton_Luu)
                        .addGap(27, 27, 27))))
        );
        jPanel_SelectLayout.setVerticalGroup(
            jPanel_SelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_SelectLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel_SelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_EnrollmentID)
                    .addComponent(jTextField_EnrollmentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel_SelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_StudentIDText1)
                    .addComponent(jLabel_StudentID))
                .addGap(18, 18, 18)
                .addGroup(jPanel_SelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel_Name))
                .addGap(18, 18, 18)
                .addGroup(jPanel_SelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Grade)
                    .addComponent(jTextField_Grade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel_SelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Xoa)
                    .addComponent(jButton_Luu))
                .addGap(17, 17, 17))
        );

        jPanel_Add.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton_XemDSSV.setText("Xem danh sách sinh viên");

        jLabel_StudentIDText2.setText("Student ID :");

        jButton_ChonStudentdID.setText("Chọn");
        jButton_ChonStudentdID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ChonStudentdIDActionPerformed(evt);
            }
        });

        jLabel_FristNameText.setText("First name :");

        jLabel_FristName.setText("       ");

        jLabel_LastNameText.setText("Last name :");

        jLabel_LastName.setText("          ");

        jLabel_EnrollmentDateText.setText("Enrollment Date :");

        jLabel_EnrollmentDate.setText("           ");

        jButton_Them.setText("Thêm");
        jButton_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ThemActionPerformed(evt);
            }
        });

        jLabel_IDText.setText("ID :");

        jLabel_ID.setText("                   ");

        jButton_resetThongTin.setText("Reset");
        jButton_resetThongTin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_resetThongTinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_AddLayout = new javax.swing.GroupLayout(jPanel_Add);
        jPanel_Add.setLayout(jPanel_AddLayout);
        jPanel_AddLayout.setHorizontalGroup(
            jPanel_AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_AddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_AddLayout.createSequentialGroup()
                        .addGroup(jPanel_AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_LastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_FristNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_FristName, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_LastName, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_AddLayout.createSequentialGroup()
                        .addGap(0, 62, Short.MAX_VALUE)
                        .addGroup(jPanel_AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_AddLayout.createSequentialGroup()
                                .addComponent(jButton_resetThongTin)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_Them)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_AddLayout.createSequentialGroup()
                                .addGroup(jPanel_AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel_AddLayout.createSequentialGroup()
                                        .addComponent(jLabel_StudentIDText2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField_StudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton_ChonStudentdID))
                                    .addComponent(jButton_XemDSSV, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39))))
                    .addGroup(jPanel_AddLayout.createSequentialGroup()
                        .addGroup(jPanel_AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_AddLayout.createSequentialGroup()
                                .addComponent(jLabel_EnrollmentDateText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel_EnrollmentDate, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel_AddLayout.createSequentialGroup()
                                .addComponent(jLabel_IDText, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel_ID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(63, 63, 63))))
        );
        jPanel_AddLayout.setVerticalGroup(
            jPanel_AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_AddLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jButton_XemDSSV)
                .addGap(18, 18, 18)
                .addGroup(jPanel_AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_StudentIDText2)
                    .addComponent(jTextField_StudentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_ChonStudentdID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_ID)
                    .addComponent(jLabel_IDText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_FristNameText)
                    .addComponent(jLabel_FristName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_LastName)
                    .addComponent(jLabel_LastNameText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel_AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_EnrollmentDateText)
                    .addComponent(jLabel_EnrollmentDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Them)
                    .addComponent(jButton_resetThongTin))
                .addGap(15, 15, 15))
        );

        jLabel_TimKiem.setText("Tìm kiếm :");

        jButton_TimKiem.setText("Tìm kiếm");

        jButton_ResetJtable.setText("Reset");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel_Select, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jPanel_Add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jTextField_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton_TimKiem)
                                    .addComponent(jButton_ResetJtable)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(jLabel_OnOff, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox_OnOff, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel_Header, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 487, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel_Course, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox_Course, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(171, 171, 171)))))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel_Header, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_OnOff)
                    .addComponent(jComboBox_OnOff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Course)
                    .addComponent(jComboBox_Course, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_TimKiem)
                            .addComponent(jTextField_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_TimKiem))
                        .addGap(18, 18, 18)
                        .addComponent(jButton_ResetJtable))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel_Select, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_LuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LuuActionPerformed
        String result = bLL_StudentGrade.checkAndEditGrade(jTextField_Grade.getText().trim(), jTextField_EnrollmentID.getText().trim());
        JOptionPane.showMessageDialog(this,result);
        addDataToTable();
    }//GEN-LAST:event_jButton_LuuActionPerformed

    private void jButton_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_XoaActionPerformed
        String result = bLL_StudentGrade.checkAndDeleteStudentGrade(jTextField_EnrollmentID.getText().trim());
        JOptionPane.showMessageDialog(this,result);
        addDataToTable();
    }//GEN-LAST:event_jButton_XoaActionPerformed

    private void jComboBox_OnOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_OnOffActionPerformed
         jComboBox_Course.removeAllItems();
        
        if (jComboBox_OnOff.getSelectedItem().equals("On site"))
        {
            addOnSiteCourseDataToJcomboboxCourse();
        } else if (jComboBox_OnOff.getSelectedItem().equals("Online")) {
            addOnlineCourseDataToJcomboboxCourse();
        }
        setEmptyJpanel1();
    }//GEN-LAST:event_jComboBox_OnOffActionPerformed
    
    private void jComboBox_CourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_CourseActionPerformed
        
        addDataToTable();
        setEmptyJpanel1();
    }//GEN-LAST:event_jComboBox_CourseActionPerformed

    private void jTable_StudentGradeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_StudentGradeMouseClicked
        int index = jTable_StudentGrade.getSelectedRow();
        model = (DefaultTableModel) jTable_StudentGrade.getModel();
        
        jTextField_EnrollmentID.setText(model.getValueAt(index, 0)+"");
        jLabel_StudentID.setText(model.getValueAt(index, 1)+"");
        jLabel_Name.setText(model.getValueAt(index, 2)+"");
        jTextField_Grade.setText(model.getValueAt(index, 3)+"");
    }//GEN-LAST:event_jTable_StudentGradeMouseClicked

    private void jButton_ChonStudentdIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ChonStudentdIDActionPerformed
      
       String result = bLL_StudentGrade.checkStudentID(jTextField_StudentID.getText().trim());
       if (result.equals("Correct")) {
            dTO_Person = new DTO_Person(); 
            dTO_Person = bLL_StudentGrade.readPerson(jTextField_StudentID.getText().trim());
            if (dTO_Person != null) {
             jLabel_ID.setText(dTO_Person.getPersonID()+"");
             jLabel_FristName.setText(dTO_Person.getFirstName());
             jLabel_LastName.setText(dTO_Person.getLastName());
             jLabel_EnrollmentDate.setText(dTO_Person.getEnrollmentDate().toString());
            } else {
                 JOptionPane.showMessageDialog(this,"Không tồn tại !");
                
            }
       } else {
           JOptionPane.showMessageDialog(this,result);
       }
    }//GEN-LAST:event_jButton_ChonStudentdIDActionPerformed

    private void jButton_resetThongTinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_resetThongTinActionPerformed
       setEmptyJpanel2();
    }//GEN-LAST:event_jButton_resetThongTinActionPerformed

    private void jButton_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ThemActionPerformed
        if (jLabel_ID.getText().trim().equals("") == false ) {
            dTO_StudentGrade = new DTO_StudentGrade();
        dTO_StudentGrade.setCourseID( Integer.parseInt(courseID) );
        dTO_StudentGrade.setStudentId(Integer.parseInt(jLabel_ID.getText()));
//        bLL_StudentGrade.addStudentGrade(dTO_StudentGrade);
         JOptionPane.showMessageDialog(this,"Thêm thành công");
        addDataToTable();
        } else {
             JOptionPane.showMessageDialog(this,"Vui lòng chọn sinh viên !");
        }
        
        
    }//GEN-LAST:event_jButton_ThemActionPerformed

    private void setEmptyJpanel1 () {
         jTextField_EnrollmentID.setText("");
        jLabel_StudentID.setText("");
        jLabel_Name.setText("");
        jTextField_Grade.setText("");
    }
    
    private void setEmptyJpanel2 () {
        jLabel_ID.setText("");
        jLabel_FristName.setText("");
        jLabel_LastName.setText("");
        jLabel_EnrollmentDate.setText("");
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
            java.util.logging.Logger.getLogger(UI_StudentGrade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_StudentGrade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_StudentGrade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_StudentGrade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_StudentGrade().setVisible(true);
            }
        });
    }

    public void addOnlineCourseDataToJcomboboxCourse () {
        ArrayList<DTO_OnlineCourse> arrayListOnlineCourse = new ArrayList<DTO_OnlineCourse>() ;
        arrayListOnlineCourse = bLL_StudentGrade.readOnlineCourse();
        for (int i = 0; i<arrayListOnlineCourse.size(); i++) {
            jComboBox_Course.addItem(arrayListOnlineCourse.get(i).getCourseID() + "-" + arrayListOnlineCourse.get(i).getTitle());
        }
    }
    
     public void addOnSiteCourseDataToJcomboboxCourse () {
        ArrayList<DTO_OnSiteCourse> arrayListOnSiteCourse = new ArrayList<DTO_OnSiteCourse>() ;
        arrayListOnSiteCourse = bLL_StudentGrade.readOnSiteCourse();
        for (int i = 0; i<arrayListOnSiteCourse.size(); i++) {
            jComboBox_Course.addItem(arrayListOnSiteCourse.get(i).getCourseID() + "-" + arrayListOnSiteCourse.get(i).getTitle());
        }
    }
     
     public void addDataToTable ( ) {
         
         if (jComboBox_Course.getSelectedItem() != null) {
        String [] course = jComboBox_Course.getSelectedItem().toString().split("-");
         courseID = course[0];
         ArrayList<DTO_StudentGrade> arrayListStudentGrade = new ArrayList<>();
         arrayListStudentGrade = bLL_StudentGrade.readStudentGrade(courseID.trim());
         model = (DefaultTableModel) jTable_StudentGrade.getModel(); 
         model.setRowCount(0);
         for (int i = 0; i<arrayListStudentGrade.size(); i ++ ) {
            Object[] row = {arrayListStudentGrade.get(i).getEnrollmentID(),arrayListStudentGrade.get(i).getStudentId(), arrayListStudentGrade.get(i).getName(), 
                arrayListStudentGrade.get(i).getGrade(), arrayListStudentGrade.get(i).getEnrollmentDate()
            };
              model.addRow(row);
            }
         }
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_ChonStudentdID;
    private javax.swing.JButton jButton_Luu;
    private javax.swing.JButton jButton_ResetJtable;
    private javax.swing.JButton jButton_Them;
    private javax.swing.JButton jButton_TimKiem;
    private javax.swing.JButton jButton_XemDSSV;
    private javax.swing.JButton jButton_Xoa;
    private javax.swing.JButton jButton_resetThongTin;
    private javax.swing.JComboBox<String> jComboBox_Course;
    private javax.swing.JComboBox<String> jComboBox_OnOff;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Course;
    private javax.swing.JLabel jLabel_EnrollmentDate;
    private javax.swing.JLabel jLabel_EnrollmentDateText;
    private javax.swing.JLabel jLabel_EnrollmentID;
    private javax.swing.JLabel jLabel_FristName;
    private javax.swing.JLabel jLabel_FristNameText;
    private javax.swing.JLabel jLabel_Grade;
    private javax.swing.JLabel jLabel_Header;
    private javax.swing.JLabel jLabel_ID;
    private javax.swing.JLabel jLabel_IDText;
    private javax.swing.JLabel jLabel_LastName;
    private javax.swing.JLabel jLabel_LastNameText;
    private javax.swing.JLabel jLabel_Name;
    private javax.swing.JLabel jLabel_OnOff;
    private javax.swing.JLabel jLabel_StudentID;
    private javax.swing.JLabel jLabel_StudentIDText1;
    private javax.swing.JLabel jLabel_StudentIDText2;
    private javax.swing.JLabel jLabel_TimKiem;
    private javax.swing.JPanel jPanel_Add;
    private javax.swing.JPanel jPanel_Select;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_StudentGrade;
    private javax.swing.JTextField jTextField_EnrollmentID;
    private javax.swing.JTextField jTextField_Grade;
    private javax.swing.JTextField jTextField_StudentID;
    private javax.swing.JTextField jTextField_TimKiem;
    // End of variables declaration//GEN-END:variables
}
