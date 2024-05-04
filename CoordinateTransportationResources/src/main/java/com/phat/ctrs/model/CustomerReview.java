// Generated with g9.

package com.phat.ctrs.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Version;

@Entity(name="CUSTOMER_REVIEW")
public class CustomerReview implements Serializable {

    /** Primary key. */
    protected static final String PK = "customerReviewId";

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
    private BigDecimal customerReviewId;
    @Column(precision=10)
    private BigDecimal point;
    private String comment;
    @ManyToOne(optional=false)
    @JoinColumn(name="customerId", nullable=false)
    private Customer customer;
    @ManyToOne(optional=false)
    @JoinColumn(name="orderId", nullable=false)
    private Order order;

    /** Default constructor. */
    public CustomerReview() {
        super();
    }

    /**
     * Access method for customerReviewId.
     *
     * @return the current value of customerReviewId
     */
    public BigDecimal getCustomerReviewId() {
        return customerReviewId;
    }

    /**
     * Setter method for customerReviewId.
     *
     * @param aCustomerReviewId the new value for customerReviewId
     */
    public void setCustomerReviewId(BigDecimal aCustomerReviewId) {
        customerReviewId = aCustomerReviewId;
    }

    /**
     * Access method for point.
     *
     * @return the current value of point
     */
    public BigDecimal getPoint() {
        return point;
    }

    /**
     * Setter method for point.
     *
     * @param aPoint the new value for point
     */
    public void setPoint(BigDecimal aPoint) {
        point = aPoint;
    }

    /**
     * Access method for comment.
     *
     * @return the current value of comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * Setter method for comment.
     *
     * @param aComment the new value for comment
     */
    public void setComment(String aComment) {
        comment = aComment;
    }

    /**
     * Access method for customer.
     *
     * @return the current value of customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Setter method for customer.
     *
     * @param aCustomer the new value for customer
     */
    public void setCustomer(Customer aCustomer) {
        customer = aCustomer;
    }

    /**
     * Access method for order.
     *
     * @return the current value of order
     */
    public Order getOrder() {
        return order;
    }

    /**
     * Setter method for order.
     *
     * @param aOrder the new value for order
     */
    public void setOrder(Order aOrder) {
        order = aOrder;
    }

    /**
     * Compares the key for this instance with another CustomerReview.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class CustomerReview and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof CustomerReview)) {
            return false;
        }
        CustomerReview that = (CustomerReview) other;
        Object myCustomerReviewId = this.getCustomerReviewId();
        Object yourCustomerReviewId = that.getCustomerReviewId();
        if (myCustomerReviewId==null ? yourCustomerReviewId!=null : !myCustomerReviewId.equals(yourCustomerReviewId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another CustomerReview.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof CustomerReview)) return false;
        return this.equalKeys(other) && ((CustomerReview)other).equalKeys(this);
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
        if (getCustomerReviewId() == null) {
            i = 0;
        } else {
            i = getCustomerReviewId().hashCode();
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
        StringBuffer sb = new StringBuffer("[CustomerReview |");
        sb.append(" customerReviewId=").append(getCustomerReviewId());
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
        ret.put("customerReviewId", getCustomerReviewId());
        return ret;
    }

}
