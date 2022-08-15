package org.durga.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Quotation 
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    private String particular;
    
    private int quantity;
    
    private int rate;
    
    private int amount;
    
    private int status;
    
    @Temporal(TemporalType.DATE)
    private Date created; 
    @Temporal(TemporalType.DATE)
    private Date modified; 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getParticular() {
        return particular;
    }

    public void setParticular(String particular) {
        this.particular = particular;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
     
    @Override
    public String toString() {
        return "Quoatation{" + "id=" + id + ", particular=" + particular + ", quantity=" + quantity + ", rate=" + rate + ", amount=" + amount + ", created=" + created + ", modified=" + modified + '}';
    }
    
   
    
}
