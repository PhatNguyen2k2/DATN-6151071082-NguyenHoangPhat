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

@Entity(name="MAINGROUP")
public class Maingroup implements Serializable {

    /** Primary key. */
    protected static final String PK = "mainGroupId";

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
    private BigDecimal mainGroupId;
    private String mainGroupName;
    @OneToMany(mappedBy="maingroup")
    private Set<ResourcePrice> resourcePrice;
    @OneToMany(mappedBy="maingroup")
    private Set<Subgroup> subgroup;

    /** Default constructor. */
    public Maingroup() {
        super();
    }

    /**
     * Access method for mainGroupId.
     *
     * @return the current value of mainGroupId
     */
    public BigDecimal getMainGroupId() {
        return mainGroupId;
    }

    /**
     * Setter method for mainGroupId.
     *
     * @param aMainGroupId the new value for mainGroupId
     */
    public void setMainGroupId(BigDecimal aMainGroupId) {
        mainGroupId = aMainGroupId;
    }

    /**
     * Access method for mainGroupName.
     *
     * @return the current value of mainGroupName
     */
    public String getMainGroupName() {
        return mainGroupName;
    }

    /**
     * Setter method for mainGroupName.
     *
     * @param aMainGroupName the new value for mainGroupName
     */
    public void setMainGroupName(String aMainGroupName) {
        mainGroupName = aMainGroupName;
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
     * Access method for subgroup.
     *
     * @return the current value of subgroup
     */
    public Set<Subgroup> getSubgroup() {
        return subgroup;
    }

    /**
     * Setter method for subgroup.
     *
     * @param aSubgroup the new value for subgroup
     */
    public void setSubgroup(Set<Subgroup> aSubgroup) {
        subgroup = aSubgroup;
    }

    /**
     * Compares the key for this instance with another Maingroup.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Maingroup and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Maingroup)) {
            return false;
        }
        Maingroup that = (Maingroup) other;
        Object myMainGroupId = this.getMainGroupId();
        Object yourMainGroupId = that.getMainGroupId();
        if (myMainGroupId==null ? yourMainGroupId!=null : !myMainGroupId.equals(yourMainGroupId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Maingroup.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Maingroup)) return false;
        return this.equalKeys(other) && ((Maingroup)other).equalKeys(this);
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
        if (getMainGroupId() == null) {
            i = 0;
        } else {
            i = getMainGroupId().hashCode();
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
        StringBuffer sb = new StringBuffer("[Maingroup |");
        sb.append(" mainGroupId=").append(getMainGroupId());
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
        ret.put("mainGroupId", getMainGroupId());
        return ret;
    }

}
