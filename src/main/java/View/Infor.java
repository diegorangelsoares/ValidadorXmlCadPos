/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vinicius
 */
public class Infor extends javax.swing.JFrame {
    //criação dos nomes das colunas da Tabela
    DefaultTableModel Produtos = new DefaultTableModel(null, new String[]
            {"cod","Nome","NCM",
                    "CFOP","Und","Qtd","Valor und","Valor","Und Tributaria",
                    "Qtd Tributaria","Vl Tributaria","Indtot"});

//
//
////    List&lt;LerArquivoXML&gt; ProdXML;
//    /**
//     * Creates new form Infor
//     */
//    public Infor() {
//        initComponents();
//    }
//
//    /**
//     * This method is called from within the constructor to initialize the form.
//     * WARNING: Do NOT modify this code. The content of this method is always
//     * regenerated by the Form Editor.
//     */
//    @SuppressWarnings("unchecked")
//    // &lt;editor-fold defaultstate="collapsed" desc="Generated Code"&gt;
//    private void initComponents() {
//
//        jLabel3 = new javax.swing.JLabel();
//        jTNumNF = new javax.swing.JTextField();
//        jButton1 = new javax.swing.JButton();
//        jButton2 = new javax.swing.JButton();
//        jTArquivo = new javax.swing.JTextField();
//        jPanel1 = new javax.swing.JPanel();
//        jTEmitente = new javax.swing.JTextField();
//        jTEndEmit = new javax.swing.JTextField();
//        jTNumEmit = new javax.swing.JTextField();
//        jTCplEmit = new javax.swing.JTextField();
//        jTMunEmit = new javax.swing.JTextField();
//        jTUFemit = new javax.swing.JTextField();
//        jTBairroEmit = new javax.swing.JTextField();
//        jTCNPJemit = new javax.swing.JFormattedTextField();
//        jTCEPEmit = new javax.swing.JFormattedTextField();
//        jPanel2 = new javax.swing.JPanel();
//        jTDest = new javax.swing.JTextField();
//        jTEndDest = new javax.swing.JTextField();
//        jTNumDest = new javax.swing.JTextField();
//        jTCplDest = new javax.swing.JTextField();
//        jTMunDest = new javax.swing.JTextField();
//        jTUFDest = new javax.swing.JTextField();
//        jTBairroDest = new javax.swing.JTextField();
//        jTCNPJDest = new javax.swing.JFormattedTextField();
//        jTCEPDest = new javax.swing.JFormattedTextField();
//        jScrollPane1 = new javax.swing.JScrollPane();
//        jTable1 = new javax.swing.JTable();
//        jLabel1 = new javax.swing.JLabel();
//        jProgressBar1 = new javax.swing.JProgressBar();
//
//        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
//
//        jLabel3.setText("Num. Nfe:");
//
//        jButton1.setText("MOSTRAR");
//
//        jButton2.setText("Arquivo");
//        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
//        jButton2.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                jButton2ActionPerformed(evt);
//            }
//        });
//
//        jTArquivo.setEditable(false);
//        jTArquivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Caminho do Arquivo:"));
//
//        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Emitente"));
//
//        jTEmitente.setForeground(new java.awt.Color(0, 0, 255));
//        jTEmitente.setBorder(javax.swing.BorderFactory.createTitledBorder("Emitente:"));
//        jTEmitente.setDisabledTextColor(new java.awt.Color(204, 204, 204));
//        jTEmitente.setSelectedTextColor(new java.awt.Color(0, 0, 204));
//
//        jTEndEmit.setForeground(new java.awt.Color(0, 0, 255));
//        jTEndEmit.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço:"));
//        jTEndEmit.setDisabledTextColor(new java.awt.Color(204, 204, 204));
//        jTEndEmit.setSelectedTextColor(new java.awt.Color(0, 0, 204));
//
//        jTNumEmit.setForeground(new java.awt.Color(0, 0, 255));
//        jTNumEmit.setBorder(javax.swing.BorderFactory.createTitledBorder("Numero:"));
//        jTNumEmit.setDisabledTextColor(new java.awt.Color(204, 204, 204));
//        jTNumEmit.setSelectedTextColor(new java.awt.Color(0, 0, 255));
//
//        jTCplEmit.setForeground(new java.awt.Color(0, 0, 255));
//        jTCplEmit.setBorder(javax.swing.BorderFactory.createTitledBorder("Complemento:"));
//        jTCplEmit.setDisabledTextColor(new java.awt.Color(204, 204, 204));
//        jTCplEmit.setSelectedTextColor(new java.awt.Color(0, 0, 204));
//
//        jTMunEmit.setForeground(new java.awt.Color(0, 0, 255));
//        jTMunEmit.setBorder(javax.swing.BorderFactory.createTitledBorder("Municipio:"));
//        jTMunEmit.setDisabledTextColor(new java.awt.Color(204, 204, 204));
//        jTMunEmit.setSelectedTextColor(new java.awt.Color(0, 0, 204));
//
//        jTUFemit.setForeground(new java.awt.Color(0, 0, 255));
//        jTUFemit.setBorder(javax.swing.BorderFactory.createTitledBorder("UF:"));
//        jTUFemit.setDisabledTextColor(new java.awt.Color(204, 204, 204));
//        jTUFemit.setSelectedTextColor(new java.awt.Color(0, 0, 204));
//
//        jTBairroEmit.setForeground(new java.awt.Color(0, 0, 255));
//        jTBairroEmit.setBorder(javax.swing.BorderFactory.createTitledBorder("Bairro:"));
//        jTBairroEmit.setDisabledTextColor(new java.awt.Color(204, 204, 204));
//        jTBairroEmit.setSelectedTextColor(new java.awt.Color(0, 0, 204));
//
//        jTCNPJemit.setBorder(javax.swing.BorderFactory.createTitledBorder("CNPJ:"));
//        jTCNPJemit.setForeground(new java.awt.Color(0, 0, 255));
//        try {
//            jTCNPJemit.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
//        } catch (java.text.ParseException ex) {
//            ex.printStackTrace();
//        }
//        jTCNPJemit.setText("24.343.546/0001-76");
//        jTCNPJemit.setDisabledTextColor(new java.awt.Color(204, 204, 204));
//        jTCNPJemit.setSelectedTextColor(new java.awt.Color(0, 0, 204));
//
//        jTCEPEmit.setBorder(javax.swing.BorderFactory.createTitledBorder("CEP:"));
//        jTCEPEmit.setForeground(new java.awt.Color(0, 0, 255));
//        try {
//            jTCEPEmit.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
//        } catch (java.text.ParseException ex) {
//            ex.printStackTrace();
//        }
//        jTCEPEmit.setText("59073-343");
//        jTCEPEmit.setDisabledTextColor(new java.awt.Color(204, 204, 204));
//        jTCEPEmit.setSelectedTextColor(new java.awt.Color(0, 0, 204));
//
//        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
//        jPanel1.setLayout(jPanel1Layout);
//        jPanel1Layout.setHorizontalGroup(
//                jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
//                        .add(jPanel1Layout.createSequentialGroup()
//                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
//                                        .add(jPanel1Layout.createSequentialGroup()
//                                                .add(jTEndEmit, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 452, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
//                                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
//                                                .add(jTNumEmit, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 73, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
//                                        .add(jPanel1Layout.createSequentialGroup()
//                                                .add(jTMunEmit, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 281, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
//                                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
//                                                .add(jTUFemit, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
//                                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
//                                                .add(jTCEPEmit, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
//                                        .add(jPanel1Layout.createSequentialGroup()
//                                                .add(jTCplEmit, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 281, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
//                                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
//                                                .add(jTBairroEmit, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 244, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
//                                        .add(jTCNPJemit, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
//                                        .add(jTEmitente, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 354, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
//                                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
//        );
//        jPanel1Layout.setVerticalGroup(
//                jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
//                        .add(jPanel1Layout.createSequentialGroup()
//                                .add(jTCNPJemit, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
//                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
//                                .add(jTEmitente, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
//                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
//                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
//                                        .add(jTEndEmit, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
//                                        .add(jTNumEmit, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
//                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
//                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
//                                        .add(jTCplEmit, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
//                                        .add(jTBairroEmit, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
//                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
//                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
//                                        .add(jTMunEmit, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
//                                        .add(jTUFemit, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
//                                        .add(jTCEPEmit, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
//        );
//
//        jPanel1Layout.linkSize(new java.awt.Component[] {jTBairroEmit, jTCEPEmit, jTCNPJemit, jTCplEmit, jTEmitente, jTEndEmit, jTMunEmit, jTNumEmit, jTUFemit}, org.jdesktop.layout.GroupLayout.VERTICAL);
//
//        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Destinatario:"));
//
//        jTDest.setForeground(new java.awt.Color(0, 0, 255));
//        jTDest.setText("MARCUS VINICIUS");
//        jTDest.setBorder(javax.swing.BorderFactory.createTitledBorder("Destinatario:"));
//        jTDest.setDisabledTextColor(new java.awt.Color(204, 204, 204));
//        jTDest.setSelectedTextColor(new java.awt.Color(0, 51, 255));
//
//        jTEndDest.setForeground(java.awt.Color.blue);
//        jTEndDest.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço:"));
//        jTEndDest.setDisabledTextColor(new java.awt.Color(204, 204, 204));
//        jTEndDest.setSelectedTextColor(new java.awt.Color(0, 51, 255));
//
//        jTNumDest.setForeground(java.awt.Color.blue);
//        jTNumDest.setBorder(javax.swing.BorderFactory.createTitledBorder("Numero:"));
//        jTNumDest.setDisabledTextColor(new java.awt.Color(204, 204, 204));
//        jTNumDest.setSelectedTextColor(new java.awt.Color(0, 51, 255));
//
//        jTCplDest.setForeground(java.awt.Color.blue);
//        jTCplDest.setBorder(javax.swing.BorderFactory.createTitledBorder("Complemento:"));
//        jTCplDest.setDisabledTextColor(new java.awt.Color(204, 204, 204));
//        jTCplDest.setSelectedTextColor(new java.awt.Color(0, 51, 255));
//
//        jTMunDest.setForeground(java.awt.Color.blue);
//        jTMunDest.setBorder(javax.swing.BorderFactory.createTitledBorder("Municipio:"));
//        jTMunDest.setDisabledTextColor(new java.awt.Color(204, 204, 204));
//        jTMunDest.setSelectedTextColor(new java.awt.Color(0, 51, 255));
//
//        jTUFDest.setForeground(java.awt.Color.blue);
//        jTUFDest.setBorder(javax.swing.BorderFactory.createTitledBorder("UF:"));
//        jTUFDest.setDisabledTextColor(new java.awt.Color(204, 204, 204));
//        jTUFDest.setSelectedTextColor(new java.awt.Color(0, 51, 255));
//
//        jTBairroDest.setForeground(java.awt.Color.blue);
//        jTBairroDest.setBorder(javax.swing.BorderFactory.createTitledBorder("Bairro:"));
//        jTBairroDest.setDisabledTextColor(new java.awt.Color(204, 204, 204));
//        jTBairroDest.setSelectedTextColor(new java.awt.Color(0, 51, 255));
//
//        jTCNPJDest.setBorder(javax.swing.BorderFactory.createTitledBorder("CNPJ:"));
//        jTCNPJDest.setForeground(java.awt.Color.blue);
//        try {
//            jTCNPJDest.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
//        } catch (java.text.ParseException ex) {
//            ex.printStackTrace();
//        }
//        jTCNPJDest.setText("02.434.564/0001-12");
//        jTCNPJDest.setDisabledTextColor(new java.awt.Color(204, 204, 204));
//        jTCNPJDest.setSelectedTextColor(new java.awt.Color(0, 51, 255));
//
//        jTCEPDest.setBorder(javax.swing.BorderFactory.createTitledBorder("CEP:"));
//        jTCEPDest.setForeground(java.awt.Color.blue);
//        try {
//            jTCEPDest.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
//        } catch (java.text.ParseException ex) {
//            ex.printStackTrace();
//        }
//        jTCEPDest.setText("59073-343");
//        jTCEPDest.setDisabledTextColor(new java.awt.Color(204, 204, 204));
//        jTCEPDest.setSelectedTextColor(new java.awt.Color(0, 51, 255));
//
//        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
//        jPanel2.setLayout(jPanel2Layout);
//        jPanel2Layout.setHorizontalGroup(
//                jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
//                        .add(jPanel2Layout.createSequentialGroup()
//                                .addContainerGap()
//                                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
//                                        .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
//                                                .add(0, 1, Short.MAX_VALUE)
//                                                .add(jTCplDest, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 281, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
//                                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
//                                                .add(jTBairroDest, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 243, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
//                                        .add(jPanel2Layout.createSequentialGroup()
//                                                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
//                                                        .add(jTDest, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 354, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
//                                                        .add(jTCNPJDest, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
//                                                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
//                                        .add(jPanel2Layout.createSequentialGroup()
//                                                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
//                                                        .add(jPanel2Layout.createSequentialGroup()
//                                                                .add(jTEndDest, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 452, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
//                                                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
//                                                                .add(jTNumDest, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 72, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
//                                                        .add(jPanel2Layout.createSequentialGroup()
//                                                                .add(jTMunDest, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 281, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
//                                                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
//                                                                .add(jTUFDest, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
//                                                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
//                                                                .add(jTCEPDest, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
//                                                .add(0, 0, Short.MAX_VALUE))))
//        );
//        jPanel2Layout.setVerticalGroup(
//                jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
//                        .add(jPanel2Layout.createSequentialGroup()
//                                .add(jTCNPJDest, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
//                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
//                                .add(jTDest, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
//                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
//                                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
//                                        .add(jTNumDest)
//                                        .add(jTEndDest))
//                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
//                                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
//                                        .add(jTBairroDest)
//                                        .add(jTCplDest, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
//                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
//                                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
//                                        .add(jTMunDest, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
//                                        .add(jTUFDest, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
//                                        .add(jTCEPDest, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
//        );
//
//        jTable1.setModel(Produtos);
//        jScrollPane1.setViewportView(jTable1);
//
//        jLabel1.setText("Itens da Nf-E:");
//
//        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
//        getContentPane().setLayout(layout);
//        layout.setHorizontalGroup(
//                layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
//                        .add(layout.createSequentialGroup()
//                                .addContainerGap()
//                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
//                                        .add(layout.createSequentialGroup()
//                                                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
//                                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
//                                                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
//                                        .add(layout.createSequentialGroup()
//                                                .add(jTArquivo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 943, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
//                                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                                                .add(jButton2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 135, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
//                                        .add(jScrollPane1))
//                                .addContainerGap())
//                        .add(layout.createSequentialGroup()
//                                .add(6, 6, 6)
//                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
//                                        .add(jButton1)
//                                        .add(layout.createSequentialGroup()
//                                                .add(jLabel3)
//                                                .add(35, 35, 35)
//                                                .add(jTNumNF, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 116, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
//                                                .add(30, 30, 30)
//                                                .add(jProgressBar1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 586, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
//                                        .add(jLabel1))
//                                .add(278, 278, 278))
//        );
//
//        layout.linkSize(new java.awt.Component[] {jPanel1, jPanel2}, org.jdesktop.layout.GroupLayout.HORIZONTAL);
//
//        layout.setVerticalGroup(
//                layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
//                        .add(layout.createSequentialGroup()
//                                .add(20, 20, 20)
//                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
//                                        .add(jTArquivo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
//                                        .add(jButton2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
//                                .add(18, 18, 18)
//                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
//                                        .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
//                                        .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
//                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
//                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
//                                        .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
//                                                .add(jLabel3)
//                                                .add(jTNumNF, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
//                                        .add(org.jdesktop.layout.GroupLayout.TRAILING, jProgressBar1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
//                                .add(3, 3, 3)
//                                .add(jLabel1)
//                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
//                                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 154, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
//                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
//                                .add(jButton1)
//                                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
//        );
//
//        layout.linkSize(new java.awt.Component[] {jPanel1, jPanel2}, org.jdesktop.layout.GroupLayout.VERTICAL);
//
//        pack();
//    }// &lt;/editor-fold&gt;
//
//    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
//
//        try {
//            lerArquivo();
//
//        } catch (IOException ex) {
//            Logger.getLogger(Infor.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        LerArquivoXML buscarDadosEmXML = new LerArquivoXML(jTArquivo.getText());
//        jProgressBar1.setIndeterminate(true);
//        EmitDestXML();
//        //jogar produtos na tabela
//
//        ProdutosXML();
//
//        jProgressBar1.setIndeterminate(false);
//    }
//    public void lerArquivo() throws IOException {
//        JFileChooser xml = new JFileChooser();
//        xml.setDialogTitle("Selecione o Arquivo XML:");
//        FileNameExtensionFilter filter = new FileNameExtensionFilter("XML", "xml");
//        xml.setFileFilter(filter);
//        xml.setFileSelectionMode(JFileChooser.FILES_ONLY);
//        int option = xml.showOpenDialog(this);
//        if (option == JFileChooser.APPROVE_OPTION) {
//            File file = xml.getSelectedFile();
//            jTArquivo.setText(file.getCanonicalPath());
//        } else {
//            JOptionPane.showMessageDialog(null, "Nenhum arquivo selecionado!");
//        }
//    }
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //&lt;editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) "&gt;
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Infor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Infor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Infor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Infor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //&lt;/editor-fold&gt;
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Infor().setVisible(true);
//            }
//        });
//    }
//    // Variables declaration - do not modify
//    private javax.swing.JButton jButton1;
//    private javax.swing.JButton jButton2;
//    private javax.swing.JLabel jLabel1;
//    private javax.swing.JLabel jLabel3;
//    private javax.swing.JPanel jPanel1;
//    private javax.swing.JPanel jPanel2;
//    private javax.swing.JProgressBar jProgressBar1;
//    private javax.swing.JScrollPane jScrollPane1;
//    private javax.swing.JTextField jTArquivo;
//    private javax.swing.JTextField jTBairroDest;
//    private javax.swing.JTextField jTBairroEmit;
//    private javax.swing.JFormattedTextField jTCEPDest;
//    private javax.swing.JFormattedTextField jTCEPEmit;
//    private javax.swing.JFormattedTextField jTCNPJDest;
//    private javax.swing.JFormattedTextField jTCNPJemit;
//    private javax.swing.JTextField jTCplDest;
//    private javax.swing.JTextField jTCplEmit;
//    private javax.swing.JTextField jTDest;
//    private javax.swing.JTextField jTEmitente;
//    private javax.swing.JTextField jTEndDest;
//    private javax.swing.JTextField jTEndEmit;
//    private javax.swing.JTextField jTMunDest;
//    private javax.swing.JTextField jTMunEmit;
//    private javax.swing.JTextField jTNumDest;
//    private javax.swing.JTextField jTNumEmit;
//    private javax.swing.JTextField jTNumNF;
//    private javax.swing.JTextField jTUFDest;
//    private javax.swing.JTextField jTUFemit;
//    private javax.swing.JTable jTable1;
//    // End of variables declaration
//    public void ProdutosXML(){
//        LerArquivoXML buscarDadosEmXML = new LerArquivoXML(jTArquivo.getText());
//
//        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
//        String[] inf = new String[]{
//                buscarDadosEmXML.getCodProduto(),
//                buscarDadosEmXML.getNomeproduto(),
//                buscarDadosEmXML.getNCM(),
//                buscarDadosEmXML.getCFOPproduto(),
//                buscarDadosEmXML.getUndproduto(),
//                buscarDadosEmXML.getQtdproduto(),
//                buscarDadosEmXML.getVlundproduto(),
//                buscarDadosEmXML.getVlproduto(),
//                buscarDadosEmXML.getUndtributaria(),
//                buscarDadosEmXML.getQtdtributaria(),
//                buscarDadosEmXML.getVltributaria()};
//
//        Produtos.addRow(inf);
//
//
////      if (buscarDadosEmXML.getNumitem() != "0"){
////              Produtos.addRow(inf);
////          } else {
////              //Produtos.setValueAt(ProdXML.get(i).getCEPEmitente(),i, 1);
////        }
//    }
//
//    public void EmitDestXML(){
//        LerArquivoXML buscarDadosEmXML = new LerArquivoXML(jTArquivo.getText());
//
//        jTCNPJemit.setText(buscarDadosEmXML.getCnpjEmit());
//        jTUFemit.setText(buscarDadosEmXML.getUFemit());
//        jTEmitente.setText(buscarDadosEmXML.getEmitente());
//        jTEndEmit.setText(buscarDadosEmXML.getEndEmitente());
//        jTNumEmit.setText(buscarDadosEmXML.getNumEmitente());
//        jTCplEmit.setText(buscarDadosEmXML.getCplEmitente());
//        jTBairroEmit.setText(buscarDadosEmXML.getBairroEmitente());
//        jTMunEmit.setText(buscarDadosEmXML.getMunEmitente());
//        jTUFemit.setText(buscarDadosEmXML.getUFemit());
//        jTCEPEmit.setText(buscarDadosEmXML.getCEPEmitente());
//
//        jTCNPJDest.setText(buscarDadosEmXML.getCNPJDest());
//        jTUFDest.setText(buscarDadosEmXML.getUFDest());
//        jTDest.setText(buscarDadosEmXML.getDestinatario());
//        jTEndDest.setText(buscarDadosEmXML.getEnddestinatario());
//        jTNumNF.setText(buscarDadosEmXML.getNunNFe());
//    }
}