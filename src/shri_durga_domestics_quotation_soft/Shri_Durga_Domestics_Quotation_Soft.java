package shri_durga_domestics_quotation_soft;

import com.jtattoo.plaf.bernstein.BernsteinLookAndFeel;
import org.durga.view.LoginForm;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class Shri_Durga_Domestics_Quotation_Soft {

    public static void main(String[] args)
    {
        try 
        {
//            SessionFactory sf = new Configuration().configure().buildSessionFactory();
//            Session ses = sf.openSession();
//            ses.beginTransaction();
//            ses.getTransaction().commit();
//            ses.close();
//            sf.close();
         UIManager.setLookAndFeel(new BernsteinLookAndFeel());
        new LoginForm().setVisible(true);
        
        } 
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
       
    }
    
}
