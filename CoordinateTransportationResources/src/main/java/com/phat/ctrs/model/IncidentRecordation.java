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

@Entity(name="INCIDENT_RECORDATION")
@IdClass(IncidentRecordation.IncidentRecordationId.class)
public class IncidentRecordation implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class IncidentRecordationId implements Serializable {
        Incident incident;
        ImplementTransportation implementTransportation;
    }

    /** Primary key. */
    protected static final String PK = "IncidentRecordationIncidentRecordationPkey";

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

    private String description;
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
    @JoinColumn(name="implementTranportationId", nullable=false)
    private ImplementTransportation implementTransportation;
    @ManyToOne(optional=false)
    @Id
    @JoinColumn(name="incidentId", nullable=false)
    private Incident incident;

    /** Default constructor. */
    public IncidentRecordation() {
        super();
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
     * Access method for implementTransportation.
     *
     * @return the current value of implementTransportation
     */
    public ImplementTransportation getImplementTransportation() {
        return implementTransportation;
    }

    /**
     * Setter method for implementTransportation.
     *
     * @param aImplementTransportation the new value for implementTransportation
     */
    public void setImplementTransportation(ImplementTransportation aImplementTransportation) {
        implementTransportation = aImplementTransportation;
    }

    /**
     * Access method for incident.
     *
     * @return the current value of incident
     */
    public Incident getIncident() {
        return incident;
    }

    /**
     * Setter method for incident.
     *
     * @param aIncident the new value for incident
     */
    public void setIncident(Incident aIncident) {
        incident = aIncident;
    }

    /** Temporary value holder for group key fragment incidentIncidentId */
    private transient BigDecimal tempIncidentIncidentId;

    /**
     * Gets the key fragment incidentId for member incident.
     * If this.incident is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setIncidentIncidentId.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see Incident
     */
    public BigDecimal getIncidentIncidentId() {
        return (getIncident() == null ? tempIncidentIncidentId : getIncident().getIncidentId());
    }

    /**
     * Sets the key fragment incidentId from member incident.
     * If this.incident is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getIncidentIncidentId.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aIncidentId New value for the key fragment
     * @see Incident
     */
    public void setIncidentIncidentId(BigDecimal aIncidentId) {
        if (getIncident() == null) {
            tempIncidentIncidentId = aIncidentId;
        } else {
            getIncident().setIncidentId(aIncidentId);
        }
    }

    /** Temporary value holder for group key fragment implementTransportationImplementTransportationId */
    private transient BigDecimal tempImplementTransportationImplementTransportationId;

    /**
     * Gets the key fragment implementTransportationId for member implementTransportation.
     * If this.implementTransportation is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setImplementTransportationImplementTransportationId.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see ImplementTransportation
     */
    public BigDecimal getImplementTransportationImplementTransportationId() {
        return (getImplementTransportation() == null ? tempImplementTransportationImplementTransportationId : getImplementTransportation().getImplementTransportationId());
    }

    /**
     * Sets the key fragment implementTransportationId from member implementTransportation.
     * If this.implementTransportation is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getImplementTransportationImplementTransportationId.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aImplementTransportationId New value for the key fragment
     * @see ImplementTransportation
     */
    public void setImplementTransportationImplementTransportationId(BigDecimal aImplementTransportationId) {
        if (getImplementTransportation() == null) {
            tempImplementTransportationImplementTransportationId = aImplementTransportationId;
        } else {
            getImplementTransportation().setImplementTransportationId(aImplementTransportationId);
        }
    }

    /**
     * Compares the key for this instance with another IncidentRecordation.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class IncidentRecordation and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof IncidentRecordation)) {
            return false;
        }
        IncidentRecordation that = (IncidentRecordation) other;
        Object myIncidentIncidentId = this.getIncidentIncidentId();
        Object yourIncidentIncidentId = that.getIncidentIncidentId();
        if (myIncidentIncidentId==null ? yourIncidentIncidentId!=null : !myIncidentIncidentId.equals(yourIncidentIncidentId)) {
            return false;
        }
        Object myImplementTransportationImplementTransportationId = this.getImplementTransportationImplementTransportationId();
        Object yourImplementTransportationImplementTransportationId = that.getImplementTransportationImplementTransportationId();
        if (myImplementTransportationImplementTransportationId==null ? yourImplementTransportationImplementTransportationId!=null : !myImplementTransportationImplementTransportationId.equals(yourImplementTransportationImplementTransportationId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another IncidentRecordation.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof IncidentRecordation)) return false;
        return this.equalKeys(other) && ((IncidentRecordation)other).equalKeys(this);
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
        if (getIncidentIncidentId() == null) {
            i = 0;
        } else {
            i = getIncidentIncidentId().hashCode();
        }
        result = 37*result + i;
        if (getImplementTransportationImplementTransportationId() == null) {
            i = 0;
        } else {
            i = getImplementTransportationImplementTransportationId().hashCode();
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
        StringBuffer sb = new StringBuffer("[IncidentRecordation |");
        sb.append(" incidentIncidentId=").append(getIncidentIncidentId());
        sb.append(" implementTransportationImplementTransportationId=").append(getImplementTransportationImplementTransportationId());
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
        ret.put("incidentIncidentId", getIncidentIncidentId());
        ret.put("implementTransportationImplementTransportationId", getImplementTransportationImplementTransportationId());
        return ret;
    }

}
