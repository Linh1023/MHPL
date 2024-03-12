/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import BLL.BLL_CourseInstructor;
import BLL.BLL_Instructor;
import BLL.CourseInstructor;
import BLL.Instructor;
import BLL.BLL_Course;
import BLL.Course;
import java.awt.Component;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Admin
 */
public class UI_CourseInstructor extends javax.swing.JFrame {

    BLL_CourseInstructor cibll = new BLL_CourseInstructor();

    /**
     * Creates new form GUI
     */
    public UI_CourseInstructor() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        try {
            loadCourseInstructor();
            loadComboboxCourse();
            loadComboboxInstructor();
        } catch (SQLException ex) {
            Logger.getLogger(UI_CourseInstructor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private void loadCourseInstructor() throws SQLException {
        List list = cibll.loadCourseInstructor();
//        DefaultTableModel model = convertCourseInstructor(list);
//        tblPhanCong.setModel(model);
        loadList(list);
        tblPhanCong.getColumn("").setCellRenderer(new ButtonRenderer());
    }

    private void loadComboboxCourse() throws SQLException {
        BLL_Course cbll = new BLL_Course();
        List listCourses = cbll.LoadCourse_No_Frac_page();

        for (int i = 0; i < listCourses.size(); i++) {
            Course c = (Course) listCourses.get(i);
            cbbKhoaHoc.addItem(c.getCourseId() + " - " + c.getTitle());
        }
    }

    private void loadComboboxInstructor() throws SQLException {
        BLL_Instructor insbll = new BLL_Instructor();
        List listInstructors = insbll.loadInstructors();
        for (int i = 0; i < listInstructors.size(); i++) {
            Instructor instructor = (Instructor) listInstructors.get(i);
            cbbGiangVien.addItem(instructor.getPersonID() + " - " + instructor.getFirstName() + " " + instructor.getLastName());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cbbGiangVien = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cbbKhoaHoc = new javax.swing.JComboBox<>();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPhanCong = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cbbTimKiem = new javax.swing.JComboBox<>();
        txtTimKiem = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PHÂN CÔNG GIẢNG DẠY");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INPUT", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 0, 0))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("GIẢNG VIÊN :");

        cbbGiangVien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn giảng viên" }));
        cbbGiangVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbGiangVienActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("KHÓA HỌC :");

        cbbKhoaHoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn khóa học" }));
        cbbKhoaHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbKhoaHocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbbKhoaHoc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbGiangVien, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(118, 118, 118))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbGiangVien, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbKhoaHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        btnThem.setBackground(new java.awt.Color(51, 204, 0));
        btnThem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnThem.setForeground(new java.awt.Color(255, 255, 255));
        btnThem.setText("THÊM");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(255, 0, 0));
        btnXoa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnXoa.setForeground(new java.awt.Color(204, 0, 0));
        btnXoa.setText("XÓA");
        btnXoa.setEnabled(false);
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setBackground(new java.awt.Color(51, 0, 204));
        btnSua.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSua.setForeground(new java.awt.Color(255, 255, 0));
        btnSua.setText("SỬA");
        btnSua.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSua.setEnabled(false);
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnRefresh.setBackground(new java.awt.Color(51, 0, 51));
        btnRefresh.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh.setText("REFRESH");
        btnRefresh.setToolTipText("");
        btnRefresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRefreshMouseClicked(evt);
            }
        });
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        tblPhanCong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã Khóa Học", "Tên Khóa Học", "Mã Giảng Viên", "Tên Giảng Viên", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPhanCong.setFocusTraversalPolicyProvider(true);
        tblPhanCong.getTableHeader().setReorderingAllowed(false);
        tblPhanCong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPhanCongMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPhanCong);
        tblPhanCong.setRowHeight(30);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SEARCH", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(51, 204, 0))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("TÌM KIẾM THEO :");

        cbbTimKiem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tên khóa học", "Tên giảng viên", "Mã khóa học", "Mã giảng viên" }));
        cbbTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbTimKiemActionPerformed(evt);
            }
        });

        txtTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKiemActionPerformed(evt);
            }
        });

        btnTimKiem.setBackground(new java.awt.Color(255, 255, 0));
        btnTimKiem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnTimKiem.setText("TÌM");
        btnTimKiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTimKiemMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(cbbTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 95, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTimKiem)
                    .addComponent(btnTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(btnRefresh)))))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(102, 102, 102)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE))
                .addGap(49, 49, 49))
        );

        jPanel1.getAccessibleContext().setAccessibleName("");
        jPanel1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        if (cbbGiangVien.getSelectedIndex() != 0 && cbbKhoaHoc.getSelectedIndex() != 0) {
            try {
                int courseID = Integer.parseInt(cbbKhoaHoc.getSelectedItem().toString().split(" - ")[0]);
                int personID = Integer.parseInt(cbbGiangVien.getSelectedItem().toString().split(" - ")[0]);
                int result = cibll.addCourseInstructor(courseID, personID);
                if (result > 0) {
                    JOptionPane.showMessageDialog(rootPane, "Thêm thành công!");
                    loadCourseInstructor();
                    cbbGiangVien.setSelectedIndex(0);
                    cbbKhoaHoc.setSelectedIndex(0);
                }
            } catch (SQLException ex) {
                Logger.getLogger(UI_CourseInstructor.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, "Thêm thất bại!");
            }
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        int row = tblPhanCong.getSelectedRow();
        int courseID = (int) tblPhanCong.getValueAt(row, 0);
        String title = (String) tblPhanCong.getValueAt(row, 1);
        int personID = (int) tblPhanCong.getValueAt(row, 2);
        String name = (String) tblPhanCong.getValueAt(row, 3);
        int option = JOptionPane.showConfirmDialog(rootPane,
                "Bạn có muốn xóa phân công có CourseID: " + courseID + " title: " + title + " PersonID: " + personID + " Name: " + name + " ?",
                "Xóa phân công",
                JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            try {
                int result = cibll.deleteCourseInstructor(courseID, personID);
                if (result > 0) {
                    JOptionPane.showMessageDialog(rootPane, "Xóa thành công!");
                    refresh();
                }
            } catch (SQLException ex) {
                Logger.getLogger(UI_CourseInstructor.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, "Xóa thất bại!");
            }

        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        String course = (String) cbbKhoaHoc.getSelectedItem();
        String newIns = (String) cbbGiangVien.getSelectedItem();
        String oldIns = cbbGiangVien.getItemAt(cbbGiangVien.getItemCount() - 1);
        int courseID = Integer.parseInt(course.split(" - ")[0]);
        int oldInsID = Integer.parseInt(oldIns.split(" - ")[0]);
        int newInsID = Integer.parseInt(newIns.split(" - ")[0]);
        int choose = JOptionPane.showConfirmDialog(rootPane,
                "Bạn có muổn thay đổi phân công này?",
                "Sửa phân công",
                JOptionPane.YES_NO_OPTION);
        if (choose == JOptionPane.YES_OPTION) {
            try {
                int result = cibll.updateCourseInstructor(courseID, newInsID, newInsID);
                if (result > 0) {
                    JOptionPane.showMessageDialog(rootPane, "Cập nhật thành công!");
                    refresh();
                }
            } catch (SQLException ex) {
                Logger.getLogger(UI_CourseInstructor.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, "Cập nhật thất bại!");
            }
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void txtTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimKiemActionPerformed

    private void cbbTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbTimKiemActionPerformed

    private void btnTimKiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimKiemMouseClicked
        // TODO add your handling code here:
        int selected = cbbTimKiem.getSelectedIndex();
        String keyword = txtTimKiem.getText().trim();
        if (!keyword.isEmpty()) {
            try {
                List list = cibll.findCourseInstructor(keyword, selected);
                if (!list.isEmpty()) {
                    loadList(list);
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Không tìm thấy phân công!");
                }
            } catch (SQLException ex) {
                Logger.getLogger(UI_CourseInstructor.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Nhập từ khóa vào ô tìm kiếm!");
        }
    }//GEN-LAST:event_btnTimKiemMouseClicked

    private void btnRefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRefreshMouseClicked
        refresh();
    }//GEN-LAST:event_btnRefreshMouseClicked

    private void refresh() {
        try {
            // TODO add your handling code here:
            loadCourseInstructor();
            cbbKhoaHoc.setEnabled(true);
            cbbKhoaHoc.setSelectedIndex(0);
            cbbGiangVien.setSelectedIndex(0);
            btnThem.setEnabled(true);
            btnSua.setEnabled(false);
            btnXoa.setEnabled(false);
        } catch (SQLException ex) {
            Logger.getLogger(UI_CourseInstructor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void cbbGiangVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbGiangVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbGiangVienActionPerformed

    private void cbbKhoaHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbKhoaHocActionPerformed
        // TODO add your handling code here:
        Object selectedInstructor = cbbGiangVien.getSelectedItem();
        cbbGiangVien.removeAllItems();
        cbbGiangVien.addItem("Chọn giảng viên");

        if (cbbKhoaHoc.getSelectedIndex() == 0) {
            try {
                loadComboboxInstructor();
                cbbGiangVien.setSelectedItem(selectedInstructor);
            } catch (SQLException ex) {
                Logger.getLogger(UI_CourseInstructor.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                int courseID = Integer.parseInt(cbbKhoaHoc.getSelectedItem().toString().split(" - ")[0]);
                BLL_Instructor isbll = new BLL_Instructor();
                List list = isbll.listInstructorNotInCI(courseID);
                if (!list.isEmpty()) {
//                    load cobobox giảng viên
                    for (int i = 0; i < list.size(); i++) {
                        Instructor ins = (Instructor) list.get(i);
                        cbbGiangVien.addItem(ins.getPersonID() + " - " + ins.getFirstName() + " " + ins.getLastName());
                    }
                    int selectedPersonID = Integer.parseInt(selectedInstructor.toString().split(" - ")[0]);
                    if (isbll.isInstructorExistInList(list, selectedPersonID)) {
                        cbbGiangVien.setSelectedItem(selectedInstructor);
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(UI_CourseInstructor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NumberFormatException ex) {
                cbbGiangVien.setSelectedIndex(0);
            }

        }
    }//GEN-LAST:event_cbbKhoaHocActionPerformed

    private void tblPhanCongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPhanCongMouseClicked
        // TODO add your handling code here:
        btnThem.setEnabled(false);
        btnXoa.setEnabled(true);
        btnSua.setEnabled(true);
        int col = tblPhanCong.getSelectedColumn();
        int row = tblPhanCong.getSelectedRow();
        cbbKhoaHoc.setSelectedItem(tblPhanCong.getValueAt(row, 0) + " - " + tblPhanCong.getValueAt(row, 1));
        cbbKhoaHoc.setEnabled(false);
        cbbGiangVien.addItem(tblPhanCong.getValueAt(row, 2) + " - " + tblPhanCong.getValueAt(row, 3));
        cbbGiangVien.setSelectedItem(tblPhanCong.getValueAt(row, 2) + " - " + tblPhanCong.getValueAt(row, 3));

//        xem chi tiet
        if (col == 4) {
            BLL_Instructor b = new BLL_Instructor();
            int courseID = Integer.parseInt(tblPhanCong.getValueAt(row, 0).toString());
            int personID = Integer.parseInt(tblPhanCong.getValueAt(row, 2).toString());
            Instructor ins;
            try {
                ins = b.getInstructor(personID);
                Course c = new Course();
                new UI_CourseIntructorDetail(c, ins).setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(UI_CourseInstructor.class.getName()).log(Level.SEVERE, null, ex);
            }
            refresh();
        }
    }//GEN-LAST:event_tblPhanCongMouseClicked

    private void loadList(List list) {
        DefaultTableModel model = (DefaultTableModel) tblPhanCong.getModel();
        model.setRowCount(0);
        for (int i = 0; i < list.size(); i++) {
            CourseInstructor ci = (CourseInstructor) list.get(i);
            model.addRow(new Object[]{ci.getCourseID(), ci.getCourseTitle(), ci.getPersonID(), ci.getPersonName(), "Xem chi tiết"});
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
            java.util.logging.Logger.getLogger(UI_CourseInstructor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_CourseInstructor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_CourseInstructor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_CourseInstructor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_CourseInstructor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbbGiangVien;
    private javax.swing.JComboBox<String> cbbKhoaHoc;
    private javax.swing.JComboBox<String> cbbTimKiem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPhanCong;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}

class ButtonRenderer extends JComponent implements TableCellRenderer {

    private final JButton button;

    public ButtonRenderer() {
        setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
        button = new JButton();
        add(Box.createHorizontalGlue());
        add(button);
        add(Box.createHorizontalGlue());
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        button.setText(String.valueOf(value));
        return this;
    }

}
