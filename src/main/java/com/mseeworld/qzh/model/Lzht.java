package com.mseeworld.qzh.model;
// Generated Sep 6, 2014 9:23:12 PM by Hibernate Tools 3.2.1.GA


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Lzht generated by hbm2java
 */
@Entity
@Table(name="lzht"
    ,schema="public"
)
public class Lzht  implements java.io.Serializable {


     private long id;
     private String ycbhtbm;
     private String lzhtbm;
     private String cbfbm;
     private String srfbm;
     private String lzfs;
     private String lzqx;
     private Date lzqxksrq;
     private Date lzqxjsrq;
     private Float lzmj;
     private Integer lzdks;
     private Character lzqtdyt;
     private Character lzhtdyt;
     private String lzjgsm;
     private Date htqdrq;

    public Lzht() {
    }

	
    public Lzht(long id) {
        this.id = id;
    }
    public Lzht(long id, String ycbhtbm, String lzhtbm, String cbfbm, String srfbm, String lzfs, String lzqx, Date lzqxksrq, Date lzqxjsrq, Float lzmj, Integer lzdks, Character lzqtdyt, Character lzhtdyt, String lzjgsm, Date htqdrq) {
       this.id = id;
       this.ycbhtbm = ycbhtbm;
       this.lzhtbm = lzhtbm;
       this.cbfbm = cbfbm;
       this.srfbm = srfbm;
       this.lzfs = lzfs;
       this.lzqx = lzqx;
       this.lzqxksrq = lzqxksrq;
       this.lzqxjsrq = lzqxjsrq;
       this.lzmj = lzmj;
       this.lzdks = lzdks;
       this.lzqtdyt = lzqtdyt;
       this.lzhtdyt = lzhtdyt;
       this.lzjgsm = lzjgsm;
       this.htqdrq = htqdrq;
    }
   
     @Id 
    
    @Column(name="id", unique=true, nullable=false)
    public long getId() {
        return this.id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    
    @Column(name="ycbhtbm", length=19)
    public String getYcbhtbm() {
        return this.ycbhtbm;
    }
    
    public void setYcbhtbm(String ycbhtbm) {
        this.ycbhtbm = ycbhtbm;
    }
    
    @Column(name="lzhtbm", length=18)
    public String getLzhtbm() {
        return this.lzhtbm;
    }
    
    public void setLzhtbm(String lzhtbm) {
        this.lzhtbm = lzhtbm;
    }
    
    @Column(name="cbfbm", length=18)
    public String getCbfbm() {
        return this.cbfbm;
    }
    
    public void setCbfbm(String cbfbm) {
        this.cbfbm = cbfbm;
    }
    
    @Column(name="srfbm", length=18)
    public String getSrfbm() {
        return this.srfbm;
    }
    
    public void setSrfbm(String srfbm) {
        this.srfbm = srfbm;
    }
    
    @Column(name="lzfs", length=3)
    public String getLzfs() {
        return this.lzfs;
    }
    
    public void setLzfs(String lzfs) {
        this.lzfs = lzfs;
    }
    
    @Column(name="lzqx", length=10)
    public String getLzqx() {
        return this.lzqx;
    }
    
    public void setLzqx(String lzqx) {
        this.lzqx = lzqx;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="lzqxksrq", length=13)
    public Date getLzqxksrq() {
        return this.lzqxksrq;
    }
    
    public void setLzqxksrq(Date lzqxksrq) {
        this.lzqxksrq = lzqxksrq;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="lzqxjsrq", length=13)
    public Date getLzqxjsrq() {
        return this.lzqxjsrq;
    }
    
    public void setLzqxjsrq(Date lzqxjsrq) {
        this.lzqxjsrq = lzqxjsrq;
    }
    
    @Column(name="lzmj", precision=8, scale=8)
    public Float getLzmj() {
        return this.lzmj;
    }
    
    public void setLzmj(Float lzmj) {
        this.lzmj = lzmj;
    }
    
    @Column(name="lzdks")
    public Integer getLzdks() {
        return this.lzdks;
    }
    
    public void setLzdks(Integer lzdks) {
        this.lzdks = lzdks;
    }
    
    @Column(name="lzqtdyt", length=1)
    public Character getLzqtdyt() {
        return this.lzqtdyt;
    }
    
    public void setLzqtdyt(Character lzqtdyt) {
        this.lzqtdyt = lzqtdyt;
    }
    
    @Column(name="lzhtdyt", length=1)
    public Character getLzhtdyt() {
        return this.lzhtdyt;
    }
    
    public void setLzhtdyt(Character lzhtdyt) {
        this.lzhtdyt = lzhtdyt;
    }
    
    @Column(name="lzjgsm", length=100)
    public String getLzjgsm() {
        return this.lzjgsm;
    }
    
    public void setLzjgsm(String lzjgsm) {
        this.lzjgsm = lzjgsm;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="htqdrq", length=13)
    public Date getHtqdrq() {
        return this.htqdrq;
    }
    
    public void setHtqdrq(Date htqdrq) {
        this.htqdrq = htqdrq;
    }




}


