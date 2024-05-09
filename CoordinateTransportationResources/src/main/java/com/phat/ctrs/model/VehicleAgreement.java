// Generated with g9.

package com.phat.ctrs.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Version;

@Entity(name = "VEHICLE_AGREEMENT")
public class VehicleAgreement implements Serializable {

    /** Primary key. */
    protected static final String PK = "vehicleAgreementId";

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
    private BigDecimal vehicleAgreementId;
    private String vehicleAgreementName;
    private LocalDateTime effectiveDate;
    private LocalDateTime agreementExpirationDate;
    @Column(length = 1)
    private boolean agreementExtended;
    private LocalDateTime extensionToDate;
    @Column(length = 1)
    private boolean agreementHasBeenLiquidated;
    private LocalDateTime agreementLiquidationDate;
    @Column(length = 1)
    private boolean agreementCanceled;
    @Column(precision = 10)
    private BigDecimal maximumNumberOfViolations;
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
    @OneToMany(mappedBy = "vehicleAgreement")
    @JsonIgnore
    private Set<AgreementViolateInfo> agreementViolateInfo;
    @OneToMany(mappedBy = "vehicleAgreement")
    @JsonIgnore
    private Set<FeeByBookingDay> feeByBookingDay;
    @OneToMany(mappedBy = "vehicleAgreement")
    @JsonIgnore
    private Set<ServicePrice> servicePrice;
    @OneToMany(mappedBy = "vehicleAgreement")
    @JsonIgnore
    private Set<TransportResource> transportResource;
    @ManyToOne
    @JoinColumn(name = "partnerId")
    private Partner partner;
    @ManyToOne
    @JoinColumn(name = "storeId")
    private Store store;
    @ManyToOne(optional = false)
    @JoinColumn(name = "vehicleRentalAgreementTypeId", nullable = false)
    private VehicleRentalAgreementType vehicleRentalAgreementType;

    /** Default constructor. */
    public VehicleAgreement() {
        super();
    }

    /**
     * Access method for vehicleAgreementId.
     *
     * @return the current value of vehicleAgreementId
     */
    public BigDecimal getVehicleAgreementId() {
        return vehicleAgreementId;
    }

    /**
     * Setter method for vehicleAgreementId.
     *
     * @param aVehicleAgreementId the new value for vehicleAgreementId
     */
    public void setVehicleAgreementId(BigDecimal aVehicleAgreementId) {
        vehicleAgreementId = aVehicleAgreementId;
    }

    /**
     * Access method for vehicleAgreementName.
     *
     * @return the current value of vehicleAgreementName
     */
    public String getVehicleAgreementName() {
        return vehicleAgreementName;
    }

    /**
     * Setter method for vehicleAgreementName.
     *
     * @param aVehicleAgreementName the new value for vehicleAgreementName
     */
    public void setVehicleAgreementName(String aVehicleAgreementName) {
        vehicleAgreementName = aVehicleAgreementName;
    }

    /**
     * Access method for effectiveDate.
     *
     * @return the current value of effectiveDate
     */
    public LocalDateTime getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Setter method for effectiveDate.
     *
     * @param aEffectiveDate the new value for effectiveDate
     */
    public void setEffectiveDate(LocalDateTime aEffectiveDate) {
        effectiveDate = aEffectiveDate;
    }

    /**
     * Access method for agreementExpirationDate.
     *
     * @return the current value of agreementExpirationDate
     */
    public LocalDateTime getAgreementExpirationDate() {
        return agreementExpirationDate;
    }

    /**
     * Setter method for agreementExpirationDate.
     *
     * @param aAgreementExpirationDate the new value for agreementExpirationDate
     */
    public void setAgreementExpirationDate(LocalDateTime aAgreementExpirationDate) {
        agreementExpirationDate = aAgreementExpirationDate;
    }

    /**
     * Access method for agreementExtended.
     *
     * @return true if and only if agreementExtended is currently true
     */
    public boolean getAgreementExtended() {
        return agreementExtended;
    }

    /**
     * Setter method for agreementExtended.
     *
     * @param aAgreementExtended the new value for agreementExtended
     */
    public void setAgreementExtended(boolean aAgreementExtended) {
        agreementExtended = aAgreementExtended;
    }

    /**
     * Access method for extensionToDate.
     *
     * @return the current value of extensionToDate
     */
    public LocalDateTime getExtensionToDate() {
        return extensionToDate;
    }

    /**
     * Setter method for extensionToDate.
     *
     * @param aExtensionToDate the new value for extensionToDate
     */
    public void setExtensionToDate(LocalDateTime aExtensionToDate) {
        extensionToDate = aExtensionToDate;
    }

    /**
     * Access method for agreementHasBeenLiquidated.
     *
     * @return true if and only if agreementHasBeenLiquidated is currently true
     */
    public boolean getAgreementHasBeenLiquidated() {
        return agreementHasBeenLiquidated;
    }

    /**
     * Setter method for agreementHasBeenLiquidated.
     *
     * @param aAgreementHasBeenLiquidated the new value for
     *                                    agreementHasBeenLiquidated
     */
    public void setAgreementHasBeenLiquidated(boolean aAgreementHasBeenLiquidated) {
        agreementHasBeenLiquidated = aAgreementHasBeenLiquidated;
    }

