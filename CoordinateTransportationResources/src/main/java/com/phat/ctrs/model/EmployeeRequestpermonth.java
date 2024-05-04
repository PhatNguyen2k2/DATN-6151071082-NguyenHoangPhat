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

@Entity(name="EMPLOYEE_REQUESTPERMONTH")
public class EmployeeRequestpermonth implements Serializable {

    /** Primary key. */
    protected static final String PK = "employeeRequestPerMonthId";

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
    private BigDecimal employeeRequestPerMonthId;
    @Column(precision=4)
    private BigDecimal year;
    @Column(precision=2)
    private BigDecimal month;
    @Column(precision=4)
    private BigDecimal totalRequest;
    @Column(precision=4)
    private BigDecimal totalRejectRequest;
    @Column(precision=4)
    private BigDecimal totalExpire;
    @ManyToOne
    @JoinColumn(name="employeeId")
    private Employee employee;

    /** Default constructor. */
    public EmployeeRequestpermonth() {
        super();
    }

    /**
     * Access method for employeeRequestPerMonthId.
     *
     * @return the current value of employeeRequestPerMonthId
     */
    public BigDecimal getEmployeeRequestPerMonthId() {
        return employeeRequestPerMonthId;
    }

    /**
     * Setter method for employeeRequestPerMonthId.
     *
     * @param aEmployeeRequestPerMonthId the new value for employeeRequestPerMonthId
     */
    public void setEmployeeRequestPerMonthId(BigDecimal aEmployeeRequestPerMonthId) {
        employeeRequestPerMonthId = aEmployeeRequestPerMonthId;
    }

    /**
     * Access method for year.
     *
     * @return the current value of year
     */
    public BigDecimal getYear() {
        return year;
    }

    /**
     * Setter method for year.
     *
     * @param aYear the new value for year
     */
    public void setYear(BigDecimal aYear) {
        year = aYear;
    }

    /**
     * Access method for month.
     *
     * @return the current value of month
     */
    public BigDecimal getMonth() {
        return month;
    }

    /**
     * Setter method for month.
     *
     * @param aMonth the new value for month
     */
    public void setMonth(BigDecimal aMonth) {
        month = aMonth;
    }

    /**
     * Access method for totalRequest.
     *
     * @return the current value of totalRequest
     */
    public BigDecimal getTotalRequest() {
        return totalRequest;
    }

    /**
     * Setter method for totalRequest.
     *
     * @param aTotalRequest the new value for totalRequest
     */
    public void setTotalRequest(BigDecimal aTotalRequest) {
        totalRequest = aTotalRequest;
    }

    /**
     * Access method for totalRejectRequest.
     *
     * @return the current value of totalRejectRequest
     */
    public BigDecimal getTotalRejectRequest() {
        return totalRejectRequest;
    }

    /**
     * Setter method for totalRejectRequest.
     *
     * @param aTotalRejectRequest the new value for totalRejectRequest
     */
    public void setTotalRejectRequest(BigDecimal aTotalRejectRequest) {
        totalRejectRequest = aTotalRejectRequest;
    }

    /**
     * Access method for totalExpire.
     *
     * @return the current value of totalExpire
     */
    public BigDecimal getTotalExpire() {
        return totalExpire;
    }

    /**
     * Setter method for totalExpire.
     *
     * @param aTotalExpire the new value for totalExpire
     */
    public void setTotalExpire(BigDecimal aTotalExpire) {
        totalExpire = aTotalExpire;
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
     * Compares the key for this instance with another EmployeeRequestpermonth.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EmployeeRequestpermonth and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EmployeeRequestpermonth)) {
            return false;
        }
        EmployeeRequestpermonth that = (EmployeeRequestpermonth) other;
        Object myEmployeeRequestPerMonthId = this.getEmployeeRequestPerMonthId();
        Object yourEmployeeRequestPerMonthId = that.getEmployeeRequestPerMonthId();
        if (myEmployeeRequestPerMonthId==null ? yourEmployeeRequestPerMonthId!=null : !myEmployeeRequestPerMonthId.equals(yourEmployeeRequestPerMonthId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EmployeeRequestpermonth.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EmployeeRequestpermonth)) return false;
        return this.equalKeys(other) && ((EmployeeRequestpermonth)other).equalKeys(this);
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
        if (getEmployeeRequestPerMonthId() == null) {
            i = 0;
        } else {
            i = getEmployeeRequestPerMonthId().hashCode();
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
        StringBuffer sb = new StringBuffer("[EmployeeRequestpermonth |");
        sb.append(" employeeRequestPerMonthId=").append(getEmployeeRequestPerMonthId());
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
        ret.put("employeeRequestPerMonthId", getEmployeeRequestPerMonthId());
        return ret;
    }

}
