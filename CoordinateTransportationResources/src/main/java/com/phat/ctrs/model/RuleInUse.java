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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Version;

@Entity(name="RULE_IN_USE")
public class RuleInUse implements Serializable {

    /** Primary key. */
    protected static final String PK = "ruleInUseId";

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
    private BigDecimal ruleInUseId;
    private String ruleName;
    @Column(precision=10)
    private BigDecimal priorityIndex;
    @Column(precision=10, scale=2)
    private BigDecimal priorityPercentage;
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
    @JoinColumn(name="ruleId", nullable=false)
    private Rule rule;
    @ManyToOne(optional=false)
    @JoinColumn(name="storeId", nullable=false)
    private Store store;

    /** Default constructor. */
    public RuleInUse() {
        super();
    }

    /**
     * Access method for ruleInUseId.
     *
     * @return the current value of ruleInUseId
     */
    public BigDecimal getRuleInUseId() {
        return ruleInUseId;
    }

    /**
     * Setter method for ruleInUseId.
     *
     * @param aRuleInUseId the new value for ruleInUseId
     */
    public void setRuleInUseId(BigDecimal aRuleInUseId) {
        ruleInUseId = aRuleInUseId;
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
     * Access method for priorityIndex.
     *
     * @return the current value of priorityIndex
     */
    public BigDecimal getPriorityIndex() {
        return priorityIndex;
    }

    /**
     * Setter method for priorityIndex.
     *
     * @param aPriorityIndex the new value for priorityIndex
     */
    public void setPriorityIndex(BigDecimal aPriorityIndex) {
        priorityIndex = aPriorityIndex;
    }

    /**
     * Access method for priorityPercentage.
     *
     * @return the current value of priorityPercentage
     */
    public BigDecimal getPriorityPercentage() {
        return priorityPercentage;
    }

    /**
     * Setter method for priorityPercentage.
     *
     * @param aPriorityPercentage the new value for priorityPercentage
     */
    public void setPriorityPercentage(BigDecimal aPriorityPercentage) {
        priorityPercentage = aPriorityPercentage;
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
     * Access method for rule.
     *
     * @return the current value of rule
     */
    public Rule getRule() {
        return rule;
    }

    /**
     * Setter method for rule.
     *
     * @param aRule the new value for rule
     */
    public void setRule(Rule aRule) {
        rule = aRule;
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
     * Compares the key for this instance with another RuleInUse.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class RuleInUse and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof RuleInUse)) {
            return false;
        }
        RuleInUse that = (RuleInUse) other;
        Object myRuleInUseId = this.getRuleInUseId();
        Object yourRuleInUseId = that.getRuleInUseId();
        if (myRuleInUseId==null ? yourRuleInUseId!=null : !myRuleInUseId.equals(yourRuleInUseId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another RuleInUse.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof RuleInUse)) return false;
        return this.equalKeys(other) && ((RuleInUse)other).equalKeys(this);
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
        if (getRuleInUseId() == null) {
            i = 0;
        } else {
            i = getRuleInUseId().hashCode();
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
        StringBuffer sb = new StringBuffer("[RuleInUse |");
        sb.append(" ruleInUseId=").append(getRuleInUseId());
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
        ret.put("ruleInUseId", getRuleInUseId());
        return ret;
    }

}
