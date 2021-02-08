import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Facturas extends javax.swing.JFrame {

    public Facturas() {
        initComponents();
        mostrarDatos("");
    }
    void mostrarDatos(String valor){
     DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID Factura");
        modelo.addColumn("ID Cliente");
        modelo.addColumn("ID Producto");
        modelo.addColumn("Fecha");
        modelo.addColumn("Hora");
        modelo.addColumn("Monto");
        Resultado.setModel(modelo);
    String sql="";
    if(valor.equals(""))
    {
        sql="SELECT * FROM facturas";
    }
    else{
        sql="SELECT * FROM facturas WHERE id_factura='"+valor+"'";
    }
 
    String []datos = new String [6];
        try {
            Statement st = cx.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                modelo.addRow(datos);
            }
            Resultado.setModel(modelo);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu = new javax.swing.JPopupMenu();
        Actualizar = new javax.swing.JMenuItem();
        Eliminar = new javax.swing.JMenuItem();
        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Resultado = new javax.swing.JTable();
        txtFactura = new javax.swing.JTextField();
        txtProducto = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        btnBuscar3 = new javax.swing.JButton();
        btnAgregar3 = new javax.swing.JButton();
        btnActualizar3 = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        btnMostrar3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Cod_Pos = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        txtMonto = new javax.swing.JTextField();
        Cod_Pos1 = new javax.swing.JLabel();

        Actualizar.setText("Actualizar");
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });
        Menu.add(Actualizar);

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        Menu.add(Eliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Facturas");

        jPanel1.setBackground(new java.awt.Color(104, 109, 118));

        Resultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Resultado.setComponentPopupMenu(Menu);
        jScrollPane4.setViewportView(Resultado);

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("ID_Factura");

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("ID_Cliente");

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("ID_Producto");

        btnBuscar3.setBackground(new java.awt.Color(25, 211, 218));
        btnBuscar3.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar3.setText("Buscar");
        btnBuscar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar3ActionPerformed(evt);
            }
        });

        btnAgregar3.setBackground(new java.awt.Color(25, 211, 218));
        btnAgregar3.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar3.setText("Agregar");
        btnAgregar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar3ActionPerformed(evt);
            }
        });

        btnActualizar3.setBackground(new java.awt.Color(25, 211, 218));
        btnActualizar3.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar3.setText("Actualizar");
        btnActualizar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizar3ActionPerformed(evt);
            }
        });

        btnMostrar3.setBackground(new java.awt.Color(25, 211, 218));
        btnMostrar3.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrar3.setText("Mostrar");
        btnMostrar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrar3ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/regresar.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Cod_Pos.setForeground(new java.awt.Color(255, 255, 255));
        Cod_Pos.setText("Hora");

        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Fecha");

        Cod_Pos1.setForeground(new java.awt.Color(255, 255, 255));
        Cod_Pos1.setText("Monto");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnBuscar3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel25)
                                    .addComponent(Cod_Pos)
                                    .addComponent(Cod_Pos1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMonto)
                                    .addComponent(txtFecha)
                                    .addComponent(txtHora)
                                    .addComponent(txtFactura)
                                    .addComponent(txtCliente)
                                    .addComponent(txtProducto))))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMostrar3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregar3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnActualizar3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(208, 208, 208))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel22))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel25))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Cod_Pos)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(btnMostrar3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnActualizar3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cod_Pos1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnBuscar3)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(btnAgregar3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar3ActionPerformed
        try {
            PreparedStatement pst = cx.prepareStatement("INSERT INTO facturas (id_factura, id_cliente, id_producto, fecha, hora, monto) VALUES (?, ?, ?, ?, ?, ?)");
            pst.setString(1, txtFactura.getText());
            pst.setString(2, txtCliente.getText());
            pst.setString(3, txtProducto.getText());
            pst.setString(4, txtFecha.getText());
            pst.setString(5, txtHora.getText());
            pst.setString(6, txtMonto.getText());
            pst.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_btnAgregar3ActionPerformed

    private void btnActualizar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizar3ActionPerformed
        try{
            PreparedStatement up = cx.prepareStatement("UPDATE facturas SET id_factura='"+txtFactura.getText()+"', id_cliente='"+txtCliente.getText()+
                "', id_producto='"+txtProducto.getText()+"', fecha='"+txtFecha.getText()+"', hora='"+txtHora.getText()+"',monto='"+txtMonto.getText()
                +"' WHERE id_factura='"+txtFactura.getText()+"'");
            up.executeUpdate();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_btnActualizar3ActionPerformed

    private void btnMostrar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrar3ActionPerformed
        mostrarDatos("");
    }//GEN-LAST:event_btnMostrar3ActionPerformed

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
        int fila = Resultado.getSelectedRow();
            if (fila>=0){
                    txtFactura.setText(Resultado.getValueAt(fila,0).toString());
                    txtCliente.setText(Resultado.getValueAt(fila,1).toString());
                    txtProducto.setText(Resultado.getValueAt(fila,2).toString());
                    txtFecha.setText(Resultado.getValueAt(fila,3).toString());
                    txtHora.setText(Resultado.getValueAt(fila,4).toString());
                    txtMonto.setText(Resultado.getValueAt(fila,5).toString());
            }else{
             JOptionPane.showMessageDialog(null,"No seleciono fila");
            }
    }//GEN-LAST:event_ActualizarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        int fila= Resultado.getSelectedRow();
        String id="";
        id=Resultado.getValueAt(fila,0).toString();
        try{
          PreparedStatement del = cx.prepareStatement("DELETE FROM facturas WHERE id_factura='"+id+"'");
          del.executeUpdate();
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_EliminarActionPerformed

    private void btnBuscar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar3ActionPerformed
        mostrarDatos(txtBuscar.getText());
    }//GEN-LAST:event_btnBuscar3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        MenuI m = new MenuI();
        m.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Empleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Actualizar;
    private javax.swing.JLabel Cod_Pos;
    private javax.swing.JLabel Cod_Pos1;
    private javax.swing.JMenuItem Eliminar;
    private javax.swing.JPopupMenu Menu;
    private javax.swing.JTable Resultado;
    private javax.swing.JButton btnActualizar3;
    private javax.swing.JButton btnAgregar3;
    private javax.swing.JButton btnBuscar3;
    private javax.swing.JButton btnMostrar3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtFactura;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtProducto;
    // End of variables declaration//GEN-END:variables
    ConexionDB cone= new ConexionDB();
    Connection cx= cone.conexion();
}
