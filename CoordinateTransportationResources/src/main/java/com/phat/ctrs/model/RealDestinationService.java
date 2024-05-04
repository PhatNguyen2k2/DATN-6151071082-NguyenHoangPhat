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

@Entity(name="REAL_DESTINATION_SERVICE")
@IdClass(RealDestinationService.RealDestinationServiceId.class)
public class RealDestinationService implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class RealDestinationServiceId implements Serializable {
        RealStopLocation realStopLocation;
        Serviceorder serviceorder;
    }

    /** Primary key. */
    protected static final String PK = "RealDestinationServiceRealDestinationServicePkey";

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
    @JoinColumn(name="realStopLocationId", nullable=false)
    private RealStopLocation realStopLocation;
    @ManyToOne(optional=false)
    @Id
    @JoinColumn(name="serviceOrderId", nullable=false)
    private Serviceorder serviceorder;
    @ManyToOne(optional=false)
    @JoinColumn(name="serviceTypeId", nullable=false)
    private Servicetype servicetype;

    /** Default constructor. */
    public RealDestinationService() {
        super();
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
     * Access method for realStopLocation.
     *
     * @return the current value of realStopLocation
     */
    public RealStopLocation getRealStopLocation() {
        return realStopLocation;
    }

    /**
     * Setter method for realStopLocation.
     *
     * @param aRealStopLocation the new value for realStopLocation
     */
    public void setRealStopLocation(RealStopLocation aRealStopLocation) {
        realStopLocation = aRealStopLocation;
    }

    /**
     * Access method for serviceorder.
     *
     * @return the current value of serviceorder
     */
    public Serviceorder getServiceorder() {
        return serviceorder;
    }

    /**
     * Setter method for serviceorder.
     *
     * @param aServiceorder the new value for serviceorder
     */
    public void setServiceorder(Serviceorder aServiceorder) {
        serviceorder = aServiceorder;
    }

    /**
     * Access method for servicetype.
     *
     * @return the current value of servicetype
     */
    public Servicetype getServicetype() {
        return servicetype;
    }

    /**
     * Setter method for servicetype.
     *
     * @param aServicetype the new value for servicetype
     */
    public void setServicetype(Servicetype aServicetype) {
        servicetype = aServicetype;
    }

    /** Temporary value holder for group key fragment realStopLocationRealStopLocationId */
    private transient BigDecimal tempRealStopLocationRealStopLocationId;

    /**
     * Gets the key fragment realStopLocationId for member realStopLocation.
     * If this.realStopLocation is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setRealStopLocationRealStopLocationId.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see RealStopLocation
     */
    public BigDecimal getRealStopLocationRealStopLocationId() {
        return (getRealStopLocation() == null ? tempRealStopLocationRealStopLocationId : getRealStopLocation().getRealStopLocationId());
    }

    /**
     * Sets the key fragment realStopLocationId from member realStopLocation.
     * If this.realStopLocation is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getRealStopLocationRealStopLocationId.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aRealStopLocationId New value for the key fragment
     * @see RealStopLocation
     */
    public void setRealStopLocationRealStopLocationId(BigDecimal aRealStopLocationId) {
        if (getRealStopLocation() == null) {
            tempRealStopLocationRealStopLocationId = aRealStopLocationId;
        } else {
            getRealStopLocation().setRealStopLocationId(aRealStopLocationId);
        }
    }

    /** Temporary value holder for group key fragment serviceorderServiceOrderId */
    private transient BigDecimal tempServiceorderServiceOrderId;

    /**
     * Gets the key fragment serviceOrderId for member serviceorder.
     * If this.serviceorder is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setServiceorderServiceOrderId.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see Serviceorder
     */
    public BigDecimal getServiceorderServiceOrderId() {
        return (getServiceorder() == null ? tempServiceorderServiceOrderId : getServiceorder().getServiceOrderId());
    }

    /**
     * Sets the key fragment serviceOrderId from member serviceorder.
     * If this.serviceorder is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getServiceorderServiceOrderId.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aServiceOrderId New value for the key fragment
     * @see Serviceorder
     */
    public void setServiceorderServiceOrderId(BigDecimal aServiceOrderId) {
        if (getServiceorder() == null) {
            tempServiceorderServiceOrderId = aServiceOrderId;
        } else {
            getServiceorder().setServiceOrderId(aServiceOrderId);
        }
    }

    /**
     * Compares the key for this instance with another RealDestinationService.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class RealDestinationService and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof RealDestinationService)) {
            return false;
        }
        RealDestinationService that = (RealDestinationService) other;
        Object myRealStopLocationRealStopLocationId = this.getRealStopLocationRealStopLocationId();
        Object yourRealStopLocationRealStopLocationId = that.getRealStopLocationRealStopLocationId();
        if (myRealStopLocationRealStopLocationId==null ? yourRealStopLocationRealStopLocationId!=null : !myRealStopLocationRealStopLocationId.equals(yourRealStopLocationRealStopLocationId)) {
            return false;
        }
        Object myServiceorderServiceOrderId = this.getServiceorderServiceOrderId();
        Object yourServiceorderServiceOrderId = that.getServiceorderServiceOrderId();
        if (myServiceorderServiceOrderId==null ? yourServiceorderServiceOrderId!=null : !myServiceorderServiceOrderId.equals(yourServiceorderServiceOrderId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another RealDestinationService.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof RealDestinationService)) return false;
        return this.equalKeys(other) && ((RealDestinationService)other).equalKeys(this);
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
        if (getRealStopLocationRealStopLocationId() == null) {
            i = 0;
        } else {
            i = getRealStopLocationRealStopLocationId().hashCode();
        }
        result = 37*result + i;
        if (getServiceorderServiceOrderId() == null) {
            i = 0;
        } else {
            i = getServiceorderServiceOrderId().hashCode();
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
        StringBuffer sb = new StringBuffer("[RealDestinationService |");
        sb.append(" realStopLocationRealStopLocationId=").append(getRealStopLocationRealStopLocationId());
        sb.append(" serviceorderServiceOrderId=").append(getServiceorderServiceOrderId());
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
        ret.put("realStopLocationRealStopLocationId", getRealStopLocationRealStopLocationId());
        ret.put("serviceorderServiceOrderId", getServiceorderServiceOrderId());
        return ret;
    }

}
