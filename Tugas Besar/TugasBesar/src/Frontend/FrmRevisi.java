package Frontend;

import Backend.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmRevisi extends javax.swing.JFrame {

    public FrmRevisi() {
        initComponents();
        tampilkanDataMobil();
        tampilkanDataRental();
        addItemTypeMobil();
        addItemMrkMobil();
        kosongkanForm();
    }

    public void tampilkanDataRental() {
        String[] kolom = {"ID", "Nama", "Mobil", "Tanggal Pinjam", "Tanggal Kembali", "Total Bayar"};
        ArrayList<Rental> ren = new Rental().getAll();
        Object rowData[] = new Object[6];

        tblRental.setModel(new DefaultTableModel(new Object[][]{}, kolom));

        for (int i = 0; i < ren.size(); i++) {
            rowData[0] = ren.get(i).getIdRental();
            rowData[1] = ren.get(i).getCustomer().getNama();
            if (ren.get(i).getManual().getJenisMesin().equals("-")) {
                rowData[2] = ren.get(i).getMatic().getMerek();
            } else {
                rowData[2] = ren.get(i).getManual().getMerek();
            }
            rowData[3] = ren.get(i).getTanggalPinjam();
            rowData[4] = ren.get(i).getTanggalKembali();
            rowData[5] = ren.get(i).getTotalBayar();

            ((DefaultTableModel) tblRental.getModel()).addRow(rowData);
        }
    }

    public void tampilkanDataMobil() {
        if (typeMobil.getSelectedIndex() == 0) {
            String[] kolom = {"Merek", "CC", "Bahan Bakar", "Jenis Mesin", "Jenis Transmisi", "Harga/hari"};
            ArrayList<MobilManual> mob = new MobilManual().getAll();
            ArrayList<MobilMatic> mob1 = new MobilMatic().getAll();
            Object rowData[] = new Object[6];

            tblMobil.setModel(new DefaultTableModel(new Object[][]{}, kolom));

            for (int i = 0; i < mob.size(); i++) {
                rowData[0] = mob.get(i).getMerek();
                rowData[1] = mob.get(i).getCc();
                rowData[2] = mob.get(i).getBahanBakar();
                rowData[3] = mob.get(i).getJenisMesin();
                rowData[4] = mob1.get(i).getJenisTransmisi();
                rowData[5] = mob.get(i).getHarga();

                ((DefaultTableModel) tblMobil.getModel()).addRow(rowData);
            }
        } else if (typeMobil.getSelectedIndex() == 1) {
            String[] kolom = {"Merek", "CC", "Bahan Bakar", "Jenis Mesin", "Harga/hari"};
            ArrayList<MobilManual> mob = new MobilManual().getAll();
            Object rowData[] = new Object[5];

            tblMobil.setModel(new DefaultTableModel(new Object[][]{}, kolom));

            for (int i = 0; i < mob.size(); i++) {
                if (mob.get(i).getJenisMesin().equals("-")) {
                    continue;
                } else {
                    rowData[0] = mob.get(i).getMerek();
                    rowData[1] = mob.get(i).getCc();
                    rowData[2] = mob.get(i).getBahanBakar();
                    rowData[3] = mob.get(i).getJenisMesin();
                    rowData[4] = mob.get(i).getHarga();

                    ((DefaultTableModel) tblMobil.getModel()).addRow(rowData);
                }
            }
        } else if (typeMobil.getSelectedIndex() == 2) {
            String[] kolom = {"Merek", "CC", "Bahan Bakar", "Jenis Transmisi", "Harga/hari"};
            ArrayList<MobilMatic> mob = new MobilMatic().getAll();
            Object rowData[] = new Object[5];

            tblMobil.setModel(new DefaultTableModel(new Object[][]{}, kolom));

            for (int i = 0; i < mob.size(); i++) {
                if (mob.get(i).getJenisTransmisi().equals("-")) {
                    continue;
                } else {
                    rowData[0] = mob.get(i).getMerek();
                    rowData[1] = mob.get(i).getCc();
                    rowData[2] = mob.get(i).getBahanBakar();
                    rowData[3] = mob.get(i).getJenisTransmisi();
                    rowData[4] = mob.get(i).getHarga();

                    ((DefaultTableModel) tblMobil.getModel()).addRow(rowData);
                }
            }
        }
    }

    public void addItemTypeMobil() {
        DefaultComboBoxModel mdl = new DefaultComboBoxModel();
        typeMobil.setModel(mdl);
        mdl.addElement("All");
        mdl.addElement("Manual");
        mdl.addElement("Matic");
        mdl.setSelectedItem("All");
    }

    public void addItemMrkMobil() {
        DefaultComboBoxModel mdl = new DefaultComboBoxModel();
        mrkMobil.setModel(mdl);
        ArrayList<MobilMatic> mob = new MobilMatic().getAll();
        for (int i = 0; i < mob.size(); i++) {
            mdl.addElement(mob.get(i).getMerek());
        }
    }

    public void kosongkanForm() {
        txtIdTransaksi.setText("0");
        txtNik.setText("");
        txtTotal.setText("");
        txtTglKembali.setText("");
        txtTglPinjam.setText("");
    }

    public boolean isValidDate(String inDate) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        dateFormat.setLenient(false);
        try {
            dateFormat.parse(inDate.trim());
        } catch (ParseException pe) {
            return false;
        }
        return true;
    }

    public int cekTypeMobil() {
        int x = 0;
        ArrayList<MobilManual> mob = new MobilManual().getAll();
        for (int i = 0; i < mob.size(); i++) {
            if (mrkMobil.getSelectedItem().equals(mob.get(i).getMerek())) {
                if (mob.get(i).getJenisMesin().equals("-")) {
                    x = 1;
                }
                break;
            }
        }
        return x;
    }

    public int cekIdMobil() {
        int x = 0;
        ArrayList<MobilManual> mob = new MobilManual().getAll();
        for (int i = 0; i < mob.size(); i++) {
            if (mrkMobil.getSelectedItem().equals(mob.get(i).getMerek())) {
                x = mob.get(i).getIdMobil();
                break;
            }
        }
        return x;
    }

    public int cekIdCustomer() {
        int x = 0;
        ArrayList<Customer> cus = new Customer().getAll();
        for (int i = 0; i < cus.size(); i++) {
            if (txtNik.getText().equals(cus.get(i).getNik())) {
                x = cus.get(i).getIdCustomer();
                break;
            }
        }
        return x;
    }

    public int hitungHari() {
        String pinjam = txtThnPinjam.getText()+txtBlnPinjam.getText()+txtTglPinjam.getText();
        String kembali = txtThnKembali.getText()+txtBlnKembali.getText()+txtTglKembali.getText();
        int a = Integer.parseInt(kembali);
        int b = Integer.parseInt(pinjam);
        return a - b + 1;
    }

    public int hitungTotal() {
        int x = 0;
        ArrayList<MobilManual> mob = new MobilManual().getAll();
        for (int i = 0; i < mob.size(); i++) {
            if (mrkMobil.getSelectedItem().equals(mob.get(i).getMerek())) {
                x = mob.get(i).getHarga() * hitungHari();
                break;
            }
        }
        return x;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIdTransaksi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        mrkMobil = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        txtNik = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtBlnPinjam = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtBlnKembali = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRental = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        txtCari = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        btnHitung = new javax.swing.JButton();
        typeMobil = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblMobil = new javax.swing.JTable();
        btnTambahBaru = new javax.swing.JButton();
        txtThnPinjam = new javax.swing.JTextField();
        txtTglPinjam = new javax.swing.JTextField();
        txtTglKembali = new javax.swing.JTextField();
        txtThnKembali = new javax.swing.JTextField();

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

        jLabel1.setFont(new java.awt.Font("Trajan Pro", 1, 48)); // NOI18N
        jLabel1.setText("Rental Mobil");

        jLabel2.setFont(new java.awt.Font("Trajan Pro", 3, 24)); // NOI18N
        jLabel2.setText("Makmur");

        jLabel3.setText("=========================================================================");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("ID Transaksi :");

        txtIdTransaksi.setEnabled(false);
        txtIdTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdTransaksiActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Keterangan Mobil :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Merek Mobil :");

        mrkMobil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        mrkMobil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mrkMobilActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("NIK :");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Tgl Pinjam :");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Tgl Kembali :");

        tblRental.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblRental.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblRental);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("Total Bayar");

        txtTotal.setEnabled(false);

        btnSimpan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSimpan.setText("Simpan Data");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnHapus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnHapus.setLabel("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnCari.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        btnHitung.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnHitung.setText("Hitung Total Bayar");
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });

        typeMobil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        typeMobil.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                typeMobilItemStateChanged(evt);
            }
        });
        typeMobil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeMobilActionPerformed(evt);
            }
        });

        tblMobil.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblMobil.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tblMobil);

        btnTambahBaru.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnTambahBaru.setText("Tambah Baru");
        btnTambahBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahBaruActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSimpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTambahBaru, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCari))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(mrkMobil, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtIdTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(btnHitung))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNik, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(txtTglKembali)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtBlnKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(txtTglPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtBlnPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtThnPinjam)
                                    .addComponent(txtThnKembali))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(typeMobil, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(118, 118, 118))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtIdTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(typeMobil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mrkMobil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(txtNik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txtThnPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBlnPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTglPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtBlnKembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTglKembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtThnKembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHitung)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSimpan)
                        .addComponent(btnTambahBaru)
                        .addComponent(btnHapus))
                    .addComponent(btnCari)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdTransaksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdTransaksiActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        Rental ren = new Rental();
        String pinjam = txtThnPinjam.getText()+"/"+txtBlnPinjam.getText()+"/"+txtTglPinjam.getText();
        String kembali = txtThnKembali.getText()+"/"+txtBlnKembali.getText()+"/"+txtTglKembali.getText();
        boolean tglPinjam = isValidDate(pinjam);
        boolean tglKembali = isValidDate(kembali);
        if (tglKembali == false || tglPinjam == false) {
            JOptionPane.showMessageDialog(this, "Format tanggal salah!");
        } else {
            if (cekIdCustomer() == 0) {
                JOptionPane.showMessageDialog(this, "Customer belum terdaftar!!");
                txtNik.setText("");
            } else {
                Customer newCus = new Customer().getById(cekIdCustomer());
                if (cekTypeMobil() == 0) {
                    MobilManual newMob = new MobilManual().getById(cekIdMobil());
                    ren.setManual(newMob);
                } else {
                    MobilMatic newMob = new MobilMatic().getById(cekIdMobil());
                    ren.setMatic(newMob);
                }
                ren.setCustomer(newCus);
                ren.setIdRental(Integer.parseInt(txtIdTransaksi.getText()));
                ren.setTanggalKembali(kembali);
                ren.setTanggalPinjam(pinjam);
                ren.setTotalBayar(Integer.parseInt(txtTotal.getText()));
                ren.save(cekTypeMobil());
                tampilkanDataRental();
                kosongkanForm();
            }
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCariActionPerformed

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
        txtTotal.setText(String.valueOf(hitungTotal()));
    }//GEN-LAST:event_btnHitungActionPerformed

    private void typeMobilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeMobilActionPerformed
        tampilkanDataMobil();
    }//GEN-LAST:event_typeMobilActionPerformed

    private void mrkMobilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mrkMobilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mrkMobilActionPerformed

    private void typeMobilItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_typeMobilItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_typeMobilItemStateChanged

    private void btnTambahBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahBaruActionPerformed
        kosongkanForm();
    }//GEN-LAST:event_btnTambahBaruActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblRental.getModel();
        int row = tblRental.getSelectedRow();

        Rental ren = new Rental().getById(Integer.parseInt(model.getValueAt(row, 0).toString()));
        ren.delete();
        kosongkanForm();
        tampilkanDataRental();
    }//GEN-LAST:event_btnHapusActionPerformed

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
            java.util.logging.Logger.getLogger(FrmRevisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRevisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRevisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRevisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRevisi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnHitung;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambahBaru;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> mrkMobil;
    private javax.swing.JTable tblMobil;
    private javax.swing.JTable tblRental;
    private javax.swing.JTextField txtBlnKembali;
    private javax.swing.JTextField txtBlnPinjam;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtIdTransaksi;
    private javax.swing.JTextField txtNik;
    private javax.swing.JTextField txtTglKembali;
    private javax.swing.JTextField txtTglPinjam;
    private javax.swing.JTextField txtThnKembali;
    private javax.swing.JTextField txtThnPinjam;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JComboBox<String> typeMobil;
    // End of variables declaration//GEN-END:variables
}
