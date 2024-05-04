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

@Entity(name="REAL_STOP_LOCATION")
public class RealStopLocation implements Serializable {

    /** Primary key. */
    protected static final String PK = "realStopLocationId";

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
    private BigDecimal realStopLocationId;
    @Column(precision=10)
    private BigDecimal stopIndex;
    private LocalDateTime realStopTime;
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
    @OneToMany(mappedBy="realStopLocation")
    private Set<RealDestinationService> realDestinationService;
    @ManyToOne(optional=false)
    @JoinColumn(name="routeId", nullable=false)
    private Route route;
    @ManyToOne(optional=false)
    @JoinColumn(name="stopAddress", nullable=false)
    private Address address;

    /** Default constructor. */
    public RealStopLocation() {
        super();
    }

    /**
     * Access method for realStopLocationId.
     *
     * @return the current value of realStopLocationId
     */
    public BigDecimal getRealStopLocationId() {
        return realStopLocationId;
    }

    /**
     * Setter method for realStopLocationId.
     *
     * @param aRealStopLocationId the new value for realStopLocationId
     */
    public void setRealStopLocationId(BigDecimal aRealStopLocationId) {
        realStopLocationId = aRealStopLocationId;
    }

    /**
     * Access method for stopIndex.
     *
     * @return the current value of stopIndex
     */
    public BigDecimal getStopIndex() {
        return stopIndex;
    }

    /**
     * Setter method for stopIndex.
     *
     * @param aStopIndex the new value for stopIndex
     */
    public void setStopIndex(BigDecimal aStopIndex) {
        stopIndex = aStopIndex;
    }

    /**
     * Access method for realStopTime.
     *
     * @return the current value of realStopTime
     */
    public LocalDateTime getRealStopTime() {
        return realStopTime;
    }

    /**
     * Setter method for realStopTime.
     *
     * @param aRealStopTime the new value for realStopTime
     */
    public void setRealStopTime(LocalDateTime aRealStopTime) {
        realStopTime = aRealStopTime;
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
     * Access method for realDestinationService.
     *
     * @return the current value of realDestinationService
     */
    public Set<RealDestinationService> getRealDestinationService() {
        return realDestinationService;
    }

    /**
     * Setter method for realDestinationService.
     *
     * @param aRealDestinationService the new value for realDestinationService
     */
    public void setRealDestinationService(Set<RealDestinationService> aRealDestinationService) {
        realDestinationService = aRealDestinationService;
    }

    /**
     * Access method for route.
     *
     * @return the current value of route
     */
    public Route getRoute() {
        return route;
    }

    /**
     * Setter method for route.
     *
     * @param aRoute the new value for route
     */
    public void setRoute(Route aRoute) {
        route = aRoute;
    }

    /**
     * Access method for address.
     *
     * @return the current value of address
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Setter method for address.
     *
     * @param aAddress the new value for address
     */
    public void setAddress(Address aAddress) {
        address = aAddress;
    }

    /**
     * Compares the key for this instance with another RealStopLocation.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class RealStopLocation and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof RealStopLocation)) {
            return false;
        }
        RealStopLocation that = (RealStopLocation) other;
        Object myRealStopLocationId = this.getRealStopLocationId();
        Object yourRealStopLocationId = that.getRealStopLocationId();
        if (myRealStopLocationId==null ? yourRealStopLocationId!=null : !myRealStopLocationId.equals(yourRealStopLocationId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another RealStopLocation.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof RealStopLocation)) return false;
        return this.equalKeys(other) && ((RealStopLocation)other).equalKeys(this);
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
        if (getRealStopLocationId() == null) {
            i = 0;
        } else {
            i = getRealStopLocationId().hashCode();
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
        StringBuffer sb = new StringBuffer("[RealStopLocation |");
        sb.append(" realStopLocationId=").append(getRealStopLocationId());
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
        ret.put("realStopLocationId", getRealStopLocationId());
        return ret;
    }

}