    /**
     * Access method for agreementLiquidationDate.
     *
     * @return the current value of agreementLiquidationDate
     */
    public LocalDateTime getAgreementLiquidationDate() {
        return agreementLiquidationDate;
    }

    /**
     * Setter method for agreementLiquidationDate.
     *
     * @param aAgreementLiquidationDate the new value for agreementLiquidationDate
     */
    public void setAgreementLiquidationDate(LocalDateTime aAgreementLiquidationDate) {
        agreementLiquidationDate = aAgreementLiquidationDate;
    }

    /**
     * Access method for agreementCanceled.
     *
     * @return true if and only if agreementCanceled is currently true
     */
    public boolean getAgreementCanceled() {
        return agreementCanceled;
    }

    /**
     * Setter method for agreementCanceled.
     *
     * @param aAgreementCanceled the new value for agreementCanceled
     */
    public void setAgreementCanceled(boolean aAgreementCanceled) {
        agreementCanceled = aAgreementCanceled;
    }

    /**
     * Access method for maximumNumberOfViolations.
     *
     * @return the current value of maximumNumberOfViolations
     */
    public BigDecimal getMaximumNumberOfViolations() {
        return maximumNumberOfViolations;
    }

    /**
     * Setter method for maximumNumberOfViolations.
     *
     * @param aMaximumNumberOfViolations the new value for maximumNumberOfViolations
     */
    public void setMaximumNumberOfViolations(BigDecimal aMaximumNumberOfViolations) {
        maximumNumberOfViolations = aMaximumNumberOfViolations;
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
     * Access method for agreementViolateInfo.
     *
     * @return the current value of agreementViolateInfo
     */
    public Set<AgreementViolateInfo> getAgreementViolateInfo() {
        return agreementViolateInfo;
    }

    /**
     * Setter method for agreementViolateInfo.
     *
     * @param aAgreementViolateInfo the new value for agreementViolateInfo
     */
    public void setAgreementViolateInfo(Set<AgreementViolateInfo> aAgreementViolateInfo) {
        agreementViolateInfo = aAgreementViolateInfo;
    }

    /**
     * Access method for feeByBookingDay.
     *
     * @return the current value of feeByBookingDay
     */
    public Set<FeeByBookingDay> getFeeByBookingDay() {
        return feeByBookingDay;
    }

    /**
     * Setter method for feeByBookingDay.
     *
     * @param aFeeByBookingDay the new value for feeByBookingDay
     */
    public void setFeeByBookingDay(Set<FeeByBookingDay> aFeeByBookingDay) {
        feeByBookingDay = aFeeByBookingDay;
    }

    /**
     * Access method for servicePrice.
     *
     * @return the current value of servicePrice
     */
    public Set<ServicePrice> getServicePrice() {
        return servicePrice;
    }

    /**
     * Setter method for servicePrice.
     *
     * @param aServicePrice the new value for servicePrice
     */
    public void setServicePrice(Set<ServicePrice> aServicePrice) {
        servicePrice = aServicePrice;
    }

    /**
     * Access method for transportResource.
     *
     * @return the current value of transportResource
     */
    public Set<TransportResource> getTransportResource() {
        return transportResource;
    }

    /**
     * Setter method for transportResource.
     *
     * @param aTransportResource the new value for transportResource
     */
    public void setTransportResource(Set<TransportResource> aTransportResource) {
        transportResource = aTransportResource;
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
     * Access method for store.
     *
     * @return the current value of store
     */
    public Store getStore() {
        return store;
    }

    /**
     * Setter method for store.
     *
     * @param aStore the new value for store
     */
    public void setStore(Store aStore) {
        store = aStore;
    }

    /**
     * Access method for vehicleRentalAgreementType.
     *
     * @return the current value of vehicleRentalAgreementType
     */
    public VehicleRentalAgreementType getVehicleRentalAgreementType() {
        return vehicleRentalAgreementType;
    }

    /**
     * Setter method for vehicleRentalAgreementType.
     *
     * @param aVehicleRentalAgreementType the new value for
     *                                    vehicleRentalAgreementType
     */
    public void setVehicleRentalAgreementType(VehicleRentalAgreementType aVehicleRentalAgreementType) {
        vehicleRentalAgreementType = aVehicleRentalAgreementType;
    }

    /**
     * Compares the key for this instance with another VehicleAgreement.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class VehicleAgreement and the
     *         key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VehicleAgreement)) {
            return false;
        }
        VehicleAgreement that = (VehicleAgreement) other;
        Object myVehicleAgreementId = this.getVehicleAgreementId();
        Object yourVehicleAgreementId = that.getVehicleAgreementId();
        if (myVehicleAgreementId == null ? yourVehicleAgreementId != null
                : !myVehicleAgreementId.equals(yourVehicleAgreementId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another VehicleAgreement.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof VehicleAgreement))
            return false;
        return this.equalKeys(other) && ((VehicleAgreement) other).equalKeys(this);
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
        if (getVehicleAgreementId() == null) {
            i = 0;
        } else {
            i = getVehicleAgreementId().hashCode();
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
        StringBuffer sb = new StringBuffer("[VehicleAgreement |");
        sb.append(" vehicleAgreementId=").append(getVehicleAgreementId());
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
        ret.put("vehicleAgreementId", getVehicleAgreementId());
        return ret;
    }

}
