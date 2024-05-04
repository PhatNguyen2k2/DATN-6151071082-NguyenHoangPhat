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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Version;

@Entity(name="RESOURCE_PRICE")
public class ResourcePrice implements Serializable {

    /** Primary key. */
    protected static final String PK = "resourcePriceId";

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
    private BigDecimal resourcePriceId;
    private String resourcePriceName;
    @Column(precision=5)
    private BigDecimal specificationsFrom;
    @Column(precision=5)
    private BigDecimal specificationsTo;
    @Column(precision=15)
    private BigDecimal cost;
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
    @ManyToOne
    @JoinColumn(name="mainGroupId")
    private Maingroup maingroup;
    @ManyToOne
    @JoinColumn(name="serviceTypeId")
    private Servicetype servicetype;
    @ManyToOne
    @JoinColumn(name="subGroupId")
    private Subgroup subgroup;

    /** Default constructor. */
    public ResourcePrice() {
        super();
    }

    /**
     * Access method for resourcePriceId.
     *
     * @return the current value of resourcePriceId
     */
    public BigDecimal getResourcePriceId() {
        return resourcePriceId;
    }

    /**
     * Setter method for resourcePriceId.
     *
     * @param aResourcePriceId the new value for resourcePriceId
     */
    public void setResourcePriceId(BigDecimal aResourcePriceId) {
        resourcePriceId = aResourcePriceId;
    }

    /**
     * Access method for resourcePriceName.
     *
     * @return the current value of resourcePriceName
     */
    public String getResourcePriceName() {
        return resourcePriceName;
    }

    /**
     * Setter method for resourcePriceName.
     *
     * @param aResourcePriceName the new value for resourcePriceName
     */
    public void setResourcePriceName(String aResourcePriceName) {
        resourcePriceName = aResourcePriceName;
    }

    /**
     * Access method for specificationsFrom.
     *
     * @return the current value of specificationsFrom
     */
    public BigDecimal getSpecificationsFrom() {
        return specificationsFrom;
    }

    /**
     * Setter method for specificationsFrom.
     *
     * @param aSpecificationsFrom the new value for specificationsFrom
     */
    public void setSpecificationsFrom(BigDecimal aSpecificationsFrom) {
        specificationsFrom = aSpecificationsFrom;
    }

    /**
     * Access method for specificationsTo.
     *
     * @return the current value of specificationsTo
     */
    public BigDecimal getSpecificationsTo() {
        return specificationsTo;
    }

    /**
     * Setter method for specificationsTo.
     *
     * @param aSpecificationsTo the new value for specificationsTo
     */
    public void setSpecificationsTo(BigDecimal aSpecificationsTo) {
        specificationsTo = aSpecificationsTo;
    }

    /**
     * Access method for cost.
     *
     * @return the current value of cost
     */
    public BigDecimal getCost() {
        return cost;
    }

    /**
     * Setter method for cost.
     *
     * @param aCost the new value for cost
     */
    public void setCost(BigDecimal aCost) {
        cost = aCost;
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
     * Access method for maingroup.
     *
     * @return the current value of maingroup
     */
    public Maingroup getMaingroup() {
        return maingroup;
    }

    /**
     * Setter method for maingroup.
     *
     * @param aMaingroup the new value for maingroup
     */
    public void setMaingroup(Maingroup aMaingroup) {
        maingroup = aMaingroup;
    }

    /**
     * Access method for servicetype.
     *
     * @return the current value of servicetype
     */
    public Servicetype getServicetype() {
        return servicetype;
    }

    /**
     * Setter method for servicetype.
     *
     * @param aServicetype the new value for servicetype
     */
    public void setServicetype(Servicetype aServicetype) {
        servicetype = aServicetype;
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
     * Compares the key for this instance with another ResourcePrice.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class ResourcePrice and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof ResourcePrice)) {
            return false;
        }
        ResourcePrice that = (ResourcePrice) other;
        Object myResourcePriceId = this.getResourcePriceId();
        Object yourResourcePriceId = that.getResourcePriceId();
        if (myResourcePriceId==null ? yourResourcePriceId!=null : !myResourcePriceId.equals(yourResourcePriceId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another ResourcePrice.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ResourcePrice)) return false;
        return this.equalKeys(other) && ((ResourcePrice)other).equalKeys(this);
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
        if (getResourcePriceId() == null) {
            i = 0;
        } else {
            i = getResourcePriceId().hashCode();
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
        StringBuffer sb = new StringBuffer("[ResourcePrice |");
        sb.append(" resourcePriceId=").append(getResourcePriceId());
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
        ret.put("resourcePriceId", getResourcePriceId());
        return ret;
    }

}
