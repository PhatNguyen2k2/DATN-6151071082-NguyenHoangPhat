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

@Entity(name="RULE")
public class Rule implements Serializable {

    /** Primary key. */
    protected static final String PK = "ruleId";

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
    private BigDecimal ruleId;
    private String ruleName;
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
    @OneToMany(mappedBy="rule")
    private Set<RuleInUse> ruleInUse;
    @ManyToOne(optional=false)
    @JoinColumn(name="ruleGroupId", nullable=false)
    private RuleGroup ruleGroup;
    @ManyToOne(optional=false)
    @JoinColumn(name="ruleTypeId", nullable=false)
    private Ruletype ruletype;

    /** Default constructor. */
    public Rule() {
        super();
    }

    /**
     * Access method for ruleId.
     *
     * @return the current value of ruleId
     */
    public BigDecimal getRuleId() {
        return ruleId;
    }

    /**
     * Setter method for ruleId.
     *
     * @param aRuleId the new value for ruleId
     */
    public void setRuleId(BigDecimal aRuleId) {
        ruleId = aRuleId;
    }

    /**
     * Access method for ruleName.
     *
     * @return the current value of ruleName
     */
    public String getRuleName() {
        return ruleName;
    }

    /**
     * Setter method for ruleName.
     *
     * @param aRuleName the new value for ruleName
     */
    public void setRuleName(String aRuleName) {
        ruleName = aRuleName;
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
     * Access method for ruleInUse.
     *
     * @return the current value of ruleInUse
     */
    public Set<RuleInUse> getRuleInUse() {
        return ruleInUse;
    }

    /**
     * Setter method for ruleInUse.
     *
     * @param aRuleInUse the new value for ruleInUse
     */
    public void setRuleInUse(Set<RuleInUse> aRuleInUse) {
        ruleInUse = aRuleInUse;
    }

    /**
     * Access method for ruleGroup.
     *
     * @return the current value of ruleGroup
     */
    public RuleGroup getRuleGroup() {
        return ruleGroup;
    }

    /**
     * Setter method for ruleGroup.
     *
     * @param aRuleGroup the new value for ruleGroup
     */
    public void setRuleGroup(RuleGroup aRuleGroup) {
        ruleGroup = aRuleGroup;
    }

    /**
     * Access method for ruletype.
     *
     * @return the current value of ruletype
     */
    public Ruletype getRuletype() {
        return ruletype;
    }

    /**
     * Setter method for ruletype.
     *
     * @param aRuletype the new value for ruletype
     */
    public void setRuletype(Ruletype aRuletype) {
        ruletype = aRuletype;
    }

    /**
     * Compares the key for this instance with another Rule.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Rule and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Rule)) {
            return false;
        }
        Rule that = (Rule) other;
        Object myRuleId = this.getRuleId();
        Object yourRuleId = that.getRuleId();
        if (myRuleId==null ? yourRuleId!=null : !myRuleId.equals(yourRuleId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Rule.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Rule)) return false;
        return this.equalKeys(other) && ((Rule)other).equalKeys(this);
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
        if (getRuleId() == null) {
            i = 0;
        } else {
            i = getRuleId().hashCode();
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
        StringBuffer sb = new StringBuffer("[Rule |");
        sb.append(" ruleId=").append(getRuleId());
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
        ret.put("ruleId", getRuleId());
        return ret;
    }

}
