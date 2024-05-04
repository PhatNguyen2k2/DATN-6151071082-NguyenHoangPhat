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

@Entity(name="RESOURCE_PRICE_APPLY")
public class ResourcePriceApply implements Serializable {

    /** Primary key. */
    protected static final String PK = "listPriceApplyId";

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
    private BigDecimal listPriceApplyId;
    @Column(precision=10)
    private BigDecimal resourcePriceId;
    @Column(length=1)
    private boolean isAnnual;
    private LocalDate fromDate;
    private LocalDate toDate;
    @Column(length=1)
    private boolean isActive;
    @Column(precision=2)
    private BigDecimal priority;
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
    @JoinColumn(name="employeeAgreementId")
    private EmployeeAgreement employeeAgreement;

    /** Default constructor. */
    public ResourcePriceApply() {
        super();
    }

    /**
     * Access method for listPriceApplyId.
     *
     * @return the current value of listPriceApplyId
     */
    public BigDecimal getListPriceApplyId() {
        return listPriceApplyId;
    }

    /**
     * Setter method for listPriceApplyId.
     *
     * @param aListPriceApplyId the new value for listPriceApplyId
     */
    public void setListPriceApplyId(BigDecimal aListPriceApplyId) {
        listPriceApplyId = aListPriceApplyId;
    }

    /**
     * Access method for resourcePriceId.
     *
     * @return the current value of resourcePriceId
     */
    public BigDecimal getResourcePriceId() {
        return resourcePriceId;
    }

    /**
     * Setter method for resourcePriceId.
     *
     * @param aResourcePriceId the new value for resourcePriceId
     */
    public void setResourcePriceId(BigDecimal aResourcePriceId) {
        resourcePriceId = aResourcePriceId;
    }

    /**
     * Access method for isAnnual.
     *
     * @return true if and only if isAnnual is currently true
     */
    public boolean getIsAnnual() {
        return isAnnual;
    }

    /**
     * Setter method for isAnnual.
     *
     * @param aIsAnnual the new value for isAnnual
     */
    public void setIsAnnual(boolean aIsAnnual) {
        isAnnual = aIsAnnual;
    }

    /**
     * Access method for fromDate.
     *
     * @return the current value of fromDate
     */
    public LocalDate getFromDate() {
        return fromDate;
    }

    /**
     * Setter method for fromDate.
     *
     * @param aFromDate the new value for fromDate
     */
    public void setFromDate(LocalDate aFromDate) {
        fromDate = aFromDate;
    }

    /**
     * Access method for toDate.
     *
     * @return the current value of toDate
     */
    public LocalDate getToDate() {
        return toDate;
    }

    /**
     * Setter method for toDate.
     *
     * @param aToDate the new value for toDate
     */
    public void setToDate(LocalDate aToDate) {
        toDate = aToDate;
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
     * Access method for priority.
     *
     * @return the current value of priority
     */
    public BigDecimal getPriority() {
        return priority;
    }

    /**
     * Setter method for priority.
     *
     * @param aPriority the new value for priority
     */
    public void setPriority(BigDecimal aPriority) {
        priority = aPriority;
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
     * Access method for employeeAgreement.
     *
     * @return the current value of employeeAgreement
     */
    public EmployeeAgreement getEmployeeAgreement() {
        return employeeAgreement;
    }

    /**
     * Setter method for employeeAgreement.
     *
     * @param aEmployeeAgreement the new value for employeeAgreement
     */
    public void setEmployeeAgreement(EmployeeAgreement aEmployeeAgreement) {
        employeeAgreement = aEmployeeAgreement;
    }

    /**
     * Compares the key for this instance with another ResourcePriceApply.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class ResourcePriceApply and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof ResourcePriceApply)) {
            return false;
        }
        ResourcePriceApply that = (ResourcePriceApply) other;
        Object myListPriceApplyId = this.getListPriceApplyId();
        Object yourListPriceApplyId = that.getListPriceApplyId();
        if (myListPriceApplyId==null ? yourListPriceApplyId!=null : !myListPriceApplyId.equals(yourListPriceApplyId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another ResourcePriceApply.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ResourcePriceApply)) return false;
        return this.equalKeys(other) && ((ResourcePriceApply)other).equalKeys(this);
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
        if (getListPriceApplyId() == null) {
            i = 0;
        } else {
            i = getListPriceApplyId().hashCode();
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
        StringBuffer sb = new StringBuffer("[ResourcePriceApply |");
        sb.append(" listPriceApplyId=").append(getListPriceApplyId());
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
        ret.put("listPriceApplyId", getListPriceApplyId());
        return ret;
    }

}
