// Generated with g9.

package com.phat.ctrs.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Version;

@Entity(name="EMPLOYEE_LOAD")
public class EmployeeLoad implements Serializable {

    /** Primary key. */
    protected static final String PK = "employeeLoadId";

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
    private BigDecimal employeeLoadId;
    @Column(precision=4)
    private BigDecimal totalLoad;
    @Column(precision=4)
    private BigDecimal loadUsed;
    @Column(precision=4)
    private BigDecimal loadRemaining;
    private LocalDate dateApply;
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
    @JoinColumn(name="shiftId")
    private Shift shift;
    @ManyToOne
    @JoinColumn(name="skillId")
    private Skill skill;
    @ManyToOne
    @JoinColumn(name="storeId")
    private Store store;
    @ManyToOne
    @JoinColumn(name="subGroupId")
    private Subgroup subgroup;

    /** Default constructor. */
    public EmployeeLoad() {
        super();
    }

    /**
     * Access method for employeeLoadId.
     *
     * @return the current value of employeeLoadId
     */
    public BigDecimal getEmployeeLoadId() {
        return employeeLoadId;
    }

    /**
     * Setter method for employeeLoadId.
     *
     * @param aEmployeeLoadId the new value for employeeLoadId
     */
    public void setEmployeeLoadId(BigDecimal aEmployeeLoadId) {
        employeeLoadId = aEmployeeLoadId;
    }

    /**
     * Access method for totalLoad.
     *
     * @return the current value of totalLoad
     */
    public BigDecimal getTotalLoad() {
        return totalLoad;
    }

    /**
     * Setter method for totalLoad.
     *
     * @param aTotalLoad the new value for totalLoad
     */
    public void setTotalLoad(BigDecimal aTotalLoad) {
        totalLoad = aTotalLoad;
    }

    /**
     * Access method for loadUsed.
     *
     * @return the current value of loadUsed
     */
    public BigDecimal getLoadUsed() {
        return loadUsed;
    }

    /**
     * Setter method for loadUsed.
     *
     * @param aLoadUsed the new value for loadUsed
     */
    public void setLoadUsed(BigDecimal aLoadUsed) {
        loadUsed = aLoadUsed;
    }

    /**
     * Access method for loadRemaining.
     *
     * @return the current value of loadRemaining
     */
    public BigDecimal getLoadRemaining() {
        return loadRemaining;
    }

    /**
     * Setter method for loadRemaining.
     *
     * @param aLoadRemaining the new value for loadRemaining
     */
    public void setLoadRemaining(BigDecimal aLoadRemaining) {
        loadRemaining = aLoadRemaining;
    }

    /**
     * Access method for dateApply.
     *
     * @return the current value of dateApply
     */
    public LocalDate getDateApply() {
        return dateApply;
    }

    /**
     * Setter method for dateApply.
     *
     * @param aDateApply the new value for dateApply
     */
    public void setDateApply(LocalDate aDateApply) {
        dateApply = aDateApply;
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
     * Access method for skill.
     *
     * @return the current value of skill
     */
    public Skill getSkill() {
        return skill;
    }

    /**
     * Setter method for skill.
     *
     * @param aSkill the new value for skill
     */
    public void setSkill(Skill aSkill) {
        skill = aSkill;
    }

    /**
     * Access method for store.
     *
     * @return the current value of store
     */
    public Store getStore() {
        return store;
    }

    /**
     * Setter method for store.
     *
     * @param aStore the new value for store
     */
    public void setStore(Store aStore) {
        store = aStore;
    }

    /**
     * Access method for subgroup.
     *
     * @return the current value of subgroup
     */
    public Subgroup getSubgroup() {
        return subgroup;
    }

    /**
     * Setter method for subgroup.
     *
     * @param aSubgroup the new value for subgroup
     */
    public void setSubgroup(Subgroup aSubgroup) {
        subgroup = aSubgroup;
    }

    /**
     * Compares the key for this instance with another EmployeeLoad.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EmployeeLoad and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EmployeeLoad)) {
            return false;
        }
        EmployeeLoad that = (EmployeeLoad) other;
        Object myEmployeeLoadId = this.getEmployeeLoadId();
        Object yourEmployeeLoadId = that.getEmployeeLoadId();
        if (myEmployeeLoadId==null ? yourEmployeeLoadId!=null : !myEmployeeLoadId.equals(yourEmployeeLoadId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EmployeeLoad.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EmployeeLoad)) return false;
        return this.equalKeys(other) && ((EmployeeLoad)other).equalKeys(this);
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
        if (getEmployeeLoadId() == null) {
            i = 0;
        } else {
            i = getEmployeeLoadId().hashCode();
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
        StringBuffer sb = new StringBuffer("[EmployeeLoad |");
        sb.append(" employeeLoadId=").append(getEmployeeLoadId());
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
        ret.put("employeeLoadId", getEmployeeLoadId());
        return ret;
    }

}
