// Generated with g9.

package com.phat.ctrs.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Version;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name = "ROUTE")
public class Route implements Serializable {

    /** Primary key. */
    protected static final String PK = "routeId";

    /**
     * The optimistic lock. Available via standard bean get/set operations.
     */
    @Version
    @Column(name = "LOCK_FLAG")
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
    @Column(unique = true, nullable = false, precision = 10)
    private BigDecimal routeId;
    private LocalDateTime beginTime;
    private LocalDateTime endTime;
    @Column(precision = 10, scale = 2)
    private BigDecimal routeLength;
    @ManyToOne(optional = false)
    @JoinColumn(name = "vehicleTypeId", nullable = false)
    private Vehicletype vehicletype;
    private BigDecimal cost;
    @ManyToOne()
    @JoinColumn(name = "skillId")
    private Skill skill;
    @Column(precision = 10)
    private BigDecimal numberRequire;
    @Column(precision = 10)
    private BigDecimal createdUser;
    private LocalDateTime createdDate;
    @Column(precision = 10)
    private BigDecimal updatedUser;
    private LocalDateTime updatedDate;
    @Column(precision = 10)
    private BigDecimal deletedUser;
    private LocalDateTime deletedDate;
    private String updateNote;
    @Column(length = 1)
    private boolean isLast;
    @OneToMany(mappedBy = "route")
    @JsonIgnore
    private Set<EmployeeBooking> employeeBooking;
    @OneToMany(mappedBy = "route")
    @JsonIgnore
    private Set<RealStopLocation> realStopLocation;
    @ManyToOne(optional = false)
    @JoinColumn(name = "beginAddress", nullable = false)
    private Address address;
    @ManyToOne(optional = false)
    @JoinColumn(name = "endAddress", nullable = false)
    private Address address2;
    @ManyToOne(optional = false)
    @JoinColumn(name = "tranportFormId", nullable = false)
    private TransportForm transportForm;
    @OneToMany(mappedBy = "route")
    @JsonIgnore
    private Set<StopLocation> stopLocation;
    @OneToMany(mappedBy = "route")
    @JsonIgnore
    private Set<TransportServicePlan> transportServicePlan;
    @OneToMany(mappedBy = "route")
    @JsonIgnore
    private Set<VehicleBookingRoute> vehicleBookingRoute;

    /** Default constructor. */
    public Route() {
        super();
    }

    public Route(BigDecimal routeId) {
        this.routeId = routeId;
    }

    /**
     * Access method for routeId.
     *
     * @return the current value of routeId
     */
    public BigDecimal getRouteId() {
        return routeId;
    }

    /**
     * Setter method for routeId.
     *
     * @param aRouteId the new value for routeId
     */
    public void setRouteId(BigDecimal aRouteId) {
        routeId = aRouteId;
    }

    /**
     * Access method for beginTime.
     *
     * @return the current value of beginTime
     */
    public LocalDateTime getBeginTime() {
        return beginTime;
    }

    /**
     * Setter method for beginTime.
     *
     * @param aBeginTime the new value for beginTime
     */
    public void setBeginTime(LocalDateTime aBeginTime) {
        beginTime = aBeginTime;
    }

    /**
     * Access method for endTime.
     *
     * @return the current value of endTime
     */
    public LocalDateTime getEndTime() {
        return endTime;
    }

    /**
     * Setter method for endTime.
     *
     * @param aEndTime the new value for endTime
     */
    public void setEndTime(LocalDateTime aEndTime) {
        endTime = aEndTime;
    }

    /**
     * Access method for routeLength.
     *
     * @return the current value of routeLength
     */
    public BigDecimal getRouteLength() {
        return routeLength;
    }

