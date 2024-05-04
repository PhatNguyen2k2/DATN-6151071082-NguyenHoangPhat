// Generated with g9.

package com.phat.ctrs.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Version;

@Entity(name="SKILL_BY_VEHICLETYPE")
@IdClass(SkillByVehicletype.SkillByVehicletypeId.class)
public class SkillByVehicletype implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class SkillByVehicletypeId implements Serializable {
        Vehicletype vehicletype;
        Skill skill;
    }

    /** Primary key. */
    protected static final String PK = "SkillByVehicletypeSkillByVehicletypePkey";

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

    @ManyToOne(optional=false)
    @Id
    @JoinColumn(name="skillId", nullable=false)
    private Skill skill;
    @ManyToOne(optional=false)
    @Id
    @JoinColumn(name="vehicleTypeId", nullable=false)
    private Vehicletype vehicletype;

    /** Default constructor. */
    public SkillByVehicletype() {
        super();
    }

    /**
     * Access method for skill.
     *
     * @return the current value of skill
     */
    public Skill getSkill() {
        return skill;
    }

    /**
     * Setter method for skill.
     *
     * @param aSkill the new value for skill
     */
    public void setSkill(Skill aSkill) {
        skill = aSkill;
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

    /** Temporary value holder for group key fragment vehicletypeVehicleTypeId */
    private transient BigDecimal tempVehicletypeVehicleTypeId;

    /**
     * Gets the key fragment vehicleTypeId for member vehicletype.
     * If this.vehicletype is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setVehicletypeVehicleTypeId.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see Vehicletype
     */
    public BigDecimal getVehicletypeVehicleTypeId() {
        return (getVehicletype() == null ? tempVehicletypeVehicleTypeId : getVehicletype().getVehicleTypeId());
    }

    /**
     * Sets the key fragment vehicleTypeId from member vehicletype.
     * If this.vehicletype is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getVehicletypeVehicleTypeId.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aVehicleTypeId New value for the key fragment
     * @see Vehicletype
     */
    public void setVehicletypeVehicleTypeId(BigDecimal aVehicleTypeId) {
        if (getVehicletype() == null) {
            tempVehicletypeVehicleTypeId = aVehicleTypeId;
        } else {
            getVehicletype().setVehicleTypeId(aVehicleTypeId);
        }
    }

    /** Temporary value holder for group key fragment skillSkillId */
    private transient BigDecimal tempSkillSkillId;

    /**
     * Gets the key fragment skillId for member skill.
     * If this.skill is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setSkillSkillId.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see Skill
     */
    public BigDecimal getSkillSkillId() {
        return (getSkill() == null ? tempSkillSkillId : getSkill().getSkillId());
    }

    /**
     * Sets the key fragment skillId from member skill.
     * If this.skill is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getSkillSkillId.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aSkillId New value for the key fragment
     * @see Skill
     */
    public void setSkillSkillId(BigDecimal aSkillId) {
        if (getSkill() == null) {
            tempSkillSkillId = aSkillId;
        } else {
            getSkill().setSkillId(aSkillId);
        }
    }

    /**
     * Compares the key for this instance with another SkillByVehicletype.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class SkillByVehicletype and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof SkillByVehicletype)) {
            return false;
        }
        SkillByVehicletype that = (SkillByVehicletype) other;
        Object myVehicletypeVehicleTypeId = this.getVehicletypeVehicleTypeId();
        Object yourVehicletypeVehicleTypeId = that.getVehicletypeVehicleTypeId();
        if (myVehicletypeVehicleTypeId==null ? yourVehicletypeVehicleTypeId!=null : !myVehicletypeVehicleTypeId.equals(yourVehicletypeVehicleTypeId)) {
            return false;
        }
        Object mySkillSkillId = this.getSkillSkillId();
        Object yourSkillSkillId = that.getSkillSkillId();
        if (mySkillSkillId==null ? yourSkillSkillId!=null : !mySkillSkillId.equals(yourSkillSkillId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another SkillByVehicletype.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof SkillByVehicletype)) return false;
        return this.equalKeys(other) && ((SkillByVehicletype)other).equalKeys(this);
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
        if (getVehicletypeVehicleTypeId() == null) {
            i = 0;
        } else {
            i = getVehicletypeVehicleTypeId().hashCode();
        }
        result = 37*result + i;
        if (getSkillSkillId() == null) {
            i = 0;
        } else {
            i = getSkillSkillId().hashCode();
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
        StringBuffer sb = new StringBuffer("[SkillByVehicletype |");
        sb.append(" vehicletypeVehicleTypeId=").append(getVehicletypeVehicleTypeId());
        sb.append(" skillSkillId=").append(getSkillSkillId());
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
        ret.put("vehicletypeVehicleTypeId", getVehicletypeVehicleTypeId());
        ret.put("skillSkillId", getSkillSkillId());
        return ret;
    }

}
