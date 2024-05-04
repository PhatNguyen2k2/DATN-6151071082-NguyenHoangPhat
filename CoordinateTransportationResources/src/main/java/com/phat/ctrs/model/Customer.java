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

@Entity(name="CUSTOMER")
public class Customer implements Serializable {

    /** Primary key. */
    protected static final String PK = "customerId";

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
    private BigDecimal customerId;
    private String customerName;
    private String phone;
    @ManyToOne(optional=false)
    @JoinColumn(name="addressId", nullable=false)
    private Address address;
    @OneToMany(mappedBy="customer")
    private Set<CustomerReview> customerReview;
    @OneToMany(mappedBy="customer")
    private Set<Order> order;

    /** Default constructor. */
    public Customer() {
        super();
    }

    /**
     * Access method for customerId.
     *
     * @return the current value of customerId
     */
    public BigDecimal getCustomerId() {
        return customerId;
    }

    /**
     * Setter method for customerId.
     *
     * @param aCustomerId the new value for customerId
     */
    public void setCustomerId(BigDecimal aCustomerId) {
        customerId = aCustomerId;
    }

    /**
     * Access method for customerName.
     *
     * @return the current value of customerName
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Setter method for customerName.
     *
     * @param aCustomerName the new value for customerName
     */
    public void setCustomerName(String aCustomerName) {
        customerName = aCustomerName;
    }

    /**
     * Access method for phone.
     *
     * @return the current value of phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Setter method for phone.
     *
     * @param aPhone the new value for phone
     */
    public void setPhone(String aPhone) {
        phone = aPhone;
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
     * Access method for customerReview.
     *
     * @return the current value of customerReview
     */
    public Set<CustomerReview> getCustomerReview() {
        return customerReview;
    }

    /**
     * Setter method for customerReview.
     *
     * @param aCustomerReview the new value for customerReview
     */
    public void setCustomerReview(Set<CustomerReview> aCustomerReview) {
        customerReview = aCustomerReview;
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
     * Compares the key for this instance with another Customer.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Customer and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Customer)) {
            return false;
        }
        Customer that = (Customer) other;
        Object myCustomerId = this.getCustomerId();
        Object yourCustomerId = that.getCustomerId();
        if (myCustomerId==null ? yourCustomerId!=null : !myCustomerId.equals(yourCustomerId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Customer.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Customer)) return false;
        return this.equalKeys(other) && ((Customer)other).equalKeys(this);
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
        if (getCustomerId() == null) {
            i = 0;
        } else {
            i = getCustomerId().hashCode();
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
        StringBuffer sb = new StringBuffer("[Customer |");
        sb.append(" customerId=").append(getCustomerId());
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
        ret.put("customerId", getCustomerId());
        return ret;
    }

}
