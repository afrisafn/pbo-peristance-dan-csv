package pbo7;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;
import pbo9.DaftarBuku;
import static pbo9.DaftarBuku_.isbn;
import static pbo9.DaftarBuku_.judulBuku;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

/**
 *
 * @author fauziah
 */
public class Buku extends javax.swing.JFrame {

    ArrayList<DaftarBukuPOJO> dataBuku;
    private int id = 0;

    public Buku() {
        try {
            dataBuku = new ArrayList<>();
            initComponents();
            tampil();
        } catch (Exception e) {
            Logger.getLogger(Buku.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void peringatan(String pesan) {
        JOptionPane.showMessageDialog(rootPane, pesan);
    }

    private void resetField() {
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
    }

    private void tampil() {
        EntityManager entityManager = Persistence.createEntityManagerFactory("Gui_utsPU").createEntityManager();
        entityManager.getTransaction().begin();
        TypedQuery<DaftarBuku> querySelectAll = entityManager.createNamedQuery("DaftarBuku.findAll", DaftarBuku.class);
        List<DaftarBuku> results = querySelectAll.getResultList();

        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0);
        for (DaftarBuku data : results) {
            Object[] baris = new Object[4];
            baris[0] = data.getIsbn();
            baris[1] = data.getJudulBuku();
            baris[2] = data.getTahunTerbit();
            baris[3] = data.getPenerbit();
            model.addRow(baris);
        }
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new java.awt.TextField();
        label2 = new java.awt.Label();
        label4 = new java.awt.Label();
        jTextField2 = new java.awt.TextField();
        label5 = new java.awt.Label();
        jTextField3 = new java.awt.TextField();
        jTextField4 = new java.awt.TextField();
        label3 = new java.awt.Label();
        button3 = new java.awt.Button();
        button2 = new java.awt.Button();
        button1 = new java.awt.Button();
        button4 = new java.awt.Button();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        label1 = new java.awt.Label();
        jButton5 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        label2.setBackground(new java.awt.Color(255, 204, 204));
        label2.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        label2.setText("isbn");

        label4.setBackground(new java.awt.Color(255, 204, 204));
        label4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label4.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        label4.setText("Judul Buku");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        label5.setBackground(new java.awt.Color(255, 204, 204));
        label5.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        label5.setText("Tahun Terbit");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        label3.setBackground(new java.awt.Color(255, 204, 204));
        label3.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        label3.setText("Penerbit");

        button3.setBackground(new java.awt.Color(255, 255, 255));
        button3.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        button3.setLabel("Hapus");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        button2.setBackground(new java.awt.Color(255, 255, 255));
        button2.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        button2.setLabel("Update");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        button1.setBackground(new java.awt.Color(255, 255, 255));
        button1.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        button1.setLabel("Masukkan");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button4.setBackground(new java.awt.Color(255, 255, 255));
        button4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button4.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        button4.setLabel("Cetak");
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "isbn", "Judul Buku", "Tahun Terbit", "Penerbit"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setBackground(new java.awt.Color(255, 204, 204));
        label1.setFont(new java.awt.Font("Dubai Light", 3, 36)); // NOI18N
        label1.setText("Selamat datang");

        jButton5.setText("IMPOR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton5)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(151, 151, 151)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(41, 41, 41)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(94, 94, 94)
                            .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(36, 36, 36)
                            .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(51, 51, 51)
                            .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(36, 36, 36)
                            .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(230, 230, 230)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(48, 48, 48)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(386, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1040, 630);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        int isbn = Integer.parseInt(jTextField1.getText().trim());
        String judulBuku = jTextField2.getText();
        int tahunTerbit = Integer.parseInt(jTextField3.getText().trim());
        String penerbit = jTextField4.getText();
        if (!judulBuku.isEmpty()) {

            EntityManager entityManager = Persistence.createEntityManagerFactory("Gui_utsPU").createEntityManager();
            entityManager.getTransaction().begin();
            DaftarBuku m = new DaftarBuku();
            m.setIsbn(isbn);
            m.setJudulBuku(judulBuku);
            m.setTahunTerbit(tahunTerbit);
            m.setPenerbit(penerbit);

            entityManager.persist(m);
            entityManager.getTransaction().commit();
        } else {
            this.peringatan("Input Data Gagal");
        }
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");


    }//GEN-LAST:event_button1ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        int isbn = Integer.parseInt(jTextField1.getText().trim());
        String judulBuku = jTextField2.getText();
        int tahunTerbit = Integer.parseInt(jTextField3.getText().trim());
        String penerbit = jTextField4.getText();

        EntityManager entityManager = Persistence.createEntityManagerFactory("Gui_utsPU").createEntityManager();
        entityManager.getTransaction().begin();
        TypedQuery<DaftarBuku> queryFindByIsbn = entityManager.createNamedQuery("DaftarBuku.findByIsbn", DaftarBuku.class);
        TypedQuery<DaftarBuku> setParameter = queryFindByIsbn.setParameter("isbn", isbn);
        DaftarBuku firstEntity = queryFindByIsbn.getSingleResult();
        if (firstEntity != null) {
            entityManager.remove(firstEntity);

            // Commit transaksi
            entityManager.getTransaction().commit();
            this.peringatan("Delete berhasil");
        } else {
            this.peringatan("Delete gagal");
        }
        this.tampil();

    }//GEN-LAST:event_button3ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        int isbn = Integer.parseInt(jTextField1.getText().trim());
        String judulBuku = jTextField2.getText();
        int tahunTerbit = Integer.parseInt(jTextField3.getText().trim());
        String penerbit = jTextField4.getText();

        EntityManager entityManager = Persistence.createEntityManagerFactory("Gui_utsPU").createEntityManager();
        entityManager.getTransaction().begin();
        TypedQuery<DaftarBuku> queryFindByIsbn = entityManager.createNamedQuery("DaftarBuku.findByIsbn", DaftarBuku.class);
        TypedQuery<DaftarBuku> setParameter = queryFindByIsbn.setParameter("isbn", isbn);
        DaftarBuku firstEntity = queryFindByIsbn.getSingleResult();
        if (firstEntity != null) {
            firstEntity.setIsbn(isbn);
            firstEntity.setJudulBuku(judulBuku);
            firstEntity.setPenerbit(penerbit);
            firstEntity.setTahunTerbit(tahunTerbit);
            entityManager.merge(firstEntity);

            // Commit transaksi
            entityManager.getTransaction().commit();
            this.peringatan("Update berhasil");
        } else {
            this.peringatan("Update gagal");
        }
        this.tampil();
    }//GEN-LAST:event_button2ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        try {
            EntityManager entityManager = Persistence.createEntityManagerFactory("Gui_utsPU").createEntityManager();
            entityManager.getTransaction().begin();
            TypedQuery<DaftarBuku> querySelectAll = entityManager.createNamedQuery("DaftarBuku.findAll", DaftarBuku.class);
            List<DaftarBuku> results = querySelectAll.getResultList();
            entityManager.getTransaction().commit();
            entityManager.close();

            String jrxmlFile = new String("src/pbo7/daftarBuku.jrxml");
            JasperReport jr = JasperCompileManager.compileReport(jrxmlFile);
//            JasperPrint jp = JasperFillManager.fillReport(jr, null, conn);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, new JRBeanCollectionDataSource(results));
            JasperViewer.viewReport(jp, false);
        } catch (JRException ex) {
            Logger.getLogger(Buku.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {
            Logger.getLogger(Buku.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_button4ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {
        int baris = jTable2.rowAtPoint(evt.getPoint());
        String Isbn = jTable2.getValueAt(baris, 0).toString();
        jTextField1.setText(Isbn);

        String JudulBuku = jTable2.getValueAt(baris, 1).toString();
        jTextField2.setText(JudulBuku);

        String TahunTerbit = jTable2.getValueAt(baris, 2).toString();
        jTextField3.setText(TahunTerbit);

        String Penerbit = jTable2.getValueAt(baris, 3).toString();
        jTextField4.setText(Penerbit);

    }

    private void inputTahunTerbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTahunTerbitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTahunTerbitActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        JFileChooser filechooser = new JFileChooser();

        int i = filechooser.showOpenDialog(null);
        if (i == JFileChooser.APPROVE_OPTION) {

            EntityManager entityManager = Persistence.createEntityManagerFactory("Gui_utsPU").createEntityManager();
            entityManager.getTransaction().begin();

            File f = filechooser.getSelectedFile();
            String filepath = f.getPath();
            String fi = f.getName();
            //Parsing CSV Data
            System.out.print(filepath);
            DefaultTableModel csv_data = new DefaultTableModel();

            try {
                InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filepath));
                org.apache.commons.csv.CSVParser csvParser = CSVFormat.DEFAULT.parse(inputStreamReader);
                for (CSVRecord csvRecord : csvParser) {

                    DaftarBuku b = new DaftarBuku();
                    System.out.println(Integer.parseInt(csvRecord.get(0)));
                    b.setIsbn(Integer.parseInt(csvRecord.get(0)));
                    b.setJudulBuku(csvRecord.get(1));
                    b.setTahunTerbit(Integer.parseInt(csvRecord.get(2)));
                    b.setPenerbit(csvRecord.get(3));
                    entityManager.persist(b);
                }
            } catch (Exception ex) {
                this.peringatan("error " + ex.getMessage());
                System.out.println("Error in Parsing CSV File");
            } finally {
                entityManager.getTransaction().commit();
                this.peringatan("Berhasil import");
                this.tampil();
            }
        }

    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * }      *
     * /
     *
     **
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
            java.util.logging.Logger.getLogger(Buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Buku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Button button2;
    private java.awt.Button button3;
    private java.awt.Button button4;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private java.awt.TextField jTextField1;
    private java.awt.TextField jTextField2;
    private java.awt.TextField jTextField3;
    private java.awt.TextField jTextField4;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    // End of variables declaration//GEN-END:variables

}
