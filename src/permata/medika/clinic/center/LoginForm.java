/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package permata.medika.clinic.center;
import java.awt.Color;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class LoginForm extends javax.swing.JFrame {

    /**
     * Creates new form LoginForm
     */
    public LoginForm() {
        initComponents();
        login_content.removeAll();
        login_content.repaint();
        login_content.revalidate();
        login_content.add(panel_welcome);
        login_content.repaint();
        login_content.revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login_content = new javax.swing.JPanel();
        panel_welcome = new javax.swing.JPanel();
        btn_masuk = new javax.swing.JLabel();
        bg_login1 = new javax.swing.JLabel();
        panel_login = new javax.swing.JPanel();
        btn_login = new javax.swing.JLabel();
        tf_password = new javax.swing.JTextField();
        tf_username = new javax.swing.JTextField();
        bg_login = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        login_content.setLayout(null);

        panel_welcome.setLayout(null);

        btn_masuk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_masukMouseClicked(evt);
            }
        });
        panel_welcome.add(btn_masuk);
        btn_masuk.setBounds(160, 490, 210, 50);

        bg_login1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Welcome.png"))); // NOI18N
        bg_login1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bg_login1MouseClicked(evt);
            }
        });
        panel_welcome.add(bg_login1);
        bg_login1.setBounds(0, 0, 1512, 856);

        login_content.add(panel_welcome);
        panel_welcome.setBounds(0, 0, 1510, 860);

        panel_login.setLayout(null);

        btn_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_loginMouseClicked(evt);
            }
        });
        panel_login.add(btn_login);
        btn_login.setBounds(230, 520, 200, 50);

        tf_password.setBackground(new Color(0,0,0,0));
        tf_password.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        tf_password.setBorder(null);
        panel_login.add(tf_password);
        tf_password.setBounds(250, 450, 330, 50);

        tf_username.setBackground(new Color(0,0,0,0));
        tf_username.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        tf_username.setBorder(null);
        panel_login.add(tf_username);
        tf_username.setBounds(250, 360, 330, 50);

        bg_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Login.png"))); // NOI18N
        panel_login.add(bg_login);
        bg_login.setBounds(0, 0, 1512, 856);
        bg_login.getAccessibleContext().setAccessibleName("");

        login_content.add(panel_login);
        panel_login.setBounds(0, 0, 1510, 860);

        getContentPane().add(login_content);
        login_content.setBounds(0, 0, 1510, 860);

        setSize(new java.awt.Dimension(1512, 884));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_masukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_masukMouseClicked
        login_content.removeAll();
        login_content.repaint();
        login_content.revalidate();
        login_content.add(panel_login);
        login_content.repaint();
        login_content.revalidate();
    }//GEN-LAST:event_btn_masukMouseClicked

    private void btn_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loginMouseClicked
        try {
            String username = tf_username.getText();
            String password = tf_password.getText();
            
            String sql = "select * from `tb_karyawan` where username='"+username+"' AND password='"+password+"'";
            java.sql.Connection conn = (Connection) config.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            
            if (res.next()) {          
                String rule = res.getString(8);
                System.out.println(rule);
                if(rule.equals("admin")){
                    MainPage halaman = new MainPage();
                    halaman.getViewAdmin();
                    halaman.setVisible(true);
                    this.setVisible(false);
                }else if(rule.equals("owner")){
                    MainPage halaman = new MainPage();
                    halaman.getViewOwner();
                    halaman.setVisible(true);
                    this.setVisible(false);
                }else{
                    JOptionPane.showMessageDialog(this, "rule tidak ada");
                }
            }else{
                JOptionPane.showMessageDialog(this, "Password atau username salah");
            }
            
        } catch (Exception e) {
            System.err.println("koneksi gagal " + e.getMessage());
        }
        
    }//GEN-LAST:event_btn_loginMouseClicked

    private void bg_login1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bg_login1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bg_login1MouseClicked

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
    private javax.swing.JLabel bg_login1;
    private javax.swing.JLabel btn_login;
    private javax.swing.JLabel btn_masuk;
    private javax.swing.JPanel login_content;
    private javax.swing.JPanel panel_login;
    private javax.swing.JPanel panel_welcome;
    private javax.swing.JTextField tf_password;
    private javax.swing.JTextField tf_username;
    // End of variables declaration//GEN-END:variables
}
