
package org.durga.services;

import java.util.List;
import javax.swing.JOptionPane;
import org.durga.include.Config;
import org.durga.model.Particulars;
import org.hibernate.Query;

public class ParticularService {
     
    public static void setParticularMap() 
    {
        try{
         Config.PARTICULAR_MAP.clear();
         
         Config.SES.beginTransaction();
        Query query = Config.SES.createQuery("from Particulars where status=1");
        List<Particulars> quotationList = query.list();
         Config.SES.getTransaction().commit();
//            System.out.println(quotationList+"Service");
         for(Particulars particular:quotationList)
         {
             Config.PARTICULAR_MAP.put(particular.getId(),particular);
         }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e,"Particulars SERVICES",JOptionPane.ERROR_MESSAGE);
        }
        
    }
     
    public static void addItem(Particulars particular) {
        try{
        
        Config.SES.beginTransaction();
        Config.SES.save(particular);
        Config.SES.getTransaction().commit();
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e,"Particulars addItem SERVICES",JOptionPane.ERROR_MESSAGE);
        }
    }
  
    
    public static void updateItem(Particulars particular)
    {
        try 
        {
            Config.SES.beginTransaction();
            Config.SES.update(particular);
            Config.SES.getTransaction().commit();
        } 
        catch (Exception e)
        {
             JOptionPane.showMessageDialog(null, e,"Particulars addItem SERVICES",JOptionPane.ERROR_MESSAGE);
        }
    }
   
}
