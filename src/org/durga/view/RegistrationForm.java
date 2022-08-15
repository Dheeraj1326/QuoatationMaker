package org.durga.view;

import java.awt.Toolkit;
import java.io.File;
import java.util.Date;
import javax.swing.JOptionPane;
import org.durga.model.Users;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class RegistrationForm extends javax.swing.JFrame {

    public RegistrationForm() {
        initComponents();
        iconImage();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nameTextFeild = new javax.swing.JTextField();
        userNameTextFeild = new javax.swing.JTextField();
        passwordTextField = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        confirmPasswordTextFeild = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        phoneTextFeild = new javax.swing.JTextField();
        createAccountButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(218, 165, 32));
        jLabel1.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(200, 20, 20));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRATION");

        jLabel2.setText("ENTER YOUR NAME :");

        jLabel3.setText("CONFIRM  PASSWORD :");

        jLabel4.setText("CREATE YOUR USER ID :");

        jLabel5.setText("CREATE YOUR PASSWORD :");

        jLabel6.setText("ENTER YOUR CONTACT NUMBER:");

        createAccountButton.setForeground(new java.awt.Color(200, 20, 20));
        createAccountButton.setText("CREATE ACCOUNT");
        createAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAccountButtonActionPerformed(evt);
            }
        });

        cancelButton.setForeground(new java.awt.Color(200, 20, 20));
        cancelButton.setText("CANCEL");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(createAccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(cancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nameTextFeild)
                            .addComponent(userNameTextFeild)
                            .addComponent(passwordTextField)
                            .addComponent(confirmPasswordTextFeild)
                            .addComponent(phoneTextFeild, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTextFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(userNameTextFeild, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmPasswordTextFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneTextFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createAccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(614, 578));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        try
        {
           this.dispose();
           new LoginForm().setVisible(true);
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this, e,"REGISTRATION FORM",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void createAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAccountButtonActionPerformed
        try 
        {
            String name = nameTextFeild.getText().toUpperCase();
            String uname=userNameTextFeild.getText();
            String pass=passwordTextField.getText();
            String c_pass=confirmPasswordTextFeild.getText();
            String phone=phoneTextFeild.getText();
            
            if(name.isEmpty()||uname.isEmpty()||phone.isEmpty()||pass.isEmpty()||c_pass.isEmpty())
            {
               JOptionPane.showMessageDialog(this, "All Feilds Are Mandatory.","REGISTRATION FORM",JOptionPane.ERROR_MESSAGE);
            }
            else if(!(pass.equals(c_pass)))
            {
                JOptionPane.showMessageDialog(this,"Password Mismatch.", "REGISTRATION FORM", HEIGHT);
            }
            else 
             {
                 Users user=new Users();
                 user.setName(name);
                 user.setPassword(c_pass);
                 user.setCreated(new Date());
                 user.setUsername(uname);
                 user.setPhone(phone);
                 user.setStatus(1);
                 user.setModified(new Date());
                 
                SessionFactory sf = new Configuration().configure().buildSessionFactory();
                 Session ses= sf.openSession();
                 ses.beginTransaction();
                 ses.save(user);
                 ses.getTransaction().commit();
                 JOptionPane.showMessageDialog(this,"Data Inserted Successfully.", "REGISTRATION FORM", JOptionPane.INFORMATION_MESSAGE);
                 ses.close();
                 sf.close();
                 resetData();
                 this.dispose();
                 new LoginForm().setVisible(true);
                 
             }
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this, e,"REGISTRATION FORM",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_createAccountButtonActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JPasswordField confirmPasswordTextFeild;
    private javax.swing.JButton createAccountButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameTextFeild;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JTextField phoneTextFeild;
    private javax.swing.JTextField userNameTextFeild;
    // End of variables declaration//GEN-END:variables

    private void iconImage()
    {
        try {
            File f=new File(".");
             setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Shri_Durga_Domestics_Quotation_Soft\\build\\classes\\org\\durga\\images\\DDLogo1.jpg"));
            setTitle("REGISTER HERE");
        } catch (Exception e) {
        }
    }

    private void resetData() {
        try 
        {
            nameTextFeild.setText("");
            userNameTextFeild.setText("");
            passwordTextField.setText("");
            confirmPasswordTextFeild.setText("");
            phoneTextFeild.setText("");
        }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this, e, "REGISTRATION FORM",JOptionPane.ERROR_MESSAGE);
        }
    }
}
