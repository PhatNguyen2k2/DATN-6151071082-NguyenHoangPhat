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

@Entity(name="LOAD_DEVIATION")
@IdClass(LoadDeviation.LoadDeviationId.class)
public class LoadDeviation implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class LoadDeviationId implements Serializable {
        Store store;
        java.math.BigDecimal deviatePercent;
    }

    /** Primary key. */
    protected static final String PK = "LoadDeviationLoadDeviationPkey";

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
    @Column(nullable=false, precision=10)
    private BigDecimal deviatePercent;
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
    @JoinColumn(name="storeId", nullable=false)
    private Store store;

    /** Default constructor. */
    public LoadDeviation() {
        super();
    }

    /**
     * Access method for deviatePercent.
     *
     * @return the current value of deviatePercent
     */
    public BigDecimal getDeviatePercent() {
        return deviatePercent;
    }

    /**
     * Setter method for deviatePercent.
     *
     * @param aDeviatePercent the new value for deviatePercent
     */
    public void setDeviatePercent(BigDecimal aDeviatePercent) {
        deviatePercent = aDeviatePercent;
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

    /** Temporary value holder for group key fragment storeStoreId */
    private transient BigDecimal tempStoreStoreId;

    /**
     * Gets the key fragment storeId for member store.
     * If this.store is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setStoreStoreId.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see Store
     */
    public BigDecimal getStoreStoreId() {
        return (getStore() == null ? tempStoreStoreId : getStore().getStoreId());
    }

    /**
     * Sets the key fragment storeId from member store.
     * If this.store is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getStoreStoreId.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aStoreId New value for the key fragment
     * @see Store
     */
    public void setStoreStoreId(BigDecimal aStoreId) {
        if (getStore() == null) {
            tempStoreStoreId = aStoreId;
        } else {
            getStore().setStoreId(aStoreId);
        }
    }

    /**
     * Compares the key for this instance with another LoadDeviation.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class LoadDeviation and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof LoadDeviation)) {
            return false;
        }
        LoadDeviation that = (LoadDeviation) other;
        Object myStoreStoreId = this.getStoreStoreId();
        Object yourStoreStoreId = that.getStoreStoreId();
        if (myStoreStoreId==null ? yourStoreStoreId!=null : !myStoreStoreId.equals(yourStoreStoreId)) {
            return false;
        }
        Object myDeviatePercent = this.getDeviatePercent();
        Object yourDeviatePercent = that.getDeviatePercent();
        if (myDeviatePercent==null ? yourDeviatePercent!=null : !myDeviatePercent.equals(yourDeviatePercent)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another LoadDeviation.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof LoadDeviation)) return false;
        return this.equalKeys(other) && ((LoadDeviation)other).equalKeys(this);
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
        if (getStoreStoreId() == null) {
            i = 0;
        } else {
            i = getStoreStoreId().hashCode();
        }
        result = 37*result + i;
        if (getDeviatePercent() == null) {
            i = 0;
        } else {
            i = getDeviatePercent().hashCode();
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
        StringBuffer sb = new StringBuffer("[LoadDeviation |");
        sb.append(" storeStoreId=").append(getStoreStoreId());
        sb.append(" deviatePercent=").append(getDeviatePercent());
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
        ret.put("storeStoreId", getStoreStoreId());
        ret.put("deviatePercent", getDeviatePercent());
        return ret;
    }

}
