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

@Entity(name="SKILL_LEVEL")
public class SkillLevel implements Serializable {

    /** Primary key. */
    protected static final String PK = "skillLevelId";

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
    private BigDecimal skillLevelId;
    private String skillLevelName;
    @Column(length=1)
    private boolean isActive;
    @OneToMany(mappedBy="skillLevel")
    private Set<EmployeeSkill> employeeSkill;

    /** Default constructor. */
    public SkillLevel() {
        super();
    }

    /**
     * Access method for skillLevelId.
     *
     * @return the current value of skillLevelId
     */
    public BigDecimal getSkillLevelId() {
        return skillLevelId;
    }

    /**
     * Setter method for skillLevelId.
     *
     * @param aSkillLevelId the new value for skillLevelId
     */
    public void setSkillLevelId(BigDecimal aSkillLevelId) {
        skillLevelId = aSkillLevelId;
    }

    /**
     * Access method for skillLevelName.
     *
     * @return the current value of skillLevelName
     */
    public String getSkillLevelName() {
        return skillLevelName;
    }

    /**
     * Setter method for skillLevelName.
     *
     * @param aSkillLevelName the new value for skillLevelName
     */
    public void setSkillLevelName(String aSkillLevelName) {
        skillLevelName = aSkillLevelName;
    }

    /**
     * Access method for isActive.
     *
     * @return true if and only if isActive is currently true
     */
    public boolean getIsActive() {
        return isActive;
    }

    /**
     * Setter method for isActive.
     *
     * @param aIsActive the new value for isActive
     */
    public void setIsActive(boolean aIsActive) {
        isActive = aIsActive;
    }

    /**
     * Access method for employeeSkill.
     *
     * @return the current value of employeeSkill
     */
    public Set<EmployeeSkill> getEmployeeSkill() {
        return employeeSkill;
    }

    /**
     * Setter method for employeeSkill.
     *
     * @param aEmployeeSkill the new value for employeeSkill
     */
    public void setEmployeeSkill(Set<EmployeeSkill> aEmployeeSkill) {
        employeeSkill = aEmployeeSkill;
    }

    /**
     * Compares the key for this instance with another SkillLevel.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class SkillLevel and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof SkillLevel)) {
            return false;
        }
        SkillLevel that = (SkillLevel) other;
        Object mySkillLevelId = this.getSkillLevelId();
        Object yourSkillLevelId = that.getSkillLevelId();
        if (mySkillLevelId==null ? yourSkillLevelId!=null : !mySkillLevelId.equals(yourSkillLevelId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another SkillLevel.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof SkillLevel)) return false;
        return this.equalKeys(other) && ((SkillLevel)other).equalKeys(this);
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
        if (getSkillLevelId() == null) {
            i = 0;
        } else {
            i = getSkillLevelId().hashCode();
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
        StringBuffer sb = new StringBuffer("[SkillLevel |");
        sb.append(" skillLevelId=").append(getSkillLevelId());
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
        ret.put("skillLevelId", getSkillLevelId());
        return ret;
    }

}
