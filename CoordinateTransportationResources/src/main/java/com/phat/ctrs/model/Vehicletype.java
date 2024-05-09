// Generated with g9.

package com.phat.ctrs.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Version;

@Entity(name = "VEHICLETYPE")
public class Vehicletype implements Serializable {

    /** Primary key. */
    protected static final String PK = "vehicleTypeId";

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
    private BigDecimal vehicleTypeId;
    @Column(precision = 10, scale = 2)
    private BigDecimal length;
    @Column(precision = 10, scale = 2)
    private BigDecimal weight;
    @Column(precision = 10, scale = 2)
    private BigDecimal width;
    @Column(precision = 10, scale = 2)
    private BigDecimal height;
    @Column(precision = 10, scale = 2)
    private BigDecimal volume;
    @OneToMany(mappedBy = "vehicletype")
    @JsonIgnore
    private Set<DriverPriceDetail> driverPriceDetail;
    @OneToMany(mappedBy = "vehicletype")
    @JsonIgnore
    private Set<DriverResource> driverResource;
    @OneToMany(mappedBy = "vehicletype")
    @JsonIgnore
    private Set<FeeByBookingDay> feeByBookingDay;
    @OneToMany(mappedBy = "vehicletype")
    @JsonIgnore
    private Set<ServicePrice> servicePrice;
    @OneToMany(mappedBy = "vehicletype")
    @JsonIgnore
    private Set<SkillByVehicletype> skillByVehicletype;
    @OneToMany(mappedBy = "vehicletype")
    @JsonIgnore
    private Set<TransportResource> transportResource;
    @OneToMany(mappedBy = "vehicletype")
    @JsonIgnore
    private Set<VehicleBanSchedule> vehicleBanSchedule;
    @OneToMany(mappedBy = "vehicletype")
    @JsonIgnore
    private Set<VehicleLoadType> vehicleLoadType;
    @OneToMany(mappedBy = "vehicletype")
    @JsonIgnore
    private Set<Route> route;
    @ManyToOne(optional = false)
    @JoinColumn(name = "carrierTypeId", nullable = false)
    private Carriertype carriertype;
    @ManyToOne(optional = false)
    @JoinColumn(name = "vehicleGroupId", nullable = false)
    private Vehiclegroup vehiclegroup;
    @OneToMany(mappedBy = "vehicletype")
    @JsonIgnore
    private Set<Vehicle> vehicle;

