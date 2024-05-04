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

@Entity(name="SKILL_SUBGROUP")
@IdClass(SkillSubgroup.SkillSubgroupId.class)
public class SkillSubgroup implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class SkillSubgroupId implements Serializable {
        Skill skill;
        Subgroup subgroup;
    }

    /** Primary key. */
    protected static final String PK = "SkillSubgroupSkillSubgroupPkey";

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
    @JoinColumn(name="skillId", nullable=false)
    private Skill skill;
    @ManyToOne(optional=false)
    @Id
    @JoinColumn(name="subGroupId", nullable=false)
    private Subgroup subgroup;

    /** Default constructor. */
    public SkillSubgroup() {
        super();
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

    /** Temporary value holder for group key fragment subgroupSubGroupId */
    private transient BigDecimal tempSubgroupSubGroupId;

    /**
     * Gets the key fragment subGroupId for member subgroup.
     * If this.subgroup is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setSubgroupSubGroupId.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see Subgroup
     */
    public BigDecimal getSubgroupSubGroupId() {
        return (getSubgroup() == null ? tempSubgroupSubGroupId : getSubgroup().getSubGroupId());
    }

    /**
     * Sets the key fragment subGroupId from member subgroup.
     * If this.subgroup is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getSubgroupSubGroupId.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aSubGroupId New value for the key fragment
     * @see Subgroup
     */
    public void setSubgroupSubGroupId(BigDecimal aSubGroupId) {
        if (getSubgroup() == null) {
            tempSubgroupSubGroupId = aSubGroupId;
        } else {
            getSubgroup().setSubGroupId(aSubGroupId);
        }
    }

    /**
     * Compares the key for this instance with another SkillSubgroup.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class SkillSubgroup and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof SkillSubgroup)) {
            return false;
        }
        SkillSubgroup that = (SkillSubgroup) other;
        Object mySkillSkillId = this.getSkillSkillId();
        Object yourSkillSkillId = that.getSkillSkillId();
        if (mySkillSkillId==null ? yourSkillSkillId!=null : !mySkillSkillId.equals(yourSkillSkillId)) {
            return false;
        }
        Object mySubgroupSubGroupId = this.getSubgroupSubGroupId();
        Object yourSubgroupSubGroupId = that.getSubgroupSubGroupId();
        if (mySubgroupSubGroupId==null ? yourSubgroupSubGroupId!=null : !mySubgroupSubGroupId.equals(yourSubgroupSubGroupId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another SkillSubgroup.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof SkillSubgroup)) return false;
        return this.equalKeys(other) && ((SkillSubgroup)other).equalKeys(this);
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
        if (getSkillSkillId() == null) {
            i = 0;
        } else {
            i = getSkillSkillId().hashCode();
        }
        result = 37*result + i;
        if (getSubgroupSubGroupId() == null) {
            i = 0;
        } else {
            i = getSubgroupSubGroupId().hashCode();
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
        StringBuffer sb = new StringBuffer("[SkillSubgroup |");
        sb.append(" skillSkillId=").append(getSkillSkillId());
        sb.append(" subgroupSubGroupId=").append(getSubgroupSubGroupId());
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
        ret.put("skillSkillId", getSkillSkillId());
        ret.put("subgroupSubGroupId", getSubgroupSubGroupId());
        return ret;
    }

}
