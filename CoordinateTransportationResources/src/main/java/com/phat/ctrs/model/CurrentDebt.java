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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Version;

@Entity(name="CURRENT_DEBT")
public class CurrentDebt implements Serializable {

    /** Primary key. */
    protected static final String PK = "currentDebtId";

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
    private BigDecimal currentDebtId;
    @Column(precision=15)
    private BigDecimal totalDebt;
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
    @ManyToOne
    @JoinColumn(name="carrierTypeId")
    private Carriertype carriertype;
    @ManyToOne
    @JoinColumn(name="employeeId")
    private Employee employee;

    /** Default constructor. */
    public CurrentDebt() {
        super();
    }

    /**
     * Access method for currentDebtId.
     *
     * @return the current value of currentDebtId
     */
    public BigDecimal getCurrentDebtId() {
        return currentDebtId;
    }

    /**
     * Setter method for currentDebtId.
     *
     * @param aCurrentDebtId the new value for currentDebtId
     */
    public void setCurrentDebtId(BigDecimal aCurrentDebtId) {
        currentDebtId = aCurrentDebtId;
    }

    /**
     * Access method for totalDebt.
     *
     * @return the current value of totalDebt
     */
    public BigDecimal getTotalDebt() {
        return totalDebt;
    }

    /**
     * Setter method for totalDebt.
     *
     * @param aTotalDebt the new value for totalDebt
     */
    public void setTotalDebt(BigDecimal aTotalDebt) {
        totalDebt = aTotalDebt;
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
     * Compares the key for this instance with another CurrentDebt.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class CurrentDebt and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof CurrentDebt)) {
            return false;
        }
        CurrentDebt that = (CurrentDebt) other;
        Object myCurrentDebtId = this.getCurrentDebtId();
        Object yourCurrentDebtId = that.getCurrentDebtId();
        if (myCurrentDebtId==null ? yourCurrentDebtId!=null : !myCurrentDebtId.equals(yourCurrentDebtId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another CurrentDebt.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof CurrentDebt)) return false;
        return this.equalKeys(other) && ((CurrentDebt)other).equalKeys(this);
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
        if (getCurrentDebtId() == null) {
            i = 0;
        } else {
            i = getCurrentDebtId().hashCode();
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
        StringBuffer sb = new StringBuffer("[CurrentDebt |");
        sb.append(" currentDebtId=").append(getCurrentDebtId());
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
        ret.put("currentDebtId", getCurrentDebtId());
        return ret;
    }

}
