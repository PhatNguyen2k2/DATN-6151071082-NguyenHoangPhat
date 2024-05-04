// Generated with g9.

package com.phat.ctrs.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Version;

@Entity(name="MAX_DRIVING_TIME")
public class MaxDrivingTime implements Serializable {

    /** Primary key. */
    protected static final String PK = "maxDrivingTimeId";

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
    private BigDecimal maxDrivingTimeId;
    private LocalDateTime maximumTime;
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
    @OneToMany(mappedBy="maxDrivingTime")
    private Set<DrivingHourInfo> drivingHourInfo;
    @ManyToOne(optional=false)
    @JoinColumn(name="storeId", nullable=false)
    private Store store;

    /** Default constructor. */
    public MaxDrivingTime() {
        super();
    }

    /**
     * Access method for maxDrivingTimeId.
     *
     * @return the current value of maxDrivingTimeId
     */
    public BigDecimal getMaxDrivingTimeId() {
        return maxDrivingTimeId;
    }

    /**
     * Setter method for maxDrivingTimeId.
     *
     * @param aMaxDrivingTimeId the new value for maxDrivingTimeId
     */
    public void setMaxDrivingTimeId(BigDecimal aMaxDrivingTimeId) {
        maxDrivingTimeId = aMaxDrivingTimeId;
    }

    /**
     * Access method for maximumTime.
     *
     * @return the current value of maximumTime
     */
    public LocalDateTime getMaximumTime() {
        return maximumTime;
    }

    /**
     * Setter method for maximumTime.
     *
     * @param aMaximumTime the new value for maximumTime
     */
    public void setMaximumTime(LocalDateTime aMaximumTime) {
        maximumTime = aMaximumTime;
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
     * Access method for drivingHourInfo.
     *
     * @return the current value of drivingHourInfo
     */
    public Set<DrivingHourInfo> getDrivingHourInfo() {
        return drivingHourInfo;
    }

    /**
     * Setter method for drivingHourInfo.
     *
     * @param aDrivingHourInfo the new value for drivingHourInfo
     */
    public void setDrivingHourInfo(Set<DrivingHourInfo> aDrivingHourInfo) {
        drivingHourInfo = aDrivingHourInfo;
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
     * Compares the key for this instance with another MaxDrivingTime.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class MaxDrivingTime and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof MaxDrivingTime)) {
            return false;
        }
        MaxDrivingTime that = (MaxDrivingTime) other;
        Object myMaxDrivingTimeId = this.getMaxDrivingTimeId();
        Object yourMaxDrivingTimeId = that.getMaxDrivingTimeId();
        if (myMaxDrivingTimeId==null ? yourMaxDrivingTimeId!=null : !myMaxDrivingTimeId.equals(yourMaxDrivingTimeId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another MaxDrivingTime.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof MaxDrivingTime)) return false;
        return this.equalKeys(other) && ((MaxDrivingTime)other).equalKeys(this);
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
        if (getMaxDrivingTimeId() == null) {
            i = 0;
        } else {
            i = getMaxDrivingTimeId().hashCode();
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
        StringBuffer sb = new StringBuffer("[MaxDrivingTime |");
        sb.append(" maxDrivingTimeId=").append(getMaxDrivingTimeId());
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
        ret.put("maxDrivingTimeId", getMaxDrivingTimeId());
        return ret;
    }

}
