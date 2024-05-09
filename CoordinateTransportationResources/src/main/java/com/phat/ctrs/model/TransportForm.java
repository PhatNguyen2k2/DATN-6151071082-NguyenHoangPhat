// Generated with g9.

package com.phat.ctrs.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Version;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name = "TRANSPORT_FORM")
public class TransportForm implements Serializable {

    /** Primary key. */
    protected static final String PK = "transportFormId";

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
    private BigDecimal transportFormId;
    private String transportFormName;
    private String description;
    @Column(precision = 10)
    private BigDecimal createdUser;
    private LocalDateTime createdDate;
    @Column(precision = 10)
    private BigDecimal updatedUser;
    private LocalDateTime updatedDate;
    @Column(precision = 10)
    private BigDecimal deletedUser;
    private LocalDateTime deletedDate;
    private String updateNote;
    @Column(length = 1)
    private boolean isLast;
    @OneToMany(mappedBy = "transportForm")
    @JsonIgnore
    private Set<FeeByTransportForm> feeByTransportForm;
    @OneToMany(mappedBy = "transportForm")
    @JsonIgnore
    private Set<Route> route;
    @OneToMany(mappedBy = "transportForm")
    @JsonIgnore
    private Set<Serviceorder> serviceorder;

    /** Default constructor. */
    public TransportForm() {
        super();
    }

    /**
     * Access method for transportFormId.
     *
     * @return the current value of transportFormId
     */
    public BigDecimal getTransportFormId() {
        return transportFormId;
    }

    /**
     * Setter method for transportFormId.
     *
     * @param aTransportFormId the new value for transportFormId
     */
    public void setTransportFormId(BigDecimal aTransportFormId) {
        transportFormId = aTransportFormId;
    }

    /**
     * Access method for transportFormName.
     *
     * @return the current value of transportFormName
     */
    public String getTransportFormName() {
        return transportFormName;
    }

    /**
     * Setter method for transportFormName.
     *
     * @param aTransportFormName the new value for transportFormName
     */
    public void setTransportFormName(String aTransportFormName) {
        transportFormName = aTransportFormName;
    }

    /**
     * Access method for description.
     *
     * @return the current value of description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter method for description.
     *
     * @param aDescription the new value for description
     */
    public void setDescription(String aDescription) {
        description = aDescription;
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
     * Access method for feeByTransportForm.
     *
     * @return the current value of feeByTransportForm
     */
    public Set<FeeByTransportForm> getFeeByTransportForm() {
        return feeByTransportForm;
    }

    /**
     * Setter method for feeByTransportForm.
     *
     * @param aFeeByTransportForm the new value for feeByTransportForm
     */
    public void setFeeByTransportForm(Set<FeeByTransportForm> aFeeByTransportForm) {
        feeByTransportForm = aFeeByTransportForm;
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
     * Compares the key for this instance with another TransportForm.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class TransportForm and the key
     *         objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransportForm)) {
            return false;
        }
        TransportForm that = (TransportForm) other;
        Object myTransportFormId = this.getTransportFormId();
        Object yourTransportFormId = that.getTransportFormId();
        if (myTransportFormId == null ? yourTransportFormId != null : !myTransportFormId.equals(yourTransportFormId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another TransportForm.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof TransportForm))
            return false;
        return this.equalKeys(other) && ((TransportForm) other).equalKeys(this);
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
        if (getTransportFormId() == null) {
            i = 0;
        } else {
            i = getTransportFormId().hashCode();
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
        StringBuffer sb = new StringBuffer("[TransportForm |");
        sb.append(" transportFormId=").append(getTransportFormId());
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
    // ret.put("transportFormId", getTransportFormId());
    // return ret;
    // }

}
