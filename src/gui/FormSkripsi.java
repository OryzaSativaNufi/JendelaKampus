package gui;

import Parsistence.Buku;
import Parsistence.Kategori;
import Parsistence.Skripsi;
import static Parsistence.Skripsi_.kategoriCollection;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Ailsa
 */
public class FormSkripsi extends javax.swing.JPanel {

    ArrayList<Skripsi> Skripsi;

    public FormSkripsi() {
        try {
            Skripsi = new ArrayList<>();
            initComponents();
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/perpus", "postgres", "5432");
            setTabelModel();
            loadData();
        } catch (SQLException ex) {
            Logger.getLogger(FormSkripsi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectedDate1 = new com.raven.datechooser.SelectedDate();
        dateChooser1 = new com.raven.datechooser.DateChooser();
        bgJenis = new javax.swing.ButtonGroup();
        mainPanel = new javax.swing.JPanel();
        dataSkripsi = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableSkripsi = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btBatal = new javax.swing.JButton();
        btTambah = new javax.swing.JButton();
        btHapus = new javax.swing.JButton();
        tfCari = new javax.swing.JTextField();
        cbCari = new javax.swing.JComboBox<>();
        btCetak = new javax.swing.JButton();
        panelAdd = new javax.swing.JPanel();
        btn_simpan = new javax.swing.JButton();
        btn_batal = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tf_id = new javax.swing.JTextField();
        tf_penulis = new javax.swing.JTextField();
        tf_judul = new javax.swing.JTextField();
        tf_fakultas = new javax.swing.JTextField();
        tf_pembimbing = new javax.swing.JTextField();
        tf_bahasa = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tf_prodi = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(983, 638));
        setLayout(new java.awt.CardLayout());

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setPreferredSize(new java.awt.Dimension(983, 638));
        mainPanel.setLayout(new java.awt.CardLayout());

        dataSkripsi.setBackground(new java.awt.Color(255, 255, 255));
        dataSkripsi.setPreferredSize(new java.awt.Dimension(983, 638));

        jTableSkripsi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableSkripsi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableSkripsiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableSkripsi);

        jLabel1.setBackground(new java.awt.Color(255, 204, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/IconBuku.png"))); // NOI18N
        jLabel1.setText("Data Skripsi");

        btBatal.setBackground(new java.awt.Color(255, 153, 102));
        btBatal.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btBatal.setForeground(new java.awt.Color(255, 255, 255));
        btBatal.setText("BATAL");
        btBatal.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btBatalMouseMoved(evt);
            }
        });
        btBatal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btBatalMouseExited(evt);
            }
        });
        btBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBatalActionPerformed(evt);
            }
        });

        btTambah.setBackground(new java.awt.Color(255, 153, 102));
        btTambah.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btTambah.setForeground(new java.awt.Color(255, 255, 255));
        btTambah.setText("TAMBAH");
        btTambah.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btTambahMouseMoved(evt);
            }
        });
        btTambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btTambahMouseExited(evt);
            }
        });
        btTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTambahActionPerformed(evt);
            }
        });

        btHapus.setBackground(new java.awt.Color(255, 153, 102));
        btHapus.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btHapus.setForeground(new java.awt.Color(255, 255, 255));
        btHapus.setText("HAPUS");
        btHapus.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btHapusMouseMoved(evt);
            }
        });
        btHapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btHapusMouseExited(evt);
            }
        });
        btHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHapusActionPerformed(evt);
            }
        });

        tfCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCariActionPerformed(evt);
            }
        });
        tfCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfCariKeyTyped(evt);
            }
        });

        cbCari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID Skripsi", "Judul", "Penulis", "Pembimbing", "Bahasa", "Fakultas", "Program Studi" }));
        cbCari.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 183, 137)));

        btCetak.setBackground(new java.awt.Color(255, 153, 102));
        btCetak.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btCetak.setForeground(new java.awt.Color(255, 255, 255));
        btCetak.setText("CETAK");
        btCetak.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btCetakMouseMoved(evt);
            }
        });
        btCetak.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btCetakMouseExited(evt);
            }
        });
        btCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCetakActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dataSkripsiLayout = new javax.swing.GroupLayout(dataSkripsi);
        dataSkripsi.setLayout(dataSkripsiLayout);
        dataSkripsiLayout.setHorizontalGroup(
            dataSkripsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataSkripsiLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(dataSkripsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dataSkripsiLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(dataSkripsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dataSkripsiLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 708, Short.MAX_VALUE))
                            .addGroup(dataSkripsiLayout.createSequentialGroup()
                                .addComponent(btTambah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btBatal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btCetak)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfCari, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbCari, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 945, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        dataSkripsiLayout.setVerticalGroup(
            dataSkripsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dataSkripsiLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dataSkripsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(dataSkripsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btTambah, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                        .addComponent(btHapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btBatal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btCetak, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(dataSkripsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tfCari, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(cbCari, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
                .addGap(40, 40, 40))
        );

        mainPanel.add(dataSkripsi, "card2");

        panelAdd.setBackground(new java.awt.Color(255, 255, 255));
        panelAdd.setPreferredSize(new java.awt.Dimension(983, 638));

        btn_simpan.setBackground(new java.awt.Color(255, 153, 102));
        btn_simpan.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_simpan.setForeground(new java.awt.Color(255, 255, 255));
        btn_simpan.setText("SIMPAN");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });

        btn_batal.setBackground(new java.awt.Color(255, 153, 102));
        btn_batal.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_batal.setForeground(new java.awt.Color(255, 255, 255));
        btn_batal.setText("Kembali");
        btn_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batalActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 204, 204));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setText("Tambah Data Skripsi");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 102));
        jLabel2.setText("ID Skripsi");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 102));
        jLabel3.setText("Penulis");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 102));
        jLabel4.setText("Judul");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 102));
        jLabel7.setText("Bahasa");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 153, 102));
        jLabel8.setText("Fakultas");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 153, 102));
        jLabel12.setText("Pembimbing");

        tf_id.setEditable(false);
        tf_id.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tf_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_id.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 153, 102)));

        tf_penulis.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tf_penulis.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 153, 102)));

        tf_judul.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tf_judul.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 153, 102)));
        tf_judul.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_judulKeyTyped(evt);
            }
        });

        tf_fakultas.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tf_fakultas.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 153, 102)));

        tf_pembimbing.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tf_pembimbing.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 153, 102)));

        tf_bahasa.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tf_bahasa.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 153, 102)));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 153, 102));
        jLabel9.setText("Program Studi");

        tf_prodi.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tf_prodi.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 153, 102)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_prodi, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                    .addComponent(jLabel9)
                    .addComponent(tf_judul, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(tf_fakultas)
                    .addComponent(tf_bahasa)
                    .addComponent(tf_pembimbing)
                    .addComponent(jLabel3)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(tf_penulis)
                    .addComponent(tf_id))
                .addContainerGap(600, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(tf_id, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_judul, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addGap(5, 5, 5)
                .addComponent(tf_penulis, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_pembimbing, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_bahasa, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_fakultas, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(tf_prodi, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelAddLayout = new javax.swing.GroupLayout(panelAdd);
        panelAdd.setLayout(panelAddLayout);
        panelAddLayout.setHorizontalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddLayout.createSequentialGroup()
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel6)
                        .addGap(0, 669, Short.MAX_VALUE))
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_simpan)
                        .addGap(18, 18, 18)
                        .addComponent(btn_batal)))
                .addGap(20, 20, 20))
            .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelAddLayout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(21, 21, 21)))
        );
        panelAddLayout.setVerticalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 667, Short.MAX_VALUE)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_batal, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
            .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelAddLayout.createSequentialGroup()
                    .addGap(90, 90, 90)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(102, Short.MAX_VALUE)))
        );

        mainPanel.add(panelAdd, "card2");

        add(mainPanel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTambahActionPerformed
        mainPanel.removeAll();
        mainPanel.add(panelAdd);
        mainPanel.repaint();
        mainPanel.revalidate();

        tf_id.setText(setIDSkripsi());
        if (btTambah.getText().equals("UBAH")) {
            dataTabel();
            btn_simpan.setText("UBAH");
        }
    }//GEN-LAST:event_btTambahActionPerformed

    private void btHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHapusActionPerformed
        String s = (String) jTableSkripsi.getValueAt(jTableSkripsi.getSelectedRow(), 1);
