// Generated with g9.

package com.phat.ctrs.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Version;

@Entity(name = "STORETYPE")
public class Storetype implements Serializable {

    /** Primary key. */
    protected static final String PK = "storeTypeId";

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
    private BigDecimal storeTypeId;
    private String storeTypeName;
    @OneToMany(mappedBy = "storetype")
    @JsonIgnore
    private Set<Store> store;

    /** Default constructor. */
    public Storetype() {
        super();
    }

    /**
     * Access method for storeTypeId.
     *
     * @return the current value of storeTypeId
     */
    public BigDecimal getStoreTypeId() {
        return storeTypeId;
    }

    /**
     * Setter method for storeTypeId.
     *
     * @param aStoreTypeId the new value for storeTypeId
     */
    public void setStoreTypeId(BigDecimal aStoreTypeId) {
        storeTypeId = aStoreTypeId;
    }

    /**
     * Access method for storeTypeName.
     *
     * @return the current value of storeTypeName
     */
    public String getStoreTypeName() {
        return storeTypeName;
    }

    /**
     * Setter method for storeTypeName.
     *
     * @param aStoreTypeName the new value for storeTypeName
     */
    public void setStoreTypeName(String aStoreTypeName) {
        storeTypeName = aStoreTypeName;
    }

    /**
     * Access method for store.
     *
     * @return the current value of store
     */
    public Set<Store> getStore() {
        return store;
    }

    /**
     * Setter method for store.
     *
     * @param aStore the new value for store
     */
    public void setStore(Set<Store> aStore) {
        store = aStore;
    }

    /**
     * Compares the key for this instance with another Storetype.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Storetype and the key
     *         objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Storetype)) {
            return false;
        }
        Storetype that = (Storetype) other;
        Object myStoreTypeId = this.getStoreTypeId();
        Object yourStoreTypeId = that.getStoreTypeId();
        if (myStoreTypeId == null ? yourStoreTypeId != null : !myStoreTypeId.equals(yourStoreTypeId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Storetype.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Storetype))
            return false;
        return this.equalKeys(other) && ((Storetype) other).equalKeys(this);
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
        if (getStoreTypeId() == null) {
            i = 0;
        } else {
            i = getStoreTypeId().hashCode();
        }
        result = 37 * result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[Storetype |");
        sb.append(" storeTypeId=").append(getStoreTypeId());
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
        ret.put("storeTypeId", getStoreTypeId());
        return ret;
    }

}
