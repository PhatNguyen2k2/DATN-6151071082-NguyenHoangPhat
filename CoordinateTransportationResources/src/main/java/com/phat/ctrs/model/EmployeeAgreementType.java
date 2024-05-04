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

@Entity(name="EMPLOYEE_AGREEMENT_TYPE")
public class EmployeeAgreementType implements Serializable {

    /** Primary key. */
    protected static final String PK = "employeeAgreementTypeId";

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
    private BigDecimal employeeAgreementTypeId;
    private String employeeAgreementTypeName;
    @Column(length=1)
    private boolean isActive;
    @OneToMany(mappedBy="employeeAgreementType")
    private Set<BookingPercent> bookingPercent;
    @OneToMany(mappedBy="employeeAgreementType")
    private Set<EmployeeAgreement> employeeAgreement;

    /** Default constructor. */
    public EmployeeAgreementType() {
        super();
    }

    /**
     * Access method for employeeAgreementTypeId.
     *
     * @return the current value of employeeAgreementTypeId
     */
    public BigDecimal getEmployeeAgreementTypeId() {
        return employeeAgreementTypeId;
    }

    /**
     * Setter method for employeeAgreementTypeId.
     *
     * @param aEmployeeAgreementTypeId the new value for employeeAgreementTypeId
     */
    public void setEmployeeAgreementTypeId(BigDecimal aEmployeeAgreementTypeId) {
        employeeAgreementTypeId = aEmployeeAgreementTypeId;
    }

    /**
     * Access method for employeeAgreementTypeName.
     *
     * @return the current value of employeeAgreementTypeName
     */
    public String getEmployeeAgreementTypeName() {
        return employeeAgreementTypeName;
    }

    /**
     * Setter method for employeeAgreementTypeName.
     *
     * @param aEmployeeAgreementTypeName the new value for employeeAgreementTypeName
     */
    public void setEmployeeAgreementTypeName(String aEmployeeAgreementTypeName) {
        employeeAgreementTypeName = aEmployeeAgreementTypeName;
    }

    /**
     * Access method for isActive.
     *
     * @return true if and only if isActive is currently true
     */
    public boolean getIsActive() {
        return isActive;
    }

    /**
     * Setter method for isActive.
     *
     * @param aIsActive the new value for isActive
     */
    public void setIsActive(boolean aIsActive) {
        isActive = aIsActive;
    }

    /**
     * Access method for bookingPercent.
     *
     * @return the current value of bookingPercent
     */
    public Set<BookingPercent> getBookingPercent() {
        return bookingPercent;
    }

    /**
     * Setter method for bookingPercent.
     *
     * @param aBookingPercent the new value for bookingPercent
     */
    public void setBookingPercent(Set<BookingPercent> aBookingPercent) {
        bookingPercent = aBookingPercent;
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
     * Compares the key for this instance with another EmployeeAgreementType.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EmployeeAgreementType and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EmployeeAgreementType)) {
            return false;
        }
        EmployeeAgreementType that = (EmployeeAgreementType) other;
        Object myEmployeeAgreementTypeId = this.getEmployeeAgreementTypeId();
        Object yourEmployeeAgreementTypeId = that.getEmployeeAgreementTypeId();
        if (myEmployeeAgreementTypeId==null ? yourEmployeeAgreementTypeId!=null : !myEmployeeAgreementTypeId.equals(yourEmployeeAgreementTypeId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EmployeeAgreementType.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EmployeeAgreementType)) return false;
        return this.equalKeys(other) && ((EmployeeAgreementType)other).equalKeys(this);
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
        if (getEmployeeAgreementTypeId() == null) {
            i = 0;
        } else {
            i = getEmployeeAgreementTypeId().hashCode();
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
        StringBuffer sb = new StringBuffer("[EmployeeAgreementType |");
        sb.append(" employeeAgreementTypeId=").append(getEmployeeAgreementTypeId());
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
        ret.put("employeeAgreementTypeId", getEmployeeAgreementTypeId());
        return ret;
    }

}
