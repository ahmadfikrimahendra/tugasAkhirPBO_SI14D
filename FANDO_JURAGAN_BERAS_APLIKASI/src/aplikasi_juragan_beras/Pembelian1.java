/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi_juragan_beras;

import java.sql.ResultSet;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASPIREV5471G
 */
public class Pembelian1 extends javax.swing.JInternalFrame {
Koneksi k = new Koneksi();
ResultSet rs = null;
    /**
     * Creates new form Pembelian1
     */
    public void tampilkandata(){
DefaultTableModel tbbeli = new DefaultTableModel();
        tbbeli.addColumn("No. Transaksi");
        tbbeli.addColumn("Id Pemasok");
        tbbeli.addColumn("Nama Pemasok");
        tbbeli.addColumn("Alamat");
        tbbeli.addColumn("Tanggal Transaksi");
        tbbeli.addColumn("Jenis Beras");
        tbbeli.addColumn("Harga");
        tbbeli.addColumn("Jumlah Beli");
        tbbeli.addColumn("Total");
        tbbeli.addColumn("Bayar");
        tbbeli.addColumn("Kembali");
        
        
        try {
            rs=k.ambilData("select * from tbl_beli");
            
            
            while (rs.next()) {
                tbbeli.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)
                ,rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11)});
            }
           jTable1.setModel(tbbeli);
        notrans.setText("");
        idpemasok.setText("");
        namapemasok.setText("");
        alamat.setText("");
        ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).setText("");
        jenis.setSelectedItem("Pandan Wangi");
        jumlahbeli.setText("");
        harga.setText("");
        total.setText("");
        bayar.setText("");
        kembali.setText("");
        
        notrans.setEnabled(true);
        idpemasok.setEnabled(true);
        namapemasok.setEnabled(true);
        alamat.setEnabled(true);
        notrans.requestFocus();
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Table Tidak Ditemukan");
        }
}
    public Pembelian1() {
        initComponents();
            }
    
    int total3,bayar1;
    void hitung(){
        int hargajual,jumlahbeli2;
        hargajual = Integer.parseInt(harga.getText());
        jumlahbeli2 = Integer.parseInt(jumlahbeli.getText());
        total3=hargajual*jumlahbeli2;
        total.setText(""+total3);
    }
    void kembalian(){
        int kembalian;
        bayar1 = Integer.parseInt(bayar.getText());
        kembalian=bayar1-total3;
        kembali.setText(""+kembalian);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        notrans = new javax.swing.JTextField();
        idpemasok = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        namapemasok = new javax.swing.JTextField();
        alamat = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jenis = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jumlahbeli = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        bayar = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        kembali = new javax.swing.JTextField();
        bttnCari = new javax.swing.JButton();
        bttnEdit = new javax.swing.JButton();
        bttnHapus = new javax.swing.JButton();
        bttnSimpan = new javax.swing.JButton();
        bttnTampil = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        harga = new javax.swing.JTextField();
        bttnHitung = new javax.swing.JButton();
        bttnHitungKembalian = new javax.swing.JButton();
        bttnKliID = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("TRANSAKSI PEMBELIAN");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("No.Transaksi");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Id Pemasok");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Nama Pemasok");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Alamat");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Tanggal Transaksi");

        jenis.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Rojolele", "Manggis", "Pandan Wangi", "ABC" }));
        jenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jenisActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Jenis Beras");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Jumlah Beli");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Total");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("Bayar");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("Kembali");

        bttnCari.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        bttnCari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi/penjualan/Gambar/cr.jpg"))); // NOI18N
        bttnCari.setText("Cari");
        bttnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnCariActionPerformed(evt);
            }
        });

        bttnEdit.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        bttnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi/penjualan/Gambar/ed.jpg"))); // NOI18N
        bttnEdit.setText("Edit");
        bttnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnEditActionPerformed(evt);
            }
        });

        bttnHapus.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        bttnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi/penjualan/Gambar/dt.jpg"))); // NOI18N
        bttnHapus.setText("Hapus");
        bttnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnHapusActionPerformed(evt);
            }
        });

        bttnSimpan.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        bttnSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi/penjualan/Gambar/sv.jpg"))); // NOI18N
        bttnSimpan.setText("Simpan");
        bttnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnSimpanActionPerformed(evt);
            }
        });

        bttnTampil.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        bttnTampil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi/penjualan/Gambar/tm.jpg"))); // NOI18N
        bttnTampil.setText("Tampilan");
        bttnTampil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnTampilActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No. Transaksi", "Id Pemasok", "Nama Pemasok", "Alamat", "Tanggal Transaksi", "Jenis Beras", "Jumlah Beli", "Total", "Bayar", "Kembali"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("Harga");

        bttnHitung.setText("Hitung");
        bttnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnHitungActionPerformed(evt);
            }
        });

        bttnHitungKembalian.setText("Hitung Kembalian");
        bttnHitungKembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnHitungKembalianActionPerformed(evt);
            }
        });

        bttnKliID.setText("Klik ID");
        bttnKliID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnKliIDActionPerformed(evt);
            }
        });

        jDateChooser1.setDateFormatString("d MMM yyyy");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel12))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jenis, 0, 230, Short.MAX_VALUE)
                                    .addComponent(namapemasok, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                    .addComponent(alamat, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                    .addComponent(jumlahbeli, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                    .addComponent(idpemasok)
                                    .addComponent(notrans, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(harga, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(87, 87, 87)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel11)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bttnKliID)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(210, 210, 210)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(bttnSimpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(bttnCari, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(bttnHapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(bttnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                            .addComponent(bttnTampil, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(56, 56, 56)
                                                .addComponent(bttnHitung, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(bttnHitungKembalian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(18, 18, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(total)
                                            .addComponent(bayar)
                                            .addComponent(kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(18, 36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(notrans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(idpemasok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bttnKliID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(namapemasok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bttnCari)
                            .addComponent(bttnEdit))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bttnSimpan)
                            .addComponent(bttnHapus))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bttnTampil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(bttnHitungKembalian)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bttnHitung)
                        .addGap(13, 13, 13)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(bayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(kembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jumlahbeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnCariActionPerformed
    String notr=notrans.getText();
        DefaultTableModel tbcari = new DefaultTableModel();
         tbcari.addColumn("No. Transaksi");
        tbcari.addColumn("Id Pemasok");
        tbcari.addColumn("Nama Pemasok");
        tbcari.addColumn("Alamat");
        tbcari.addColumn("Tanggal Transaksi");
        tbcari.addColumn("Jenis Beras");
        tbcari.addColumn("Jumlah Beli");
        tbcari.addColumn("Harga");
        tbcari.addColumn("Total");
        tbcari.addColumn("Bayar");
        tbcari.addColumn("Kembali");
        if(notr.equals("")){
            JOptionPane.showMessageDialog(rootPane, "NO TRANSAKSI HARUS DI ISI", "INFORMASI", WIDTH, null);
                notrans.requestFocus();
        }
        else{
         try {
             rs=k.ambilData("Select * from tbl_beli where No ='"+notr+"'");
             
            if (rs.next()) {
               
        idpemasok.setText(rs.getString(2));
        namapemasok.setText(rs.getString(3));
        alamat.setText(rs.getString(4));
        ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).setText(rs.getString(5));
        jenis.setSelectedItem(rs.getString(6));
        jumlahbeli.setText(rs.getString(7));
        harga.setText(rs.getString(8));
        total.setText(rs.getString(9));
        bayar.setText(rs.getString(10));
        kembali.setText(rs.getString(11));
        
        tbcari.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)
        ,rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11)});
            
                jTable1.setModel(tbcari);
            notrans.setEnabled(false);
            idpemasok.setEnabled(false);
            namapemasok.setEnabled(false);
            alamat.setEnabled(false);
            jDateChooser1.requestFocus();
           
            }          
           
           else{
                   JOptionPane.showMessageDialog(rootPane, "DATA TIDAK DITEMUKAN ");
                   notrans.requestFocus();
                   }
        } catch (Exception e) {
        JOptionPane.showMessageDialog(rootPane, "Error Pengambilan Data ");
        }
        }    // TODO add your handling code here:
    }//GEN-LAST:event_bttnCariActionPerformed

    private void bttnTampilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnTampilActionPerformed
    tampilkandata();    // TODO add your handling code here:
    }//GEN-LAST:event_bttnTampilActionPerformed

    private void bttnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnSimpanActionPerformed
    String notransaksi=notrans.getText();
        String idpemaso=idpemasok.getText();
        String namapemas=namapemasok.getText();
        String alamatt=alamat.getText();
        String tgl = ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText();
        String jnisberas=jenis.getSelectedItem().toString();
        String jmlhbeli=jumlahbeli.getText();
        String hrga=harga.getText();
        String totall=total.getText();
        String byr=bayar.getText();
        String kmbl=kembali.getText();

        boolean j = k.simpanData("insert into tbl_beli value('"+notransaksi+"','"+idpemaso+"','"+namapemas+"','"+alamatt+"','"+tgl+"'"
            + ",'"+jnisberas+"','"+jmlhbeli+"','"+hrga+"','"+totall+"','"+byr+"','"+kmbl+"')");
        tampilkandata();
    }//GEN-LAST:event_bttnSimpanActionPerformed

    private void bttnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnHapusActionPerformed
    int hasil = JOptionPane.showConfirmDialog(null, "Apakah Anda Yakin ingin Hapus?", "Yakin?", JOptionPane.YES_NO_OPTION);
        if (hasil == 0) {
        try{
        int baris=jTable1.getSelectedRow();
        String not=(String)jTable1.getModel().getValueAt(baris, 0);
        boolean j=k.simpanData("delete from tbl_beli where `No` ='"+not+"'");
        tampilkandata();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "KLIK PADA TABLENYA");
        }
        }
        else{
            tampilkandata();
        }
    }//GEN-LAST:event_bttnHapusActionPerformed

    private void bttnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnEditActionPerformed
    DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        String no=notrans.getText();
        String id=idpemasok.getText();
        String namapem=namapemasok.getText();
        String alamat2=alamat.getText();
        String tgltrans = ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText();
        String jnis=jenis.getSelectedItem().toString();
        String jumlahbel=jumlahbeli.getText();
        String hrg=harga.getText();
        String tot=total.getText();
        String bayar2=bayar.getText();
        String kmbl=kembali.getText();
        
        if((no.equals(""))||(id.equals(""))||(namapem.equals(""))||(alamat2.equals(""))
                ||(tgltrans.equals(""))||(jnis.equals(""))||(jumlahbel.equals(""))
                ||(hrg.equals(""))||(tot.equals(""))
                ||(bayar2.equals(""))||(kmbl.equals(""))){
                JOptionPane.showMessageDialog(rootPane, "Data Ada Yang Kosong", "INFORMASI", WIDTH, null);
                notrans.requestFocus();
                
            }
            else {
         boolean j=k.simpanData("UPDATE `tbl_beli` SET `No` ='"+no+"'," +
                                "`Id` = '"+id+"'," +
                                "`Nama Pemasok` = '"+namapem+"'," +
                                "`Alamat` = '"+alamat2+"'," +
                                "`Tanggal Transaksi` = '"+tgltrans+"'," +
                                "`Jenis Beras` = '"+jnis+"'," +
                                "`Jumlah Beli` = '"+jumlahbel+"'," +
                                "`Harga` = '"+hrg+"'," +
                                "`Total` = '"+tot+"'," +
                                "`Bayar` = '"+bayar2+"'," +
                                "`Kembali` = '"+kmbl+"'" +
                                "WHERE `No` = '"+no+"'" +
                                "AND `Id` = '"+id+"'");
        JOptionPane.showMessageDialog(rootPane, "Berhasil di Update");     
        tampilkandata();
        }    // TODO add your handling code here:
    }//GEN-LAST:event_bttnEditActionPerformed

    private void bttnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnHitungActionPerformed
    hitung();    // TODO add your handling code here:
    }//GEN-LAST:event_bttnHitungActionPerformed

    private void bttnHitungKembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnHitungKembalianActionPerformed
    kembalian();    // TODO add your handling code here:
    }//GEN-LAST:event_bttnHitungKembalianActionPerformed

    private void bttnKliIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnKliIDActionPerformed
    String id=idpemasok.getText();
        DefaultTableModel tbjual = new DefaultTableModel();
       
        tbjual.addColumn("Id Pemasok");
        tbjual.addColumn("Nama Pemasok");
        tbjual.addColumn("Alamat");
        
        if(id.equals("")){
            JOptionPane.showMessageDialog(rootPane, "ID HARUS DI ISI", "INFORMASI", WIDTH, null);
                idpemasok.requestFocus();
        }
        else{
         try {
            rs=k.ambilData("Select * from tbl_pemasok where Id='"+id+"'");
             
            if (rs.next()) {
        
        namapemasok.setText(rs.getString(2));
        alamat.setText(rs.getString(3));
        idpemasok.setEnabled(false);
        namapemasok.setEnabled(false);
        alamat.setEnabled(false);
        jDateChooser1.requestFocus();
            }          
            else{
                JOptionPane.showMessageDialog(rootPane, "Data Tidak Ditemukan");
                idpemasok.requestFocus();
            }
           } catch (Exception e) {
        JOptionPane.showMessageDialog(rootPane, "Error Pengambilan Data ");
        }
        }
    }//GEN-LAST:event_bttnKliIDActionPerformed

    private void jenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenisActionPerformed
    String h = jenis.getSelectedItem().toString();
        if("Rojolele".equals(h)){
            harga.setText("225500");
            
        }
        else if("Manggis".equals(h)){
            harga.setText("212000");
            
        }
        else if("Pandan Wangi".equals(h)){
            harga.setText("250000");
        }
        else {
            harga.setText("200000");
        }
    }//GEN-LAST:event_jenisActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
    DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
    notrans.setText(dtm.getValueAt(jTable1.getSelectedRow(), 0).toString());
    idpemasok.setText(dtm.getValueAt(jTable1.getSelectedRow(), 1).toString());
    namapemasok.setText(dtm.getValueAt(jTable1.getSelectedRow(), 2).toString());
    alamat.setText(dtm.getValueAt(jTable1.getSelectedRow(), 3).toString());
   ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).setText(dtm.getValueAt(jTable1.getSelectedRow(), 4).toString());
    jenis.setSelectedItem(dtm.getValueAt(jTable1.getSelectedRow(), 5).toString());
    jumlahbeli.setText(dtm.getValueAt(jTable1.getSelectedRow(), 6).toString());
    harga.setText(dtm.getValueAt(jTable1.getSelectedRow(), 7).toString());
    total.setText(dtm.getValueAt(jTable1.getSelectedRow(), 8).toString());
    bayar.setText(dtm.getValueAt(jTable1.getSelectedRow(), 9).toString());
    kembali.setText(dtm.getValueAt(jTable1.getSelectedRow(), 10).toString());
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamat;
    private javax.swing.JTextField bayar;
    private javax.swing.JButton bttnCari;
    private javax.swing.JButton bttnEdit;
    private javax.swing.JButton bttnHapus;
    private javax.swing.JButton bttnHitung;
    private javax.swing.JButton bttnHitungKembalian;
    private javax.swing.JButton bttnKliID;
    private javax.swing.JButton bttnSimpan;
    private javax.swing.JButton bttnTampil;
    private javax.swing.JTextField harga;
    private javax.swing.JTextField idpemasok;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox jenis;
    private javax.swing.JTextField jumlahbeli;
    private javax.swing.JTextField kembali;
    private javax.swing.JTextField namapemasok;
    private javax.swing.JTextField notrans;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}
