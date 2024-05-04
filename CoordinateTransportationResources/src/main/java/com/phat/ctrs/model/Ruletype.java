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

@Entity(name="RULETYPE")
public class Ruletype implements Serializable {

    /** Primary key. */
    protected static final String PK = "ruleTypeId";

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
    private BigDecimal ruleTypeId;
    private String ruleTypeName;
    @OneToMany(mappedBy="ruletype")
    private Set<Rule> rule;

    /** Default constructor. */
    public Ruletype() {
        super();
    }

    /**
     * Access method for ruleTypeId.
     *
     * @return the current value of ruleTypeId
     */
    public BigDecimal getRuleTypeId() {
        return ruleTypeId;
    }

    /**
     * Setter method for ruleTypeId.
     *
     * @param aRuleTypeId the new value for ruleTypeId
     */
    public void setRuleTypeId(BigDecimal aRuleTypeId) {
        ruleTypeId = aRuleTypeId;
    }

    /**
     * Access method for ruleTypeName.
     *
     * @return the current value of ruleTypeName
     */
    public String getRuleTypeName() {
        return ruleTypeName;
    }

    /**
     * Setter method for ruleTypeName.
     *
     * @param aRuleTypeName the new value for ruleTypeName
     */
    public void setRuleTypeName(String aRuleTypeName) {
        ruleTypeName = aRuleTypeName;
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
     * Compares the key for this instance with another Ruletype.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Ruletype and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Ruletype)) {
            return false;
        }
        Ruletype that = (Ruletype) other;
        Object myRuleTypeId = this.getRuleTypeId();
        Object yourRuleTypeId = that.getRuleTypeId();
        if (myRuleTypeId==null ? yourRuleTypeId!=null : !myRuleTypeId.equals(yourRuleTypeId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Ruletype.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Ruletype)) return false;
        return this.equalKeys(other) && ((Ruletype)other).equalKeys(this);
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
        if (getRuleTypeId() == null) {
            i = 0;
        } else {
            i = getRuleTypeId().hashCode();
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
        StringBuffer sb = new StringBuffer("[Ruletype |");
        sb.append(" ruleTypeId=").append(getRuleTypeId());
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
        ret.put("ruleTypeId", getRuleTypeId());
        return ret;
    }

}
