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

@Entity(name="FEEONKILOMETERS")
public class Feeonkilometers implements Serializable {

    /** Primary key. */
    protected static final String PK = "feeOnKilometerId";

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
    private BigDecimal feeOnKilometerId;
    @Column(precision=10)
    private BigDecimal startKm;
    @Column(precision=10)
    private BigDecimal endKm;
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

    /** Default constructor. */
    public Feeonkilometers() {
        super();
    }

    /**
     * Access method for feeOnKilometerId.
     *
     * @return the current value of feeOnKilometerId
     */
    public BigDecimal getFeeOnKilometerId() {
        return feeOnKilometerId;
    }

    /**
     * Setter method for feeOnKilometerId.
     *
     * @param aFeeOnKilometerId the new value for feeOnKilometerId
     */
    public void setFeeOnKilometerId(BigDecimal aFeeOnKilometerId) {
        feeOnKilometerId = aFeeOnKilometerId;
    }

    /**
     * Access method for start.
     *
     * @return the current value of start
     */
    
    /**
     * Access method for cost.
     *
     * @return the current value of cost
     */
    public BigDecimal getCost() {
        return cost;
    }

    public BigDecimal getStartKm() {
		return startKm;
	}

	public void setStartKm(BigDecimal startKm) {
		this.startKm = startKm;
	}

	public BigDecimal getEndKm() {
		return endKm;
	}

	public void setEndKm(BigDecimal endKm) {
		this.endKm = endKm;
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
     * Compares the key for this instance with another Feeonkilometers.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Feeonkilometers and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Feeonkilometers)) {
            return false;
        }
        Feeonkilometers that = (Feeonkilometers) other;
        Object myFeeOnKilometerId = this.getFeeOnKilometerId();
        Object yourFeeOnKilometerId = that.getFeeOnKilometerId();
        if (myFeeOnKilometerId==null ? yourFeeOnKilometerId!=null : !myFeeOnKilometerId.equals(yourFeeOnKilometerId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Feeonkilometers.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Feeonkilometers)) return false;
        return this.equalKeys(other) && ((Feeonkilometers)other).equalKeys(this);
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
        if (getFeeOnKilometerId() == null) {
            i = 0;
        } else {
            i = getFeeOnKilometerId().hashCode();
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
        StringBuffer sb = new StringBuffer("[Feeonkilometers |");
        sb.append(" feeOnKilometerId=").append(getFeeOnKilometerId());
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
        ret.put("feeOnKilometerId", getFeeOnKilometerId());
        return ret;
    }

}
