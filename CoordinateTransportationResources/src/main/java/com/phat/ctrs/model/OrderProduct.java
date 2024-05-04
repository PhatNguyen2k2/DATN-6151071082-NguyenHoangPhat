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

@Entity(name="ORDER_PRODUCT")
@IdClass(OrderProduct.OrderProductId.class)
public class OrderProduct implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class OrderProductId implements Serializable {
        Order order;
        Product product;
    }

    /** Primary key. */
    protected static final String PK = "OrderProductOrderProductPkey";

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
    private BigDecimal quantity;
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
    @JoinColumn(name="orderId", nullable=false)
    private Order order;
    @ManyToOne(optional=false)
    @Id
    @JoinColumn(name="productId", nullable=false)
    private Product product;

    /** Default constructor. */
    public OrderProduct() {
        super();
    }

    /**
     * Access method for quantity.
     *
     * @return the current value of quantity
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    /**
     * Setter method for quantity.
     *
     * @param aQuantity the new value for quantity
     */
    public void setQuantity(BigDecimal aQuantity) {
        quantity = aQuantity;
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
     * Access method for product.
     *
     * @return the current value of product
     */
    public Product getProduct() {
        return product;
    }

    /**
     * Setter method for product.
     *
     * @param aProduct the new value for product
     */
    public void setProduct(Product aProduct) {
        product = aProduct;
    }

    /** Temporary value holder for group key fragment orderOrderId */
    private transient BigDecimal tempOrderOrderId;

    /**
     * Gets the key fragment orderId for member order.
     * If this.order is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setOrderOrderId.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see Order
     */
    public BigDecimal getOrderOrderId() {
        return (getOrder() == null ? tempOrderOrderId : getOrder().getOrderId());
    }

    /**
     * Sets the key fragment orderId from member order.
     * If this.order is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getOrderOrderId.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aOrderId New value for the key fragment
     * @see Order
     */
    public void setOrderOrderId(BigDecimal aOrderId) {
        if (getOrder() == null) {
            tempOrderOrderId = aOrderId;
        } else {
            getOrder().setOrderId(aOrderId);
        }
    }

    /** Temporary value holder for group key fragment productProductId */
    private transient BigDecimal tempProductProductId;

    /**
     * Gets the key fragment productId for member product.
     * If this.product is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setProductProductId.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see Product
     */
    public BigDecimal getProductProductId() {
        return (getProduct() == null ? tempProductProductId : getProduct().getProductId());
    }

    /**
     * Sets the key fragment productId from member product.
     * If this.product is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getProductProductId.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aProductId New value for the key fragment
     * @see Product
     */
    public void setProductProductId(BigDecimal aProductId) {
        if (getProduct() == null) {
            tempProductProductId = aProductId;
        } else {
            getProduct().setProductId(aProductId);
        }
    }

    /**
     * Compares the key for this instance with another OrderProduct.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class OrderProduct and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof OrderProduct)) {
            return false;
        }
        OrderProduct that = (OrderProduct) other;
        Object myOrderOrderId = this.getOrderOrderId();
        Object yourOrderOrderId = that.getOrderOrderId();
        if (myOrderOrderId==null ? yourOrderOrderId!=null : !myOrderOrderId.equals(yourOrderOrderId)) {
            return false;
        }
        Object myProductProductId = this.getProductProductId();
        Object yourProductProductId = that.getProductProductId();
        if (myProductProductId==null ? yourProductProductId!=null : !myProductProductId.equals(yourProductProductId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another OrderProduct.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof OrderProduct)) return false;
        return this.equalKeys(other) && ((OrderProduct)other).equalKeys(this);
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
        if (getOrderOrderId() == null) {
            i = 0;
        } else {
            i = getOrderOrderId().hashCode();
        }
        result = 37*result + i;
        if (getProductProductId() == null) {
            i = 0;
        } else {
            i = getProductProductId().hashCode();
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
        StringBuffer sb = new StringBuffer("[OrderProduct |");
        sb.append(" orderOrderId=").append(getOrderOrderId());
        sb.append(" productProductId=").append(getProductProductId());
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
        ret.put("orderOrderId", getOrderOrderId());
        ret.put("productProductId", getProductProductId());
        return ret;
    }

}
