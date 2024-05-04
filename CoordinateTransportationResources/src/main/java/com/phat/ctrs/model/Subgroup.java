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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Version;

@Entity(name="SUBGROUP")
public class Subgroup implements Serializable {

    /** Primary key. */
    protected static final String PK = "subGroupId";

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
    private BigDecimal subGroupId;
    private String subGroupName;
    @OneToMany(mappedBy="subgroup")
    private Set<EmployeeLoad> employeeLoad;
    @OneToMany(mappedBy="subgroup")
    private Set<GroupProductAllowTransport> groupProductAllowTransport;
    @OneToMany(mappedBy="subgroup")
    private Set<Product> product;
    @OneToMany(mappedBy="subgroup")
    private Set<ResourcePrice> resourcePrice;
    @OneToMany(mappedBy="subgroup")
    private Set<SkillSubgroup> skillSubgroup;
    @ManyToOne(optional=false)
    @JoinColumn(name="mainGroupId", nullable=false)
    private Maingroup maingroup;

    /** Default constructor. */
    public Subgroup() {
        super();
    }

    /**
     * Access method for subGroupId.
     *
     * @return the current value of subGroupId
     */
    public BigDecimal getSubGroupId() {
        return subGroupId;
    }

    /**
     * Setter method for subGroupId.
     *
     * @param aSubGroupId the new value for subGroupId
     */
    public void setSubGroupId(BigDecimal aSubGroupId) {
        subGroupId = aSubGroupId;
    }

    /**
     * Access method for subGroupName.
     *
     * @return the current value of subGroupName
     */
    public String getSubGroupName() {
        return subGroupName;
    }

    /**
     * Setter method for subGroupName.
     *
     * @param aSubGroupName the new value for subGroupName
     */
    public void setSubGroupName(String aSubGroupName) {
        subGroupName = aSubGroupName;
    }

    /**
     * Access method for employeeLoad.
     *
     * @return the current value of employeeLoad
     */
    public Set<EmployeeLoad> getEmployeeLoad() {
        return employeeLoad;
    }

    /**
     * Setter method for employeeLoad.
     *
     * @param aEmployeeLoad the new value for employeeLoad
     */
    public void setEmployeeLoad(Set<EmployeeLoad> aEmployeeLoad) {
        employeeLoad = aEmployeeLoad;
    }

    /**
     * Access method for groupProductAllowTransport.
     *
     * @return the current value of groupProductAllowTransport
     */
    public Set<GroupProductAllowTransport> getGroupProductAllowTransport() {
        return groupProductAllowTransport;
    }

    /**
     * Setter method for groupProductAllowTransport.
     *
     * @param aGroupProductAllowTransport the new value for groupProductAllowTransport
     */
    public void setGroupProductAllowTransport(Set<GroupProductAllowTransport> aGroupProductAllowTransport) {
        groupProductAllowTransport = aGroupProductAllowTransport;
    }

    /**
     * Access method for product.
     *
     * @return the current value of product
     */
    public Set<Product> getProduct() {
        return product;
    }

    /**
     * Setter method for product.
     *
     * @param aProduct the new value for product
     */
    public void setProduct(Set<Product> aProduct) {
        product = aProduct;
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
     * Access method for skillSubgroup.
     *
     * @return the current value of skillSubgroup
     */
    public Set<SkillSubgroup> getSkillSubgroup() {
        return skillSubgroup;
    }

    /**
     * Setter method for skillSubgroup.
     *
     * @param aSkillSubgroup the new value for skillSubgroup
     */
    public void setSkillSubgroup(Set<SkillSubgroup> aSkillSubgroup) {
        skillSubgroup = aSkillSubgroup;
    }

    /**
     * Access method for maingroup.
     *
     * @return the current value of maingroup
     */
    public Maingroup getMaingroup() {
        return maingroup;
    }

    /**
     * Setter method for maingroup.
     *
     * @param aMaingroup the new value for maingroup
     */
    public void setMaingroup(Maingroup aMaingroup) {
        maingroup = aMaingroup;
    }

    /**
     * Compares the key for this instance with another Subgroup.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Subgroup and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Subgroup)) {
            return false;
        }
        Subgroup that = (Subgroup) other;
        Object mySubGroupId = this.getSubGroupId();
        Object yourSubGroupId = that.getSubGroupId();
        if (mySubGroupId==null ? yourSubGroupId!=null : !mySubGroupId.equals(yourSubGroupId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Subgroup.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Subgroup)) return false;
        return this.equalKeys(other) && ((Subgroup)other).equalKeys(this);
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
        if (getSubGroupId() == null) {
            i = 0;
        } else {
            i = getSubGroupId().hashCode();
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
        StringBuffer sb = new StringBuffer("[Subgroup |");
        sb.append(" subGroupId=").append(getSubGroupId());
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
        ret.put("subGroupId", getSubGroupId());
        return ret;
    }

}
