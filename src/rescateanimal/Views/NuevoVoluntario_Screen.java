/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rescateanimal.Views;

import com.github.lgooddatepicker.components.DatePicker;
import com.github.lgooddatepicker.components.DatePickerSettings;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;
import rescateanimal.Controllers.Conexion;
import rescateanimal.Models.Voluntario;
import rescateanimal.Utils.Validaciones;

/**
 *
 * @author chris
 */
public class NuevoVoluntario_Screen extends javax.swing.JFrame {

    /**
     * Creates new form NuevoVoluntario_Screen
     */
    Conexion con = new Conexion();
    DatePicker datePicker;
    DatePicker datePicker2;
    DatePicker datePicker3;
    private String selected;
    private int turno = -1;
    Validaciones val = new Validaciones();

    public NuevoVoluntario_Screen() {
        initComponents();

        this.con.conector();

        URL dateImageURL = NuevoVoluntario_Screen.class.getResource("../Images/calendar-outline.png");
        Image dateExampleImage = Toolkit.getDefaultToolkit().getImage(dateImageURL);
        ImageIcon dateIcon = new ImageIcon(dateExampleImage);

        DatePickerSettings dateSettings = new DatePickerSettings();
        dateSettings.setAllowKeyboardEditing(false);
        datePicker = new DatePicker(dateSettings);
        dateSettings.setDateRangeLimits(LocalDate.ofYearDay(1955, 1), LocalDate.ofYearDay(2008, 1));
        dateSettings.setDefaultYearMonth(YearMonth.of(1995, Month.JANUARY));
        JButton datePickerButton = datePicker.getComponentToggleCalendarButton();
        datePickerButton.setText("");
        datePickerButton.setIcon(dateIcon);
        datePickerButton.setBorderPainted(false);
        datePickerButton.setBackground(new Color(241, 242, 240));
        datePickerButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        txtFechaNacimiento.add(datePicker);

        DatePickerSettings dateSettings2 = new DatePickerSettings();
        dateSettings2.setAllowKeyboardEditing(false);
        datePicker2 = new DatePicker(dateSettings2);
        dateSettings2.setDateRangeLimits(LocalDate.now(), LocalDate.MAX);
        datePicker2.setDate(LocalDate.now());
        JButton datePickerButton2 = datePicker2.getComponentToggleCalendarButton();
        datePickerButton2.setText("");
        datePickerButton2.setIcon(dateIcon);
        datePickerButton2.setBorderPainted(false);
        datePickerButton2.setBackground(new Color(241, 242, 240));
        datePickerButton2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        txtFechaInicio.add(datePicker2);

        DatePickerSettings dateSettings3 = new DatePickerSettings();
        dateSettings3.setAllowKeyboardEditing(false);
        datePicker3 = new DatePicker(dateSettings3);
        dateSettings3.setDateRangeLimits(LocalDate.now(), LocalDate.MAX);
        JButton datePickerButton3 = datePicker3.getComponentToggleCalendarButton();
        datePickerButton3.setText("");
        datePickerButton3.setIcon(dateIcon);
        datePickerButton3.setBorderPainted(false);
        datePickerButton3.setBackground(new Color(241, 242, 240));
        datePickerButton3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        txtFechaFinal.add(datePicker3);

        rbDiurno.setActionCommand("diurno");
        rbNocturno.setActionCommand("nocturno");

        this.lbError.setVisible(false);
        
        this.txtNombre.setTransferHandler(null);
        this.txtApellido.setTransferHandler(null);
        this.txtCorreo.setTransferHandler(null);
        this.txtTelefono.setTransferHandler(null);
    }

