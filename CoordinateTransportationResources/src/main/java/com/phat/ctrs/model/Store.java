// Generated with g9.

package com.phat.ctrs.model;

import java.io.Serializable;
import java.math.BigDecimal;
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

@Entity(name="STORE")
public class Store implements Serializable {

    /** Primary key. */
    protected static final String PK = "storeId";

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
    private BigDecimal storeId;
    private String storeName;
    @OneToMany(mappedBy="store")
    private Set<BookingPercent> bookingPercent;
    @OneToMany(mappedBy="store")
    private Set<DriverPriceDetail> driverPriceDetail;
    @OneToMany(mappedBy="store")
    private Set<EmployeeAgreement> employeeAgreement;
    @OneToMany(mappedBy="store")
    private Set<EmployeeLoad> employeeLoad;
    @OneToMany(mappedBy="store")
    private Set<Employee> employee;
    @OneToMany(mappedBy="store")
    private Set<EmployeeViolateInfo> employeeViolateInfo;
    @OneToMany(mappedBy="store")
    private Set<LoadDeviation> loadDeviation;
    @OneToMany(mappedBy="store")
    private Set<MaxDrivingTime> maxDrivingTime;
    @OneToMany(mappedBy="store")
    private Set<PartnerRequestpermonth> partnerRequestpermonth;
    @OneToMany(mappedBy="store")
    private Set<RuleInUse> ruleInUse;
    @OneToMany(mappedBy="store2")
    private Set<Serviceorder> serviceorder2;
    @OneToMany(mappedBy="store")
    private Set<Serviceorder> serviceorder;
    @OneToMany(mappedBy="store")
    private Set<Shift> shift;
    @ManyToOne(optional=false)
    @JoinColumn(name="addressId", nullable=false)
    private Address address;
    @OneToMany(mappedBy="store2")
    private Set<Store> store3;
    @ManyToOne
    @JoinColumn(name="coordinationStore")
    private Store store2;
    @ManyToOne(optional=false)
    @JoinColumn(name="storeTypeId", nullable=false)
    private Storetype storetype;
    @OneToMany(mappedBy="store")
    private Set<VehicleAgreement> vehicleAgreement;
    @OneToMany(mappedBy="store")
    private Set<VehicleBookingExpiration> vehicleBookingExpiration;
    @OneToMany(mappedBy="store")
    private Set<VehicleBookingRate> vehicleBookingRate;
    @OneToMany(mappedBy="store")
    private Set<VehicleLoadType> vehicleLoadType;

    /** Default constructor. */
    public Store() {
        super();
    }

    /**
     * Access method for storeId.
     *
     * @return the current value of storeId
     */
    public BigDecimal getStoreId() {
        return storeId;
    }

    /**
     * Setter method for storeId.
     *
     * @param aStoreId the new value for storeId
     */
    public void setStoreId(BigDecimal aStoreId) {
        storeId = aStoreId;
    }

    /**
     * Access method for storeName.
     *
     * @return the current value of storeName
     */
    public String getStoreName() {
        return storeName;
    }

    /**
     * Setter method for storeName.
     *
     * @param aStoreName the new value for storeName
     */
    public void setStoreName(String aStoreName) {
        storeName = aStoreName;
    }

    /**
     * Access method for bookingPercent.
     *
     * @return the current value of bookingPercent
     */
    public Set<BookingPercent> getBookingPercent() {
        return bookingPercent;
    }