    /**
     * Setter method for routeLength.
     *
     * @param aRouteLength the new value for routeLength
     */
    public void setRouteLength(BigDecimal aRouteLength) {
        routeLength = aRouteLength;
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
     * Access method for employeeBooking.
     *
     * @return the current value of employeeBooking
     */
    public Set<EmployeeBooking> getEmployeeBooking() {
        return employeeBooking;
    }

    /**
     * Setter method for employeeBooking.
     *
     * @param aEmployeeBooking the new value for employeeBooking
     */
    public void setEmployeeBooking(Set<EmployeeBooking> aEmployeeBooking) {
        employeeBooking = aEmployeeBooking;
    }

    /**
     * Access method for realStopLocation.
     *
     * @return the current value of realStopLocation
     */
    public Set<RealStopLocation> getRealStopLocation() {
        return realStopLocation;
    }

    /**
     * Setter method for realStopLocation.
     *
     * @param aRealStopLocation the new value for realStopLocation
     */
    public void setRealStopLocation(Set<RealStopLocation> aRealStopLocation) {
        realStopLocation = aRealStopLocation;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
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
     * Access method for address2.
     *
     * @return the current value of address2
     */
    public Address getAddress2() {
        return address2;
    }

    /**
     * Setter method for address2.
     *
     * @param aAddress2 the new value for address2
     */
    public void setAddress2(Address aAddress2) {
        address2 = aAddress2;
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
     * Access method for stopLocation.
     *
     * @return the current value of stopLocation
     */
    public Set<StopLocation> getStopLocation() {
        return stopLocation;
    }

    /**
     * Setter method for stopLocation.
     *
     * @param aStopLocation the new value for stopLocation
     */
    public void setStopLocation(Set<StopLocation> aStopLocation) {
        stopLocation = aStopLocation;
    }

    /**
     * Access method for transportServicePlan.
     *
     * @return the current value of transportServicePlan
     */
    public Set<TransportServicePlan> getTransportServicePlan() {
        return transportServicePlan;
    }

    /**
     * Setter method for transportServicePlan.
     *
     * @param aTransportServicePlan the new value for transportServicePlan
     */
    public void setTransportServicePlan(Set<TransportServicePlan> aTransportServicePlan) {
        transportServicePlan = aTransportServicePlan;
    }

    /**
     * Access method for vehicleBookingRoute.
     *
     * @return the current value of vehicleBookingRoute
     */
    public Set<VehicleBookingRoute> getVehicleBookingRoute() {
        return vehicleBookingRoute;
    }

    /**
     * Setter method for vehicleBookingRoute.
     *
     * @param aVehicleBookingRoute the new value for vehicleBookingRoute
     */
    public void setVehicleBookingRoute(Set<VehicleBookingRoute> aVehicleBookingRoute) {
        vehicleBookingRoute = aVehicleBookingRoute;
    }

    /**
     * Compares the key for this instance with another Route.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Route and the key objects
     *         are equal
     */
    private boolean equalKeys(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Route)) {
            return false;
        }
        Route that = (Route) other;
        Object myRouteId = this.getRouteId();
        Object yourRouteId = that.getRouteId();
        if (myRouteId == null ? yourRouteId != null : !myRouteId.equals(yourRouteId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Route.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Route))
            return false;
        return this.equalKeys(other) && ((Route) other).equalKeys(this);
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
        if (getRouteId() == null) {
            i = 0;
        } else {
            i = getRouteId().hashCode();
        }
        result = 37 * result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[Route |");
        sb.append(" routeId=").append(getRouteId());
        sb.append("]");
        return sb.toString();
    }

    public static String getPk() {
        return PK;
    }

    public Vehicletype getVehicleType() {
        return vehicletype;
    }

    public void setVehicleType(Vehicletype vehicleType) {
        this.vehicletype = vehicleType;
    }

    public void setLast(boolean isLast) {
        this.isLast = isLast;
    }

    public Vehicletype getVehicletype() {
        return vehicletype;
    }

    public void setVehicletype(Vehicletype vehicletype) {
        this.vehicletype = vehicletype;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public BigDecimal getNumberRequire() {
        return numberRequire;
    }

    public void setNumberRequire(BigDecimal numberRequire) {
        this.numberRequire = numberRequire;
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    // public Map<String, Object> getPrimaryKey() {
    // Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
    // ret.put("routeId", getRouteId());
    // return ret;
    // }

}
