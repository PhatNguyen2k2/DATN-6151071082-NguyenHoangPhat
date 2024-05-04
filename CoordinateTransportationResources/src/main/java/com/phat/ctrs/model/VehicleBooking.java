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

@Entity(name="VEHICLE_BOOKING")
public class VehicleBooking implements Serializable {

    /** Primary key. */
    protected static final String PK = "vehicleBookingId";

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
    private BigDecimal vehicleBookingId;
    @Column(precision=10)
    private BigDecimal vehicleId;
    @Column(precision=10)
    private BigDecimal vehicleTypeId;
    private LocalDateTime createTime;
    private LocalDateTime respondTime;
    @Column(precision=10, scale=2)
    private BigDecimal fee;
    private String status;
    private String rentalForm;
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
    @JoinColumn(name="partnerId")
    private Partner partner;
    @OneToMany(mappedBy="vehicleBooking")
    private Set<VehicleBookingRoute> vehicleBookingRoute;

    /** Default constructor. */
    public VehicleBooking() {
        super();
    }

    /**
     * Access method for vehicleBookingId.
     *
     * @return the current value of vehicleBookingId
     */
    public BigDecimal getVehicleBookingId() {
        return vehicleBookingId;
    }

    /**
     * Setter method for vehicleBookingId.
     *
     * @param aVehicleBookingId the new value for vehicleBookingId
     */
    public void setVehicleBookingId(BigDecimal aVehicleBookingId) {
        vehicleBookingId = aVehicleBookingId;
    }

    /**
     * Access method for vehicleId.
     *
     * @return the current value of vehicleId
     */
    public BigDecimal getVehicleId() {
        return vehicleId;
    }

    /**
     * Setter method for vehicleId.
     *
     * @param aVehicleId the new value for vehicleId
     */
    public void setVehicleId(BigDecimal aVehicleId) {
        vehicleId = aVehicleId;
    }

    /**
     * Access method for vehicleTypeId.
     *
     * @return the current value of vehicleTypeId
     */
    public BigDecimal getVehicleTypeId() {
        return vehicleTypeId;
    }

    /**
     * Setter method for vehicleTypeId.
     *
     * @param aVehicleTypeId the new value for vehicleTypeId
     */
    public void setVehicleTypeId(BigDecimal aVehicleTypeId) {
        vehicleTypeId = aVehicleTypeId;
    }

    /**
     * Access method for createTime.
     *
     * @return the current value of createTime
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * Setter method for createTime.
     *
     * @param aCreateTime the new value for createTime
     */
    public void setCreateTime(LocalDateTime aCreateTime) {
        createTime = aCreateTime;
    }

    /**
     * Access method for respondTime.
     *
     * @return the current value of respondTime
     */
    public LocalDateTime getRespondTime() {
        return respondTime;
    }

    /**
     * Setter method for respondTime.
     *
     * @param aRespondTime the new value for respondTime
     */
    public void setRespondTime(LocalDateTime aRespondTime) {
        respondTime = aRespondTime;
    }

    /**
     * Access method for fee.
     *
     * @return the current value of fee
     */
    public BigDecimal getFee() {
        return fee;
    }

    /**
     * Setter method for fee.
     *
     * @param aFee the new value for fee
     */
    public void setFee(BigDecimal aFee) {
        fee = aFee;
    }

    /**
     * Access method for status.
     *
     * @return the current value of status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Setter method for status.
     *
     * @param aStatus the new value for status
     */
    public void setStatus(String aStatus) {
        status = aStatus;
    }

    /**
     * Access method for rentalForm.
     *
     * @return the current value of rentalForm
     */
    public String getRentalForm() {
        return rentalForm;
    }

    /**
     * Setter method for rentalForm.
     *
     * @param aRentalForm the new value for rentalForm
     */
    public void setRentalForm(String aRentalForm) {
        rentalForm = aRentalForm;
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
     * Access method for partner.
     *
     * @return the current value of partner
     */
    public Partner getPartner() {
        return partner;
    }

    /**
     * Setter method for partner.
     *
     * @param aPartner the new value for partner
     */
    public void setPartner(Partner aPartner) {
        partner = aPartner;
    }

    /**
     * Access method for vehicleBookingRoute.
     *
     * @return the current value of vehicleBookingRoute
     */
    public Set<VehicleBookingRoute> getVehicleBookingRoute() {
        return vehicleBookingRoute;
    }

    /**
     * Setter method for vehicleBookingRoute.
     *
     * @param aVehicleBookingRoute the new value for vehicleBookingRoute
     */
    public void setVehicleBookingRoute(Set<VehicleBookingRoute> aVehicleBookingRoute) {
        vehicleBookingRoute = aVehicleBookingRoute;
    }

    /**
     * Compares the key for this instance with another VehicleBooking.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class VehicleBooking and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof VehicleBooking)) {
            return false;
        }
        VehicleBooking that = (VehicleBooking) other;
        Object myVehicleBookingId = this.getVehicleBookingId();
        Object yourVehicleBookingId = that.getVehicleBookingId();
        if (myVehicleBookingId==null ? yourVehicleBookingId!=null : !myVehicleBookingId.equals(yourVehicleBookingId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another VehicleBooking.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof VehicleBooking)) return false;
        return this.equalKeys(other) && ((VehicleBooking)other).equalKeys(this);
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
        if (getVehicleBookingId() == null) {
            i = 0;
        } else {
            i = getVehicleBookingId().hashCode();
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
        StringBuffer sb = new StringBuffer("[VehicleBooking |");
        sb.append(" vehicleBookingId=").append(getVehicleBookingId());
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
        ret.put("vehicleBookingId", getVehicleBookingId());
        return ret;
    }

}
