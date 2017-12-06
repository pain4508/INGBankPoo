/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import dao.ClienteDao;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.ClienteLogica;
import logica.NacionalidadLogica;
import logica.SexoLogica;

/**
 *
 * @author griselda
 */
public class JIFraCliente
        extends javax.swing.JInternalFrame {

    /**
     * Creates new form JIFraCliente
     */
    public JIFraCliente() {
        initComponents();
       
          llenarCbS();
          llenarCbN();
          habilitarBotones(true,false,false,false,false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTFDireccion = new javax.swing.JTextField();
        jTFTelefono = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jBtnNuevo = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jBtnGuardar = new javax.swing.JButton();
        Direccion = new javax.swing.JLabel();
        jBtnModificar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jBtnEliminar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblCliente = new javax.swing.JTable();
        jTFIdCliente = new javax.swing.JTextField();
        jTFNombres = new javax.swing.JTextField();
        jCboSexo = new javax.swing.JComboBox<>();
        jTFApellidos = new javax.swing.JTextField();
        jCboNacionalidad = new javax.swing.JComboBox<>();
        jTFDireccion1 = new javax.swing.JTextField();
        jTFTelefono1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jBtnNuevo1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jBtnGuardar1 = new javax.swing.JButton();
        Direccion1 = new javax.swing.JLabel();
        jBtnModificar1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jBtnEliminar1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTblCliente1 = new javax.swing.JTable();
        jTFIdCliente1 = new javax.swing.JTextField();
        jTFNombres1 = new javax.swing.JTextField();
        jCboSexo1 = new javax.swing.JComboBox<>();
        jTFApellidos1 = new javax.swing.JTextField();
        jCboNacionalidad1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTFDireccion2 = new javax.swing.JTextField();
        jTFTelefono2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jBtnGuardar2 = new javax.swing.JButton();
        Direccion2 = new javax.swing.JLabel();
        jBtnModificar2 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jBtnEliminar2 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTblCliente2 = new javax.swing.JTable();
        jTFIdCliente2 = new javax.swing.JTextField();
        jTFNombres2 = new javax.swing.JTextField();
        jCboSexo2 = new javax.swing.JComboBox<>();
        jTFApellidos2 = new javax.swing.JTextField();
        jCboNacionalidad2 = new javax.swing.JComboBox<>();
        jBtnN = new javax.swing.JButton();

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("IdCliente");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Pais Origen");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombres");

        jBtnNuevo.setText("Nuevo");
        jBtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNuevoActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Apellidos");

        jBtnGuardar.setText("Guardar");
        jBtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGuardarActionPerformed(evt);
            }
        });

        Direccion.setForeground(new java.awt.Color(255, 255, 255));
        Direccion.setText("Direccion");

        jBtnModificar.setText("Modificar");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sexo");

        jBtnEliminar.setText("Eliminar");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Telefono");

        jTblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "IdCliente", "Nombres", "Apellidos", "Direccion", "Sexo", "Telefono", "Nacionalidad"
            }
        ));
        jTblCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTblClienteMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTblCliente);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("IdCliente");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Pais Origen");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Nombres");

        jBtnNuevo1.setText("Nuevo");
        jBtnNuevo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNuevo1ActionPerformed(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Apellidos");

        jBtnGuardar1.setText("Guardar");
        jBtnGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGuardar1ActionPerformed(evt);
            }
        });

        Direccion1.setForeground(new java.awt.Color(255, 255, 255));
        Direccion1.setText("Direccion");

        jBtnModificar1.setText("Modificar");

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Sexo");

        jBtnEliminar1.setText("Eliminar");

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Telefono");

        jTblCliente1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "IdCliente", "Nombres", "Apellidos", "Direccion", "Sexo", "Telefono", "Nacionalidad"
            }
        ));
        jTblCliente1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTblCliente1MousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTblCliente1);

        setClosable(true);
        setIconifiable(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("MANTENIMIENTO CLIENTES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("IdCliente");

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Pais Origen");

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Nombres");

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Apellidos");

        jBtnGuardar2.setIcon(new javax.swing.ImageIcon("/Users/griselda/Documents/GitHub/INGBankPoo/INGBank/src/imagenes/save.png")); // NOI18N
        jBtnGuardar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGuardar2ActionPerformed(evt);
            }
        });

        Direccion2.setForeground(new java.awt.Color(255, 255, 255));
        Direccion2.setText("Direccion");

        jBtnModificar2.setIcon(new javax.swing.ImageIcon("/Users/griselda/Documents/GitHub/INGBankPoo/INGBank/src/imagenes/edit.png")); // NOI18N

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Sexo");

        jBtnEliminar2.setIcon(new javax.swing.ImageIcon("/Users/griselda/Documents/GitHub/INGBankPoo/INGBank/src/imagenes/delete.png")); // NOI18N

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Telefono");

        jTblCliente2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "IdCliente", "Nombres", "Apellidos", "Direccion", "Sexo", "Telefono", "Nacionalidad"
            }
        ));
        jTblCliente2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTblCliente2MousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(jTblCliente2);

        jBtnN.setIcon(new javax.swing.ImageIcon("/Users/griselda/Documents/GitHub/INGBankPoo/INGBank/src/imagenes/new.png")); // NOI18N
        jBtnN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(32, 32, 32))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel16)
                                    .addComponent(Direccion2))
                                .addGap(31, 31, 31)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFIdCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTFNombres2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCboSexo2, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTFDireccion2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jBtnN)
                                        .addGap(18, 18, 18)
                                        .addComponent(jBtnGuardar2)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel19)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jTFTelefono2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jCboNacionalidad2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel15)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel17)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jTFApellidos2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addComponent(jBtnModificar2)
                                        .addGap(39, 39, 39)
                                        .addComponent(jBtnEliminar2))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTFIdCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jTFNombres2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jTFApellidos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jTFTelefono2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Direccion2)
                    .addComponent(jTFDireccion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel15)
                    .addComponent(jCboSexo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCboNacionalidad2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jBtnGuardar2)
                        .addComponent(jBtnModificar2, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jBtnEliminar2, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jBtnN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void llenarCbS() {
    try{
        ClienteDao dao = new ClienteDao();   
        jCboSexo2.removeAllItems(); 

        List<SexoLogica> miComboSexo;

        miComboSexo = dao.getComboSexo();

        for(int i=0; i<miComboSexo.size();i++){


            jCboSexo2.addItem(miComboSexo.get(i).getSexo());
            
         }
            
    }catch(SQLException e){
        JOptionPane.showMessageDialog(null, e);
    }  
    
  
} 
private void llenarCbN(){
       try{
        ClienteDao dao = new ClienteDao();   
        jCboNacionalidad2.removeAllItems();

        List<NacionalidadLogica> miComboNacionalidad;

        miComboNacionalidad = dao.getComboNacionalidad();

        for(int i=0; i<miComboNacionalidad.size();i++){

            jCboNacionalidad2.addItem(miComboNacionalidad.get(i).getNacionalidadcol());
        }
        
        
    }catch(SQLException e){
        JOptionPane.showMessageDialog(null, e);
    }
    
}

      private void habilitarBotones(boolean nuevo, boolean guardar, boolean modificar, boolean eliminar, boolean textField){
        jBtnN.setEnabled(nuevo);
        jBtnGuardar2.setEnabled(guardar);
        jBtnModificar2.setEnabled(modificar);
        jBtnEliminar2.setEnabled(eliminar);
        jTFNombres2.setEditable(textField);
        jTFApellidos2.setEditable(textField);
        jCboSexo2.setEditable(textField);
        jTFDireccion2.setEditable(textField);
        jTFTelefono2.setEditable(textField);
        jCboNacionalidad2.setEditable(textField);
    }
      
     
      
  private void limpiar(){
       jTFIdCliente2.setText("");
       jTFNombres2.setText("");
       jTFApellidos2.setText("");
       jTFDireccion2.setText("");
       jTFTelefono2.setText("");
      
       
    }
  
    private void investigarCorrelativo() throws SQLException{
        ClienteDao dao = new ClienteDao();
        ClienteLogica c1 = new ClienteLogica();
        c1.setIdCliente(dao.autoIncrementar());
        jTFIdCliente2.setText(String.valueOf(c1.getIdCliente()));
        
    }
     private boolean verificarTextField(){
        boolean estado;
        
        if(jTFNombres2.getText().isEmpty()  || jTFDireccion2.getText().isEmpty() || jTFTelefono2.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingrese los campos vacios");
            estado = false;    
        }else{
            estado = true;
        }
        return estado;
    }
    private void guardarCliente(){
        
        ClienteLogica c1 = new ClienteLogica();
            if(jCboSexo2.getSelectedItem()=="Masculino"){
            
                   c1.setIdSexo(Integer.parseInt(this.jCboSexo2.toString()));
                    
         }else if(jCboSexo2.getSelectedItem()=="Femenino"){
            
               c1.setIdSexo(Integer.parseInt(this.jCboSexo2.toString()));
        }else if(jCboNacionalidad2.getSelectedItem()=="Honduras"){
            
              c1.setIdNacionalidad(Integer.parseInt(this.jCboNacionalidad2.toString()));
        }else if(jCboNacionalidad2.getSelectedItem()=="Guatemala"){
            
              c1.setIdNacionalidad(Integer.parseInt(this.jCboNacionalidad2.toString()));
        }else if(jCboNacionalidad2.getSelectedItem()=="Nicaragua"){
            
              c1.setIdNacionalidad(Integer.parseInt(this.jCboNacionalidad2.toString()));
        }else if(jCboNacionalidad2.getSelectedItem()=="Costarica"){
            
              c1.setIdNacionalidad(Integer.parseInt(this.jCboNacionalidad2.toString()));
        }else if(jCboNacionalidad2.getSelectedItem()=="Estados Unidos"){
            
              c1.setIdNacionalidad(Integer.parseInt(this.jCboNacionalidad2.toString()));
        }else if(jCboNacionalidad2.getSelectedItem()=="Mexico"){
            
              c1.setIdNacionalidad(Integer.parseInt(this.jCboNacionalidad2.toString()));
        }else if(jCboNacionalidad2.getSelectedItem()=="Panama"){
            
              c1.setIdNacionalidad(Integer.parseInt(this.jCboNacionalidad2.toString()));
        }else if(jCboNacionalidad2.getSelectedItem()=="Canada"){
            
              c1.setIdNacionalidad(Integer.parseInt(this.jCboNacionalidad2.toString()));
        }else if(jCboNacionalidad2.getSelectedItem()=="Otros"){
            
              c1.setIdNacionalidad(Integer.parseInt(this.jCboNacionalidad2.toString()));
        }
         
        
        c1.setIdCliente(Integer.parseInt(this.jTFIdCliente2.getText()));
        c1.setNombres(this.jTFNombres2.getText());
        c1.setApellidos(this.jTFApellidos2.getText());
        c1.setDireccion(this.jTFDireccion2.getText());
       
        c1.setTelefono(this.jTFTelefono2.getText());
       
             
        try {
            ClienteDao dao = new ClienteDao();
            dao.insertarcliente(c1);
            JOptionPane.showMessageDialog(null, "Registro almacenado satisfactoriamente.");
            limpiar();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al almacenar el Cliente." + e);
        }
    }
   private void limpiarTabla(){
      
        DefaultTableModel temp = (DefaultTableModel) this.jTblCliente.getModel(); //
        
        // Limpiar los datos de la tabla.
        while (temp.getRowCount() > 0) {
            temp.removeRow(0);
     }
    }
         
    private void llenarTabla() throws SQLException{
        limpiarTabla();
        
        ClienteDao dao = new ClienteDao();
        List<ClienteLogica> miLista = dao.getLista();
        
        DefaultTableModel temp = (DefaultTableModel) this.jTblCliente2.getModel(); 
        
        for(ClienteLogica c1:miLista){
            //Se crea un array que sera una de las filas de la tabla.
            Object[] fila = new Object[3]; // Hay 2 columnas en la tabla
            // Se rellena cada posicion del array con una de las columnas de la tabla en base de datos.
            
                fila[0] = c1.getIdCliente();
                fila[1] = c1.getNombres();
                fila[2] = c1.getApellidos();
                fila[3] = c1.getDireccion();
                fila[4] = c1.getIdSexo();
                fila[5] = c1.getTelefono();
                fila[6] = c1.getIdNacionalidad();
                temp.addRow(fila);
        }   
    }

    
        
    private void lineaSeleccionada() {
        if (this.jTblCliente2.getSelectedRow() != -1) {
            //Habilito los controles para que se pueda hacer una accion.
            if (this.jTblCliente2.isEnabled() == true) {
                this.jTFIdCliente2.setText(String.valueOf(this.jTblCliente2.getValueAt(jTblCliente2.getSelectedRow(), 0)));
                this.jTFNombres2.setText(String.valueOf(this.jTblCliente2.getValueAt(jTblCliente2.getSelectedRow(), 1)));
                this.jTFApellidos2.setText(String.valueOf(this.jTblCliente2.getValueAt(jTblCliente2.getSelectedRow(), 2)));
                this.jTFDireccion2.setText(String.valueOf(this.jTblCliente2.getValueAt(jTblCliente2.getSelectedRow(), 3)));
                this.jTFTelefono2.setText(String.valueOf(this.jTblCliente2.getValueAt(jTblCliente2.getSelectedRow(), 6)));
                
            }
        } else {
            limpiar();
        }
    }
    private void jBtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNuevoActionPerformed
   
    }//GEN-LAST:event_jBtnNuevoActionPerformed

    private void jBtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGuardarActionPerformed
        if(verificarTextField()==true){
            guardarCliente();

            try {
                llenarTabla();
            } catch (SQLException ex) {
                Logger.getLogger(JIFraCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
            habilitarBotones(true, false, false, false, false);
        }
    }//GEN-LAST:event_jBtnGuardarActionPerformed

    private void jTblClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTblClienteMousePressed
        lineaSeleccionada();
        habilitarBotones(false, false, true, true, true);
    }//GEN-LAST:event_jTblClienteMousePressed

    private void jBtnNuevo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNuevo1ActionPerformed
   
    }//GEN-LAST:event_jBtnNuevo1ActionPerformed

    private void jBtnGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGuardar1ActionPerformed
        if(verificarTextField()==true){
            guardarCliente();

            try {
                llenarTabla();
            } catch (SQLException ex) {
                Logger.getLogger(JIFraCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
            habilitarBotones(true, false, false, false, false);
        }
    }//GEN-LAST:event_jBtnGuardar1ActionPerformed

    private void jTblCliente1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTblCliente1MousePressed
        lineaSeleccionada();
        habilitarBotones(false, false, true, true, true);
    }//GEN-LAST:event_jTblCliente1MousePressed

    private void jBtnGuardar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGuardar2ActionPerformed
        if(verificarTextField()==true){
            guardarCliente();

            try {
                llenarTabla();
            } catch (SQLException ex) {
                Logger.getLogger(JIFraCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
            habilitarBotones(true, false, false, false, false);
        }
    }//GEN-LAST:event_jBtnGuardar2ActionPerformed

    private void jTblCliente2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTblCliente2MousePressed
        lineaSeleccionada();
        habilitarBotones(false, false, true, true, true);
    }//GEN-LAST:event_jTblCliente2MousePressed

    private void jBtnNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNActionPerformed
          limpiar();
        habilitarBotones(false, true, false, false, true);
        jTFNombres2.requestFocus();
        try {
            investigarCorrelativo();
        } catch (SQLException ex) {
            Logger.getLogger(JIFraCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBtnNActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Direccion;
    private javax.swing.JLabel Direccion1;
    private javax.swing.JLabel Direccion2;
    private javax.swing.JButton jBtnEliminar;
    private javax.swing.JButton jBtnEliminar1;
    private javax.swing.JButton jBtnEliminar2;
    private javax.swing.JButton jBtnGuardar;
    private javax.swing.JButton jBtnGuardar1;
    private javax.swing.JButton jBtnGuardar2;
    private javax.swing.JButton jBtnModificar;
    private javax.swing.JButton jBtnModificar1;
    private javax.swing.JButton jBtnModificar2;
    private javax.swing.JButton jBtnN;
    private javax.swing.JButton jBtnNuevo;
    private javax.swing.JButton jBtnNuevo1;
    private javax.swing.JComboBox<String> jCboNacionalidad;
    private javax.swing.JComboBox<String> jCboNacionalidad1;
    private javax.swing.JComboBox<String> jCboNacionalidad2;
    private javax.swing.JComboBox<String> jCboSexo;
    private javax.swing.JComboBox<String> jCboSexo1;
    private javax.swing.JComboBox<String> jCboSexo2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTFApellidos;
    private javax.swing.JTextField jTFApellidos1;
    private javax.swing.JTextField jTFApellidos2;
    private javax.swing.JTextField jTFDireccion;
    private javax.swing.JTextField jTFDireccion1;
    private javax.swing.JTextField jTFDireccion2;
    private javax.swing.JTextField jTFIdCliente;
    private javax.swing.JTextField jTFIdCliente1;
    private javax.swing.JTextField jTFIdCliente2;
    private javax.swing.JTextField jTFNombres;
    private javax.swing.JTextField jTFNombres1;
    private javax.swing.JTextField jTFNombres2;
    private javax.swing.JTextField jTFTelefono;
    private javax.swing.JTextField jTFTelefono1;
    private javax.swing.JTextField jTFTelefono2;
    private javax.swing.JTable jTblCliente;
    private javax.swing.JTable jTblCliente1;
    private javax.swing.JTable jTblCliente2;
    // End of variables declaration//GEN-END:variables
}
