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

@Entity(name="CATEGORY_SKILL")
public class CategorySkill implements Serializable {

    /** Primary key. */
    protected static final String PK = "categorySkillId";

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
    private BigDecimal categorySkillId;
    private String categoryName;
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
    @ManyToOne
    @JoinColumn(name="serviceTypeId")
    private Servicetype servicetype;
    @OneToMany(mappedBy="categorySkill")
    private Set<Skill> skill;

    /** Default constructor. */
    public CategorySkill() {
        super();
    }

    /**
     * Access method for categorySkillId.
     *
     * @return the current value of categorySkillId
     */
    public BigDecimal getCategorySkillId() {
        return categorySkillId;
    }

    /**
     * Setter method for categorySkillId.
     *
     * @param aCategorySkillId the new value for categorySkillId
     */
    public void setCategorySkillId(BigDecimal aCategorySkillId) {
        categorySkillId = aCategorySkillId;
    }

    /**
     * Access method for categoryName.
     *
     * @return the current value of categoryName
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * Setter method for categoryName.
     *
     * @param aCategoryName the new value for categoryName
     */
    public void setCategoryName(String aCategoryName) {
        categoryName = aCategoryName;
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
     * Access method for servicetype.
     *
     * @return the current value of servicetype
     */
    public Servicetype getServicetype() {
        return servicetype;
    }

    /**
     * Setter method for servicetype.
     *
     * @param aServicetype the new value for servicetype
     */
    public void setServicetype(Servicetype aServicetype) {
        servicetype = aServicetype;
    }

    /**
     * Access method for skill.
     *
     * @return the current value of skill
     */
    public Set<Skill> getSkill() {
        return skill;
    }

    /**
     * Setter method for skill.
     *
     * @param aSkill the new value for skill
     */
    public void setSkill(Set<Skill> aSkill) {
        skill = aSkill;
    }

    /**
     * Compares the key for this instance with another CategorySkill.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class CategorySkill and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof CategorySkill)) {
            return false;
        }
        CategorySkill that = (CategorySkill) other;
        Object myCategorySkillId = this.getCategorySkillId();
        Object yourCategorySkillId = that.getCategorySkillId();
        if (myCategorySkillId==null ? yourCategorySkillId!=null : !myCategorySkillId.equals(yourCategorySkillId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another CategorySkill.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof CategorySkill)) return false;
        return this.equalKeys(other) && ((CategorySkill)other).equalKeys(this);
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
        if (getCategorySkillId() == null) {
            i = 0;
        } else {
            i = getCategorySkillId().hashCode();
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
        StringBuffer sb = new StringBuffer("[CategorySkill |");
        sb.append(" categorySkillId=").append(getCategorySkillId());
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
        ret.put("categorySkillId", getCategorySkillId());
        return ret;
    }

}
