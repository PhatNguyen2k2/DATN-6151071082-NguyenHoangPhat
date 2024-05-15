// Generated with g9.

package com.phat.ctrs.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Version;

@Entity(name = "SKILL")
public class Skill implements Serializable {

    /** Primary key. */
    protected static final String PK = "skillId";

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
    private BigDecimal skillId;
    private String skillName;
    @Column(precision = 10)
    private BigDecimal createdUser;
    private LocalDateTime createdDate;
    @Column(precision = 10)
    private BigDecimal updatedUser;
    private LocalDateTime updatedDate;
    @Column(precision = 10)
    private BigDecimal deletedUser;
    private LocalDateTime deletedDate;
    private String updateNote;
    @Column(length = 1)
    private boolean isLast;
    @OneToMany(mappedBy = "skill")
    @JsonIgnore
    private Set<EmployeeLoad> employeeLoad;
    @OneToMany(mappedBy = "skill")
    @JsonIgnore
    private Set<EmployeeSkill> employeeSkill;
    @OneToMany(mappedBy = "skill")
    @JsonIgnore
    private Set<RatingEmployeeSkill> ratingEmployeeSkill;
    @OneToMany(mappedBy = "skill")
    @JsonIgnore
    private Set<SkillByVehicletype> skillByVehicletype;
    @ManyToOne
    @JoinColumn(name = "categorySkillId")
    private CategorySkill categorySkill;
    @OneToMany(mappedBy = "skill")
    @JsonIgnore
    private Set<SkillSubgroup> skillSubgroup;
    @OneToMany(mappedBy = "skill")
    @JsonIgnore
    private Set<Route> route;

    /** Default constructor. */
    public Skill() {
        super();
    }

    /**
     * Access method for skillId.
     *
     * @return the current value of skillId
     */
    public BigDecimal getSkillId() {
        return skillId;
    }

    /**
     * Setter method for skillId.
     *
     * @param aSkillId the new value for skillId
     */
    public void setSkillId(BigDecimal aSkillId) {
        skillId = aSkillId;
    }

    /**
     * Access method for skillName.
     *
     * @return the current value of skillName
     */
    public String getSkillName() {
        return skillName;
    }

    /**
     * Setter method for skillName.
     *
     * @param aSkillName the new value for skillName
     */
    public void setSkillName(String aSkillName) {
        skillName = aSkillName;
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
     * Access method for employeeLoad.
     *
     * @return the current value of employeeLoad
     */
    public Set<EmployeeLoad> getEmployeeLoad() {
        return employeeLoad;
    }

    /**
     * Setter method for employeeLoad.
     *
     * @param aEmployeeLoad the new value for employeeLoad
     */
    public void setEmployeeLoad(Set<EmployeeLoad> aEmployeeLoad) {
        employeeLoad = aEmployeeLoad;
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
     * Access method for ratingEmployeeSkill.
     *
     * @return the current value of ratingEmployeeSkill
     */
    public Set<RatingEmployeeSkill> getRatingEmployeeSkill() {
        return ratingEmployeeSkill;
    }

    /**
     * Setter method for ratingEmployeeSkill.
     *
     * @param aRatingEmployeeSkill the new value for ratingEmployeeSkill
     */
    public void setRatingEmployeeSkill(Set<RatingEmployeeSkill> aRatingEmployeeSkill) {
        ratingEmployeeSkill = aRatingEmployeeSkill;
    }

    /**
     * Access method for skillByVehicletype.
     *
     * @return the current value of skillByVehicletype
     */
    public Set<SkillByVehicletype> getSkillByVehicletype() {
        return skillByVehicletype;
    }

    /**
     * Setter method for skillByVehicletype.
     *
     * @param aSkillByVehicletype the new value for skillByVehicletype
     */
    public void setSkillByVehicletype(Set<SkillByVehicletype> aSkillByVehicletype) {
        skillByVehicletype = aSkillByVehicletype;
    }

    /**
     * Access method for categorySkill.
     *
     * @return the current value of categorySkill
     */
    public CategorySkill getCategorySkill() {
        return categorySkill;
    }

    /**
     * Setter method for categorySkill.
     *
     * @param aCategorySkill the new value for categorySkill
     */
    public void setCategorySkill(CategorySkill aCategorySkill) {
        categorySkill = aCategorySkill;
    }

    /**
     * Access method for skillSubgroup.
     *
     * @return the current value of skillSubgroup
     */
    public Set<SkillSubgroup> getSkillSubgroup() {
        return skillSubgroup;
    }

    /**
     * Setter method for skillSubgroup.
     *
     * @param aSkillSubgroup the new value for skillSubgroup
     */
    public void setSkillSubgroup(Set<SkillSubgroup> aSkillSubgroup) {
        skillSubgroup = aSkillSubgroup;
    }

    /**
     * Compares the key for this instance with another Skill.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Skill and the key objects
     *         are equal
     */
    private boolean equalKeys(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Skill)) {
            return false;
        }
        Skill that = (Skill) other;
        Object mySkillId = this.getSkillId();
        Object yourSkillId = that.getSkillId();
        if (mySkillId == null ? yourSkillId != null : !mySkillId.equals(yourSkillId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Skill.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Skill))
            return false;
        return this.equalKeys(other) && ((Skill) other).equalKeys(this);
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
        if (getSkillId() == null) {
            i = 0;
        } else {
            i = getSkillId().hashCode();
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
        StringBuffer sb = new StringBuffer("[Skill |");
        sb.append(" skillId=").append(getSkillId());
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
        ret.put("skillId", getSkillId());
        return ret;
    }

    public static String getPk() {
        return PK;
    }

    public void setLast(boolean isLast) {
        this.isLast = isLast;
    }

    public Set<Route> getRoute() {
        return route;
    }

    public void setRoute(Set<Route> route) {
        this.route = route;
    }

}