//        ImageIcon icon = new ImageIcon(getClass().getResource("/gambar/hapus.png"));
        hapusData();
        loadData();
    }//GEN-LAST:event_btHapusActionPerformed

    private void btTambahMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btTambahMouseMoved
//        btTambah.setForeground(Color.white);
//        ImageIcon icon;
//        if (btTambah.getText().equalsIgnoreCase("UBAH")) {
//            icon = new ImageIcon(getClass().getResource("/gambar/edit.png"));
//        } else {
//            icon = new ImageIcon(getClass().getResource("/gambar/tambah.png"));
//        }
////        btTambah.setIcon(icon);
    }//GEN-LAST:event_btTambahMouseMoved

    private void btTambahMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btTambahMouseExited
//        btTambah.setForeground(Color.white);
//        ImageIcon icon;
//        if (btTambah.getText().equalsIgnoreCase("UBAH")) {
//            icon = new ImageIcon(getClass().getResource("/gambar/edit.png"));
//        } else {
//            icon = new ImageIcon(getClass().getResource("/gambar/tambah.png"));
//        }
//        btTambah.setIcon(icon);
//        jLabel1.requestFocus();
    }//GEN-LAST:event_btTambahMouseExited

    private void btHapusMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btHapusMouseMoved
//        btHapus.setForeground(Color.white);
//        ImageIcon icon = new ImageIcon(getClass().getResource("/gambar/hapus.png"));
//        btHapus.setIcon(icon);
    }//GEN-LAST:event_btHapusMouseMoved

    private void btHapusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btHapusMouseExited
