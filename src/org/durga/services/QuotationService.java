package org.durga.services;

import java.util.List;
import javax.swing.JOptionPane;
import org.durga.include.Config;
import org.durga.model.Quotation;
import org.hibernate.Query;

public class QuotationService
{
    
    public static void setQuotationMap() 
    {
        try{
         Config.QUOTATION_MAP.clear();
         
         Config.SES.beginTransaction();
        Query query = Config.SES.createQuery("from Quotation where status=1");
        List<Quotation> quotationList = query.list();
         Config.SES.getTransaction().commit();
//            System.out.println(quotationList+"Service");
         for(Quotation quot:quotationList)
         {
             Config.QUOTATION_MAP.put(quot.getId(),quot);
         }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e,"QUOTATION SERVICES",JOptionPane.ERROR_MESSAGE);
        }
        
    }
     
    public static void addItem(Quotation quotation) {
        try{
        
        Config.SES.beginTransaction();
        Config.SES.save(quotation);
        Config.SES.getTransaction().commit();
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e,"Quotation addItem SERVICES",JOptionPane.ERROR_MESSAGE);
        }
    }
  
    
    public static void updateItem(Quotation quotations)
    {
        try 
        {
            Config.SES.beginTransaction();
            Config.SES.update(quotations);
            Config.SES.getTransaction().commit();
        } 
        catch (Exception e)
        {
             JOptionPane.showMessageDialog(null, e,"Quotation addItem SERVICES",JOptionPane.ERROR_MESSAGE);
        }
    }
   
    
   
}
