
package org.durga.view;

import java.awt.Toolkit;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JOptionPane;
import org.durga.include.Config;
import org.durga.model.Quotation;
import org.durga.services.QuotationService;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;



public class MakeQuatation extends javax.swing.JFrame {
private Quotation Quot=null;
public int Total;
public String client;
public String address;
 public static String Qid;   
    public MakeQuatation() {
        initComponents();
       
        //For icon image for the slide.
        icon();
        try {
             Class.forName("com.mysql.jdbc.Driver");
            Config.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/durga","root","admin");
             setTableData();
             QuotationService.setQuotationMap();
             
        } catch (Exception e)
        {
            System.out.println(e);
        }
        
       // Serial number for Quotation purpose.
//        srnoiTextFeild.setText(SRNO+"");
        // To set Quotation data inside table and display it.
       
        
    }
 
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        particularComboBox = new javax.swing.JComboBox<>();
        newParticularButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        quantityTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        rateTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        AmountTextField = new javax.swing.JTextField();
        nameTextFeild = new javax.swing.JLabel();
        makePdfButton = new javax.swing.JButton();
        submitButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ClientName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        AddressTextFeild = new javax.swing.JTextField();
        NO_GST_PDF = new javax.swing.JButton();
        MakeICSGstPdf = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        QuotationTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(2, 1, 20, 5));

        jLabel2.setText("SELECT PERTICULAR  :");

        jPanel4.setLayout(new java.awt.BorderLayout());

        particularComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel4.add(particularComboBox, java.awt.BorderLayout.CENTER);

        newParticularButton.setText("New");
        newParticularButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newParticularButtonActionPerformed(evt);
            }
        });
        jPanel4.add(newParticularButton, java.awt.BorderLayout.EAST);

        jLabel3.setText("ENTER RATE              :");

        quantityTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setText("ENTER QUANTITY       :");

        rateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rateTextFieldActionPerformed(evt);
            }
        });

        jLabel5.setText("HERE IS AMOUNT       :");

        AmountTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AmountTextFieldMouseClicked(evt);
            }
        });
        AmountTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmountTextFieldActionPerformed(evt);
            }
        });

        nameTextFeild.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        nameTextFeild.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        makePdfButton.setText("MAKE C&S GST PDF");
        makePdfButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makePdfButtonActionPerformed(evt);
            }
        });

        submitButton.setText("SUBMIT");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        updateButton.setText("UPDATE");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setText("Client Name : ");

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel6.setText("ADDRESS :");

        NO_GST_PDF.setText("MAKE NO GST PDF");
        NO_GST_PDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NO_GST_PDFActionPerformed(evt);
            }
        });

        MakeICSGstPdf.setText("MAKE I,C&S GST PDF");
        MakeICSGstPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MakeICSGstPdfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AmountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(NO_GST_PDF, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(makePdfButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(MakeICSGstPdf, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(74, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ClientName, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nameTextFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(AddressTextFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameTextFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ClientName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(AddressTextFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 11, Short.MAX_VALUE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AmountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(makePdfButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NO_GST_PDF, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MakeICSGstPdf, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel1.add(jPanel2);

        jPanel3.setLayout(new java.awt.GridLayout(1, 1));

        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        QuotationTable.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        QuotationTable.setModel(new javax.swing.table.DefaultTableModel(
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
        QuotationTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                QuotationTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(QuotationTable);

        jPanel3.add(jScrollPane1);

        jPanel1.add(jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 741, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1292, 814));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AmountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmountTextFieldActionPerformed
       
    }//GEN-LAST:event_AmountTextFieldActionPerformed

    private void AmountTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AmountTextFieldMouseClicked
       try {
            //for product of quantity and rate for calculated amount.
            multiplyQuntRate();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_AmountTextFieldMouseClicked

    private void newParticularButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newParticularButtonActionPerformed
        try {
             
            this.dispose();
            new ParticulareForm().setVisible(true);
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this, e,"MAKE QUOTATION ",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_newParticularButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        try 
        {
            Qid=null;
           
            String particular = (particularComboBox.getSelectedItem()).toString();
            String qunt = quantityTextField.getText();
            String rate = rateTextField.getText();
           String amount= AmountTextField.getText();
           
           
            
            //Establishing connection between database and software.For Quotation
             
            Statement smt = Config.con.createStatement();
            
            Quotation quot=new Quotation();
            quot.setParticular(particular);
            quot.setQuantity(Integer.parseInt(qunt));
            quot.setRate(Integer.parseInt(rate));
            quot.setAmount(Integer.parseInt(amount));
            quot.setCreated(new Date());
            quot.setModified(new Date());
            quot.setStatus(1);
            
            Config.QUOTATION_SERVICE.addItem(quot);
            
           
            
             JOptionPane.showMessageDialog(this, "Data Inserted Successfully","Make Quatation ",JOptionPane.INFORMATION_MESSAGE);
            
          
             setTableData();
            
            particularComboBox.setSelectedIndex(0);
            quantityTextField.setText("");
            rateTextField.setText("");
            AmountTextField.setText("");
        } 
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, e,"MAKE QUOTATION.",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void rateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rateTextFieldActionPerformed

    private void QuotationTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuotationTableMouseClicked
        // TODO add your handling code here:
        try 
        {
            //with this we have selected item serial number within in database.
             Qid = QuotationTable.getValueAt(QuotationTable.getSelectedRow(),0).toString();
             Quot=Config.QUOTATION_MAP.get(Integer.parseInt(Qid));
//             System.out.println(Quot+"mouseClick");
           if(Quot!=null)
            {
                particularComboBox.setSelectedItem(Quot.getParticular());
                quantityTextField.setText(Quot.getQuantity()+"");
                rateTextField.setText(Quot.getRate()+"");
                AmountTextField.setText(Quot.getAmount()+"");
            }
           
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this, e, "Particular Form",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_QuotationTableMouseClicked

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
            
           
            String particular = (particularComboBox.getSelectedItem()).toString();
            String qunt = quantityTextField.getText();
            String rate = rateTextField.getText();
           String amount= AmountTextField.getText();
           
          
           
           Quot.setModified(new Date());
           Quot.setParticular(particular);
           Quot.setQuantity(Integer.parseInt(qunt));
           Quot.setRate(Integer.parseInt(rate));
           Quot.setAmount(Integer.parseInt(amount));
           
           QuotationService.updateItem(Quot);
           
           JOptionPane.showMessageDialog(this, "Data Updated Successfully","Make Quatation ",JOptionPane.INFORMATION_MESSAGE);
            setTableData();
           
            particularComboBox.setSelectedIndex(0);
            quantityTextField.setText("");
            rateTextField.setText("");
            AmountTextField.setText("");
           
    }//GEN-LAST:event_updateButtonActionPerformed

    private void makePdfButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makePdfButtonActionPerformed
        // TODO add your handling code here:
       try 
        {
            client=ClientName.getText().toUpperCase();
            address=AddressTextFeild.getText().toUpperCase();
            Connection con = Config.SES.connection();
            File f=new File(".");
            JasperDesign jd = JRXmlLoader.load("C:/Users/DELL/Documents/NetBeansProjects/Shri_Durga_Domestics_Quotation_Soft/build/classes/org/durga/report/durga.jrxml");
            String sql=  "SELECT\n"
                                      +  "quotation.`id` AS quotation_id,"
                                      +  " quotation.`amount` AS quotation_amount,"
                                      +  " quotation.`particular` AS quotation_particular,"
                                      +  " quotation.`quantity` AS quotation_quantity,"
                                      +  "quotation.`rate` AS quotation_rate,"
                                      +  "quotation.`status` AS quotation_status"
                                 + "  FROM\n"
                                        +"`quotation` quotation";
            
//            System.out.println(sql);

            JRDesignQuery query=new JRDesignQuery();
            query.setText(sql);
            jd.setQuery(query);
            JasperReport jr = JasperCompileManager.compileReport(jd);
            
            JasperPrint jp = JasperFillManager.fillReport(jr,null,con);
            String pdfFileName="E:/Durga/"+client+"_"+address+".pdf";
           
            JasperExportManager.exportReportToPdfFile(jp,pdfFileName);
            JasperViewer.viewReport(jp,false);
//            JOptionPane.showMessageDialog(this,"Quotation Created Successfully","MAKE QUOTATION PDF",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(this,e,"MAKE QUOTATION PDF",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_makePdfButtonActionPerformed

    private void NO_GST_PDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NO_GST_PDFActionPerformed
        // TODO add your handling code here:
         try 
        {
            client=ClientName.getText().toUpperCase();
            address=AddressTextFeild.getText().toUpperCase();
            Connection con = Config.SES.connection();
            File f=new File(".");
            JasperDesign jd = JRXmlLoader.load("C:/Users/DELL/Documents/NetBeansProjects/Shri_Durga_Domestics_Quotation_Soft/build/classes/org/durga/report/durga1.jrxml");
            String sql=  "SELECT\n"
                                      +  "quotation.`id` AS quotation_id,"
                                      +  " quotation.`amount` AS quotation_amount,"
                                      +  " quotation.`particular` AS quotation_particular,"
                                      +  " quotation.`quantity` AS quotation_quantity,"
                                      +  "quotation.`rate` AS quotation_rate,"
                                      +  "quotation.`status` AS quotation_status"
                                 + "  FROM\n"
                                        +"`quotation` quotation";
            
//            System.out.println(sql);

            JRDesignQuery query=new JRDesignQuery();
            query.setText(sql);
            jd.setQuery(query);
            JasperReport jr = JasperCompileManager.compileReport(jd);
            
            JasperPrint jp = JasperFillManager.fillReport(jr,null,con);
            String pdfFileName="E:/Durga/"+client+"_"+address+".pdf";
           
            JasperExportManager.exportReportToPdfFile(jp,pdfFileName);
            JasperViewer.viewReport(jp,false);
//            JOptionPane.showMessageDialog(this,"Quotation Created Successfully","MAKE QUOTATION PDF",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(this,e,"MAKE QUOTATION PDF",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_NO_GST_PDFActionPerformed

    private void MakeICSGstPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MakeICSGstPdfActionPerformed
        // TODO add your handling code here:
        try {
             client=ClientName.getText().toUpperCase();
            address=AddressTextFeild.getText().toUpperCase();
            Connection con = Config.SES.connection();
            File f=new File(".");
            JasperDesign jd = JRXmlLoader.load("C:/Users/DELL/Documents/NetBeansProjects/Shri_Durga_Domestics_Quotation_Soft/build/classes/org/durga/report/durga3.jrxml");
            String sql=  "SELECT\n"
                                      +  "quotation.`id` AS quotation_id,"
                                      +  " quotation.`amount` AS quotation_amount,"
                                      +  " quotation.`particular` AS quotation_particular,"
                                      +  " quotation.`quantity` AS quotation_quantity,"
                                      +  "quotation.`rate` AS quotation_rate,"
                                      +  "quotation.`status` AS quotation_status"
                                 + "  FROM\n"
                                        +"`quotation` quotation";
            
//            System.out.println(sql);

            JRDesignQuery query=new JRDesignQuery();
            query.setText(sql);
            jd.setQuery(query);
            JasperReport jr = JasperCompileManager.compileReport(jd);
            
            JasperPrint jp = JasperFillManager.fillReport(jr,null,con);
            String pdfFileName="E:/Durga/"+client+"_"+address+".pdf";
           
            JasperExportManager.exportReportToPdfFile(jp,pdfFileName);
            JasperViewer.viewReport(jp,false);
        } catch (Exception e) 
        {
                        JOptionPane.showMessageDialog(this,e,"MAKE QUOTATION PDF",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_MakeICSGstPdfActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddressTextFeild;
    private javax.swing.JTextField AmountTextField;
    private javax.swing.JTextField ClientName;
    private javax.swing.JButton MakeICSGstPdf;
    private javax.swing.JButton NO_GST_PDF;
    private javax.swing.JTable QuotationTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton makePdfButton;
    private javax.swing.JLabel nameTextFeild;
    private javax.swing.JButton newParticularButton;
    public javax.swing.JComboBox<String> particularComboBox;
    private javax.swing.JTextField quantityTextField;
    private javax.swing.JTextField rateTextField;
    private javax.swing.JButton submitButton;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables

    private void multiplyQuntRate()
    {
        try 
        {
           int a=Integer.parseInt(quantityTextField.getText());
           int b=Integer.parseInt(rateTextField.getText());
           AmountTextField.setText((a*b)+"");
//             System.out.println("Main page"+ProjectNameForm.NAME);
        } 
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, e,"Make Quoataion", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void icon() {
           try{
        File f=new File(".");
        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Shri_Durga_Domestics_Quotation_Soft\\build\\classes\\org\\durga\\images\\DDLogo1.jpg"));
             
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    private void setTableData() 
    {
        try 
        {
            String[] col={"SRNO","PARTICULAR","QUANTITY","RATE","AMOUNT"};
            Statement smt = Config.con.createStatement();
            ResultSet rs = smt.executeQuery("select * from Quotation where status=1");
            rs.last();
            int noOfRow = rs.getRow();
            rs.beforeFirst();
            String[][] data=new String[noOfRow][col.length];
            int i=0;
            int lTotal=0;
            while(rs.next())
            {
                data[i][0]=rs.getInt("id")+"";
                data[i][1]=rs.getString("particular");
                data[i][2]=rs.getInt("quantity")+"";
                data[i][3]=rs.getInt("rate")+"";
                data[i][4]=rs.getInt("amount")+"";
                i++;
               
                {
                      lTotal=lTotal+rs.getInt("amount");
                        
                }
              
                
            }
            if(Total!=lTotal)
            {
                Total=lTotal;
                System.out.println(Total);
                lTotal=0;
                 //For Details
             
            }
            rs.close();
            smt.close();
            DefaultTableModel model = new DefaultTableModel(data,col);
            QuotationTable.setModel(model);
            
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this, e,"MakeQuoatation",JOptionPane.ERROR_MESSAGE);
        }
        
    }

  
}
