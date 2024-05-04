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
import jakarta.persistence.OneToMany;
import jakarta.persistence.Version;

@Entity(name="INCIDENTTYPE")
public class Incidenttype implements Serializable {

    /** Primary key. */
    protected static final String PK = "incidentTypeId";

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
    private BigDecimal incidentTypeId;
    private String incidentTypeName;
    @OneToMany(mappedBy="incidenttype")
    private Set<Incident> incident;

    /** Default constructor. */
    public Incidenttype() {
        super();
    }

    /**
     * Access method for incidentTypeId.
     *
     * @return the current value of incidentTypeId
     */
    public BigDecimal getIncidentTypeId() {
        return incidentTypeId;
    }

    /**
     * Setter method for incidentTypeId.
     *
     * @param aIncidentTypeId the new value for incidentTypeId
     */
    public void setIncidentTypeId(BigDecimal aIncidentTypeId) {
        incidentTypeId = aIncidentTypeId;
    }

    /**
     * Access method for incidentTypeName.
     *
     * @return the current value of incidentTypeName
     */
    public String getIncidentTypeName() {
        return incidentTypeName;
    }

    /**
     * Setter method for incidentTypeName.
     *
     * @param aIncidentTypeName the new value for incidentTypeName
     */
    public void setIncidentTypeName(String aIncidentTypeName) {
        incidentTypeName = aIncidentTypeName;
    }

    /**
     * Access method for incident.
     *
     * @return the current value of incident
     */
    public Set<Incident> getIncident() {
        return incident;
    }

    /**
     * Setter method for incident.
     *
     * @param aIncident the new value for incident
     */
    public void setIncident(Set<Incident> aIncident) {
        incident = aIncident;
    }

    /**
     * Compares the key for this instance with another Incidenttype.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Incidenttype and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Incidenttype)) {
            return false;
        }
        Incidenttype that = (Incidenttype) other;
        Object myIncidentTypeId = this.getIncidentTypeId();
        Object yourIncidentTypeId = that.getIncidentTypeId();
        if (myIncidentTypeId==null ? yourIncidentTypeId!=null : !myIncidentTypeId.equals(yourIncidentTypeId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Incidenttype.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Incidenttype)) return false;
        return this.equalKeys(other) && ((Incidenttype)other).equalKeys(this);
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
        if (getIncidentTypeId() == null) {
            i = 0;
        } else {
            i = getIncidentTypeId().hashCode();
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
        StringBuffer sb = new StringBuffer("[Incidenttype |");
        sb.append(" incidentTypeId=").append(getIncidentTypeId());
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
        ret.put("incidentTypeId", getIncidentTypeId());
        return ret;
    }

}
