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

@Entity(name="TRANSPORT_SERVICE_PLAN")
public class TransportServicePlan implements Serializable {

    /** Primary key. */
    protected static final String PK = "transportServicePlanId";

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
    private BigDecimal transportServicePlanId;
    @Column(precision=10)
    private BigDecimal vehicleId;
    @Column(precision=10)
    private BigDecimal vehicleTypeId;
    @Column(precision=10)
    private BigDecimal employeeQuantity;
    @Column(precision=10)
    private BigDecimal driverQuantity;
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
    @OneToMany(mappedBy="transportServicePlan")
    private Set<EmployeeTransportService> employeeTransportService;
    @OneToMany(mappedBy="transportServicePlan")
    private Set<ImplementTransportation> implementTransportation;
    @ManyToOne(optional=false)
    @JoinColumn(name="routeId", nullable=false)
    private Route route;

    /** Default constructor. */
    public TransportServicePlan() {
        super();
    }

    /**
     * Access method for transportServicePlanId.
     *
     * @return the current value of transportServicePlanId
     */
    public BigDecimal getTransportServicePlanId() {
        return transportServicePlanId;
    }

    /**
     * Setter method for transportServicePlanId.
     *
     * @param aTransportServicePlanId the new value for transportServicePlanId
     */
    public void setTransportServicePlanId(BigDecimal aTransportServicePlanId) {
        transportServicePlanId = aTransportServicePlanId;
    }

    /**
     * Access method for vehicleId.
     *
     * @return the current value of vehicleId
     */
    public BigDecimal getVehicleId() {
        return vehicleId;
    }

    /**
     * Setter method for vehicleId.
     *
     * @param aVehicleId the new value for vehicleId
     */
    public void setVehicleId(BigDecimal aVehicleId) {
        vehicleId = aVehicleId;
    }

    /**
     * Access method for vehicleTypeId.
     *
     * @return the current value of vehicleTypeId
     */
    public BigDecimal getVehicleTypeId() {
        return vehicleTypeId;
    }

    /**
     * Setter method for vehicleTypeId.
     *
     * @param aVehicleTypeId the new value for vehicleTypeId
     */
    public void setVehicleTypeId(BigDecimal aVehicleTypeId) {
        vehicleTypeId = aVehicleTypeId;
    }

    /**
     * Access method for employeeQuantity.
     *
     * @return the current value of employeeQuantity
     */
    public BigDecimal getEmployeeQuantity() {
        return employeeQuantity;
    }

    /**
     * Setter method for employeeQuantity.
     *
     * @param aEmployeeQuantity the new value for employeeQuantity
     */
    public void setEmployeeQuantity(BigDecimal aEmployeeQuantity) {
        employeeQuantity = aEmployeeQuantity;
    }

    /**
     * Access method for driverQuantity.
     *
     * @return the current value of driverQuantity
     */
    public BigDecimal getDriverQuantity() {
        return driverQuantity;
    }

    /**
     * Setter method for driverQuantity.
     *
     * @param aDriverQuantity the new value for driverQuantity
     */
    public void setDriverQuantity(BigDecimal aDriverQuantity) {
        driverQuantity = aDriverQuantity;
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
     * Access method for employeeTransportService.
     *
     * @return the current value of employeeTransportService
     */
    public Set<EmployeeTransportService> getEmployeeTransportService() {
        return employeeTransportService;
    }

    /**
     * Setter method for employeeTransportService.
     *
     * @param aEmployeeTransportService the new value for employeeTransportService
     */
    public void setEmployeeTransportService(Set<EmployeeTransportService> aEmployeeTransportService) {
        employeeTransportService = aEmployeeTransportService;
    }

    /**
     * Access method for implementTransportation.
     *
     * @return the current value of implementTransportation
     */
    public Set<ImplementTransportation> getImplementTransportation() {
        return implementTransportation;
    }

    /**
     * Setter method for implementTransportation.
     *
     * @param aImplementTransportation the new value for implementTransportation
     */
    public void setImplementTransportation(Set<ImplementTransportation> aImplementTransportation) {
        implementTransportation = aImplementTransportation;
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
     * Compares the key for this instance with another TransportServicePlan.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class TransportServicePlan and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof TransportServicePlan)) {
            return false;
        }
        TransportServicePlan that = (TransportServicePlan) other;
        Object myTransportServicePlanId = this.getTransportServicePlanId();
        Object yourTransportServicePlanId = that.getTransportServicePlanId();
        if (myTransportServicePlanId==null ? yourTransportServicePlanId!=null : !myTransportServicePlanId.equals(yourTransportServicePlanId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another TransportServicePlan.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof TransportServicePlan)) return false;
        return this.equalKeys(other) && ((TransportServicePlan)other).equalKeys(this);
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
        if (getTransportServicePlanId() == null) {
            i = 0;
        } else {
            i = getTransportServicePlanId().hashCode();
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
        StringBuffer sb = new StringBuffer("[TransportServicePlan |");
        sb.append(" transportServicePlanId=").append(getTransportServicePlanId());
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
        ret.put("transportServicePlanId", getTransportServicePlanId());
        return ret;
    }

}
