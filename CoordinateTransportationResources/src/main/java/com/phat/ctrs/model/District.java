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

@Entity(name="DISTRICT")
public class District implements Serializable {

    /** Primary key. */
    protected static final String PK = "districtId";

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
    private BigDecimal districtId;
    private String districtName;
    @ManyToOne(optional=false)
    @JoinColumn(name="provinceId", nullable=false)
    private Province province;
    @OneToMany(mappedBy="district")
    @JsonIgnore
    private Set<Ward> ward;

    /** Default constructor. */
    public District() {
        super();
    }

    /**
     * Access method for districtId.
     *
     * @return the current value of districtId
     */
    public BigDecimal getDistrictId() {
        return districtId;
    }

    /**
     * Setter method for districtId.
     *
     * @param aDistrictId the new value for districtId
     */
    public void setDistrictId(BigDecimal aDistrictId) {
        districtId = aDistrictId;
    }

    /**
     * Access method for districtName.
     *
     * @return the current value of districtName
     */
    public String getDistrictName() {
        return districtName;
    }

    /**
     * Setter method for districtName.
     *
     * @param aDistrictName the new value for districtName
     */
    public void setDistrictName(String aDistrictName) {
        districtName = aDistrictName;
    }

    /**
     * Access method for province.
     *
     * @return the current value of province
     */
    public Province getProvince() {
        return province;
    }

    /**
     * Setter method for province.
     *
     * @param aProvince the new value for province
     */
    public void setProvince(Province aProvince) {
        province = aProvince;
    }

    /**
     * Access method for ward.
     *
     * @return the current value of ward
     */
    public Set<Ward> getWard() {
        return ward;
    }

    /**
     * Setter method for ward.
     *
     * @param aWard the new value for ward
     */
    public void setWard(Set<Ward> aWard) {
        ward = aWard;
    }

    /**
     * Compares the key for this instance with another District.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class District and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof District)) {
            return false;
        }
        District that = (District) other;
        Object myDistrictId = this.getDistrictId();
        Object yourDistrictId = that.getDistrictId();
        if (myDistrictId==null ? yourDistrictId!=null : !myDistrictId.equals(yourDistrictId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another District.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof District)) return false;
        return this.equalKeys(other) && ((District)other).equalKeys(this);
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
        if (getDistrictId() == null) {
            i = 0;
        } else {
            i = getDistrictId().hashCode();
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
        StringBuffer sb = new StringBuffer("[District |");
        sb.append(" districtId=").append(getDistrictId());
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
    //     ret.put("districtId", getDistrictId());
    //     return ret;
    // }

}