    /** Default constructor. */
    public Vehicletype() {
        super();
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
     * Access method for length.
     *
     * @return the current value of length
     */
    public BigDecimal getLength() {
        return length;
    }

    /**
     * Setter method for length.
     *
     * @param aLength the new value for length
     */
    public void setLength(BigDecimal aLength) {
        length = aLength;
    }

    /**
     * Access method for weight.
     *
     * @return the current value of weight
     */
    public BigDecimal getWeight() {
        return weight;
    }

    /**
     * Setter method for weight.
     *
     * @param aWeight the new value for weight
     */
    public void setWeight(BigDecimal aWeight) {
        weight = aWeight;
    }

    /**
     * Access method for width.
     *
     * @return the current value of width
     */
    public BigDecimal getWidth() {
        return width;
    }

    /**
     * Setter method for width.
     *
     * @param aWidth the new value for width
     */
    public void setWidth(BigDecimal aWidth) {
        width = aWidth;
    }

    /**
     * Access method for height.
     *
     * @return the current value of height
     */
    public BigDecimal getHeight() {
        return height;
    }

    /**
     * Setter method for height.
     *
     * @param aHeight the new value for height
     */
    public void setHeight(BigDecimal aHeight) {
        height = aHeight;
    }

    /**
     * Access method for volume.
     *
     * @return the current value of volume
     */
    public BigDecimal getVolume() {
        return volume;
    }

    /**
     * Setter method for volume.
     *
     * @param aVolume the new value for volume
     */
    public void setVolume(BigDecimal aVolume) {
        volume = aVolume;
    }

    /**
     * Access method for driverPriceDetail.
     *
     * @return the current value of driverPriceDetail
     */
    public Set<DriverPriceDetail> getDriverPriceDetail() {
        return driverPriceDetail;
    }

    /**
     * Setter method for driverPriceDetail.
     *
     * @param aDriverPriceDetail the new value for driverPriceDetail
     */
    public void setDriverPriceDetail(Set<DriverPriceDetail> aDriverPriceDetail) {
        driverPriceDetail = aDriverPriceDetail;
    }

    /**
     * Access method for driverResource.
     *
     * @return the current value of driverResource
     */
    public Set<DriverResource> getDriverResource() {
        return driverResource;
    }

    /**
     * Setter method for driverResource.
     *
     * @param aDriverResource the new value for driverResource
     */
    public void setDriverResource(Set<DriverResource> aDriverResource) {
        driverResource = aDriverResource;
    }

    /**
     * Access method for feeByBookingDay.
     *
     * @return the current value of feeByBookingDay
     */
    public Set<FeeByBookingDay> getFeeByBookingDay() {
        return feeByBookingDay;
    }

    /**
     * Setter method for feeByBookingDay.
     *
     * @param aFeeByBookingDay the new value for feeByBookingDay
     */
    public void setFeeByBookingDay(Set<FeeByBookingDay> aFeeByBookingDay) {
        feeByBookingDay = aFeeByBookingDay;
    }

    /**
     * Access method for servicePrice.
     *
     * @return the current value of servicePrice
     */
    public Set<ServicePrice> getServicePrice() {
        return servicePrice;
    }

    /**
     * Setter method for servicePrice.
     *
     * @param aServicePrice the new value for servicePrice
     */
    public void setServicePrice(Set<ServicePrice> aServicePrice) {
        servicePrice = aServicePrice;
    }

    /**
     * Access method for skillByVehicletype.
     *
     * @return the current value of skillByVehicletype
     */
    public Set<SkillByVehicletype> getSkillByVehicletype() {
        return skillByVehicletype;
    }

    /**
     * Setter method for skillByVehicletype.
     *
     * @param aSkillByVehicletype the new value for skillByVehicletype
     */
    public void setSkillByVehicletype(Set<SkillByVehicletype> aSkillByVehicletype) {
        skillByVehicletype = aSkillByVehicletype;
    }

    public Set<Route> getRoute() {
        return route;
    }

    public void setRoute(Set<Route> route) {
        this.route = route;
    }

    /**
     * Access method for transportResource.
     *
     * @return the current value of transportResource
     */
    public Set<TransportResource> getTransportResource() {
        return transportResource;
    }

    /**
     * Setter method for transportResource.
     *
     * @param aTransportResource the new value for transportResource
     */
    public void setTransportResource(Set<TransportResource> aTransportResource) {
        transportResource = aTransportResource;
    }

    /**
     * Access method for vehicleBanSchedule.
     *
     * @return the current value of vehicleBanSchedule
     */
    public Set<VehicleBanSchedule> getVehicleBanSchedule() {
        return vehicleBanSchedule;
    }

    /**
     * Setter method for vehicleBanSchedule.
     *
     * @param aVehicleBanSchedule the new value for vehicleBanSchedule
     */
    public void setVehicleBanSchedule(Set<VehicleBanSchedule> aVehicleBanSchedule) {
        vehicleBanSchedule = aVehicleBanSchedule;
    }

    /**
     * Access method for vehicleLoadType.
     *
     * @return the current value of vehicleLoadType
     */
    public Set<VehicleLoadType> getVehicleLoadType() {
        return vehicleLoadType;
    }

    /**
     * Setter method for vehicleLoadType.
     *
     * @param aVehicleLoadType the new value for vehicleLoadType
     */
    public void setVehicleLoadType(Set<VehicleLoadType> aVehicleLoadType) {
        vehicleLoadType = aVehicleLoadType;
    }

    /**
     * Access method for carriertype.
     *
     * @return the current value of carriertype
     */
    public Carriertype getCarriertype() {
        return carriertype;
    }

    /**
     * Setter method for carriertype.
     *
     * @param aCarriertype the new value for carriertype
     */
    public void setCarriertype(Carriertype aCarriertype) {
        carriertype = aCarriertype;
    }

    /**
     * Access method for vehiclegroup.
     *
     * @return the current value of vehiclegroup
     */
    public Vehiclegroup getVehiclegroup() {
        return vehiclegroup;
    }

    /**
     * Setter method for vehiclegroup.
     *
     * @param aVehiclegroup the new value for vehiclegroup
     */
    public void setVehiclegroup(Vehiclegroup aVehiclegroup) {
        vehiclegroup = aVehiclegroup;
    }

    /**
     * Access method for vehicle.
     *
     * @return the current value of vehicle
     */
    public Set<Vehicle> getVehicle() {
        return vehicle;
    }

    /**
     * Setter method for vehicle.
     *
     * @param aVehicle the new value for vehicle
     */
    public void setVehicle(Set<Vehicle> aVehicle) {
        vehicle = aVehicle;
    }

    /**
     * Compares the key for this instance with another Vehicletype.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Vehicletype and the key
     *         objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Vehicletype)) {
            return false;
        }
        Vehicletype that = (Vehicletype) other;
        Object myVehicleTypeId = this.getVehicleTypeId();
        Object yourVehicleTypeId = that.getVehicleTypeId();
        if (myVehicleTypeId == null ? yourVehicleTypeId != null : !myVehicleTypeId.equals(yourVehicleTypeId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Vehicletype.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Vehicletype))
            return false;
        return this.equalKeys(other) && ((Vehicletype) other).equalKeys(this);
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
        if (getVehicleTypeId() == null) {
            i = 0;
        } else {
            i = getVehicleTypeId().hashCode();
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
        StringBuffer sb = new StringBuffer("[Vehicletype |");
        sb.append(" vehicleTypeId=").append(getVehicleTypeId());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    // public Map<String, Object> getPrimaryKey() {
    // Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
    // ret.put("vehicleTypeId", getVehicleTypeId());
    // return ret;
    // }

    public static String getPk() {
        return PK;
    }

}
