package org.durga.include;

import java.sql.Connection;
import java.util.LinkedHashMap;
import org.durga.model.Particulars;
import org.durga.model.Quotation;
import org.durga.services.QuotationService;
import org.durga.view.MakeQuatation;
import org.durga.view.ParticulareForm;
import org.hibernate.classic.Session;


public class Config
{
    public static Session SES=null;
     public static Connection con=null ;
   
    public static MakeQuatation MAKE_QUOTATION=null;
    public static ParticulareForm PERTICULARE_FORM=null;
    public static QuotationService QUOTATION_SERVICE;
    
    /**
     *Map for Quotation 
     */
    public static LinkedHashMap<Integer,Quotation> QUOTATION_MAP=new LinkedHashMap();
    public static LinkedHashMap<Integer,Particulars> PARTICULAR_MAP=new LinkedHashMap();
    
        
}
