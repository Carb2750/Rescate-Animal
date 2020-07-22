
package rescateanimal.Views;


public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoGenero = new javax.swing.ButtonGroup();
        jpPrincipal = new javax.swing.JPanel();
        jbEmpleado = new javax.swing.JLabel();
        jbAdopcion = new javax.swing.JLabel();
        jbProveedor = new javax.swing.JLabel();
        jbAnimal = new javax.swing.JLabel();
        jbVoluntario = new javax.swing.JLabel();
        jbProducto = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jpbtnMenu = new javax.swing.JPanel();
        btnMenu = new javax.swing.JButton();
        jpNulo = new javax.swing.JPanel();
        jpMenu = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(241, 242, 240));
        setMinimumSize(new java.awt.Dimension(887, 466));
        setResizable(false);

        jpPrincipal.setBackground(new java.awt.Color(241, 242, 240));
        jpPrincipal.setPreferredSize(new java.awt.Dimension(1036, 567));
        jpPrincipal.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                jpPrincipalComponentMoved(evt);
            }
        });
        jpPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbEmpleado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Empleados.png"))); // NOI18N
        jbEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbEmpleado.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jbEmpleadoMouseMoved(evt);
            }
        });
        jbEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbEmpleadoMouseExited(evt);
            }
        });
        jpPrincipal.add(jbEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 160, 140));

        jbAdopcion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbAdopcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Adopciones.png"))); // NOI18N
        jbAdopcion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbAdopcion.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jbAdopcionMouseMoved(evt);
            }
        });
        jbAdopcion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbAdopcionMouseExited(evt);
            }
        });
        jpPrincipal.add(jbAdopcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 160, 140));

        jbProveedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Proveedores.png"))); // NOI18N
        jbProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbProveedor.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jbProveedorMouseMoved(evt);
            }
        });
        jbProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbProveedorMouseExited(evt);
            }
        });
        jpPrincipal.add(jbProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 160, 140));

        jbAnimal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbAnimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Animales.png"))); // NOI18N
        jbAnimal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbAnimal.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jbAnimalMouseMoved(evt);
            }
        });
        jbAnimal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbAnimalMouseExited(evt);
            }
        });
        jpPrincipal.add(jbAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 330, 160, 140));

        jbVoluntario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbVoluntario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Voluntarios.png"))); // NOI18N
        jbVoluntario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbVoluntario.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jbVoluntarioMouseMoved(evt);
            }
        });
        jbVoluntario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbVoluntarioMouseExited(evt);
            }
        });
        jpPrincipal.add(jbVoluntario, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 160, 140));

        jbProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Productos.png"))); // NOI18N
        jbProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbProducto.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jbProductoMouseMoved(evt);
            }
        });
        jbProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbProductoMouseExited(evt);
            }
        });
        jpPrincipal.add(jbProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 160, 140));

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(33, 67, 122));
        jLabel16.setText("Animales");
        jpPrincipal.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 480, -1, -1));

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(33, 67, 122));
        jLabel21.setText("Adopción");
        jpPrincipal.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, -1, -1));

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(33, 67, 122));
        jLabel22.setText("Proveedores");
        jpPrincipal.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, -1, -1));

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(33, 67, 122));
        jLabel23.setText("Empleados");
        jpPrincipal.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, -1, -1));

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(33, 67, 122));
        jLabel24.setText("Productos");
        jpPrincipal.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 480, -1, -1));

        jLabel25.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(33, 67, 122));
        jLabel25.setText("Voluntarios");
        jpPrincipal.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 480, -1, -1));

        jpbtnMenu.setBackground(new java.awt.Color(33, 67, 122));
        jpbtnMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu.png"))); // NOI18N
        btnMenu.setBorder(null);
        btnMenu.setContentAreaFilled(false);
        btnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMenuMouseClicked(evt);
            }
        });
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        jpbtnMenu.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 32, 30));

        jpNulo.setBackground(new java.awt.Color(33, 67, 122));

        javax.swing.GroupLayout jpNuloLayout = new javax.swing.GroupLayout(jpNulo);
        jpNulo.setLayout(jpNuloLayout);
        jpNuloLayout.setHorizontalGroup(
            jpNuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        jpNuloLayout.setVerticalGroup(
            jpNuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jpMenu.setBackground(new java.awt.Color(33, 67, 122));
        jpMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Josué Amador");
        jpMenu.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Gerente");
        jpMenu.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        jLabel9.setForeground(new java.awt.Color(73, 189, 235));
        jLabel9.setText("Editar");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpMenu.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Logout.png"))); // NOI18N
        btnLogout.setBorder(null);
        btnLogout.setContentAreaFilled(false);
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpMenu.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 40, 30));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UserMenu.png"))); // NOI18N
        jpMenu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 60, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpbtnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jpNulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jpMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 849, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpbtnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpNulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jpMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuMouseClicked
        int posicion = jpMenu.getX();
        int posicion2 = jpNulo.getX();
        int posicion3 = jpPrincipal.getX();
        
        if(posicion > -2){
            Animacion.Animacion.mover_izquierda(0, -160, 0, 2, jpMenu);
            Animacion.Animacion.mover_izquierda(50, -160, 0, 2, jpNulo);
            Animacion.Animacion.mover_izquierda(216, 130, 0, 2, jpPrincipal);
        }else{
            Animacion.Animacion.mover_derecha(-160, 0, 0, 2, jpMenu);
            Animacion.Animacion.mover_derecha(-160, 50, 0, 2, jpNulo);
            Animacion.Animacion.mover_derecha(-130, 216, 0, 2, jpPrincipal);
        }
    }//GEN-LAST:event_btnMenuMouseClicked

    private void jbAdopcionMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbAdopcionMouseMoved
        jbAdopcion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(33,67,122)));
    }//GEN-LAST:event_jbAdopcionMouseMoved

    private void jbAdopcionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbAdopcionMouseExited
        jbAdopcion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(241,242,240)));
    }//GEN-LAST:event_jbAdopcionMouseExited

    private void jbProveedorMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbProveedorMouseMoved
        jbProveedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(33,67,122)));
    }//GEN-LAST:event_jbProveedorMouseMoved

    private void jbProveedorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbProveedorMouseExited
        jbProveedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(241,242,240)));
    }//GEN-LAST:event_jbProveedorMouseExited

    private void jbEmpleadoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbEmpleadoMouseMoved
        jbEmpleado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(33,67,122)));
    }//GEN-LAST:event_jbEmpleadoMouseMoved

    private void jbEmpleadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbEmpleadoMouseExited
        jbEmpleado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(241,242,240)));
    }//GEN-LAST:event_jbEmpleadoMouseExited

    private void jbProductoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbProductoMouseMoved
        jbProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(33,67,122)));
    }//GEN-LAST:event_jbProductoMouseMoved

    private void jbProductoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbProductoMouseExited
        jbProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(241,242,240)));
    }//GEN-LAST:event_jbProductoMouseExited

    private void jbVoluntarioMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbVoluntarioMouseMoved
        jbVoluntario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(33,67,122)));
    }//GEN-LAST:event_jbVoluntarioMouseMoved

    private void jbVoluntarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbVoluntarioMouseExited
        jbVoluntario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(241,242,240)));
    }//GEN-LAST:event_jbVoluntarioMouseExited

    private void jbAnimalMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbAnimalMouseMoved
        jbAnimal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(33,67,122)));
    }//GEN-LAST:event_jbAnimalMouseMoved

    private void jbAnimalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbAnimalMouseExited
        jbAnimal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(241,242,240)));
    }//GEN-LAST:event_jbAnimalMouseExited

    private void jpPrincipalComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jpPrincipalComponentMoved

    }//GEN-LAST:event_jpPrincipalComponentMoved

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoGenero;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jbAdopcion;
    private javax.swing.JLabel jbAnimal;
    private javax.swing.JLabel jbEmpleado;
    private javax.swing.JLabel jbProducto;
    private javax.swing.JLabel jbProveedor;
    private javax.swing.JLabel jbVoluntario;
    private javax.swing.JPanel jpMenu;
    private javax.swing.JPanel jpNulo;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JPanel jpbtnMenu;
    // End of variables declaration//GEN-END:variables
}
