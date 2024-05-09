// Generated with g9.

package com.phat.ctrs.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Version;

@Entity(name = "VEHICLE_LOAD_TYPE")
@JsonIgnoreProperties(ignoreUnknown = true)
public class VehicleLoadType implements Serializable {

    /** Primary key. */
    protected static final String PK = "loadVehicleTypeId";

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
    private BigDecimal loadVehicleTypeId;
    @ManyToOne
    @JoinColumn(name = "shiftId")
    private Shift shift;
    private String vehicleLoad;
    private String usedVehicleLoad;
    private String residualVehicleLoad;
    private LocalDateTime day;
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
    @ManyToOne()
    @JoinColumn(name = "partnerId")
    private Partner partner;
    @ManyToOne
    @JoinColumn(name = "storeId")
    private Store store;
    @ManyToOne(optional = false)
    @JoinColumn(name = "vehicleTypeID", nullable = false)
    private Vehicletype vehicletype;

    /** Default constructor. */
    public VehicleLoadType() {
        super();
    }

    /**
     * Access method for loadVehicleTypeId.
     *
     * @return the current value of loadVehicleTypeId
     */
    public BigDecimal getLoadVehicleTypeId() {
        return loadVehicleTypeId;
    }

    /**
     * Setter method for loadVehicleTypeId.
     *
     * @param aLoadVehicleTypeId the new value for loadVehicleTypeId
     */
    public void setLoadVehicleTypeId(BigDecimal aLoadVehicleTypeId) {
        loadVehicleTypeId = aLoadVehicleTypeId;
    }

    /**
     * Access method for workingShift.
     *
     * @return the current value of workingShift
     */

    /**
     * Access method for vehicleLoad.
     *
     * @return the current value of vehicleLoad
     */
    public String getVehicleLoad() {
        return vehicleLoad;
    }

    /**
     * Setter method for vehicleLoad.
     *
     * @param aVehicleLoad the new value for vehicleLoad
     */
    public void setVehicleLoad(String aVehicleLoad) {
        vehicleLoad = aVehicleLoad;
    }

    /**
     * Access method for usedVehicleLoad.
     *
     * @return the current value of usedVehicleLoad
     */
    public String getUsedVehicleLoad() {
        return usedVehicleLoad;
    }

    /**
     * Setter method for usedVehicleLoad.
     *
     * @param aUsedVehicleLoad the new value for usedVehicleLoad
     */
    public void setUsedVehicleLoad(String aUsedVehicleLoad) {
        usedVehicleLoad = aUsedVehicleLoad;
    }

    /**
     * Access method for residualVehicleLoad.
     *
     * @return the current value of residualVehicleLoad
     */
    public String getResidualVehicleLoad() {
        return residualVehicleLoad;
    }

    /**
     * Setter method for residualVehicleLoad.
     *
     * @param aResidualVehicleLoad the new value for residualVehicleLoad
     */
    public void setResidualVehicleLoad(String aResidualVehicleLoad) {
        residualVehicleLoad = aResidualVehicleLoad;
    }

    /**
     * Access method for day.
     *
     * @return the current value of day
     */
    public LocalDateTime getDay() {
        return day;
    }

    /**
     * Setter method for day.
     *
     * @param aDay the new value for day
     */
    public void setDay(LocalDateTime aDay) {
        day = aDay;
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
     * Access method for vehicletype.
     *
     * @return the current value of vehicletype
     */
    public Vehicletype getVehicletype() {
        return vehicletype;
    }

    /**
     * Setter method for vehicletype.
     *
     * @param aVehicletype the new value for vehicletype
     */
    public void setVehicletype(Vehicletype aVehicletype) {
        vehicletype = aVehicletype;
    }

    /**
     * Compares the key for this instance with another VehicleLoadType.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class VehicleLoadType and the key
     *         objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VehicleLoadType)) {
            return false;
        }
        VehicleLoadType that = (VehicleLoadType) other;
        Object myLoadVehicleTypeId = this.getLoadVehicleTypeId();
        Object yourLoadVehicleTypeId = that.getLoadVehicleTypeId();
        if (myLoadVehicleTypeId == null ? yourLoadVehicleTypeId != null
                : !myLoadVehicleTypeId.equals(yourLoadVehicleTypeId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another VehicleLoadType.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof VehicleLoadType))
            return false;
        return this.equalKeys(other) && ((VehicleLoadType) other).equalKeys(this);
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
        if (getLoadVehicleTypeId() == null) {
            i = 0;
        } else {
            i = getLoadVehicleTypeId().hashCode();
        }
        result = 37 * result + i;
        return result;
    }

    @Override
    public String toString() {
        return "VehicleLoadType [partner=" + partner + ", store=" + store + "]";
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("loadVehicleTypeId", getLoadVehicleTypeId());
        return ret;
    }

    public static String getPk() {
        return PK;
    }

    public Shift getShift() {
        return shift;
    }

    public void setShift(Shift shift) {
        this.shift = shift;
    }

    public void setLast(boolean isLast) {
        this.isLast = isLast;
    }

}
