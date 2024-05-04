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

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name="COUNTRY")
public class Country implements Serializable {

    /** Primary key. */
    protected static final String PK = "countryId";

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
    private BigDecimal countryId;
    private String countryName;
    @OneToMany(mappedBy="country")
    @JsonIgnore
    private Set<Province> province;

    /** Default constructor. */
    public Country() {
        super();
    }

    /**
     * Access method for countryId.
     *
     * @return the current value of countryId
     */
    public BigDecimal getCountryId() {
        return countryId;
    }

    /**
     * Setter method for countryId.
     *
     * @param aCountryId the new value for countryId
     */
    public void setCountryId(BigDecimal aCountryId) {
        countryId = aCountryId;
    }

    /**
     * Access method for countryName.
     *
     * @return the current value of countryName
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Setter method for countryName.
     *
     * @param aCountryName the new value for countryName
     */
    public void setCountryName(String aCountryName) {
        countryName = aCountryName;
    }

    /**
     * Access method for province.
     *
     * @return the current value of province
     */
    public Set<Province> getProvince() {
        return province;
    }

    /**
     * Setter method for province.
     *
     * @param aProvince the new value for province
     */
    public void setProvince(Set<Province> aProvince) {
        province = aProvince;
    }

    /**
     * Compares the key for this instance with another Country.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Country and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Country)) {
            return false;
        }
        Country that = (Country) other;
        Object myCountryId = this.getCountryId();
        Object yourCountryId = that.getCountryId();
        if (myCountryId==null ? yourCountryId!=null : !myCountryId.equals(yourCountryId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Country.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Country)) return false;
        return this.equalKeys(other) && ((Country)other).equalKeys(this);
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
        if (getCountryId() == null) {
            i = 0;
        } else {
            i = getCountryId().hashCode();
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
        StringBuffer sb = new StringBuffer("[Country |");
        sb.append(" countryId=").append(getCountryId());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    // public Map<String, Object> getPrimaryKey() {
    //     Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
    //     ret.put("countryId", getCountryId());
    //     return ret;
    // }

}
