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

@Entity(name="VEHICLE_BOOKING_ROUTE")
@IdClass(VehicleBookingRoute.VehicleBookingRouteId.class)
public class VehicleBookingRoute implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class VehicleBookingRouteId implements Serializable {
        Route route;
        VehicleBooking vehicleBooking;
    }

    /** Primary key. */
    protected static final String PK = "VehicleBookingRouteVehicleBookingRoutePkey";

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
    @JoinColumn(name="routeId", nullable=false)
    private Route route;
    @ManyToOne(optional=false)
    @Id
    @JoinColumn(name="vehicleBookingId", nullable=false)
    private VehicleBooking vehicleBooking;

    /** Default constructor. */
    public VehicleBookingRoute() {
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
     * Access method for vehicleBooking.
     *
     * @return the current value of vehicleBooking
     */
    public VehicleBooking getVehicleBooking() {
        return vehicleBooking;
    }

    /**
     * Setter method for vehicleBooking.
     *
     * @param aVehicleBooking the new value for vehicleBooking
     */
    public void setVehicleBooking(VehicleBooking aVehicleBooking) {
        vehicleBooking = aVehicleBooking;
    }

    /** Temporary value holder for group key fragment routeRouteId */
    private transient BigDecimal tempRouteRouteId;

    /**
     * Gets the key fragment routeId for member route.
     * If this.route is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setRouteRouteId.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see Route
     */
    public BigDecimal getRouteRouteId() {
        return (getRoute() == null ? tempRouteRouteId : getRoute().getRouteId());
    }

    /**
     * Sets the key fragment routeId from member route.
     * If this.route is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getRouteRouteId.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aRouteId New value for the key fragment
     * @see Route
     */
    public void setRouteRouteId(BigDecimal aRouteId) {
        if (getRoute() == null) {
            tempRouteRouteId = aRouteId;
        } else {
            getRoute().setRouteId(aRouteId);
        }
    }

    /** Temporary value holder for group key fragment vehicleBookingVehicleBookingId */
    private transient BigDecimal tempVehicleBookingVehicleBookingId;

    /**
     * Gets the key fragment vehicleBookingId for member vehicleBooking.
     * If this.vehicleBooking is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setVehicleBookingVehicleBookingId.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see VehicleBooking
     */
    public BigDecimal getVehicleBookingVehicleBookingId() {
        return (getVehicleBooking() == null ? tempVehicleBookingVehicleBookingId : getVehicleBooking().getVehicleBookingId());
    }

    /**
     * Sets the key fragment vehicleBookingId from member vehicleBooking.
     * If this.vehicleBooking is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getVehicleBookingVehicleBookingId.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aVehicleBookingId New value for the key fragment
     * @see VehicleBooking
     */
    public void setVehicleBookingVehicleBookingId(BigDecimal aVehicleBookingId) {
        if (getVehicleBooking() == null) {
            tempVehicleBookingVehicleBookingId = aVehicleBookingId;
        } else {
            getVehicleBooking().setVehicleBookingId(aVehicleBookingId);
        }
    }

    /**
     * Compares the key for this instance with another VehicleBookingRoute.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class VehicleBookingRoute and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof VehicleBookingRoute)) {
            return false;
        }
        VehicleBookingRoute that = (VehicleBookingRoute) other;
        Object myRouteRouteId = this.getRouteRouteId();
        Object yourRouteRouteId = that.getRouteRouteId();
        if (myRouteRouteId==null ? yourRouteRouteId!=null : !myRouteRouteId.equals(yourRouteRouteId)) {
            return false;
        }
        Object myVehicleBookingVehicleBookingId = this.getVehicleBookingVehicleBookingId();
        Object yourVehicleBookingVehicleBookingId = that.getVehicleBookingVehicleBookingId();
        if (myVehicleBookingVehicleBookingId==null ? yourVehicleBookingVehicleBookingId!=null : !myVehicleBookingVehicleBookingId.equals(yourVehicleBookingVehicleBookingId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another VehicleBookingRoute.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof VehicleBookingRoute)) return false;
        return this.equalKeys(other) && ((VehicleBookingRoute)other).equalKeys(this);
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
        if (getRouteRouteId() == null) {
            i = 0;
        } else {
            i = getRouteRouteId().hashCode();
        }
        result = 37*result + i;
        if (getVehicleBookingVehicleBookingId() == null) {
            i = 0;
        } else {
            i = getVehicleBookingVehicleBookingId().hashCode();
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
        StringBuffer sb = new StringBuffer("[VehicleBookingRoute |");
        sb.append(" routeRouteId=").append(getRouteRouteId());
        sb.append(" vehicleBookingVehicleBookingId=").append(getVehicleBookingVehicleBookingId());
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
        ret.put("routeRouteId", getRouteRouteId());
        ret.put("vehicleBookingVehicleBookingId", getVehicleBookingVehicleBookingId());
        return ret;
    }

}
