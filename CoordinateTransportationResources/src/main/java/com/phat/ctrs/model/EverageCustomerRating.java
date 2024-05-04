// Generated with g9.

package com.phat.ctrs.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Version;

@Entity(name="EVERAGE_CUSTOMER_RATING")
@IdClass(EverageCustomerRating.EverageCustomerRatingId.class)
public class EverageCustomerRating implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class EverageCustomerRatingId implements Serializable {
        Employee employee;
        java.time.LocalDateTime updateTime;
    }

    /** Primary key. */
    protected static final String PK = "EverageCustomerRatingEverageCustomerRatingPkey";

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
    @Column(nullable=false)
    private LocalDateTime updateTime;
    @Column(precision=10)
    private BigDecimal createdUser;
    private LocalDateTime createdDate;
    @Column(precision=10)
    private BigDecimal updatedUser;
    private LocalDateTime updatedDate;
    @Column(precision=10)
    private BigDecimal deletedUser;
    private LocalDateTime deletedDate;
    private String updateNote;
    @Column(length=1)
    private boolean isLast;
    @ManyToOne(optional=false)
    @Id
    @JoinColumn(name="employeeId", nullable=false)
    private Employee employee;

    /** Default constructor. */
    public EverageCustomerRating() {
        super();
    }

    /**
     * Access method for updateTime.
     *
     * @return the current value of updateTime
     */
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    /**
     * Setter method for updateTime.
     *
     * @param aUpdateTime the new value for updateTime
     */
    public void setUpdateTime(LocalDateTime aUpdateTime) {
        updateTime = aUpdateTime;
    }

    /**
     * Access method for createdUser.
     *
     * @return the current value of createdUser
     */
    public BigDecimal getCreatedUser() {
        return createdUser;
    }

    /**
     * Setter method for createdUser.
     *
     * @param aCreatedUser the new value for createdUser
     */
    public void setCreatedUser(BigDecimal aCreatedUser) {
        createdUser = aCreatedUser;
    }

    /**
     * Access method for createdDate.
     *
     * @return the current value of createdDate
     */
    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    /**
     * Setter method for createdDate.
     *
     * @param aCreatedDate the new value for createdDate
     */
    public void setCreatedDate(LocalDateTime aCreatedDate) {
        createdDate = aCreatedDate;
    }

    /**
     * Access method for updatedUser.
     *
     * @return the current value of updatedUser
     */
    public BigDecimal getUpdatedUser() {
        return updatedUser;
    }

    /**
     * Setter method for updatedUser.
     *
     * @param aUpdatedUser the new value for updatedUser
     */
    public void setUpdatedUser(BigDecimal aUpdatedUser) {
        updatedUser = aUpdatedUser;
    }

    /**
     * Access method for updatedDate.
     *
     * @return the current value of updatedDate
     */
    public LocalDateTime getUpdatedDate() {
        return updatedDate;
    }

    /**
     * Setter method for updatedDate.
     *
     * @param aUpdatedDate the new value for updatedDate
     */
    public void setUpdatedDate(LocalDateTime aUpdatedDate) {
        updatedDate = aUpdatedDate;
    }

    /**
     * Access method for deletedUser.
     *
     * @return the current value of deletedUser
     */
    public BigDecimal getDeletedUser() {
        return deletedUser;
    }

    /**
     * Setter method for deletedUser.
     *
     * @param aDeletedUser the new value for deletedUser
     */
    public void setDeletedUser(BigDecimal aDeletedUser) {
        deletedUser = aDeletedUser;
    }

    /**
     * Access method for deletedDate.
     *
     * @return the current value of deletedDate
     */
    public LocalDateTime getDeletedDate() {
        return deletedDate;
    }

    /**
     * Setter method for deletedDate.
     *
     * @param aDeletedDate the new value for deletedDate
     */
    public void setDeletedDate(LocalDateTime aDeletedDate) {
        deletedDate = aDeletedDate;
    }

    /**
     * Access method for updateNote.
     *
     * @return the current value of updateNote
     */
    public String getUpdateNote() {
        return updateNote;
    }

    /**
     * Setter method for updateNote.
     *
     * @param aUpdateNote the new value for updateNote
     */
    public void setUpdateNote(String aUpdateNote) {
        updateNote = aUpdateNote;
    }

    /**
     * Access method for isLast.
     *
     * @return true if and only if isLast is currently true
     */
    public boolean getIsLast() {
        return isLast;
    }

    /**
     * Setter method for isLast.
     *
     * @param aIsLast the new value for isLast
     */
    public void setIsLast(boolean aIsLast) {
        isLast = aIsLast;
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

    /** Temporary value holder for group key fragment employeeEmployeeId */
    private transient BigDecimal tempEmployeeEmployeeId;

    /**
     * Gets the key fragment employeeId for member employee.
     * If this.employee is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setEmployeeEmployeeId.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see Employee
     */
    public BigDecimal getEmployeeEmployeeId() {
        return (getEmployee() == null ? tempEmployeeEmployeeId : getEmployee().getEmployeeId());
    }

    /**
     * Sets the key fragment employeeId from member employee.
     * If this.employee is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getEmployeeEmployeeId.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aEmployeeId New value for the key fragment
     * @see Employee
     */
    public void setEmployeeEmployeeId(BigDecimal aEmployeeId) {
        if (getEmployee() == null) {
            tempEmployeeEmployeeId = aEmployeeId;
        } else {
            getEmployee().setEmployeeId(aEmployeeId);
        }
    }

    /**
     * Compares the key for this instance with another EverageCustomerRating.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EverageCustomerRating and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EverageCustomerRating)) {
            return false;
        }
        EverageCustomerRating that = (EverageCustomerRating) other;
        Object myEmployeeEmployeeId = this.getEmployeeEmployeeId();
        Object yourEmployeeEmployeeId = that.getEmployeeEmployeeId();
        if (myEmployeeEmployeeId==null ? yourEmployeeEmployeeId!=null : !myEmployeeEmployeeId.equals(yourEmployeeEmployeeId)) {
            return false;
        }
        Object myUpdateTime = this.getUpdateTime();
        Object yourUpdateTime = that.getUpdateTime();
        if (myUpdateTime==null ? yourUpdateTime!=null : !myUpdateTime.equals(yourUpdateTime)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EverageCustomerRating.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EverageCustomerRating)) return false;
        return this.equalKeys(other) && ((EverageCustomerRating)other).equalKeys(this);
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
        if (getEmployeeEmployeeId() == null) {
            i = 0;
        } else {
            i = getEmployeeEmployeeId().hashCode();
        }
        result = 37*result + i;
        if (getUpdateTime() == null) {
            i = 0;
        } else {
            i = getUpdateTime().hashCode();
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
        StringBuffer sb = new StringBuffer("[EverageCustomerRating |");
        sb.append(" employeeEmployeeId=").append(getEmployeeEmployeeId());
        sb.append(" updateTime=").append(getUpdateTime());
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
        ret.put("employeeEmployeeId", getEmployeeEmployeeId());
        ret.put("updateTime", getUpdateTime());
        return ret;
    }

}
