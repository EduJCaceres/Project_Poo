
package Desing;

/**
 *
 * @author leona
 */
public class MenuAdmin1 extends javax.swing.JFrame {

    /**
     * Creates new form MenuAdmin1
     */
    
    public MenuAdmin1() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Administrador");
      
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_NombreUsurio = new javax.swing.JLabel();
        jButtonEntrenadores = new javax.swing.JButton();
        jButtonMatriculas = new javax.swing.JButton();
        jButtonListaAlumnos = new javax.swing.JButton();
        jButtonSedes = new javax.swing.JButton();
        jButtonHorarios = new javax.swing.JButton();
        jButtonCompetencias = new javax.swing.JButton();
        jButtonReturn = new javax.swing.JButton();
        jLabelEntrenador = new javax.swing.JLabel();
        jLabelMatricula = new javax.swing.JLabel();
        jLabelAlumno = new javax.swing.JLabel();
        jLabelSede = new javax.swing.JLabel();
        jLabelHorario = new javax.swing.JLabel();
        jLabelCompetencia = new javax.swing.JLabel();
        jLabel_WallPaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_NombreUsurio.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel_NombreUsurio.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_NombreUsurio.setText("Bienvenido Admin ");
        getContentPane().add(jLabel_NombreUsurio, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, -1, -1));

        jButtonEntrenadores.setIcon(new javax.swing.ImageIcon("C:\\Users\\leona\\Documents\\Gestion-Academia\\Project_Poo\\ProjectPoo\\src\\Image\\EntrenadorLogo.png")); // NOI18N
        jButtonEntrenadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrenadoresActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEntrenadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 120, 100));

        jButtonMatriculas.setIcon(new javax.swing.ImageIcon("C:\\Users\\leona\\Documents\\Gestion-Academia\\Project_Poo\\ProjectPoo\\src\\Image\\Matrícula.png")); // NOI18N
        jButtonMatriculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMatriculasActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMatriculas, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 120, 100));

        jButtonListaAlumnos.setIcon(new javax.swing.ImageIcon("C:\\Users\\leona\\Documents\\Gestion-Academia\\Project_Poo\\ProjectPoo\\src\\Image\\Alumno.png")); // NOI18N
        jButtonListaAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListaAlumnosActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonListaAlumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 120, 100));

        jButtonSedes.setIcon(new javax.swing.ImageIcon("C:\\Users\\leona\\Documents\\Gestion-Academia\\Project_Poo\\ProjectPoo\\src\\Image\\Sede.png")); // NOI18N
        jButtonSedes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSedesActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSedes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 120, 100));

        jButtonHorarios.setIcon(new javax.swing.ImageIcon("C:\\Users\\leona\\Documents\\Gestion-Academia\\Project_Poo\\ProjectPoo\\src\\Image\\horario.png")); // NOI18N
        jButtonHorarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHorariosActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonHorarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 120, 100));

        jButtonCompetencias.setIcon(new javax.swing.ImageIcon("C:\\Users\\leona\\Documents\\Gestion-Academia\\Project_Poo\\ProjectPoo\\src\\Image\\competencias.png")); // NOI18N
        jButtonCompetencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCompetenciasActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCompetencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 120, 100));

        jButtonReturn.setForeground(new java.awt.Color(0, 0, 0));
        jButtonReturn.setIcon(new javax.swing.ImageIcon("C:\\Users\\leona\\Documents\\Gestion-Academia\\Project_Poo\\ProjectPoo\\src\\Image\\return.png")); // NOI18N
        jButtonReturn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButtonReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReturnActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 30));
        jButtonReturn.getAccessibleContext().setAccessibleDescription("");

        jLabelEntrenador.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEntrenador.setText("Lista de Entrenadores");
        getContentPane().add(jLabelEntrenador, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabelMatricula.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMatricula.setText("Matrícula");
        getContentPane().add(jLabelMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, -1, -1));

        jLabelAlumno.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAlumno.setText("Alumnos");
        getContentPane().add(jLabelAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, -1, -1));

        jLabelSede.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSede.setText("Sedes");
        getContentPane().add(jLabelSede, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        jLabelHorario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelHorario.setText("Horario");
        getContentPane().add(jLabelHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, -1, -1));

        jLabelCompetencia.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCompetencia.setText("Competencias");
        getContentPane().add(jLabelCompetencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, -1, -1));

        jLabel_WallPaper.setIcon(new javax.swing.ImageIcon("C:\\Users\\leona\\Documents\\Gestion-Academia\\Project_Poo\\ProjectPoo\\src\\Image\\wallpaperPrincipal.jpg")); // NOI18N
        getContentPane().add(jLabel_WallPaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEntrenadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrenadoresActionPerformed
        // TODO add your handling code here:
        AdminEntrenadores x = new AdminEntrenadores();
        x.setVisible(true);
        x.setLocationRelativeTo(null);
        this.setVisible(false);
                                           
    }//GEN-LAST:event_jButtonEntrenadoresActionPerformed

    private void jButtonMatriculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMatriculasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonMatriculasActionPerformed

    private void jButtonListaAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListaAlumnosActionPerformed
        // TODO add your handling code here:
        AdminMatriculas x = new AdminMatriculas();
        x.setVisible(true);
        x.setLocationRelativeTo(null);
        this.setVisible(false);

    }//GEN-LAST:event_jButtonListaAlumnosActionPerformed

    private void jButtonSedesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSedesActionPerformed
        // TODO add your handling code here:
        AdminSedes x = new AdminSedes();
        x.setVisible(true);
        x.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonSedesActionPerformed


    private void jButtonHorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHorariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonHorariosActionPerformed

    private void jButtonCompetenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCompetenciasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCompetenciasActionPerformed

    private void jButtonReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReturnActionPerformed
        // TODO add your handling code here:
        DesingAdmin x = new DesingAdmin();
        x.setVisible(true);
        x.setLocationRelativeTo(null);
        this.setVisible(false);

    }//GEN-LAST:event_jButtonReturnActionPerformed
/*
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdmin1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCompetencias;
    private javax.swing.JButton jButtonEntrenadores;
    private javax.swing.JButton jButtonHorarios;
    private javax.swing.JButton jButtonListaAlumnos;
    private javax.swing.JButton jButtonMatriculas;
    private javax.swing.JButton jButtonReturn;
    private javax.swing.JButton jButtonSedes;
    private javax.swing.JLabel jLabelAlumno;
    private javax.swing.JLabel jLabelCompetencia;
    private javax.swing.JLabel jLabelEntrenador;
    private javax.swing.JLabel jLabelHorario;
    private javax.swing.JLabel jLabelMatricula;
    private javax.swing.JLabel jLabelSede;
    private javax.swing.JLabel jLabel_NombreUsurio;
    private javax.swing.JLabel jLabel_WallPaper;
    // End of variables declaration//GEN-END:variables
}