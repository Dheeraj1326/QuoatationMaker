
package org.durga.view;

import java.awt.Toolkit;
import java.io.File;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.durga.include.Config;
import org.durga.model.Particulars;
import org.durga.services.ParticularService;
import org.hibernate.Query;


public class ParticulareForm extends javax.swing.JFrame {
private String pid;
public Particulars particular=null;

    public ParticulareForm() {
        initComponents();
        setIcon();
        setTableData();
        ParticularService.setParticularMap();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        perticularTextField = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        perticularTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setLayout(new java.awt.GridLayout(2, 1, 20, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("ENTER PERTICULARS :");

        perticularTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perticularTextFieldActionPerformed(evt);
            }
        });

        updateButton.setText("UPDATE LIST");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("DELETE ITEM");

        addButton.setText("ADD TO LIST");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(perticularTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(perticularTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74))
        );

        jPanel1.add(jPanel2);

        jPanel3.setLayout(new java.awt.GridLayout(1, 1));

        perticularTable.setModel(new javax.swing.table.DefaultTableModel(
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
        perticularTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                perticularTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(perticularTable);

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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 705, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(785, 778));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void perticularTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perticularTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_perticularTextFieldActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        try 
        {
            String p_name = perticularTextField.getText();
            if(p_name.isEmpty())
            {
                JOptionPane.showMessageDialog(this,"Please Enter Particular","Particular Form", JOptionPane.WARNING_MESSAGE);
            }
            else
            {
                Particulars particular=new Particulars();
                particular.setName(p_name);
                particular.setStatus(1);
                particular.setCreated(new Date());
                particular.setModified(new Date());
                
                Config.SES.beginTransaction();
                Config.SES.save(particular);
                Config.SES.getTransaction().commit();
                
                JOptionPane.showMessageDialog(this,"Perticular Inserted Successfuly","Particular Form", JOptionPane.INFORMATION_MESSAGE);
                setTableData();
                perticularTextField.setText("");
                
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, e,"Perticular Form",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        Config.MAKE_QUOTATION.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void perticularTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_perticularTableMouseClicked
        try 
        {
            //with this we have selected item serial number within in database.
             pid = perticularTable.getValueAt(perticularTable.getSelectedRow(),0).toString();
             System.err.println("pid:"+pid);
             particular=Config.PARTICULAR_MAP.get(Integer.parseInt(pid));
             System.out.println(particular.getName());
                
           if(particular!=null)
            {
                System.err.println("name"+particular.getName());
                perticularTextField.setText(particular.getName());
            }
           
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this, e, "Particular Form",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_perticularTableMouseClicked

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        try 
        {
           String name= perticularTextField.getText();
            System.out.println();
            System.out.println("pid:"+pid);
            if(pid!=null)
            {
                particular.setModified(new Date());
                particular.setName(name);
                
                ParticularService.updateItem(particular);
              
               JOptionPane.showMessageDialog(this,"Perticular Updated Successfuly","Particular Form", JOptionPane.INFORMATION_MESSAGE);
                
                setTableData();
                perticularTextField.setText("");
                pid=null;
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Please Select Particular for Update","Particular Form", JOptionPane.WARNING_MESSAGE);

            }
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this, e, "Particular Form00",JOptionPane.ERROR_MESSAGE);
            
        }
    }//GEN-LAST:event_updateButtonActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable perticularTable;
    private javax.swing.JTextField perticularTextField;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
    private void setIcon()
    {
        try
        {
            File f= new File(".");
             setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Shri_Durga_Domestics_Quotation_Soft\\build\\classes\\org\\durga\\images\\DDLogo1.jpg"));
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this,e,"Particular form",JOptionPane.ERROR_MESSAGE);
        }
    }
    private void setTableData()
    {
        try{
        Config.MAKE_QUOTATION.particularComboBox.removeAllItems();
        Config.MAKE_QUOTATION.particularComboBox.addItem("....SELECT....");
        
       
         String[] col={"ID","PARICULAR NAME"}; 
         Config.SES.beginTransaction();
            Query query = Config.SES.createQuery("from Particulars where status=1");
            List<Particulars> particularList = query.list();
            Config.SES.getTransaction().commit();
            String[][] data= new String[particularList.size()][col.length];
            int i=0;
            for(Particulars particular:particularList)
            {
                data[i][0]=particular.getId()+"";
                data[i][1]=particular.getName();
                Config.MAKE_QUOTATION.particularComboBox.addItem(particular.getName());
                i++;
            }
         
         
       
       
        DefaultTableModel model = new DefaultTableModel(data,col);
        perticularTable.setModel(model);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e, "Particular Form",JOptionPane.ERROR_MESSAGE);
        }
    }
}
