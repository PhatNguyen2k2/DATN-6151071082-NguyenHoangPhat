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

@Entity(name="PRODUCT")
public class Product implements Serializable {

    /** Primary key. */
    protected static final String PK = "productId";

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
    private BigDecimal productId;
    private String productname;
    @Column(precision=10, scale=2)
    private BigDecimal productlength;
    @Column(precision=10, scale=2)
    private BigDecimal productwidth;
    @Column(precision=10, scale=2)
    private BigDecimal productheight;
    @Column(precision=10, scale=2)
    private BigDecimal productsize;
    @Column(precision=10, scale=2)
    private BigDecimal productweight;
    @Column(length=1)
    private boolean isfragile;
    @Column(precision=10, scale=2)
    private BigDecimal specification;
    @OneToMany(mappedBy="product")
    private Set<OrderProduct> orderProduct;
    @OneToMany(mappedBy="product")
    private Set<ProductServiceorder> productServiceorder;
    @ManyToOne(optional=false)
    @JoinColumn(name="subgroupid", nullable=false)
    private Subgroup subgroup;

    /** Default constructor. */
    public Product() {
        super();
    }

    /**
     * Access method for productId.
     *
     * @return the current value of productId
     */
    public BigDecimal getProductId() {
        return productId;
    }

    /**
     * Setter method for productId.
     *
     * @param aProductId the new value for productId
     */
    public void setProductId(BigDecimal aProductId) {
        productId = aProductId;
    }

    /**
     * Access method for productname.
     *
     * @return the current value of productname
     */
    public String getProductname() {
        return productname;
    }

    /**
     * Setter method for productname.
     *
     * @param aProductname the new value for productname
     */
    public void setProductname(String aProductname) {
        productname = aProductname;
    }

    /**
     * Access method for productlength.
     *
     * @return the current value of productlength
     */
    public BigDecimal getProductlength() {
        return productlength;
    }

    /**
     * Setter method for productlength.
     *
     * @param aProductlength the new value for productlength
     */
    public void setProductlength(BigDecimal aProductlength) {
        productlength = aProductlength;
    }

    /**
     * Access method for productwidth.
     *
     * @return the current value of productwidth
     */
    public BigDecimal getProductwidth() {
        return productwidth;
    }

    /**
     * Setter method for productwidth.
     *
     * @param aProductwidth the new value for productwidth
     */
    public void setProductwidth(BigDecimal aProductwidth) {
        productwidth = aProductwidth;
    }

    /**
     * Access method for productheight.
     *
     * @return the current value of productheight
     */
    public BigDecimal getProductheight() {
        return productheight;
    }

    /**
     * Setter method for productheight.
     *
     * @param aProductheight the new value for productheight
     */
    public void setProductheight(BigDecimal aProductheight) {
        productheight = aProductheight;
    }

    /**
     * Access method for productsize.
     *
     * @return the current value of productsize
     */
    public BigDecimal getProductsize() {
        return productsize;
    }

    /**
     * Setter method for productsize.
     *
     * @param aProductsize the new value for productsize
     */
    public void setProductsize(BigDecimal aProductsize) {
        productsize = aProductsize;
    }

    /**
     * Access method for productweight.
     *
     * @return the current value of productweight
     */
    public BigDecimal getProductweight() {
        return productweight;
    }

    /**
     * Setter method for productweight.
     *
     * @param aProductweight the new value for productweight
     */
    public void setProductweight(BigDecimal aProductweight) {
        productweight = aProductweight;
    }

    /**
     * Access method for isfragile.
     *
     * @return true if and only if isfragile is currently true
     */
    public boolean getIsfragile() {
        return isfragile;
    }

    /**
     * Setter method for isfragile.
     *
     * @param aIsfragile the new value for isfragile
     */
    public void setIsfragile(boolean aIsfragile) {
        isfragile = aIsfragile;
    }

    /**
     * Access method for specification.
     *
     * @return the current value of specification
     */
    public BigDecimal getSpecification() {
        return specification;
    }

    /**
     * Setter method for specification.
     *
     * @param aSpecification the new value for specification
     */
    public void setSpecification(BigDecimal aSpecification) {
        specification = aSpecification;
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
     * Access method for productServiceorder.
     *
     * @return the current value of productServiceorder
     */
    public Set<ProductServiceorder> getProductServiceorder() {
        return productServiceorder;
    }

    /**
     * Setter method for productServiceorder.
     *
     * @param aProductServiceorder the new value for productServiceorder
     */
    public void setProductServiceorder(Set<ProductServiceorder> aProductServiceorder) {
        productServiceorder = aProductServiceorder;
    }

    /**
     * Access method for subgroup.
     *
     * @return the current value of subgroup
     */
    public Subgroup getSubgroup() {
        return subgroup;
    }

    /**
     * Setter method for subgroup.
     *
     * @param aSubgroup the new value for subgroup
     */
    public void setSubgroup(Subgroup aSubgroup) {
        subgroup = aSubgroup;
    }

    /**
     * Compares the key for this instance with another Product.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Product and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Product)) {
            return false;
        }
        Product that = (Product) other;
        Object myProductId = this.getProductId();
        Object yourProductId = that.getProductId();
        if (myProductId==null ? yourProductId!=null : !myProductId.equals(yourProductId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Product.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Product)) return false;
        return this.equalKeys(other) && ((Product)other).equalKeys(this);
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
        if (getProductId() == null) {
            i = 0;
        } else {
            i = getProductId().hashCode();
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
        StringBuffer sb = new StringBuffer("[Product |");
        sb.append(" productId=").append(getProductId());
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
        ret.put("productId", getProductId());
        return ret;
    }

}