//        btHapus.setForeground(Color.white);
//        ImageIcon icon = new ImageIcon(getClass().getResource("/gambar/hapus.png"));
//        btHapus.setIcon(icon);
    }//GEN-LAST:event_btHapusMouseExited

    private void btBatalMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btBatalMouseMoved
//        btBatal.setForeground(Color.white);
//        ImageIcon icon = new ImageIcon(getClass().getResource("/gambar/kembali.png"));
//        btBatal.setIcon(icon);
    }//GEN-LAST:event_btBatalMouseMoved

    private void btBatalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btBatalMouseExited
//        btBatal.setForeground(Color.white);
//        ImageIcon icon = new ImageIcon(getClass().getResource("/gambar/kembali.png"));
//        btBatal.setIcon(icon);
    }//GEN-LAST:event_btBatalMouseExited

    private void jTableSkripsiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableSkripsiMouseClicked
        if (btTambah.getText().equals("TAMBAH")) {
            btTambah.setText("UBAH");
//            ImageIcon icon = new ImageIcon(getClass().getResource("/gambar/edit.png"));
//            btTambah.setIcon(icon);
            btHapus.setVisible(true);
            btBatal.setVisible(true);
        }
    }//GEN-LAST:event_jTableSkripsiMouseClicked

    private void btBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBatalActionPerformed
        showPanel();
        loadData();
    }//GEN-LAST:event_btBatalActionPerformed

    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
        showPanel();
        loadData();
    }//GEN-LAST:event_btn_batalActionPerformed

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        if (btn_simpan.getText().equals("TAMBAH")) {
            btn_simpan.setText("SIMPAN");
        } else if (btn_simpan.getText().equals("SIMPAN")) {
            insertData();
        } else if (btn_simpan.getText().equals("UBAH")) {
            updateData();
        }
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void tfCariKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCariKeyTyped
        searchData();
    }//GEN-LAST:event_tfCariKeyTyped

    private void tf_judulKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_judulKeyTyped
        if (tf_judul.getText().length() >= 13) {
            evt.consume();
        }
    }//GEN-LAST:event_tf_judulKeyTyped

    private void btCetakMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCetakMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_btCetakMouseMoved

    private void btCetakMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCetakMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btCetakMouseExited

    private void btCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCetakActionPerformed
 try {
            String reportPath = "src/Laporan/reportskripsi.jrxml";
            String searchTerm = tfCari.getText().trim();
            String selection = (String) cbCari.getSelectedItem();
            // Building the JPA query dynamically based on the selected criteria
            String queryString = "SELECT s FROM Skripsi s WHERE ";
            switch (cbCari.getSelectedIndex()) {
                case 0:
                    queryString += "LOWER(s.idSkripsi) LIKE LOWER(:searchTerm)";
                    break;
                case 1:
                    queryString += "LOWER(s.judul) LIKE LOWER(:searchTerm)";
                    break;
                case 2:
                    queryString += "LOWER(s.penulis) LIKE LOWER(:searchTerm)";
                    break;
                case 3:
                    queryString += "LOWER(s.pembimbing) LIKE LOWER(:searchTerm)";
                    break;
                case 4:
                    queryString += "LOWER(s.bahasa) LIKE LOWER(:searchTerm)";
                    break;
                case 5:
                    queryString += "LOWER(s.fakultas) LIKE LOWER(:searchTerm)";
                    break;
                case 6:
                    queryString += "LOWER(s.programStudi) LIKE LOWER(:searchTerm)";
                    break;
                case 7:
                    queryString += "LOWER(s.kategori) LIKE LOWER(:searchTerm)";
                    break;
                default:
                    queryString += "1=1";
            }

            EntityManagerFactory emf = Persistence.createEntityManagerFactory("JendelaKampusPU");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();

            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery<Skripsi> cq = cb.createQuery(Skripsi.class);
            Root<Skripsi> bok = cq.from(Skripsi.class);
            cq.select(bok);

            // Check if WHERE clause is not empty
//            if (queryString.endsWith(" WHERE ")) {
//                throw new IllegalArgumentException("No search criteria selected.");
//            }
            TypedQuery<Skripsi> q = em.createQuery(cq);
            List<Skripsi> list = q.getResultList();
            Query query = em.createQuery(queryString);
            if (queryString.contains(":searchTerm")) {
                query.setParameter("searchTerm", "%" + searchTerm + "%");
            }

            List<Skripsi> results = query.getResultList();
            Map<String, Object> parameter = new HashMap<>();
            parameter.put("querySearch", searchTerm);
            parameter.put("searchBy", selection);
            // Menyiapkan data untuk laporan
            List<Object[]> data = new ArrayList<>();
            for (Skripsi result : results) {
                Object[] rowData = {
                    result.getIdSkripsi(),
                    result.getJudul(),
                    result.getPenulis(),
                    result.getPembimbing(),
                    result.getBahasa(),
                    result.getFakultas(),
                    result.getProgramStudi(),
                    result.getKategoriCollection(),};

                data.add(rowData);
            }
            em.getTransaction().commit();
            em.close();
            emf.close();

            // Membuat sumber data untuk JasperReports dari data hasil pencarian
            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(results);

            // Memuat file desain laporan (*.jrxml)
            JasperReport jasperReport = JasperCompileManager.compileReport(reportPath);
            JasperPrint print = JasperFillManager.fillReport(jasperReport, parameter, dataSource);
            JasperViewer viewer = new JasperViewer(print, false);
            viewer.setVisible(true);

        } catch (JRException ex) {
            Logger.getLogger(FormSkripsi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btCetakActionPerformed

    private void tfCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCariActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgJenis;
    private javax.swing.JButton btBatal;
    private javax.swing.JButton btCetak;
    private javax.swing.JButton btHapus;
    private javax.swing.JButton btTambah;
    private javax.swing.JButton btn_batal;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JComboBox<String> cbCari;
    private javax.swing.JPanel dataSkripsi;
    private com.raven.datechooser.DateChooser dateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableSkripsi;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel panelAdd;
    private com.raven.datechooser.SelectedDate selectedDate1;
    private javax.swing.JTextField tfCari;
    private javax.swing.JTextField tf_bahasa;
    private javax.swing.JTextField tf_fakultas;
    private javax.swing.JTextField tf_id;
    private javax.swing.JTextField tf_judul;
    private javax.swing.JTextField tf_pembimbing;
    private javax.swing.JTextField tf_penulis;
    private javax.swing.JTextField tf_prodi;
    // End of variables declaration//GEN-END:variables

    private void loadData() {
        getData((DefaultTableModel) jTableSkripsi.getModel());
        if (btTambah.getText().equalsIgnoreCase("UBAH")) {
            btTambah.setText("TAMBAH");
//            ImageIcon icon = new ImageIcon(getClass().getResource("/gambar/tambah.png"));
//            btTambah.setIcon(icon);
        }
        btHapus.setVisible(false);
        btBatal.setVisible(false);
        jLabel1.requestFocus();
    }

    private void showPanel() {
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        mainPanel.add(dataSkripsi);
        mainPanel.repaint();
        mainPanel.revalidate();
    }

    private void kosongkanForm() {
        tf_id.setText("");
        tf_judul.setText("");
        tf_penulis.setText("");
        tf_pembimbing.setText("");
        tf_fakultas.setText("");
        tf_bahasa.setText("");

    }

    private void setTabelModel() {
        DefaultTableModel model = (DefaultTableModel) jTableSkripsi.getModel();
        model.addColumn("ID Skripsi");
        model.addColumn("Judul");
        model.addColumn("Penulis");
        model.addColumn("Pembimbing");
        model.addColumn("Bahasa");
        model.addColumn("Fakultas");
        model.addColumn("Program Studi");

    }

    private void getData(DefaultTableModel model) {
        model.setRowCount(0);
        EntityManagerFactory emf = null;
        EntityManager em = null;

        try {
            emf = Persistence.createEntityManagerFactory("JendelaKampusPU");
            em = emf.createEntityManager();
            em.getTransaction().begin();

            TypedQuery<Skripsi> querySelectAll = em.createNamedQuery("Skripsi.findAll", Skripsi.class);
            List<Skripsi> results = querySelectAll.getResultList();

            for (Skripsi skripsi : results) {
                model.addRow(new Object[]{
                    skripsi.getIdSkripsi(),
                    skripsi.getJudul(),
                    skripsi.getPenulis(),
                    skripsi.getPembimbing(),
                    skripsi.getBahasa(),
                    skripsi.getFakultas(),
                    skripsi.getProgramStudi()});
            }

            em.getTransaction().commit();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (em != null) {
                em.close();
            }
            if (emf != null) {
                emf.close();
            }
        }
    }

    private String setIDSkripsi() {
        EntityManager em = Persistence.createEntityManagerFactory("JendelaKampusPU").createEntityManager();
        String jpql = "SELECT SUBSTRING(s.idSkripsi, LENGTH(s.idSkripsi) - 2) AS nomor "
                + "FROM idSkripsi s WHERE s.idSkripsi LIKE 'S%' ORDER BY s.idSkripsi DESC";
        TypedQuery<String> query = em.createQuery(jpql, String.class);
        query.setMaxResults(1);

        String urutan = "";
        try {
            String lastNumber = query.getSingleResult().replaceAll("[^\\d]", "");
            int nextNumber = Integer.parseInt(lastNumber) + 1;
            urutan = "S" + String.format("%04d", nextNumber);

        } catch (Exception e) {
            // Tangani kesalahan dengan lebih baik
            e.printStackTrace();
        } finally {
            em.close();
        }

        return urutan;
    }

    private void insertData() {
        String id = tf_id.getText().trim();
        String judul = tf_judul.getText();
        String penulis = tf_penulis.getText();
        String pembimbing = tf_pembimbing.getText();
        String bahasa = tf_bahasa.getText();
        String fakultas = tf_fakultas.getText();
        String prodi = tf_prodi.getText();

        if (id.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua kolom harus diisi", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        EntityManager em = Persistence.createEntityManagerFactory("JendelaKampusPU").createEntityManager();

        try {
            em.getTransaction().begin();

            Skripsi s = new Skripsi();
            s.setIdSkripsi(id);
            s.setJudul(judul);
            s.setPenulis(penulis);
            s.setPembimbing(pembimbing);
            s.setBahasa(bahasa);
            s.setFakultas(fakultas);
            s.setFakultas(fakultas);
            s.setProgramStudi(prodi);
//            b.setKategoriCollection((Collection<Kategori>) kategoriCollection);
            em.persist(s);
            em.getTransaction().commit();

            JOptionPane.showMessageDialog(this, "Data Berhasil Disimpan", "Sukses", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            em.getTransaction().rollback();
            JOptionPane.showMessageDialog(this, "Data Gagal Disimpan: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            em.close();
        }

        kosongkanForm();
        loadData();
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        mainPanel.add(dataSkripsi);
        mainPanel.repaint();
        mainPanel.revalidate();
    }

    private void dataTabel() {
        mainPanel.setVisible(false);
        panelAdd.setVisible(true);

        int row = jTableSkripsi.getSelectedRow();
        jLabel6.setText("Perbarui Data Pengguna");
        tf_id.setEnabled(false);

        tf_id.setText(jTableSkripsi.getValueAt(row, 0).toString());
        tf_judul.setText(jTableSkripsi.getValueAt(row, 1).toString());
        tf_penulis.setText(jTableSkripsi.getValueAt(row, 2).toString());
        tf_pembimbing.setText(jTableSkripsi.getValueAt(row, 3).toString());
        tf_bahasa.setText(jTableSkripsi.getValueAt(row, 4).toString());
        tf_fakultas.setText(jTableSkripsi.getValueAt(row, 5).toString());
        tf_prodi.setText(jTableSkripsi.getValueAt(row, 6).toString());

    }

    private void updateData() {
        String id = tf_id.getText().trim();
        String judul = tf_judul.getText();
        String penulis = tf_penulis.getText();
        String pembimbing = tf_pembimbing.getText();
        String bahasa = tf_bahasa.getText();
        String fakultas = tf_fakultas.getText();
        String prodi = tf_prodi.getText();

        if (id.isEmpty() || judul.isEmpty() || penulis.isEmpty() || pembimbing.isEmpty() || bahasa.isEmpty() || fakultas.isEmpty() || prodi.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua kolom harus diisi", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JendelaKampusPU");
        EntityManager em = emf.createEntityManager();

        try {
            Skripsi s = new Skripsi();
            s.setIdSkripsi(id);
            s.setJudul(judul);
            s.setPenulis(penulis);
            s.setPembimbing(pembimbing);
            s.setBahasa(bahasa);
            s.setFakultas(fakultas);
            s.setFakultas(fakultas);
            s.setProgramStudi(prodi);
//            s.setKategoriCollection((Collection<Kategori>) kategoriCollection);

            em.getTransaction().begin();
            em.merge(s);
            em.getTransaction().commit();

            JOptionPane.showMessageDialog(this, "Data Berhasil Diperbarui", "Sukses", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            em.getTransaction().rollback();
            JOptionPane.showMessageDialog(this, "Data Gagal Diperbarui: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        } finally {
            if (em != null && em.isOpen()) {
                em.close();
            }
            kosongkanForm();
            loadData();
            showPanel();

        }
    }

//    private void hapusData() {
//        int selectedRow = jTableBuku.getSelectedRow();
//        int confirm = JOptionPane.showConfirmDialog(this, "Apakah anda yakin ingin menghapus data?",
//                "Konfirmasi Hapus Data", JOptionPane.YES_NO_OPTION);
//
//        if (confirm == JOptionPane.YES_OPTION) {
//            String id = tf_id.getText().trim();
//            EntityManagerFactory emf = Persistence.createEntityManagerFactory("JendelaKampusPU");
//            EntityManager em = emf.createEntityManager();
//            try {
//                em.getTransaction().begin();
//                Buku b = new Buku();
//                b.setIdBuku(id);
//                em.remove(b);
//                em.getTransaction().commit();
//
//                JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus");
//            } catch (Exception e) {
//                em.getTransaction().rollback();
//                JOptionPane.showMessageDialog(this, "Data Gagal Dihapus");
//            } finally {
//                em.close();
//            }
//            kosongkanForm();
//            loadData();
//            showPanel();
//        }
    private void hapusData() {
        int selectedRow = jTableSkripsi.getSelectedRow();
        int confirm = JOptionPane.showConfirmDialog(this, "Apakah anda yakin ingin menghapus data?",
                "Konfirmasi Hapus Data", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            String id = tf_id.getText().trim();
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("JendelaKampusPU");
            EntityManager em = emf.createEntityManager();
            try {
                em.getTransaction().begin();

                // Ambil entitas buku yang akan dihapus berdasarkan ID
                Skripsi s = em.find(Skripsi.class, id);

                if (s != null) {
                    // Hapus entitas dari database
                    em.remove(s);
                    em.getTransaction().commit();

                    JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus");
                } else {
                    JOptionPane.showMessageDialog(this, "Data dengan ID tersebut tidak ditemukan");
                }

            } catch (Exception e) {
                em.getTransaction().rollback();
                JOptionPane.showMessageDialog(this, "Data Gagal Dihapus");
            } finally {
                em.close();
            }

            kosongkanForm();
            loadData();
            showPanel();
        }
//    private void hapusData() {
//        int selectedRow = jTableSkripsi.getSelectedRow();
//        int confirm = JOptionPane.showConfirmDialog(this, "Apakah anda yakin ingin menghapus data?",
//                "Konfirmasi Hapus Data", JOptionPane.YES_NO_OPTION);
//
//        if (confirm == JOptionPane.YES_OPTION) {
//            String id = tf_id.getText().trim();
//            System.out.println("ID yang akan dihapus: " + id); // Tambahkan baris ini
//
//            EntityManagerFactory emf = Persistence.createEntityManagerFactory("JendelaKampusPU");
//            EntityManager em = emf.createEntityManager();
//            try {
//                em.getTransaction().begin();
//
//                // Ambil entitas buku yang akan dihapus berdasarkan ID
//                Buku b = em.find(Buku.class, id);
//
//                if (b != null) {
//                    // Hapus entitas dari database
//                    em.remove(b);
//                    em.getTransaction().commit();
//
//                    JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus");
//                } else {
//                    JOptionPane.showMessageDialog(this, "Data dengan ID tersebut tidak ditemukan");
//                }
//            } catch (Exception e) {
//                em.getTransaction().rollback();
//                JOptionPane.showMessageDialog(this, "Data Gagal Dihapus");
//            } finally {
//                em.close();
//            }
//
//            kosongkanForm();
//            loadData();
//            showPanel();
//        }
    }

    private void searchData() {
        try {
            String selection = (String) cbCari.getSelectedItem();
            String searchTerm = tfCari.getText();

            // Building the JPA query dynamically based on the selected criteria
            String queryString = "SELECT s FROM Skripsi s WHERE ";

            switch (cbCari.getSelectedIndex()) {
                case 0:
                    queryString += "LOWER(s.idSkripsi) LIKE LOWER(:searchTerm)";
                    break;
                case 1:
                    queryString += "LOWER(s.judul) LIKE LOWER(:searchTerm)";
                    break;
                case 2:
                    queryString += "LOWER(s.penulis) LIKE LOWER(:searchTerm)";
                    break;
                case 3:
                    queryString += "LOWER(s.pembimbing) LIKE LOWER(:searchTerm)";
                    break;
                case 4:
                    queryString += "LOWER(s.bahasa) LIKE LOWER(:searchTerm)";
                    break;
                case 5:
                    queryString += "LOWER(s.fakultas) LIKE LOWER(:searchTerm)";
                    break;
                case 6:
                    queryString += "LOWER(s.programStudi) LIKE LOWER(:searchTerm)";
                    break;
                default:
                    queryString += "LOWER(s.idSkripsi) LIKE LOWER(:searchTerm)"
                            + " OR LOWER(s.judul) LIKE LOWER(:searchTerm)"
                            + " OR LOWER(s.penulis) LIKE LOWER(:searchTerm)"
                            + " OR LOWER(s.pembimbing) LIKE LOWER(:searchTerm)"
                            + " OR LOWER(s.bahasa) LIKE LOWER(:searchTerm)"
                            + " OR LOWER(s.fakultas) LIKE LOWER(:searchTerm)"
                            + " OR LOWER(s.programStudi) LIKE LOWER(:searchTerm)";

                    break;
            }
            DefaultTableModel model = (DefaultTableModel) jTableSkripsi.getModel();
            model.setRowCount(0);

            EntityManager em = null;
            try {
                EntityManagerFactory emf = Persistence.createEntityManagerFactory("JendelaKampusPU");
                em = emf.createEntityManager();

                TypedQuery<Skripsi> query = em.createQuery(queryString, Skripsi.class
                );
                query.setParameter("searchTerm", "%" + searchTerm + "%");

                List<Skripsi> results = query.getResultList();

                for (Skripsi skripsi : results) {
                    // Tambahkan baris ke model berdasarkan data pengguna
                    model.addRow(new Object[]{
                        skripsi.getIdSkripsi(),
                        skripsi.getJudul(),
                        skripsi.getPenulis(),
                        skripsi.getPembimbing(),
                        skripsi.getBahasa(),
                        skripsi.getFakultas(),
                        skripsi.getProgramStudi()});
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (em != null && em.isOpen()) {
                em.close();
            }
        }
    }
    catch (Exception ex

    
        ) {
            ex.printStackTrace();
    }

}
}
