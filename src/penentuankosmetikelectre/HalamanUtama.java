/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penentuankosmetikelectre;

import Controller.DokumenManager;
import Controller.ELECTRE_TOPSIS;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aris
 */
public class HalamanUtama extends javax.swing.JFrame {

    /**
     * Creates new form HalamanUtama
     */
    
    private ArrayList<double[]> dataKulitNormal;
    private ArrayList<double[]> dataKulitBerminyak;
    private ArrayList<double[]> dataKulitKering;
    
    public HalamanUtama() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CBJenisKulit = new javax.swing.JComboBox<String>();
        BElectreTopsis = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BBrand = new javax.swing.JTextField();
        BKesesuaianKulit = new javax.swing.JTextField();
        BKualitas = new javax.swing.JTextField();
        BEfekSamping = new javax.swing.JTextField();
        BHarga = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblHasilPreferensi = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        Kulit = new javax.swing.JLabel();
        Kosmetik = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Proses Pemilihan Kosmetik", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 16))); // NOI18N

        jLabel1.setText("Pilih Jenis Kulit : ");

        CBJenisKulit.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Normal", "Berminyak", "Kering" }));

        BElectreTopsis.setText("Proses Electre dan Topsis");
        BElectreTopsis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BElectreTopsisActionPerformed(evt);
            }
        });

        jLabel2.setText("Bobot Brand Kosmetik : ");

        jLabel3.setText("Bobot Kesesuaian Jenis Kulit :");

        jLabel4.setText("Bobot Kualitas : ");

        jLabel5.setText("Bobot Efek Samping : ");

        jLabel6.setText("Bobot Harga : ");

        jButton1.setText("Info Pengisian");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BElectreTopsis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BKualitas, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                    .addComponent(BKesesuaianKulit)
                                    .addComponent(BBrand))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(BEfekSamping)
                                            .addComponent(BHarga, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)))
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CBJenisKulit, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(0, 19, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(CBJenisKulit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(BBrand))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(BKesesuaianKulit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(BKualitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BElectreTopsis, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(BEfekSamping, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(BHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tabel Hasil Pemilihan Kosmetik Menggunakan ELECTRE-TOPSIS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 16))); // NOI18N

        TblHasilPreferensi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama", "Nim", "Fakultas", "Jenis Kulit", "Kosmetik", "Nilai Preferensi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TblHasilPreferensi);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addGap(64, 64, 64))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hasil Pemilihan Kosmetik Berdasarkan Jenis Kulit", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 16))); // NOI18N

        Kulit.setText("Jenis Kulit : ");

        Kosmetik.setText("Kosmetik yang dipilih dan cocok adalah ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Kosmetik)
                    .addComponent(Kulit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Kulit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Kosmetik)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BElectreTopsisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BElectreTopsisActionPerformed
        // TODO add your handling code here:
        int baris, kolom, i, j, kode;
        int[] bobotKriteria;
        int[] bestRanking;
        double[] bestValue;
        ArrayList<ArrayList> dataKosmetik;
        double[][] m_dataKosmetik;
        double[][] m_vElectre;
        String[][] dataKosmetikInfo;
        String[] dataAlternatif;
        DokumenManager dokumenManager; 
        ELECTRE_TOPSIS electre_topsis;
        InfoElektreTopsis elektreTopsis;
        
        dokumenManager = new DokumenManager();
        electre_topsis = new ELECTRE_TOPSIS();
        String JenisKulit = CBJenisKulit.getSelectedItem().toString();
        bobotKriteria = new int[5];
        
        if(!BBrand.getText().equals("") && !BKesesuaianKulit.getText().equals("") && !BKualitas.getText().equals("") && !BEfekSamping.getText().equals("") && !BHarga.getText().equals("")){
            try{
                Integer.parseInt(BBrand.getText());
                Integer.parseInt(BKesesuaianKulit.getText());
                Integer.parseInt(BKualitas.getText());
                Integer.parseInt(BEfekSamping.getText());
                Integer.parseInt(BHarga.getText());
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Maaf bobot harus berupa angka");
            }
            
            if(Integer.parseInt(BBrand.getText()) <= 0 || Integer.parseInt(BBrand.getText()) > 5){
                JOptionPane.showMessageDialog(this, "Maaf bobot harus berada pada posisi dimana 0 < brand <= 5.");
                return; 
            }
            
            if(Integer.parseInt(BKesesuaianKulit.getText()) <= 0 || Integer.parseInt(BKesesuaianKulit.getText()) > 5){
                JOptionPane.showMessageDialog(this, "Maaf bobot harus berada pada posisi dimana 0 < kesesuaian kulit <= 5.");
                return; 
            } 
            
            if(Integer.parseInt(BKualitas.getText()) <= 0 || Integer.parseInt(BKualitas.getText()) > 5){
                JOptionPane.showMessageDialog(this, "Maaf bobot harus berada pada posisi dimana 0 < kualitas <= 5.");
                return; 
            }
            
            if(Integer.parseInt(BEfekSamping.getText()) <= 0 || Integer.parseInt(BEfekSamping.getText()) > 5){
                JOptionPane.showMessageDialog(this, "Maaf bobot harus berada pada posisi dimana 0 < efek samping <= 5.");
                return; 
            }
            
            if(Integer.parseInt(BHarga.getText()) <= 0 || Integer.parseInt(BHarga.getText()) > 5){
                JOptionPane.showMessageDialog(this, "Maaf bobot harus berada pada posisi dimana 0 < harga <= 5.");
                return; 
            }
            
            bobotKriteria[0] = Integer.parseInt(BBrand.getText());
            bobotKriteria[1] = Integer.parseInt(BKesesuaianKulit.getText());
            bobotKriteria[2] = Integer.parseInt(BKualitas.getText());
            bobotKriteria[3] = Integer.parseInt(BEfekSamping.getText());
            bobotKriteria[4] = Integer.parseInt(BHarga.getText());

            DefaultTableModel HasilPreferensi_Model = (DefaultTableModel) TblHasilPreferensi.getModel();
            String[] row = new String[6];

            switch (JenisKulit) {
                case "Normal":
                    elektreTopsis = new InfoElektreTopsis();
                    dataKosmetik = dokumenManager.get_data("D:\\Data Proyek\\Dokumen Proyek Skripsi\\UNSRI\\Nadia Tri Oktaviani\\data nadia\\Survey Kosmetik Normal.xlsx");                
                    baris  = dataKosmetik.size()-1;
                    kolom = 5;

                    m_dataKosmetik = new double[baris][5];
                    dataKosmetikInfo = new String[baris][5];
                    dataAlternatif = new String[baris];

                    for(i=0; i<baris; i++){
                        for(j=0; j<kolom; j++){
                            m_dataKosmetik[i][j] = Double.parseDouble(dataKosmetik.get(i+1).get(j+5).toString());
                        }
                    }

                    for(i=0; i<baris; i++){
                        for(j=0; j<kolom; j++){
                            dataKosmetikInfo[i][j] = dataKosmetik.get(i+1).get(j).toString();
                        }
                    }

                    for(i=0; i<baris; i++){
                        dataAlternatif[i] = dataKosmetik.get(i+1).get(4).toString();
                    }

                    electre_topsis.InisialisasiData(m_dataKosmetik);
                    kode = electre_topsis.hitungElectreTopsis(bobotKriteria);
                    bestRanking = electre_topsis.getBestRanking();
                    bestValue = electre_topsis.getBestValue();

                    for(i=TblHasilPreferensi.getRowCount()-1; i>=0; i--){
                        HasilPreferensi_Model.removeRow(i);
                    }

                    System.out.println("best ranking : "+bestRanking.length);
                    System.out.println("data kosmetik : "+dataKosmetikInfo.length);
                    
                    for(i=0; i<5; i++){
                        row[0] = dataKosmetikInfo[bestRanking[i]][0];
                        row[1] = dataKosmetikInfo[bestRanking[i]][1];
                        row[2] = dataKosmetikInfo[bestRanking[i]][2];
                        row[3] = dataKosmetikInfo[bestRanking[i]][3];
                        row[4] = dataKosmetikInfo[bestRanking[i]][4];
                        row[5] = String.valueOf(bestValue[i]);

                        HasilPreferensi_Model.addRow(row);
                    }

                    Kulit.setText("Jenis Kulit : Normal");
                    Kosmetik.setText("Kosmetik yang cocok untuk kulit normal : "+dataAlternatif[kode]);
                    
                    m_vElectre = electre_topsis.getMatriksVElectre();
                    elektreTopsis.setInfoElektreTopsis(bestRanking, bestValue, m_vElectre, dataKosmetikInfo);
                    elektreTopsis.setVisible(true);
                    break;

                case "Berminyak":
                    elektreTopsis = new InfoElektreTopsis();
                    dataKosmetik = dokumenManager.get_data("D:\\Data Proyek\\Dokumen Proyek Skripsi\\UNSRI\\Nadia Tri Oktaviani\\data nadia\\Survey Kosmetik Berminyak.xlsx");
                    baris  = dataKosmetik.size()-1;
                    kolom = 5;

                    m_dataKosmetik = new double[baris][5];
                    dataKosmetikInfo = new String[baris][5];
                    dataAlternatif = new String[baris];

                    for(i=0; i<baris; i++){
                        for(j=0; j<kolom; j++){
                            m_dataKosmetik[i][j] = Double.parseDouble(dataKosmetik.get(i+1).get(j+5).toString());
                        }
                    }

                    for(i=0; i<baris; i++){
                        for(j=0; j<kolom; j++){
                            dataKosmetikInfo[i][j] = dataKosmetik.get(i+1).get(j).toString();
                        }
                    }

                    for(i=0; i<baris; i++){
                        dataAlternatif[i] = dataKosmetik.get(i+1).get(4).toString();
                    }

                    electre_topsis.InisialisasiData(m_dataKosmetik);
                    kode = electre_topsis.hitungElectreTopsis(bobotKriteria);
                    bestRanking = electre_topsis.getBestRanking();
                    bestValue = electre_topsis.getBestValue();

                    for(i=TblHasilPreferensi.getRowCount()-1; i>=0; i--){
                        HasilPreferensi_Model.removeRow(i);
                    }

                    for(i=0; i<5; i++){
                        row[0] = dataKosmetikInfo[bestRanking[i]][0];
                        row[1] = dataKosmetikInfo[bestRanking[i]][1];
                        row[2] = dataKosmetikInfo[bestRanking[i]][2];
                        row[3] = dataKosmetikInfo[bestRanking[i]][3];
                        row[4] = dataKosmetikInfo[bestRanking[i]][4];
                        row[5] = String.valueOf(bestValue[i]);

                        HasilPreferensi_Model.addRow(row);
                    }

                    Kulit.setText("Jenis Kulit : Berminyak");
                    Kosmetik.setText("Kosmetik yang cocok untuk kulit berminyak : "+dataAlternatif[kode]);
                    
                    m_vElectre = electre_topsis.getMatriksVElectre();
                    elektreTopsis.setInfoElektreTopsis(bestRanking, bestValue, m_vElectre, dataKosmetikInfo);
                    elektreTopsis.setVisible(true);
                    break;

                case "Kering":
                    elektreTopsis = new InfoElektreTopsis();
                    dataKosmetik = dokumenManager.get_data("D:\\Data Proyek\\Dokumen Proyek Skripsi\\UNSRI\\Nadia Tri Oktaviani\\data nadia\\Survey Kosmetik Kering.xlsx");
                    baris  = dataKosmetik.size()-1;
                    kolom = 5;

                    m_dataKosmetik = new double[baris][5];
                    dataKosmetikInfo = new String[baris][5];
                    dataAlternatif = new String[baris];

                    for(i=0; i<baris; i++){
                        for(j=0; j<kolom; j++){
                            m_dataKosmetik[i][j] = Double.parseDouble(dataKosmetik.get(i+1).get(j+5).toString());
                        }
                    }

                    for(i=0; i<baris; i++){
                        for(j=0; j<kolom; j++){
                            dataKosmetikInfo[i][j] = dataKosmetik.get(i+1).get(j).toString();
                        }
                    }

                    for(i=0; i<baris; i++){
                        dataAlternatif[i] = dataKosmetik.get(i+1).get(4).toString();
                    }

                    electre_topsis.InisialisasiData(m_dataKosmetik);
                    kode = electre_topsis.hitungElectreTopsis(bobotKriteria);
                    bestRanking = electre_topsis.getBestRanking();
                    bestValue = electre_topsis.getBestValue();

                    for(i=TblHasilPreferensi.getRowCount()-1; i>=0; i--){
                        HasilPreferensi_Model.removeRow(i);
                    }

                    for(i=0; i<5; i++){
                        row[0] = dataKosmetikInfo[bestRanking[i]][0];
                        row[1] = dataKosmetikInfo[bestRanking[i]][1];
                        row[2] = dataKosmetikInfo[bestRanking[i]][2];
                        row[3] = dataKosmetikInfo[bestRanking[i]][3];
                        row[4] = dataKosmetikInfo[bestRanking[i]][4];
                        row[5] = String.valueOf(bestValue[i]);

                        HasilPreferensi_Model.addRow(row);
                    }

                    Kulit.setText("Jenis Kulit : Kering");
                    Kosmetik.setText("Kosmetik yang cocok untuk kulit kering : "+dataAlternatif[kode]);
                    
                    m_vElectre = electre_topsis.getMatriksVElectre();
                    elektreTopsis.setInfoElektreTopsis(bestRanking, bestValue, m_vElectre, dataKosmetikInfo);
                    elektreTopsis.setVisible(true);
                    break;
                default:
                    JOptionPane.showMessageDialog(this, "Maaf data jenis kulit yang anda pilih belum tersedia");
                    break;
            }
            
            
        }    
        else{
            JOptionPane.showMessageDialog(this, "Maaf anda belum mengisi bobot kriteria dengan lengkap.");
        }
    }//GEN-LAST:event_BElectreTopsisActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        InfoPengisian infoPengisian = new InfoPengisian();
        infoPengisian.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(HalamanUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HalamanUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HalamanUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HalamanUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HalamanUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BBrand;
    private javax.swing.JTextField BEfekSamping;
    private javax.swing.JButton BElectreTopsis;
    private javax.swing.JTextField BHarga;
    private javax.swing.JTextField BKesesuaianKulit;
    private javax.swing.JTextField BKualitas;
    private javax.swing.JComboBox<String> CBJenisKulit;
    private javax.swing.JLabel Kosmetik;
    private javax.swing.JLabel Kulit;
    private javax.swing.JTable TblHasilPreferensi;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