    private void group() {
        String selected = btnGroupTurno.getSelection().getActionCommand();

        if (selected == "diurno") {
            turno = 1;
        } else {
            turno = 2;
        }

        this.selected = selected;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupTurno = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        lbTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtFechaNacimiento = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        txtIndentidad = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtFechaInicio = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtFechaFinal = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        rbDiurno = new javax.swing.JRadioButton();
        rbNocturno = new javax.swing.JRadioButton();
        btnAgregar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        lbError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1036, 550));
        setMinimumSize(new java.awt.Dimension(1036, 550));
        setPreferredSize(new java.awt.Dimension(1036, 550));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(241, 242, 240));

        jPanel2.setBackground(new java.awt.Color(33, 67, 122));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Christian Rápalo");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Gerente");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        jLabel9.setForeground(new java.awt.Color(73, 189, 235));
        jLabel9.setText("Editar");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rescateanimal/Images/person-outline.png"))); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jButton2.setBackground(new java.awt.Color(33, 67, 122));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rescateanimal/Images/arrow-back-circle-outline.png"))); // NOI18N
        jButton2.setText("Salir");
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusPainted(false);
        jButton2.setIconTextGap(8);
        jButton2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton2.setRequestFocusEnabled(false);
        jButton2.setVerifyInputWhenFocusTarget(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 100, 40));

        lbTitle.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(48, 97, 176));
        lbTitle.setText("Nuevo Voluntario");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Nombre");

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Apellido");

        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Identidad");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Fecha de Nacimiento");

        txtFechaNacimiento.setLayout(new javax.swing.BoxLayout(txtFechaNacimiento, javax.swing.BoxLayout.LINE_AXIS));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Correo Electrónico");

        try {
            txtIndentidad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####-#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtIndentidad.setMaximumSize(new java.awt.Dimension(0, 0));
        txtIndentidad.setMinimumSize(new java.awt.Dimension(0, 0));
        txtIndentidad.setPreferredSize(new java.awt.Dimension(0, 0));
        txtIndentidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIndentidadKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIndentidadKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Telefono:");

        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Fecha de Inicio Voluntariado:");

        txtFechaInicio.setLayout(new javax.swing.BoxLayout(txtFechaInicio, javax.swing.BoxLayout.LINE_AXIS));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Fecha Final Voluntariado:");

        txtFechaFinal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtFechaFinal.setLayout(new javax.swing.BoxLayout(txtFechaFinal, javax.swing.BoxLayout.LINE_AXIS));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Turno"));

        btnGroupTurno.add(rbDiurno);
        rbDiurno.setText("Diurno");
        rbDiurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDiurnoActionPerformed(evt);
            }
        });

        btnGroupTurno.add(rbNocturno);
        rbNocturno.setText("Nocturno");
        rbNocturno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNocturnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(rbDiurno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(rbNocturno)
                .addGap(39, 39, 39))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbDiurno)
                    .addComponent(rbNocturno))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnRegresar.setBackground(new java.awt.Color(241, 242, 240));
        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rescateanimal/Images/chevron-back.png"))); // NOI18N
        btnRegresar.setBorderPainted(false);
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar.setFocusPainted(false);
        btnRegresar.setMaximumSize(new java.awt.Dimension(30, 30));
        btnRegresar.setMinimumSize(new java.awt.Dimension(30, 30));
        btnRegresar.setPreferredSize(new java.awt.Dimension(30, 30));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        lbError.setForeground(new java.awt.Color(153, 0, 0));
        lbError.setText("Ya existe un voluntario con esa identidad. Verifique e intente de nuevo.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(87, 87, 87)
                                        .addComponent(jLabel2))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel6)
                                                .addComponent(jLabel5))
                                            .addGap(12, 12, 12)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtCorreo)
                                                .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(79, 79, 79)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel1))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtIndentidad, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(120, 120, 120)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)
                                    .addComponent(txtFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnAgregar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnCancelar))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(178, 178, 178)
                                .addComponent(lbTitle)))
                        .addContainerGap(18, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbError)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(lbTitle))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtIndentidad, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbError)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnCancelar))
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        if (this.datePicker.getDate() != null && this.datePicker2.getDate() != null && this.datePicker3.getDate() != null && !this.txtNombre.getText().isEmpty() && !this.txtApellido.getText().isEmpty() && !this.txtCorreo.getText().isEmpty() && !this.txtIndentidad.getText().isEmpty() && !this.txtTelefono.getText().isEmpty() && this.turno != -1) {
            String correo = this.txtCorreo.getText();
            if (this.val.validarEmail(correo)) {
                Voluntario voluntario = new Voluntario("", this.txtIndentidad.getText(), this.txtNombre.getText(), this.txtApellido.getText(), this.datePicker.getDate(), this.txtTelefono.getText(), this.txtCorreo.getText(), this.datePicker2.getDate(), this.datePicker3.getDate(), this.turno, 1);
                this.con.addVoluntario(voluntario);
                VoluntarioMenu_Screen voluntarioMenuScreen = new VoluntarioMenu_Screen();
                voluntarioMenuScreen.setVisible(true);
                this.setVisible(false);
            } else {
                this.lbError.setText("El correo es érroneo");
                this.lbError.setVisible(true);
            }
        } else {
            this.lbError.setText("Hay campos vacíos");
            this.lbError.setVisible(true);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        VoluntarioMenu_Screen voluntarioMenu = new VoluntarioMenu_Screen();
        voluntarioMenu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        VoluntarioMenu_Screen voluntarioMenuScreen = new VoluntarioMenu_Screen();
        voluntarioMenuScreen.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void rbDiurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDiurnoActionPerformed
        // TODO add your handling code here:
        this.group();
    }//GEN-LAST:event_rbDiurnoActionPerformed

    private void rbNocturnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNocturnoActionPerformed
        // TODO add your handling code here:
        this.group();
    }//GEN-LAST:event_rbNocturnoActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // TODO add your handling code here:
        Object source = evt.getSource();
        JTextField txtField = (JTextField) source;
        if (!this.val.validarLetras(Character.toString(evt.getKeyChar())) || !this.val.validarMaximo(Double.valueOf(txtField.getText().length()), 49)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        // TODO add your handling code here:
        if (!this.val.validarNumeros(Character.toString(evt.getKeyChar())) || !this.val.validarMaximo(Double.valueOf(this.txtTelefono.getText().length()), 8)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtIndentidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIndentidadKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_txtIndentidadKeyTyped

    private void txtIndentidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIndentidadKeyReleased
        // TODO add your handling code here:
        ArrayList<Voluntario> voluntarioNuevo = this.con.getFiltroVoluntario("identidad_voluntario", this.txtIndentidad.getText());
        if (!voluntarioNuevo.isEmpty()) {
            Boolean isActive = false;
            for (int i = 0; i < voluntarioNuevo.size(); i++) {
                if (voluntarioNuevo.get(i).getEstado() == 1) {
                    isActive = true;
                    break;
                }
            }
            int llenar = -1;
            if (!isActive) {
                llenar = JOptionPane.showConfirmDialog(null, "¿El voluntario ya existe pero está desactivado, desea activarlo?", "Voluntario ya existente", JOptionPane.YES_NO_OPTION);
            } else {
                JOptionPane.showMessageDialog(null, "El voluntario ya está activado, no puede volver a ingresarlo", "Voluntario ya activo", JOptionPane.OK_OPTION, null);
            }
            if (llenar == 0) {
                int lengthVoluntario = voluntarioNuevo.size();
                this.txtNombre.setText(voluntarioNuevo.get(lengthVoluntario - 1).getNombre());
                this.txtApellido.setText(voluntarioNuevo.get(lengthVoluntario - 1).getApellido());
                this.txtCorreo.setText(voluntarioNuevo.get(lengthVoluntario - 1).getCorreo());
                this.txtTelefono.setText(voluntarioNuevo.get(lengthVoluntario - 1).getNumTelefono());
                this.datePicker.setDate(voluntarioNuevo.get(lengthVoluntario - 1).getFechaNacimiento());
                this.turno = voluntarioNuevo.get(lengthVoluntario - 1).getTurno();
                if (this.turno == 1) {
                    this.rbDiurno.setSelected(true);
                } else {
                    this.rbNocturno.setSelected(true);
                }
            } else {
                this.txtIndentidad.setText("");
            }
        }
    }//GEN-LAST:event_txtIndentidadKeyReleased

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
            java.util.logging.Logger.getLogger(NuevoVoluntario_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevoVoluntario_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevoVoluntario_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevoVoluntario_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevoVoluntario_Screen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.ButtonGroup btnGroupTurno;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbError;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JRadioButton rbDiurno;
    private javax.swing.JRadioButton rbNocturno;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JPanel txtFechaFinal;
    private javax.swing.JPanel txtFechaInicio;
    private javax.swing.JPanel txtFechaNacimiento;
    private javax.swing.JFormattedTextField txtIndentidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
