// Generated with g9.

package com.phat.ctrs.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Version;

@Entity(name = "EMPLOYEE_SHIFT")
public class EmployeeShift implements Serializable {

    /** Primary key. */
    protected static final String PK = "employeeShiftId";

    /**
     * The optimistic lock. Available via standard bean get/set operations.
     */
    @Version
    @Column(name = "LOCK_FLAG")
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
    @Column(unique = true, nullable = false, precision = 10)
    private BigDecimal employeeShiftId;
    private LocalDate workingDate;
    @Column(length = 1)
    private boolean loadApply;
    @ManyToOne
    @JoinColumn(name = "employeeId")
    private Employee employee;
    @ManyToOne
    @JoinColumn(name = "shiftId")
    private Shift shift;

    /** Default constructor. */
    public EmployeeShift() {
        super();
    }

    /**
     * Access method for employeeShiftId.
     *
     * @return the current value of employeeShiftId
     */
    public BigDecimal getEmployeeShiftId() {
        return employeeShiftId;
    }

    /**
     * Setter method for employeeShiftId.
     *
     * @param aEmployeeShiftId the new value for employeeShiftId
     */
    public void setEmployeeShiftId(BigDecimal aEmployeeShiftId) {
        employeeShiftId = aEmployeeShiftId;
    }

    /**
     * Access method for workingDate.
     *
     * @return the current value of workingDate
     */
    public LocalDate getWorkingDate() {
        return workingDate;
    }

    /**
     * Setter method for workingDate.
     *
     * @param aWorkingDate the new value for workingDate
     */
    public void setWorkingDate(LocalDate aWorkingDate) {
        workingDate = aWorkingDate;
    }

    /**
     * Access method for loadApply.
     *
     * @return true if and only if loadApply is currently true
     */
    public boolean getLoadApply() {
        return loadApply;
    }

    /**
     * Setter method for loadApply.
     *
     * @param aLoadApply the new value for loadApply
     */
    public void setLoadApply(boolean aLoadApply) {
        loadApply = aLoadApply;
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
     * Access method for shift.
     *
     * @return the current value of shift
     */
    public Shift getShift() {
        return shift;
    }

    /**
     * Setter method for shift.
     *
     * @param aShift the new value for shift
     */
    public void setShift(Shift aShift) {
        shift = aShift;
    }

    /**
     * Compares the key for this instance with another EmployeeShift.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EmployeeShift and the key
     *         objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmployeeShift)) {
            return false;
        }
        EmployeeShift that = (EmployeeShift) other;
        Object myEmployeeShiftId = this.getEmployeeShiftId();
        Object yourEmployeeShiftId = that.getEmployeeShiftId();
        if (myEmployeeShiftId == null ? yourEmployeeShiftId != null : !myEmployeeShiftId.equals(yourEmployeeShiftId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EmployeeShift.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EmployeeShift))
            return false;
        return this.equalKeys(other) && ((EmployeeShift) other).equalKeys(this);
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
        if (getEmployeeShiftId() == null) {
            i = 0;
        } else {
            i = getEmployeeShiftId().hashCode();
        }
        result = 37 * result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[EmployeeShift |");
        sb.append(" employeeShiftId=").append(getEmployeeShiftId());
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
        ret.put("employeeShiftId", getEmployeeShiftId());
        return ret;
    }

}
