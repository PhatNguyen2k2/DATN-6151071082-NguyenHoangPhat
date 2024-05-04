// Generated with g9.

package com.phat.ctrs.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Version;

@Entity(name="LIMIT_DEBT")
public class LimitDebt implements Serializable {

    /** Primary key. */
    protected static final String PK = "limitDebtId";

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
    private BigDecimal limitDebtId;
    @Column(precision=15)
    private BigDecimal limitDebtValue;
    @ManyToOne
    @JoinColumn(name="carrierTypeId")
    private Carriertype carriertype;
    @ManyToOne
    @JoinColumn(name="employeeId")
    private Employee employee;

    /** Default constructor. */
    public LimitDebt() {
        super();
    }

    /**
     * Access method for limitDebtId.
     *
     * @return the current value of limitDebtId
     */
    public BigDecimal getLimitDebtId() {
        return limitDebtId;
    }

    /**
     * Setter method for limitDebtId.
     *
     * @param aLimitDebtId the new value for limitDebtId
     */
    public void setLimitDebtId(BigDecimal aLimitDebtId) {
        limitDebtId = aLimitDebtId;
    }

    /**
     * Access method for limitDebtValue.
     *
     * @return the current value of limitDebtValue
     */
    public BigDecimal getLimitDebtValue() {
        return limitDebtValue;
    }

    /**
     * Setter method for limitDebtValue.
     *
     * @param aLimitDebtValue the new value for limitDebtValue
     */
    public void setLimitDebtValue(BigDecimal aLimitDebtValue) {
        limitDebtValue = aLimitDebtValue;
    }

    /**
     * Access method for carriertype.
     *
     * @return the current value of carriertype
     */
    public Carriertype getCarriertype() {
        return carriertype;
    }

    /**
     * Setter method for carriertype.
     *
     * @param aCarriertype the new value for carriertype
     */
    public void setCarriertype(Carriertype aCarriertype) {
        carriertype = aCarriertype;
    }

    /**
     * Access method for employee.
     *
     * @return the current value of employee
     */
    public Employee getEmployee() {
        return employee;
    }

    /**
     * Setter method for employee.
     *
     * @param aEmployee the new value for employee
     */
    public void setEmployee(Employee aEmployee) {
        employee = aEmployee;
    }

    /**
     * Compares the key for this instance with another LimitDebt.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class LimitDebt and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof LimitDebt)) {
            return false;
        }
        LimitDebt that = (LimitDebt) other;
        Object myLimitDebtId = this.getLimitDebtId();
        Object yourLimitDebtId = that.getLimitDebtId();
        if (myLimitDebtId==null ? yourLimitDebtId!=null : !myLimitDebtId.equals(yourLimitDebtId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another LimitDebt.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof LimitDebt)) return false;
        return this.equalKeys(other) && ((LimitDebt)other).equalKeys(this);
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
        if (getLimitDebtId() == null) {
            i = 0;
        } else {
            i = getLimitDebtId().hashCode();
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
        StringBuffer sb = new StringBuffer("[LimitDebt |");
        sb.append(" limitDebtId=").append(getLimitDebtId());
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
        ret.put("limitDebtId", getLimitDebtId());
        return ret;
    }

}
