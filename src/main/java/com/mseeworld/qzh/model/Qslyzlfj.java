package com.mseeworld.qzh.model;
// Generated Aug 20, 2014 8:31:04 AM by Hibernate Tools 3.2.1.GA


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Qslyzlfj generated by hbm2java
 */
@Entity
@Table(name="qslyzlfj"
    ,schema="public"
)
public class Qslyzlfj  implements java.io.Serializable {


     private long id;
     private String cbjyqzbm;
     private String zlfjbh;
     private String zlfjmc;
     private Date zlfjrq;
     private String fj;

    public Qslyzlfj() {
    }

	
    public Qslyzlfj(long id) {
        this.id = id;
    }
    public Qslyzlfj(long id, String cbjyqzbm, String zlfjbh, String zlfjmc, Date zlfjrq, String fj) {
       this.id = id;
       this.cbjyqzbm = cbjyqzbm;
       this.zlfjbh = zlfjbh;
       this.zlfjmc = zlfjmc;
       this.zlfjrq = zlfjrq;
       this.fj = fj;
    }
   
     @Id 
    
    @Column(name="id", unique=true, nullable=false)
    public long getId() {
        return this.id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    
    @Column(name="cbjyqzbm", length=19)
    public String getCbjyqzbm() {
        return this.cbjyqzbm;
    }
    
    public void setCbjyqzbm(String cbjyqzbm) {
        this.cbjyqzbm = cbjyqzbm;
    }
    
    @Column(name="zlfjbh", length=20)
    public String getZlfjbh() {
        return this.zlfjbh;
    }
    
    public void setZlfjbh(String zlfjbh) {
        this.zlfjbh = zlfjbh;
    }
    
    @Column(name="zlfjmc", length=100)
    public String getZlfjmc() {
        return this.zlfjmc;
    }
    
    public void setZlfjmc(String zlfjmc) {
        this.zlfjmc = zlfjmc;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="zlfjrq", length=13)
    public Date getZlfjrq() {
        return this.zlfjrq;
    }
    
    public void setZlfjrq(Date zlfjrq) {
        this.zlfjrq = zlfjrq;
    }
    
    @Column(name="fj")
    public String getFj() {
        return this.fj;
    }
    
    public void setFj(String fj) {
        this.fj = fj;
    }




}

