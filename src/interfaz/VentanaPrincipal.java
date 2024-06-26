package interfaz;

import dominio.Sistema;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 Milagros Foti 256278
 Alejandro Culñev 276792
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private Sistema modelo;

    /**
     * Creates new form VentanaPrincipal
     *
     * @param unSistema
     */
    public VentanaPrincipal(Sistema unSistema) {
        initComponents();
        this.modelo = unSistema;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnArticulo = new javax.swing.JButton();
        btnCargas = new javax.swing.JButton();
        btnDron = new javax.swing.JButton();
        btnFuncionario = new javax.swing.JButton();
        btnFuncionario1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventana Principal");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        btnArticulo.setText("Articulo");
        btnArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArticuloActionPerformed(evt);
            }
        });

        btnCargas.setText("Cargas");
        btnCargas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargasActionPerformed(evt);
            }
        });

        btnDron.setText("Dron");
        btnDron.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDronActionPerformed(evt);
            }
        });

        btnFuncionario.setText("Funcionario");
        btnFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFuncionarioActionPerformed(evt);
            }
        });

        btnFuncionario1.setText("Registrar Vuelo");
        btnFuncionario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFuncionario1ActionPerformed(evt);
            }
        });

        jButton1.setText("Estadísticas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Terminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnFuncionario1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDron, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCargas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnArticulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnArticulo)
                .addGap(18, 18, 18)
                .addComponent(btnCargas)
                .addGap(18, 18, 18)
                .addComponent(btnDron)
                .addGap(18, 18, 18)
                .addComponent(btnFuncionario)
                .addGap(18, 18, 18)
                .addComponent(btnFuncionario1)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArticuloActionPerformed

        RegistrarArticulo ventana = new RegistrarArticulo(modelo);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnArticuloActionPerformed

    private void btnCargasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargasActionPerformed
        RegistrarCarga ventana = new RegistrarCarga(modelo);
        ventana.setVisible(true);

    }//GEN-LAST:event_btnCargasActionPerformed

    private void btnDronActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDronActionPerformed
        RegistrarDrone ventana = new RegistrarDrone(modelo);
        ventana.setVisible(true);

    }//GEN-LAST:event_btnDronActionPerformed

    private void btnFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFuncionarioActionPerformed
        RegistrarFuncionario ventana = new RegistrarFuncionario(modelo);
        ventana.setVisible(true);

    }//GEN-LAST:event_btnFuncionarioActionPerformed

    private void btnFuncionario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFuncionario1ActionPerformed
        RegistrarVuelo ventana = new RegistrarVuelo(modelo);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnFuncionario1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        EstadisticasVuelos ventana = new EstadisticasVuelos(modelo);
        ventana.setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        serializar();

    }//GEN-LAST:event_formWindowClosing

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        serializar();
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArticulo;
    private javax.swing.JButton btnCargas;
    private javax.swing.JButton btnDron;
    private javax.swing.JButton btnFuncionario;
    private javax.swing.JButton btnFuncionario1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables

    private void serializar() {
        FileOutputStream out;
        try {
            out = new FileOutputStream("salida.sys");
            ObjectOutputStream serializador = new ObjectOutputStream(out);
            serializador.writeObject(this.modelo);
        } catch (FileNotFoundException ex) {
            System.out.println("error");
        } catch (IOException ex) {
            System.out.println("error");
        }

    }
}
