/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package permata.medika.clinic.center;

import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nico
 */
public class PanelRekamMedis extends javax.swing.JPanel {

    /**
     * Creates new form PanelDashboard
     */
    public PanelRekamMedis() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        tabel_data_rm = new javax.swing.JTable();
        bg_pendaftaran = new javax.swing.JLabel();

        setLayout(null);

        tabel_data_rm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        tabel_data_rm.setRowHeight(40);
        jScrollPane2.setViewportView(tabel_data_rm);

        add(jScrollPane2);
        jScrollPane2.setBounds(90, 310, 1090, 460);

        bg_pendaftaran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Panel - Rekam Medis - Admin.png"))); // NOI18N
        add(bg_pendaftaran);
        bg_pendaftaran.setBounds(0, 0, 1276, 856);
    }// </editor-fold>//GEN-END:initComponents

    public void updateTable(List<String[]> data) {
        DefaultTableModel model = (DefaultTableModel) tabel_data_rm.getModel();
        for (String[] rowData : data) {
            model.addRow(rowData);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg_pendaftaran;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable tabel_data_rm;
    // End of variables declaration//GEN-END:variables
}
