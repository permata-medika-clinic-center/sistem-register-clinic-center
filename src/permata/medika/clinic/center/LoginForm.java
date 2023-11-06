/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package permata.medika.clinic.center;
import java.awt.Color;

/**
 *
 * @author nico
 */
public class LoginForm extends javax.swing.JFrame {

    /**
     * Creates new form LoginForm
     */
    public LoginForm() {
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

        btn_login = new javax.swing.JLabel();
        tf_password = new javax.swing.JTextField();
        tf_username = new javax.swing.JTextField();
        bg_login = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(btn_login);
        btn_login.setBounds(230, 520, 200, 50);

        tf_password.setBackground(new Color(0,0,0,0));
        tf_password.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        tf_password.setBorder(null);
        getContentPane().add(tf_password);
        tf_password.setBounds(250, 450, 330, 50);

        tf_username.setBackground(new Color(0,0,0,0));
        tf_username.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        tf_username.setBorder(null);
        getContentPane().add(tf_username);
        tf_username.setBounds(250, 360, 330, 50);

        bg_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Login.png"))); // NOI18N
        getContentPane().add(bg_login);
        bg_login.setBounds(0, 0, 1512, 856);
        bg_login.getAccessibleContext().setAccessibleName("");

        setSize(new java.awt.Dimension(1512, 884));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg_login;
    private javax.swing.JLabel btn_login;
    private javax.swing.JTextField tf_password;
    private javax.swing.JTextField tf_username;
    // End of variables declaration//GEN-END:variables
}
