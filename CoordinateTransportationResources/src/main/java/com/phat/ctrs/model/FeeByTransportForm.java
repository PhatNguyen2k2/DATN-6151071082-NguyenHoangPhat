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

@Entity(name="FEE_BY_TRANSPORT_FORM")
public class FeeByTransportForm implements Serializable {

    /** Primary key. */
    protected static final String PK = "feeByTransportFormId";

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
    private BigDecimal feeByTransportFormId;
    @Column(precision=10, scale=2)
    private BigDecimal cost;
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
    @JoinColumn(name="servicePriceId", nullable=false)
    private ServicePrice servicePrice;
    @ManyToOne(optional=false)
    @JoinColumn(name="transportFormId", nullable=false)
    private TransportForm transportForm;

    /** Default constructor. */
    public FeeByTransportForm() {
        super();
    }

    /**
     * Access method for feeByTransportFormId.
     *
     * @return the current value of feeByTransportFormId
     */
    public BigDecimal getFeeByTransportFormId() {
        return feeByTransportFormId;
    }

    /**
     * Setter method for feeByTransportFormId.
     *
     * @param aFeeByTransportFormId the new value for feeByTransportFormId
     */
    public void setFeeByTransportFormId(BigDecimal aFeeByTransportFormId) {
        feeByTransportFormId = aFeeByTransportFormId;
    }

    /**
     * Access method for cost.
     *
     * @return the current value of cost
     */
    public BigDecimal getCost() {
        return cost;
    }

    /**
     * Setter method for cost.
     *
     * @param aCost the new value for cost
     */
    public void setCost(BigDecimal aCost) {
        cost = aCost;
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
     * Access method for servicePrice.
     *
     * @return the current value of servicePrice
     */
    public ServicePrice getServicePrice() {
        return servicePrice;
    }

    /**
     * Setter method for servicePrice.
     *
     * @param aServicePrice the new value for servicePrice
     */
    public void setServicePrice(ServicePrice aServicePrice) {
        servicePrice = aServicePrice;
    }

    /**
     * Access method for transportForm.
     *
     * @return the current value of transportForm
     */
    public TransportForm getTransportForm() {
        return transportForm;
    }

    /**
     * Setter method for transportForm.
     *
     * @param aTransportForm the new value for transportForm
     */
    public void setTransportForm(TransportForm aTransportForm) {
        transportForm = aTransportForm;
    }

    /**
     * Compares the key for this instance with another FeeByTransportForm.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class FeeByTransportForm and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof FeeByTransportForm)) {
            return false;
        }
        FeeByTransportForm that = (FeeByTransportForm) other;
        Object myFeeByTransportFormId = this.getFeeByTransportFormId();
        Object yourFeeByTransportFormId = that.getFeeByTransportFormId();
        if (myFeeByTransportFormId==null ? yourFeeByTransportFormId!=null : !myFeeByTransportFormId.equals(yourFeeByTransportFormId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another FeeByTransportForm.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof FeeByTransportForm)) return false;
        return this.equalKeys(other) && ((FeeByTransportForm)other).equalKeys(this);
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
        if (getFeeByTransportFormId() == null) {
            i = 0;
        } else {
            i = getFeeByTransportFormId().hashCode();
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
        StringBuffer sb = new StringBuffer("[FeeByTransportForm |");
        sb.append(" feeByTransportFormId=").append(getFeeByTransportFormId());
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
        ret.put("feeByTransportFormId", getFeeByTransportFormId());
        return ret;
    }

}
