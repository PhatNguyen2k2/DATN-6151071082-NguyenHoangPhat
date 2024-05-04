// Generated with g9.

package com.phat.ctrs.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Version;

@Entity(name="PARTNER")
public class Partner implements Serializable {

    /** Primary key. */
    protected static final String PK = "partnerId";

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
    private BigDecimal partnerId;
    private String partnerName;
    @OneToMany(mappedBy="partner")
    @JsonIgnore
    private Set<EmployeeAgreement> employeeAgreement;
    @OneToMany(mappedBy="partner")
    @JsonIgnore
    private Set<EmployeeBooking> employeeBooking;
    @OneToMany(mappedBy="partner")
    @JsonIgnore
    private Set<Employee> employee;
    @OneToMany(mappedBy="partner")
    @JsonIgnore
    private Set<GroupProductAllowTransport> groupProductAllowTransport;
    @ManyToOne(optional=false)
    @JoinColumn(name="partnerTypeId", nullable=false)
    private Partnertype partnertype;
    @OneToMany(mappedBy="partner")
    @JsonIgnore
    private Set<PartnerRequestpermonth> partnerRequestpermonth;
    @OneToMany(mappedBy="partner")
    @JsonIgnore
    private Set<VehicleAgreement> vehicleAgreement;
    @OneToMany(mappedBy="partner")
    @JsonIgnore
    private Set<VehicleBooking> vehicleBooking;
    @OneToMany(mappedBy="partner")
    @JsonIgnore
    private Set<VehicleBookingRate> vehicleBookingRate;
    @OneToMany(mappedBy="partner")
    @JsonIgnore
    private Set<VehicleLoadType> vehicleLoadType;
    @OneToMany(mappedBy="partner")
    @JsonIgnore
    private Set<Vehicle> vehicle;

    /** Default constructor. */
    public Partner() {
        super();
    }

    /**
     * Access method for partnerId.
     *
     * @return the current value of partnerId
     */
    public BigDecimal getPartnerId() {
        return partnerId;
    }

    /**
     * Setter method for partnerId.
     *
     * @param aPartnerId the new value for partnerId
     */
    public void setPartnerId(BigDecimal aPartnerId) {
        partnerId = aPartnerId;
    }

    /**
     * Access method for partnerName.
     *
     * @return the current value of partnerName
     */
    public String getPartnerName() {
        return partnerName;
    }

    /**
     * Setter method for partnerName.
     *
     * @param aPartnerName the new value for partnerName
     */
    public void setPartnerName(String aPartnerName) {
        partnerName = aPartnerName;
    }

    /**
     * Access method for employeeAgreement.
     *
     * @return the current value of employeeAgreement
     */
    public Set<EmployeeAgreement> getEmployeeAgreement() {
        return employeeAgreement;
    }

    /**
     * Setter method for employeeAgreement.
     *
     * @param aEmployeeAgreement the new value for employeeAgreement
     */
    public void setEmployeeAgreement(Set<EmployeeAgreement> aEmployeeAgreement) {
        employeeAgreement = aEmployeeAgreement;
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
     * Access method for employee.
     *
     * @return the current value of employee
     */
    public Set<Employee> getEmployee() {
        return employee;
    }

    /**
     * Setter method for employee.
     *
     * @param aEmployee the new value for employee
     */
    public void setEmployee(Set<Employee> aEmployee) {
        employee = aEmployee;
    }

    /**
     * Access method for groupProductAllowTransport.
     *
     * @return the current value of groupProductAllowTransport
     */
    public Set<GroupProductAllowTransport> getGroupProductAllowTransport() {
        return groupProductAllowTransport;
    }

    /**
     * Setter method for groupProductAllowTransport.
     *
     * @param aGroupProductAllowTransport the new value for groupProductAllowTransport
     */
    public void setGroupProductAllowTransport(Set<GroupProductAllowTransport> aGroupProductAllowTransport) {
        groupProductAllowTransport = aGroupProductAllowTransport;
    }

    /**
     * Access method for partnertype.
     *
     * @return the current value of partnertype
     */
    public Partnertype getPartnertype() {
        return partnertype;
    }

    /**
     * Setter method for partnertype.
     *
     * @param aPartnertype the new value for partnertype
     */
    public void setPartnertype(Partnertype aPartnertype) {
        partnertype = aPartnertype;
    }

    /**
     * Access method for partnerRequestpermonth.
     *
     * @return the current value of partnerRequestpermonth
     */
    public Set<PartnerRequestpermonth> getPartnerRequestpermonth() {
        return partnerRequestpermonth;
    }

    /**
     * Setter method for partnerRequestpermonth.
     *
     * @param aPartnerRequestpermonth the new value for partnerRequestpermonth
     */
    public void setPartnerRequestpermonth(Set<PartnerRequestpermonth> aPartnerRequestpermonth) {
        partnerRequestpermonth = aPartnerRequestpermonth;
    }

    /**
     * Access method for vehicleAgreement.
     *
     * @return the current value of vehicleAgreement
     */
    public Set<VehicleAgreement> getVehicleAgreement() {
        return vehicleAgreement;
    }

    /**
     * Setter method for vehicleAgreement.
     *
     * @param aVehicleAgreement the new value for vehicleAgreement
     */
    public void setVehicleAgreement(Set<VehicleAgreement> aVehicleAgreement) {
        vehicleAgreement = aVehicleAgreement;
    }

    /**
     * Access method for vehicleBooking.
     *
     * @return the current value of vehicleBooking
     */
    public Set<VehicleBooking> getVehicleBooking() {
        return vehicleBooking;
    }

    /**
     * Setter method for vehicleBooking.
     *
     * @param aVehicleBooking the new value for vehicleBooking
     */
    public void setVehicleBooking(Set<VehicleBooking> aVehicleBooking) {
        vehicleBooking = aVehicleBooking;
    }

    /**
     * Access method for vehicleBookingRate.
     *
     * @return the current value of vehicleBookingRate
     */
    public Set<VehicleBookingRate> getVehicleBookingRate() {
        return vehicleBookingRate;
    }

    /**
     * Setter method for vehicleBookingRate.
     *
     * @param aVehicleBookingRate the new value for vehicleBookingRate
     */
    public void setVehicleBookingRate(Set<VehicleBookingRate> aVehicleBookingRate) {
        vehicleBookingRate = aVehicleBookingRate;
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
     * Compares the key for this instance with another Partner.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Partner and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Partner)) {
            return false;
        }
        Partner that = (Partner) other;
        Object myPartnerId = this.getPartnerId();
        Object yourPartnerId = that.getPartnerId();
        if (myPartnerId==null ? yourPartnerId!=null : !myPartnerId.equals(yourPartnerId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Partner.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Partner)) return false;
        return this.equalKeys(other) && ((Partner)other).equalKeys(this);
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
        if (getPartnerId() == null) {
            i = 0;
        } else {
            i = getPartnerId().hashCode();
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
        StringBuffer sb = new StringBuffer("[Partner |");
        sb.append(" partnerId=").append(getPartnerId());
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
        ret.put("partnerId", getPartnerId());
        return ret;
    }

}
