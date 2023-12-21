package gui;

import Parsistence.Buku;
import Parsistence.Kategori;
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
public class FormBuku extends javax.swing.JPanel {

    ArrayList<Buku> Bukuu;

    public FormBuku() {
        try {
            Bukuu = new ArrayList<>();
            initComponents();
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/perpus", "postgres", "5432");
            setTabelModel();
            loadData();
        } catch (SQLException ex) {
            Logger.getLogger(FormBuku.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectedDate1 = new com.raven.datechooser.SelectedDate();
        dateChooser1 = new com.raven.datechooser.DateChooser();
        bgJenis = new javax.swing.ButtonGroup();
        mainPanel = new javax.swing.JPanel();
        dataBuku = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableBuku = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btBatal = new javax.swing.JButton();
        btTambah = new javax.swing.JButton();
        btHapus = new javax.swing.JButton();
        tfCari = new javax.swing.JTextField();
        cbCari = new javax.swing.JComboBox<>();
        btCetak = new javax.swing.JButton();
        panelAdd = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tf_id = new javax.swing.JTextField();
        tf_judul = new javax.swing.JTextField();
        tf_isbn = new javax.swing.JTextField();
        tf_penerbit = new javax.swing.JTextField();
        tf_bahasa = new javax.swing.JTextField();
        tf_pengarang = new javax.swing.JTextField();
        btn_simpan = new javax.swing.JButton();
        btn_batal = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btn_kategori = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(983, 638));
        setLayout(new java.awt.CardLayout());

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setPreferredSize(new java.awt.Dimension(983, 638));
        mainPanel.setLayout(new java.awt.CardLayout());

        dataBuku.setBackground(new java.awt.Color(255, 255, 255));
        dataBuku.setPreferredSize(new java.awt.Dimension(983, 638));

        jTableBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableBukuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableBuku);

        jLabel1.setBackground(new java.awt.Color(255, 204, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/IconBuku.png"))); // NOI18N
        jLabel1.setText("Data Buku");

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

        cbCari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih --", "ID Buku", "ISBN", "Judul", "Bahasa", "Penerbit", "Pengarang" }));
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

        javax.swing.GroupLayout dataBukuLayout = new javax.swing.GroupLayout(dataBuku);
        dataBuku.setLayout(dataBukuLayout);
        dataBukuLayout.setHorizontalGroup(
            dataBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataBukuLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(dataBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dataBukuLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(dataBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dataBukuLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 733, Short.MAX_VALUE))
                            .addGroup(dataBukuLayout.createSequentialGroup()
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
        dataBukuLayout.setVerticalGroup(
            dataBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dataBukuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dataBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(dataBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btTambah, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                        .addComponent(btHapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btBatal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btCetak, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(dataBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tfCari, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(cbCari, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
                .addGap(40, 40, 40))
        );

        mainPanel.add(dataBuku, "card2");

        panelAdd.setBackground(new java.awt.Color(255, 255, 255));
        panelAdd.setPreferredSize(new java.awt.Dimension(983, 638));

        jLabel6.setBackground(new java.awt.Color(255, 204, 204));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setText("Tambah Data Buku");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 102));
        jLabel2.setText("ID Buku");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 102));
        jLabel3.setText("Judul");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 102));
        jLabel4.setText("ISBN");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 102));
        jLabel7.setText("Pengarang");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 153, 102));
        jLabel8.setText("Penerbit");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 153, 102));
        jLabel12.setText("Bahasa");

        tf_id.setEditable(false);
        tf_id.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tf_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_id.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 153, 102)));

        tf_judul.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tf_judul.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 153, 102)));

        tf_isbn.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tf_isbn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 153, 102)));
        tf_isbn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_isbnKeyTyped(evt);
            }
        });

        tf_penerbit.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tf_penerbit.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 153, 102)));

        tf_bahasa.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tf_bahasa.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 153, 102)));

        tf_pengarang.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tf_pengarang.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 153, 102)));

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
        btn_batal.setText("KEMBALI");
        btn_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tf_isbn, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addComponent(tf_penerbit)
                        .addComponent(tf_pengarang)
                        .addComponent(tf_bahasa)
                        .addComponent(jLabel3)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel7)
                        .addComponent(tf_judul)
                        .addComponent(tf_id))
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_simpan)
                .addGap(18, 18, 18)
                .addComponent(btn_batal)
                .addGap(0, 281, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_batal, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(jLabel2)
                .addGap(20, 20, 20)
                .addComponent(tf_id, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_isbn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addGap(5, 5, 5)
                .addComponent(tf_judul, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_bahasa, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_pengarang, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_penerbit, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Kategori", "Kategori"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        btn_kategori.setBackground(new java.awt.Color(255, 153, 102));
        btn_kategori.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_kategori.setForeground(new java.awt.Color(255, 255, 255));
        btn_kategori.setText("KATEGORI");
        btn_kategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kategoriActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAddLayout = new javax.swing.GroupLayout(panelAdd);
        panelAdd.setLayout(panelAddLayout);
        panelAddLayout.setHorizontalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_kategori))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelAddLayout.setVerticalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel6)
                .addGap(37, 37, 37)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_kategori, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 251, Short.MAX_VALUE)))
                .addContainerGap())
        );

        mainPanel.add(panelAdd, "card2");

        add(mainPanel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTambahActionPerformed
        mainPanel.removeAll();
        mainPanel.add(panelAdd);
        mainPanel.repaint();
        mainPanel.revalidate();

        tf_id.setText(setIDBuku());
        if (btTambah.getText().equals("UBAH")) {
            dataTabel();
            btn_simpan.setText("UBAH");
        }
    }//GEN-LAST:event_btTambahActionPerformed

    private void btHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHapusActionPerformed
        String s = (String) jTableBuku.getValueAt(jTableBuku.getSelectedRow(), 0);
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

    private void jTableBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableBukuMouseClicked
        if (btTambah.getText().equals("TAMBAH")) {
            btTambah.setText("UBAH");
//            ImageIcon icon = new ImageIcon(getClass().getResource("/gambar/edit.png"));
//            btTambah.setIcon(icon);
            btHapus.setVisible(true);
            btBatal.setVisible(true);
        }
    }//GEN-LAST:event_jTableBukuMouseClicked

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

    private void tf_isbnKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_isbnKeyTyped
        if (tf_isbn.getText().length() >= 13) {
            evt.consume();
        }
    }//GEN-LAST:event_tf_isbnKeyTyped

    private void btn_kategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kategoriActionPerformed
        PilihKategori pk = new PilihKategori(null, true);
        pk.setVisible(true);
        DefaultTableModel tb = (DefaultTableModel) jTable1.getModel();
        tb.addRow(new Object[]{pk.kat.getIdKategori(), pk.kat.getIdKategori()});
    }//GEN-LAST:event_btn_kategoriActionPerformed

    private void btCetakMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCetakMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_btCetakMouseMoved

    private void btCetakMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCetakMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btCetakMouseExited

    private void btCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCetakActionPerformed
        try {
            String reportPath = "src/Laporan/reportbukuu.jrxml";
            String searchTerm = tfCari.getText().trim();
            String selection = (String) cbCari.getSelectedItem();
            // Building the JPA query dynamically based on the selected criteria
            String queryString = "SELECT b FROM Buku b WHERE ";
            switch (cbCari.getSelectedIndex()) {
                case 0:
                    queryString += "LOWER(b.idBuku) LIKE LOWER(:searchTerm)";
                    break;
                case 1:
                    queryString += "LOWER(b.isbn) LIKE LOWER(:searchTerm)";
                    break;
                case 2:
                    queryString += "LOWER(b.judul) LIKE LOWER(:searchTerm)";
                    break;
                case 3:
                    queryString += "LOWER(b.bahasa) LIKE LOWER(:searchTerm)";
                    break;
                case 4:
                    queryString += "LOWER(b.penerbit) LIKE LOWER(:searchTerm)";
                    break;
                case 5:
                    queryString += "LOWER(b.pengarang) LIKE LOWER(:searchTerm)";
                    break;
                case 6:
                    queryString += "LOWER(b.kategori) LIKE LOWER(:searchTerm)";
                    break;
                default:
                    queryString += "1=1";
            }

            EntityManagerFactory emf = Persistence.createEntityManagerFactory("JendelaKampusPU");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();

            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery<Buku> cq = cb.createQuery(Buku.class);
            Root<Buku> bok = cq.from(Buku.class);
            cq.select(bok);

            // Check if WHERE clause is not empty
            if (queryString.endsWith(" WHERE ")) {
                throw new IllegalArgumentException("No search criteria selected.");
            }

            TypedQuery<Buku> q = em.createQuery(cq);
            List<Buku> list = q.getResultList();
            Query query = em.createQuery(queryString);
            if (queryString.contains(":searchTerm")) {
                query.setParameter("searchTerm", "%" + searchTerm + "%");
            }

            List<Buku> results = query.getResultList();
            Map<String, Object> parameter = new HashMap<>();
            parameter.put("querySearch", searchTerm);
            parameter.put("searchBy", selection);
            // Menyiapkan data untuk laporan
            List<Object[]> data = new ArrayList<>();
            for (Buku result : results) {
                Object[] rowData = {
                    result.getIdBuku(),
                    result.getIsbn(),
                    result.getJudul(),
                    result.getBahasa(),
                    result.getPenerbit(),
                    result.getPengarang(),
                    result.getKategoriCollection()};

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
            Logger.getLogger(FormBuku.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JButton btn_kategori;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JComboBox<String> cbCari;
    private javax.swing.JPanel dataBuku;
    private com.raven.datechooser.DateChooser dateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableBuku;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel panelAdd;
    private com.raven.datechooser.SelectedDate selectedDate1;
    private javax.swing.JTextField tfCari;
    private javax.swing.JTextField tf_bahasa;
    private javax.swing.JTextField tf_id;
    private javax.swing.JTextField tf_isbn;
    private javax.swing.JTextField tf_judul;
    private javax.swing.JTextField tf_penerbit;
    private javax.swing.JTextField tf_pengarang;
    // End of variables declaration//GEN-END:variables

    void ambildata() {
        EntityManager em = Persistence.createEntityManagerFactory("JendelaKampusPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT b FROM Buku b");
        List<Buku> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        DefaultTableModel tb = (DefaultTableModel) jTableBuku.getModel();
        tb.setRowCount(0);
        int i = 1;
        for (Buku b : list) {
            Object[] ob = new Object[8];
            String k = null;
            for (Kategori ki : b.getKategoriCollection()) {
                if (k == null) {
                    k = ki.getKategori();
                } else {
                    k = k + ", " + ki.getKategori();
                }
            }
            ob[0] = i;
            ob[1] = b.getIdBuku();
            ob[2] = b.getIsbn();
            ob[3] = b.getJudul();
            ob[4] = k;
            ob[5] = b.getBahasa();
            ob[6] = b.getPenerbit();
            ob[7] = b.getPengarang();
            tb.addRow(ob);
            i++;
        }
    }

    private void loadData() {
        getData((DefaultTableModel) jTableBuku.getModel());
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
        mainPanel.add(dataBuku);
        mainPanel.repaint();
        mainPanel.revalidate();
    }

    private void kosongkanForm() {
        tf_id.setText("");
        tf_isbn.setText("");
        tf_judul.setText("");
        tf_bahasa.setText("");
        tf_penerbit.setText("");
        tf_pengarang.setText("");

    }

    private void setTabelModel() {
        DefaultTableModel model = (DefaultTableModel) jTableBuku.getModel();
        model.addColumn("ID Buku");
        model.addColumn("ISBN");
        model.addColumn("Judul");
        model.addColumn("Bahasa");
        model.addColumn("Pengarang");
        model.addColumn("Penerbit");
        model.addColumn("Kategori");

    }

    private void getData(DefaultTableModel model) {
        model.setRowCount(0);
        EntityManagerFactory emf = null;
        EntityManager em = null;

        try {
            emf = Persistence.createEntityManagerFactory("JendelaKampusPU");
            em = emf.createEntityManager();
            em.getTransaction().begin();

            TypedQuery<Buku> querySelectAll = em.createNamedQuery("Buku.findAll", Buku.class);
            List<Buku> results = querySelectAll.getResultList();

            for (Buku buku : results) {
                model.addRow(new Object[]{
                    buku.getIdBuku(),
                    buku.getIsbn(),
                    buku.getJudul(),
                    buku.getBahasa(),
                    buku.getPengarang(),
                    buku.getPenerbit()});
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

    private String setIDBuku() {
        EntityManager em = Persistence.createEntityManagerFactory("JendelaKampusPU").createEntityManager();
        String jpql = "SELECT SUBSTRING(b.idBuku, LENGTH(b.idBuku) - 2) AS nomor "
                + "FROM Buku b WHERE b.idBuku LIKE 'B%' ORDER BY b.idBuku DESC";
        TypedQuery<String> query = em.createQuery(jpql, String.class);
        query.setMaxResults(1);

        String urutan = "";
        try {
            String lastNumber = query.getSingleResult().replaceAll("[^\\d]", "");
            int nextNumber = Integer.parseInt(lastNumber) + 1;
            urutan = "B" + String.format("%03d", nextNumber);

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
        String isbn = tf_isbn.getText();
        String judul = tf_judul.getText();
        String bahasa = tf_bahasa.getText();
        String penerbit = tf_penerbit.getText();
        String pengarang = tf_pengarang.getText();

        if (id.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua kolom harus diisi", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        EntityManager em = Persistence.createEntityManagerFactory("JendelaKampusPU").createEntityManager();

        try {
            em.getTransaction().begin();

            Buku b = new Buku();
            b.setIdBuku(id);
            b.setIsbn(isbn);
            b.setJudul(judul);
            b.setBahasa(bahasa);
            b.setPenerbit(penerbit);
            b.setPengarang(pengarang);
//            b.setKategoriCollection((Collection<Kategori>) kategoriCollection);
            em.persist(b);
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
        mainPanel.add(dataBuku);
        mainPanel.repaint();
        mainPanel.revalidate();
    }

    private void dataTabel() {
        mainPanel.setVisible(false);
        panelAdd.setVisible(true);

        int row = jTableBuku.getSelectedRow();
        jLabel6.setText("Perbarui Data Pengguna");
        tf_id.setEnabled(false);

        tf_id.setText(jTableBuku.getValueAt(row, 0).toString());
        tf_isbn.setText(jTableBuku.getValueAt(row, 1).toString());
        tf_judul.setText(jTableBuku.getValueAt(row, 2).toString());
        tf_bahasa.setText(jTableBuku.getValueAt(row, 3).toString());
        tf_penerbit.setText(jTableBuku.getValueAt(row, 4).toString());
        tf_pengarang.setText(jTableBuku.getValueAt(row, 5).toString());
    }

    private void updateData() {
        String id = tf_id.getText().trim();
        String isbn = tf_isbn.getText();
        String judul = tf_judul.getText();
        String bahasa = tf_bahasa.getText();
        String penerbit = tf_penerbit.getText();
        String pengarang = tf_pengarang.getText();

        if (id.isEmpty() || isbn.isEmpty() || judul.isEmpty() || bahasa.isEmpty() || penerbit.isEmpty() || pengarang.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua kolom harus diisi", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JendelaKampusPU");
        EntityManager em = emf.createEntityManager();

        try {
            Buku b = new Buku();
            b.setIdBuku(id);
            b.setIsbn(isbn);
            b.setJudul(judul);
            b.setBahasa(bahasa);
            b.setPenerbit(penerbit);
            b.setPengarang(pengarang);
//            b.setKategoriCollection((Collection<Kategori>) kategoriCollection);

            em.getTransaction().begin();
            em.merge(b);
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
//               
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
    private void hapusData() {
        int selectedRow = jTableBuku.getSelectedRow();
        int confirm = JOptionPane.showConfirmDialog(this, "Apakah anda yakin ingin menghapus data?",
                "Konfirmasi Hapus Data", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            String s = (String) jTableBuku.getValueAt(jTableBuku.getSelectedRow(), 0);

            EntityManagerFactory emf = Persistence.createEntityManagerFactory("JendelaKampusPU");
            EntityManager em = emf.createEntityManager();
            try {
                em.getTransaction().begin();

                // Ambil entitas buku yang akan dihapus berdasarkan ID
                Buku b = em.find(Buku.class, s);

                if (b != null) {
                    // Hapus entitas dari database
                    em.remove(b);
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
    }

    private void searchData() {
        try {
            String selection = (String) cbCari.getSelectedItem();
            String searchTerm = tfCari.getText();

            // Building the JPA query dynamically based on the selected criteria
            String queryString = "SELECT b FROM Buku b WHERE ";

            switch (selection.toLowerCase()) {
                case "ID Buku":
                    queryString += "LOWER(b.idBuku) LIKE LOWER(:searchTerm)";
                    break;
                case "ISBN":
                    queryString += "LOWER(b.isbn) LIKE LOWER(:searchTerm)";
                    break;
                case "Judul":
                    queryString += "LOWER(b.judul) LIKE LOWER(:searchTerm)";
                    break;
                case "Bahasa":
                    queryString += "LOWER(b.bahasa) LIKE LOWER(:searchTerm)";
                    break;
                case "Penerbit":
                    queryString += "LOWER(b.penerbit) LIKE LOWER(:searchTerm)";
                    break;
                case "Pengarang":
                    queryString += "LOWER(b.pengarang) LIKE LOWER(:searchTerm)";
                    break;
                default:
                    queryString += "LOWER(b.idBuku) LIKE LOWER(:searchTerm)"
                            + " OR LOWER(b.isbn) LIKE LOWER(:searchTerm)"
                            + " OR LOWER(b.judul) LIKE LOWER(:searchTerm)"
                            + " OR LOWER(b.bahasa) LIKE LOWER(:searchTerm)"
                            + " OR LOWER(b.penerbit) LIKE LOWER(:searchTerm)"
                            + " OR LOWER(b.pengarang) LIKE LOWER(:searchTerm)";
                    break;
            }
            DefaultTableModel model = (DefaultTableModel) jTableBuku.getModel();
            model.setRowCount(0);

            EntityManager em = null;
            try {
                EntityManagerFactory emf = Persistence.createEntityManagerFactory("JendelaKampusPU");
                em = emf.createEntityManager();

                TypedQuery<Buku> query = em.createQuery(queryString, Buku.class
                );
                query.setParameter("searchTerm", "%" + searchTerm + "%");

                List<Buku> results = query.getResultList();

                for (Buku buku : results) {
                    // Tambahkan baris ke model berdasarkan data pengguna
                    model.addRow(new Object[]{
                        buku.getIdBuku(),
                        buku.getIsbn(),
                        buku.getJudul(),
                        buku.getBahasa(),
                        buku.getPenerbit(),
                        buku.getPengarang()});
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            } finally {
                if (em != null && em.isOpen()) {
                    em.close();
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
