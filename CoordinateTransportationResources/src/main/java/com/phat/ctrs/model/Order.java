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

@Entity(name="ORDERS")
public class Order implements Serializable {

    /** Primary key. */
    protected static final String PK = "orderId";

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
    private BigDecimal orderId;
    private String orderName;
    @Column(precision=10, scale=2)
    private BigDecimal weight;
    @Column(precision=10, scale=2)
    private BigDecimal length;
    @Column(precision=10, scale=2)
    private BigDecimal width;
    @Column(precision=10, scale=2)
    private BigDecimal height;
    private String note;
    private String senderFullname;
    private String senderPhonenumber;
    private String receiverFullname;
    private String receiverPhonenumber;
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
    @OneToMany(mappedBy="order")
    private Set<CustomerReview> customerReview;
    @ManyToOne(optional=false)
    @JoinColumn(name="addressDescriptionId", nullable=false)
    private AddressDescription addressDescription;
    @ManyToOne(optional=false)
    @JoinColumn(name="customerId", nullable=false)
    private Customer customer;
    @OneToMany(mappedBy="order")
    private Set<OrderProduct> orderProduct;
    @ManyToOne(optional=false)
    @JoinColumn(name="receiverAddress", nullable=false)
    private Address address2;
    @ManyToOne(optional=false)
    @JoinColumn(name="senderAddress", nullable=false)
    private Address address;
    @ManyToOne(optional=false)
    @JoinColumn(name="serviceOrderId", nullable=false)
    private Serviceorder serviceorder;
    @OneToMany(mappedBy="order")
    private Set<SpecialRequest> specialRequest;

    /** Default constructor. */
    public Order() {
        super();
    }

    /**
     * Access method for orderId.
     *
     * @return the current value of orderId
     */
    public BigDecimal getOrderId() {
        return orderId;
    }

    /**
     * Setter method for orderId.
     *
     * @param aOrderId the new value for orderId
     */
    public void setOrderId(BigDecimal aOrderId) {
        orderId = aOrderId;
    }

    /**
     * Access method for orderName.
     *
     * @return the current value of orderName
     */
    public String getOrderName() {
        return orderName;
    }

    /**
     * Setter method for orderName.
     *
     * @param aOrderName the new value for orderName
     */
    public void setOrderName(String aOrderName) {
        orderName = aOrderName;
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
     * Access method for note.
     *
     * @return the current value of note
     */
    public String getNote() {
        return note;
    }

    /**
     * Setter method for note.
     *
     * @param aNote the new value for note
     */
    public void setNote(String aNote) {
        note = aNote;
    }

    /**
     * Access method for senderFullname.
     *
     * @return the current value of senderFullname
     */
    public String getSenderFullname() {
        return senderFullname;
    }

    /**
     * Setter method for senderFullname.
     *
     * @param aSenderFullname the new value for senderFullname
     */
    public void setSenderFullname(String aSenderFullname) {
        senderFullname = aSenderFullname;
    }

    /**
     * Access method for senderPhonenumber.
     *
     * @return the current value of senderPhonenumber
     */
    public String getSenderPhonenumber() {
        return senderPhonenumber;
    }

    /**
     * Setter method for senderPhonenumber.
     *
     * @param aSenderPhonenumber the new value for senderPhonenumber
     */
    public void setSenderPhonenumber(String aSenderPhonenumber) {
        senderPhonenumber = aSenderPhonenumber;
    }

    /**
     * Access method for receiverFullname.
     *
     * @return the current value of receiverFullname
     */
    public String getReceiverFullname() {
        return receiverFullname;
    }

    /**
     * Setter method for receiverFullname.
     *
     * @param aReceiverFullname the new value for receiverFullname
     */
    public void setReceiverFullname(String aReceiverFullname) {
        receiverFullname = aReceiverFullname;
    }

    /**
     * Access method for receiverPhonenumber.
     *
     * @return the current value of receiverPhonenumber
     */
    public String getReceiverPhonenumber() {
        return receiverPhonenumber;
    }

    /**
     * Setter method for receiverPhonenumber.
     *
     * @param aReceiverPhonenumber the new value for receiverPhonenumber
     */
    public void setReceiverPhonenumber(String aReceiverPhonenumber) {
        receiverPhonenumber = aReceiverPhonenumber;
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
     * Access method for addressDescription.
     *
     * @return the current value of addressDescription
     */
    public AddressDescription getAddressDescription() {
        return addressDescription;
    }

    /**
     * Setter method for addressDescription.
     *
     * @param aAddressDescription the new value for addressDescription
     */
    public void setAddressDescription(AddressDescription aAddressDescription) {
        addressDescription = aAddressDescription;
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
     * Access method for orderProduct.
     *
     * @return the current value of orderProduct
     */
    public Set<OrderProduct> getOrderProduct() {
        return orderProduct;
    }

    /**
     * Setter method for orderProduct.
     *
     * @param aOrderProduct the new value for orderProduct
     */
    public void setOrderProduct(Set<OrderProduct> aOrderProduct) {
        orderProduct = aOrderProduct;
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
     * Access method for serviceorder.
     *
     * @return the current value of serviceorder
     */
    public Serviceorder getServiceorder() {
        return serviceorder;
    }

    /**
     * Setter method for serviceorder.
     *
     * @param aServiceorder the new value for serviceorder
     */
    public void setServiceorder(Serviceorder aServiceorder) {
        serviceorder = aServiceorder;
    }

    /**
     * Access method for specialRequest.
     *
     * @return the current value of specialRequest
     */
    public Set<SpecialRequest> getSpecialRequest() {
        return specialRequest;
    }

    /**
     * Setter method for specialRequest.
     *
     * @param aSpecialRequest the new value for specialRequest
     */
    public void setSpecialRequest(Set<SpecialRequest> aSpecialRequest) {
        specialRequest = aSpecialRequest;
    }

    /**
     * Compares the key for this instance with another Order.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Order and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Order)) {
            return false;
        }
        Order that = (Order) other;
        Object myOrderId = this.getOrderId();
        Object yourOrderId = that.getOrderId();
        if (myOrderId==null ? yourOrderId!=null : !myOrderId.equals(yourOrderId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Order.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Order)) return false;
        return this.equalKeys(other) && ((Order)other).equalKeys(this);
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
        if (getOrderId() == null) {
            i = 0;
        } else {
            i = getOrderId().hashCode();
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
        StringBuffer sb = new StringBuffer("[Order |");
        sb.append(" orderId=").append(getOrderId());
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
        ret.put("orderId", getOrderId());
        return ret;
    }

}
