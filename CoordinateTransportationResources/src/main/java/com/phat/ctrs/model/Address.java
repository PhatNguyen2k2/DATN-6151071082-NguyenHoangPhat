// Generated with g9.

package com.phat.ctrs.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Version;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name = "ADDRESS")
public class Address implements Serializable {

    /** Primary key. */
    protected static final String PK = "addressId";

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
    private BigDecimal addressId;
    private String addressDetail;
    @Column(length = 1)
    private boolean isLast;
    @ManyToOne(optional = false)
    @JoinColumn(name = "wardId", nullable = false)
    private Ward ward;
    @OneToMany(mappedBy = "address")
    @JsonIgnore
    private Set<Customer> customer;
    @OneToMany(mappedBy = "address")
    @JsonIgnore
    private Set<Employee> employee;
    @OneToMany(mappedBy = "address2")
    @JsonIgnore
    private Set<Order> order2;
    @OneToMany(mappedBy = "address")
    @JsonIgnore
    private Set<Order> order;
    @OneToMany(mappedBy = "address")
    @JsonIgnore
    private Set<RealStopLocation> realStopLocation;
    @OneToMany(mappedBy = "address")
    @JsonIgnore
    private Set<Route> route;
    @OneToMany(mappedBy = "address2")
    @JsonIgnore
    private Set<Route> route2;
    @OneToMany(mappedBy = "address")
    @JsonIgnore
    private Set<Serviceorder> serviceorder;
    @OneToMany(mappedBy = "address")
    @JsonIgnore
    private Set<StopLocation> stopLocation;
    @OneToMany(mappedBy = "address")
    @JsonIgnore
    private Set<Store> store;

    /** Default constructor. */
    public Address() {
        super();
    }

    /**
     * Access method for addressId.
     *
     * @return the current value of addressId
     */
    public BigDecimal getAddressId() {
        return addressId;
    }

    /**
     * Setter method for addressId.
     *
     * @param aAddressId the new value for addressId
     */
    public void setAddressId(BigDecimal aAddressId) {
        addressId = aAddressId;
    }

    /**
     * Access method for addressDetail.
     *
     * @return the current value of addressDetail
     */
    public String getAddressDetail() {
        return addressDetail;
    }

    /**
     * Setter method for addressDetail.
     *
     * @param aAddressDetail the new value for addressDetail
     */
    public void setAddressDetail(String aAddressDetail) {
        addressDetail = aAddressDetail;
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
     * Access method for ward.
     *
     * @return the current value of ward
     */
    public Ward getWard() {
        return ward;
    }

    /**
     * Setter method for ward.
     *
     * @param aWard the new value for ward
     */
    public void setWard(Ward aWard) {
        ward = aWard;
    }

    /**
     * Access method for customer.
     *
     * @return the current value of customer
     */
    public Set<Customer> getCustomer() {
        return customer;
    }

    /**
     * Setter method for customer.
     *
     * @param aCustomer the new value for customer
     */
    public void setCustomer(Set<Customer> aCustomer) {
        customer = aCustomer;
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
     * Access method for order2.
     *
     * @return the current value of order2
     */
    public Set<Order> getOrder2() {
        return order2;
    }

    /**
     * Setter method for order2.
     *
     * @param aOrder2 the new value for order2
     */
    public void setOrder2(Set<Order> aOrder2) {
        order2 = aOrder2;
    }

    /**
     * Access method for order.
     *
     * @return the current value of order
     */
    public Set<Order> getOrder() {
        return order;
    }

    /**
     * Setter method for order.
     *
     * @param aOrder the new value for order
     */
    public void setOrder(Set<Order> aOrder) {
        order = aOrder;
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

    /**
     * Access method for route.
     *
     * @return the current value of route
     */
    public Set<Route> getRoute() {
        return route;
    }

    /**
     * Setter method for route.
     *
     * @param aRoute the new value for route
     */
    public void setRoute(Set<Route> aRoute) {
        route = aRoute;
    }

    /**
     * Access method for route2.
     *
     * @return the current value of route2
     */
    public Set<Route> getRoute2() {
        return route2;
    }

    /**
     * Setter method for route2.
     *
     * @param aRoute2 the new value for route2
     */
    public void setRoute2(Set<Route> aRoute2) {
        route2 = aRoute2;
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
     * Access method for store.
     *
     * @return the current value of store
     */
    public Set<Store> getStore() {
        return store;
    }

    /**
     * Setter method for store.
     *
     * @param aStore the new value for store
     */
    public void setStore(Set<Store> aStore) {
        store = aStore;
    }

    /**
     * Compares the key for this instance with another Address.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Address and the key objects
     *         are equal
     */
    private boolean equalKeys(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Address)) {
            return false;
        }
        Address that = (Address) other;
        Object myAddressId = this.getAddressId();
        Object yourAddressId = that.getAddressId();
        if (myAddressId == null ? yourAddressId != null : !myAddressId.equals(yourAddressId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Address.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Address))
            return false;
        return this.equalKeys(other) && ((Address) other).equalKeys(this);
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
        if (getAddressId() == null) {
            i = 0;
        } else {
            i = getAddressId().hashCode();
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
        StringBuffer sb = new StringBuffer("[Address |");
        sb.append(" addressId=").append(getAddressId());
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
    // ret.put("addressId", getAddressId());
    // return ret;
    // }

}
