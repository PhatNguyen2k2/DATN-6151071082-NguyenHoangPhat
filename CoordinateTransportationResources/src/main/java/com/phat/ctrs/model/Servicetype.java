// Generated with g9.

package com.phat.ctrs.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Version;

@Entity(name="SERVICETYPE")
public class Servicetype implements Serializable {

    /** Primary key. */
    protected static final String PK = "serviceTypeId";

    /**
     * The optimistic lock. Available via standard bean get/set operations.
     */
    @Version
    @Column(name="LOCK_FLAG")
    private Integer lockFlag;

    /**
     * Access method for the lockFlag property.
     *
     * @return the current value of the lockFlag property
     */
    public Integer getLockFlag() {
        return lockFlag;
    }

    /**
     * Sets the value of the lockFlag property.
     *
     * @param aLockFlag the new value of the lockFlag property
     */
    public void setLockFlag(Integer aLockFlag) {
        lockFlag = aLockFlag;
    }

    @Id
    @Column(unique=true, nullable=false, precision=10)
    private BigDecimal serviceTypeId;
    private String serviceTypeName;
    private String description;
    @OneToMany(mappedBy="servicetype")
    private Set<CategorySkill> categorySkill;
    @OneToMany(mappedBy="servicetype")
    private Set<EmployeeAgreement> employeeAgreement;
    @OneToMany(mappedBy="servicetype")
    private Set<RealDestinationService> realDestinationService;
    @OneToMany(mappedBy="servicetype")
    private Set<ResourcePrice> resourcePrice;
    @OneToMany(mappedBy="servicetype")
    private Set<Serviceorder> serviceorder;
    @OneToMany(mappedBy="servicetype")
    private Set<StopLocationService> stopLocationService;

    /** Default constructor. */
    public Servicetype() {
        super();
    }

    /**
     * Access method for serviceTypeId.
     *
     * @return the current value of serviceTypeId
     */
    public BigDecimal getServiceTypeId() {
        return serviceTypeId;
    }

    /**
     * Setter method for serviceTypeId.
     *
     * @param aServiceTypeId the new value for serviceTypeId
     */
    public void setServiceTypeId(BigDecimal aServiceTypeId) {
        serviceTypeId = aServiceTypeId;
    }

    /**
     * Access method for serviceTypeName.
     *
     * @return the current value of serviceTypeName
     */
    public String getServiceTypeName() {
        return serviceTypeName;
    }

    /**
     * Setter method for serviceTypeName.
     *
     * @param aServiceTypeName the new value for serviceTypeName
     */
    public void setServiceTypeName(String aServiceTypeName) {
        serviceTypeName = aServiceTypeName;
    }

    /**
     * Access method for description.
     *
     * @return the current value of description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter method for description.
     *
     * @param aDescription the new value for description
     */
    public void setDescription(String aDescription) {
        description = aDescription;
    }

    /**
     * Access method for categorySkill.
     *
     * @return the current value of categorySkill
     */
    public Set<CategorySkill> getCategorySkill() {
        return categorySkill;
    }

    /**
     * Setter method for categorySkill.
     *
     * @param aCategorySkill the new value for categorySkill
     */
    public void setCategorySkill(Set<CategorySkill> aCategorySkill) {
        categorySkill = aCategorySkill;
    }

    /**
     * Access method for employeeAgreement.
     *
     * @return the current value of employeeAgreement
     */
    public Set<EmployeeAgreement> getEmployeeAgreement() {
        return employeeAgreement;
    }

    /**
     * Setter method for employeeAgreement.
     *
     * @param aEmployeeAgreement the new value for employeeAgreement
     */
    public void setEmployeeAgreement(Set<EmployeeAgreement> aEmployeeAgreement) {
        employeeAgreement = aEmployeeAgreement;
    }

    /**
     * Access method for realDestinationService.
     *
     * @return the current value of realDestinationService
     */
    public Set<RealDestinationService> getRealDestinationService() {
        return realDestinationService;
    }

    /**
     * Setter method for realDestinationService.
     *
     * @param aRealDestinationService the new value for realDestinationService
     */
    public void setRealDestinationService(Set<RealDestinationService> aRealDestinationService) {
        realDestinationService = aRealDestinationService;
    }

    /**
     * Access method for resourcePrice.
     *
     * @return the current value of resourcePrice
     */
    public Set<ResourcePrice> getResourcePrice() {
        return resourcePrice;
    }

    /**
     * Setter method for resourcePrice.
     *
     * @param aResourcePrice the new value for resourcePrice
     */
    public void setResourcePrice(Set<ResourcePrice> aResourcePrice) {
        resourcePrice = aResourcePrice;
    }

    /**
     * Access method for serviceorder.
     *
     * @return the current value of serviceorder
     */
    public Set<Serviceorder> getServiceorder() {
        return serviceorder;
    }

    /**
     * Setter method for serviceorder.
     *
     * @param aServiceorder the new value for serviceorder
     */
    public void setServiceorder(Set<Serviceorder> aServiceorder) {
        serviceorder = aServiceorder;
    }

    /**
     * Access method for stopLocationService.
     *
     * @return the current value of stopLocationService
     */
    public Set<StopLocationService> getStopLocationService() {
        return stopLocationService;
    }

    /**
     * Setter method for stopLocationService.
     *
     * @param aStopLocationService the new value for stopLocationService
     */
    public void setStopLocationService(Set<StopLocationService> aStopLocationService) {
        stopLocationService = aStopLocationService;
    }

    /**
     * Compares the key for this instance with another Servicetype.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Servicetype and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Servicetype)) {
            return false;
        }
        Servicetype that = (Servicetype) other;
        Object myServiceTypeId = this.getServiceTypeId();
        Object yourServiceTypeId = that.getServiceTypeId();
        if (myServiceTypeId==null ? yourServiceTypeId!=null : !myServiceTypeId.equals(yourServiceTypeId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Servicetype.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Servicetype)) return false;
        return this.equalKeys(other) && ((Servicetype)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        if (getServiceTypeId() == null) {
            i = 0;
        } else {
            i = getServiceTypeId().hashCode();
        }
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[Servicetype |");
        sb.append(" serviceTypeId=").append(getServiceTypeId());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("serviceTypeId", getServiceTypeId());
        return ret;
    }

}
