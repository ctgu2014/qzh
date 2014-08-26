package com.mseeworld.qzh.model;
// Generated Aug 20, 2014 8:31:04 AM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * AOrganization generated by hbm2java
 */
@Entity
@Table(name="a_organization"
    ,schema="public"
)
public class AOrganization  implements java.io.Serializable {


     private long orgId;
     private AOrganization AOrganization;
     private String orgName;
     private Boolean isDeleted;
     private String orgCoding;
     private String postalCode;
     private String authOrgName;
     private String authPeople;
     private String authPhone;
     private String fbfName;
     private String fbfLegalPerson;
     private String fbfPhone;
     private String fbfAddress;
     private String orgMember;
     private Short regionType;
     private Set<AOrganization> AOrganizations = new HashSet<AOrganization>(0);

    public AOrganization() {
    }

	
    public AOrganization(long orgId) {
        this.orgId = orgId;
    }
    public AOrganization(long orgId, AOrganization AOrganization, String orgName, Boolean isDeleted, String orgCoding, String postalCode, String authOrgName, String authPeople, String authPhone, String fbfName, String fbfLegalPerson, String fbfPhone, String fbfAddress, String orgMember, Short regionType, Set<AOrganization> AOrganizations) {
       this.orgId = orgId;
       this.AOrganization = AOrganization;
       this.orgName = orgName;
       this.isDeleted = isDeleted;
       this.orgCoding = orgCoding;
       this.postalCode = postalCode;
       this.authOrgName = authOrgName;
       this.authPeople = authPeople;
       this.authPhone = authPhone;
       this.fbfName = fbfName;
       this.fbfLegalPerson = fbfLegalPerson;
       this.fbfPhone = fbfPhone;
       this.fbfAddress = fbfAddress;
       this.orgMember = orgMember;
       this.regionType = regionType;
       this.AOrganizations = AOrganizations;
    }
   
     @Id 
    
    @Column(name="org_id", unique=true, nullable=false)
    public long getOrgId() {
        return this.orgId;
    }
    
    public void setOrgId(long orgId) {
        this.orgId = orgId;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="parent_id")
    public AOrganization getAOrganization() {
        return this.AOrganization;
    }
    
    public void setAOrganization(AOrganization AOrganization) {
        this.AOrganization = AOrganization;
    }
    
    @Column(name="org_name")
    public String getOrgName() {
        return this.orgName;
    }
    
    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }
    
    @Column(name="is_deleted")
    public Boolean getIsDeleted() {
        return this.isDeleted;
    }
    
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
    
    @Column(name="org_coding")
    public String getOrgCoding() {
        return this.orgCoding;
    }
    
    public void setOrgCoding(String orgCoding) {
        this.orgCoding = orgCoding;
    }
    
    @Column(name="postal_code")
    public String getPostalCode() {
        return this.postalCode;
    }
    
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    
    @Column(name="auth_org_name")
    public String getAuthOrgName() {
        return this.authOrgName;
    }
    
    public void setAuthOrgName(String authOrgName) {
        this.authOrgName = authOrgName;
    }
    
    @Column(name="auth_people")
    public String getAuthPeople() {
        return this.authPeople;
    }
    
    public void setAuthPeople(String authPeople) {
        this.authPeople = authPeople;
    }
    
    @Column(name="auth_phone")
    public String getAuthPhone() {
        return this.authPhone;
    }
    
    public void setAuthPhone(String authPhone) {
        this.authPhone = authPhone;
    }
    
    @Column(name="fbf_name")
    public String getFbfName() {
        return this.fbfName;
    }
    
    public void setFbfName(String fbfName) {
        this.fbfName = fbfName;
    }
    
    @Column(name="fbf_legal_person")
    public String getFbfLegalPerson() {
        return this.fbfLegalPerson;
    }
    
    public void setFbfLegalPerson(String fbfLegalPerson) {
        this.fbfLegalPerson = fbfLegalPerson;
    }
    
    @Column(name="fbf_phone")
    public String getFbfPhone() {
        return this.fbfPhone;
    }
    
    public void setFbfPhone(String fbfPhone) {
        this.fbfPhone = fbfPhone;
    }
    
    @Column(name="fbf_address")
    public String getFbfAddress() {
        return this.fbfAddress;
    }
    
    public void setFbfAddress(String fbfAddress) {
        this.fbfAddress = fbfAddress;
    }
    
    @Column(name="org_member")
    public String getOrgMember() {
        return this.orgMember;
    }
    
    public void setOrgMember(String orgMember) {
        this.orgMember = orgMember;
    }
    
    @Column(name="region_type")
    public Short getRegionType() {
        return this.regionType;
    }
    
    public void setRegionType(Short regionType) {
        this.regionType = regionType;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="AOrganization")
    public Set<AOrganization> getAOrganizations() {
        return this.AOrganizations;
    }
    
    public void setAOrganizations(Set<AOrganization> AOrganizations) {
        this.AOrganizations = AOrganizations;
    }




}