    /**
     * Setter method for bookingPercent.
     *
     * @param aBookingPercent the new value for bookingPercent
     */
    public void setBookingPercent(Set<BookingPercent> aBookingPercent) {
        bookingPercent = aBookingPercent;
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
     * Access method for employeeLoad.
     *
     * @return the current value of employeeLoad
     */
    public Set<EmployeeLoad> getEmployeeLoad() {
        return employeeLoad;
    }

    /**
     * Setter method for employeeLoad.
     *
     * @param aEmployeeLoad the new value for employeeLoad
     */
    public void setEmployeeLoad(Set<EmployeeLoad> aEmployeeLoad) {
        employeeLoad = aEmployeeLoad;
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
     * Access method for employeeViolateInfo.
     *
     * @return the current value of employeeViolateInfo
     */
    public Set<EmployeeViolateInfo> getEmployeeViolateInfo() {
        return employeeViolateInfo;
    }

    /**
     * Setter method for employeeViolateInfo.
     *
     * @param aEmployeeViolateInfo the new value for employeeViolateInfo
     */
    public void setEmployeeViolateInfo(Set<EmployeeViolateInfo> aEmployeeViolateInfo) {
        employeeViolateInfo = aEmployeeViolateInfo;
    }

    /**
     * Access method for loadDeviation.
     *
     * @return the current value of loadDeviation
     */
    public Set<LoadDeviation> getLoadDeviation() {
        return loadDeviation;
    }

    /**
     * Setter method for loadDeviation.
     *
     * @param aLoadDeviation the new value for loadDeviation
     */
    public void setLoadDeviation(Set<LoadDeviation> aLoadDeviation) {
        loadDeviation = aLoadDeviation;
    }

    /**
     * Access method for maxDrivingTime.
     *
     * @return the current value of maxDrivingTime
     */
    public Set<MaxDrivingTime> getMaxDrivingTime() {
        return maxDrivingTime;
    }

    /**
     * Setter method for maxDrivingTime.
     *
     * @param aMaxDrivingTime the new value for maxDrivingTime
     */
    public void setMaxDrivingTime(Set<MaxDrivingTime> aMaxDrivingTime) {
        maxDrivingTime = aMaxDrivingTime;
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
     * Access method for ruleInUse.
     *
     * @return the current value of ruleInUse
     */
    public Set<RuleInUse> getRuleInUse() {
        return ruleInUse;
    }

    /**
     * Setter method for ruleInUse.
     *
     * @param aRuleInUse the new value for ruleInUse
     */
    public void setRuleInUse(Set<RuleInUse> aRuleInUse) {
        ruleInUse = aRuleInUse;
    }

    /**
     * Access method for serviceorder2.
     *
     * @return the current value of serviceorder2
     */
    public Set<Serviceorder> getServiceorder2() {
        return serviceorder2;
    }

    /**
     * Setter method for serviceorder2.
     *
     * @param aServiceorder2 the new value for serviceorder2
     */
    public void setServiceorder2(Set<Serviceorder> aServiceorder2) {
        serviceorder2 = aServiceorder2;
    }

    /**
     * Access method for serviceorder.
     *
     * @return the current value of serviceorder
     */
    public Set<Serviceorder> getServiceorder() {
        return serviceorder;
    }

    /**
     * Setter method for serviceorder.
     *
     * @param aServiceorder the new value for serviceorder
     */
    public void setServiceorder(Set<Serviceorder> aServiceorder) {
        serviceorder = aServiceorder;
    }

    /**
     * Access method for shift.
     *
     * @return the current value of shift
     */
    public Set<Shift> getShift() {
        return shift;
    }

    /**
     * Setter method for shift.
     *
     * @param aShift the new value for shift
     */
    public void setShift(Set<Shift> aShift) {
        shift = aShift;
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
     * Access method for store3.
     *
     * @return the current value of store3
     */
    public Set<Store> getStore3() {
        return store3;
    }

    /**
     * Setter method for store3.
     *
     * @param aStore3 the new value for store3
     */
    public void setStore3(Set<Store> aStore3) {
        store3 = aStore3;
    }

    /**
     * Access method for store2.
     *
     * @return the current value of store2
     */
    public Store getStore2() {
        return store2;
    }

    /**
     * Setter method for store2.
     *
     * @param aStore2 the new value for store2
     */
    public void setStore2(Store aStore2) {
        store2 = aStore2;
    }

    /**
     * Access method for storetype.
     *
     * @return the current value of storetype
     */
    public Storetype getStoretype() {
        return storetype;
    }

    /**
     * Setter method for storetype.
     *
     * @param aStoretype the new value for storetype
     */
    public void setStoretype(Storetype aStoretype) {
        storetype = aStoretype;
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
     * Access method for vehicleBookingExpiration.
     *
     * @return the current value of vehicleBookingExpiration
     */
    public Set<VehicleBookingExpiration> getVehicleBookingExpiration() {
        return vehicleBookingExpiration;
    }

    /**
     * Setter method for vehicleBookingExpiration.
     *
     * @param aVehicleBookingExpiration the new value for vehicleBookingExpiration
     */
    public void setVehicleBookingExpiration(Set<VehicleBookingExpiration> aVehicleBookingExpiration) {
        vehicleBookingExpiration = aVehicleBookingExpiration;
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
     * Compares the key for this instance with another Store.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Store and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Store)) {
            return false;
        }
        Store that = (Store) other;
        Object myStoreId = this.getStoreId();
        Object yourStoreId = that.getStoreId();
        if (myStoreId==null ? yourStoreId!=null : !myStoreId.equals(yourStoreId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Store.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Store)) return false;
        return this.equalKeys(other) && ((Store)other).equalKeys(this);
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
        if (getStoreId() == null) {
            i = 0;
        } else {
            i = getStoreId().hashCode();
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
        StringBuffer sb = new StringBuffer("[Store |");
        sb.append(" storeId=").append(getStoreId());
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
        ret.put("storeId", getStoreId());
        return ret;
    }

}
