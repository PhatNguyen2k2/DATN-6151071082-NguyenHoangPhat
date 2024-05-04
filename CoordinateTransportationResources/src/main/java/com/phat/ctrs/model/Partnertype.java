// Generated with g9.

package com.phat.ctrs.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Version;

@Entity(name="PARTNERTYPE")
public class Partnertype implements Serializable {

    /** Primary key. */
    protected static final String PK = "partnerTypeId";

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
    private BigDecimal partnerTypeId;
    private String partnerTypeName;
    @OneToMany(mappedBy="partnertype")
    @JsonIgnore
    private Set<Partner> partner;

    /** Default constructor. */
    public Partnertype() {
        super();
    }

    /**
     * Access method for partnerTypeId.
     *
     * @return the current value of partnerTypeId
     */
    public BigDecimal getPartnerTypeId() {
        return partnerTypeId;
    }

    /**
     * Setter method for partnerTypeId.
     *
     * @param aPartnerTypeId the new value for partnerTypeId
     */
    public void setPartnerTypeId(BigDecimal aPartnerTypeId) {
        partnerTypeId = aPartnerTypeId;
    }

    /**
     * Access method for partnerTypeName.
     *
     * @return the current value of partnerTypeName
     */
    public String getPartnerTypeName() {
        return partnerTypeName;
    }

    /**
     * Setter method for partnerTypeName.
     *
     * @param aPartnerTypeName the new value for partnerTypeName
     */
    public void setPartnerTypeName(String aPartnerTypeName) {
        partnerTypeName = aPartnerTypeName;
    }

    /**
     * Access method for partner.
     *
     * @return the current value of partner
     */
    public Set<Partner> getPartner() {
        return partner;
    }

    /**
     * Setter method for partner.
     *
     * @param aPartner the new value for partner
     */
    public void setPartner(Set<Partner> aPartner) {
        partner = aPartner;
    }

    /**
     * Compares the key for this instance with another Partnertype.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Partnertype and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Partnertype)) {
            return false;
        }
        Partnertype that = (Partnertype) other;
        Object myPartnerTypeId = this.getPartnerTypeId();
        Object yourPartnerTypeId = that.getPartnerTypeId();
        if (myPartnerTypeId==null ? yourPartnerTypeId!=null : !myPartnerTypeId.equals(yourPartnerTypeId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Partnertype.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Partnertype)) return false;
        return this.equalKeys(other) && ((Partnertype)other).equalKeys(this);
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
        if (getPartnerTypeId() == null) {
            i = 0;
        } else {
            i = getPartnerTypeId().hashCode();
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
        StringBuffer sb = new StringBuffer("[Partnertype |");
        sb.append(" partnerTypeId=").append(getPartnerTypeId());
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
        ret.put("partnerTypeId", getPartnerTypeId());
        return ret;
    }

}
