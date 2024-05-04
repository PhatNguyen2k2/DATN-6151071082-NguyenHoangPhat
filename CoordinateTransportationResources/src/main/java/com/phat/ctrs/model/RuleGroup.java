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

@Entity(name="RULE_GROUP")
public class RuleGroup implements Serializable {

    /** Primary key. */
    protected static final String PK = "ruleGroupId";

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
    private BigDecimal ruleGroupId;
    private String ruleGroupName;
    @OneToMany(mappedBy="ruleGroup")
    private Set<Rule> rule;

    /** Default constructor. */
    public RuleGroup() {
        super();
    }

    /**
     * Access method for ruleGroupId.
     *
     * @return the current value of ruleGroupId
     */
    public BigDecimal getRuleGroupId() {
        return ruleGroupId;
    }

    /**
     * Setter method for ruleGroupId.
     *
     * @param aRuleGroupId the new value for ruleGroupId
     */
    public void setRuleGroupId(BigDecimal aRuleGroupId) {
        ruleGroupId = aRuleGroupId;
    }

    /**
     * Access method for ruleGroupName.
     *
     * @return the current value of ruleGroupName
     */
    public String getRuleGroupName() {
        return ruleGroupName;
    }

    /**
     * Setter method for ruleGroupName.
     *
     * @param aRuleGroupName the new value for ruleGroupName
     */
    public void setRuleGroupName(String aRuleGroupName) {
        ruleGroupName = aRuleGroupName;
    }

    /**
     * Access method for rule.
     *
     * @return the current value of rule
     */
    public Set<Rule> getRule() {
        return rule;
    }

    /**
     * Setter method for rule.
     *
     * @param aRule the new value for rule
     */
    public void setRule(Set<Rule> aRule) {
        rule = aRule;
    }

    /**
     * Compares the key for this instance with another RuleGroup.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class RuleGroup and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof RuleGroup)) {
            return false;
        }
        RuleGroup that = (RuleGroup) other;
        Object myRuleGroupId = this.getRuleGroupId();
        Object yourRuleGroupId = that.getRuleGroupId();
        if (myRuleGroupId==null ? yourRuleGroupId!=null : !myRuleGroupId.equals(yourRuleGroupId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another RuleGroup.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof RuleGroup)) return false;
        return this.equalKeys(other) && ((RuleGroup)other).equalKeys(this);
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
        if (getRuleGroupId() == null) {
            i = 0;
        } else {
            i = getRuleGroupId().hashCode();
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
        StringBuffer sb = new StringBuffer("[RuleGroup |");
        sb.append(" ruleGroupId=").append(getRuleGroupId());
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
        ret.put("ruleGroupId", getRuleGroupId());
        return ret;
    }

}
