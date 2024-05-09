// Generated with g9.

package com.phat.ctrs.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Version;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name="PROVINCE")
public class Province implements Serializable {

    /** Primary key. */
    protected static final String PK = "provinceId";

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
    private BigDecimal provinceId;
    private String provinceName;
    @OneToMany(mappedBy="province")
    @JsonIgnore
    private Set<District> district;
    @ManyToOne(optional=false)
    @JoinColumn(name="countryId", nullable=false)
    private Country country;

    /** Default constructor. */
    public Province() {
        super();
    }

    /**
     * Access method for provinceId.
     *
     * @return the current value of provinceId
     */
    public BigDecimal getProvinceId() {
        return provinceId;
    }

    /**
     * Setter method for provinceId.
     *
     * @param aProvinceId the new value for provinceId
     */
    public void setProvinceId(BigDecimal aProvinceId) {
        provinceId = aProvinceId;
    }

    /**
     * Access method for provinceName.
     *
     * @return the current value of provinceName
     */
    public String getProvinceName() {
        return provinceName;
    }

    /**
     * Setter method for provinceName.
     *
     * @param aProvinceName the new value for provinceName
     */
    public void setProvinceName(String aProvinceName) {
        provinceName = aProvinceName;
    }

    /**
     * Access method for district.
     *
     * @return the current value of district
     */
    public Set<District> getDistrict() {
        return district;
    }

    /**
     * Setter method for district.
     *
     * @param aDistrict the new value for district
     */
    public void setDistrict(Set<District> aDistrict) {
        district = aDistrict;
    }

    /**
     * Access method for country.
     *
     * @return the current value of country
     */
    public Country getCountry() {
        return country;
    }

    /**
     * Setter method for country.
     *
     * @param aCountry the new value for country
     */
    public void setCountry(Country aCountry) {
        country = aCountry;
    }

    /**
     * Compares the key for this instance with another Province.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Province and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Province)) {
            return false;
        }
        Province that = (Province) other;
        Object myProvinceId = this.getProvinceId();
        Object yourProvinceId = that.getProvinceId();
        if (myProvinceId==null ? yourProvinceId!=null : !myProvinceId.equals(yourProvinceId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Province.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Province)) return false;
        return this.equalKeys(other) && ((Province)other).equalKeys(this);
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
        if (getProvinceId() == null) {
            i = 0;
        } else {
            i = getProvinceId().hashCode();
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
        StringBuffer sb = new StringBuffer("[Province |");
        sb.append(" provinceId=").append(getProvinceId());
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
    //     ret.put("provinceId", getProvinceId());
    //     return ret;
    // }

}
