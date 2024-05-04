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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Version;

@Entity(name="EMPLOYEE")
public class Employee implements Serializable {

    /** Primary key. */
    protected static final String PK = "employeeId";

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
    private BigDecimal employeeId;
    private String employeeName;
    private String phoneNumber;
    @Column(length=1)
    private boolean gender;
    @Column(length=1)
    private boolean isActive;
    @OneToMany(mappedBy="employee")
    private Set<CurrentDebt> currentDebt;
    @OneToMany(mappedBy="employee")
    private Set<DebtDetail> debtDetail;
    @OneToMany(mappedBy="employee")
    private Set<DrivingHourInfo> drivingHourInfo;
    @ManyToOne
    @JoinColumn(name="addressId")
    private Address address;
    @OneToMany(mappedBy="employee")
    private Set<EmployeeAgreement> employeeAgreement;
    @ManyToOne
    @JoinColumn(name="partnerId")
    private Partner partner;
    @OneToMany(mappedBy="employee")
    private Set<EmployeeRequestpermonth> employeeRequestpermonth;
    @OneToMany(mappedBy="employee")
    private Set<EmployeeShift> employeeShift;
    @OneToMany(mappedBy="employee")
    private Set<EmployeeSkill> employeeSkill;
    @ManyToOne
    @JoinColumn(name="storeId")
    private Store store;
    @OneToMany(mappedBy="employee")
    private Set<EverageCustomerRating> everageCustomerRating;
    @OneToMany(mappedBy="employee")
    private Set<LimitDebt> limitDebt;
    @OneToMany(mappedBy="employee")
    private Set<RatingEmployeeSkill> ratingEmployeeSkill;

    /** Default constructor. */
    public Employee() {
        super();
    }

    /**
     * Access method for employeeId.
     *
     * @return the current value of employeeId
     */
    public BigDecimal getEmployeeId() {
        return employeeId;
    }

    /**
     * Setter method for employeeId.
     *
     * @param aEmployeeId the new value for employeeId
     */
    public void setEmployeeId(BigDecimal aEmployeeId) {
        employeeId = aEmployeeId;
    }

    /**
     * Access method for employeeName.
     *
     * @return the current value of employeeName
     */
    public String getEmployeeName() {
        return employeeName;
    }

    /**
     * Setter method for employeeName.
     *
     * @param aEmployeeName the new value for employeeName
     */
    public void setEmployeeName(String aEmployeeName) {
        employeeName = aEmployeeName;
    }

    /**
     * Access method for phoneNumber.
     *
     * @return the current value of phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Setter method for phoneNumber.
     *
     * @param aPhoneNumber the new value for phoneNumber
     */
    public void setPhoneNumber(String aPhoneNumber) {
        phoneNumber = aPhoneNumber;
    }

    /**
     * Access method for gender.
     *
     * @return true if and only if gender is currently true
     */
    public boolean getGender() {
        return gender;
    }

    /**
     * Setter method for gender.
     *
     * @param aGender the new value for gender
     */
    public void setGender(boolean aGender) {
        gender = aGender;
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
     * Access method for currentDebt.
     *
     * @return the current value of currentDebt
     */
    public Set<CurrentDebt> getCurrentDebt() {
        return currentDebt;
    }

    /**
     * Setter method for currentDebt.
     *
     * @param aCurrentDebt the new value for currentDebt
     */
    public void setCurrentDebt(Set<CurrentDebt> aCurrentDebt) {
        currentDebt = aCurrentDebt;
    }

    /**
     * Access method for debtDetail.
     *
     * @return the current value of debtDetail
     */
    public Set<DebtDetail> getDebtDetail() {
        return debtDetail;
    }

    /**
     * Setter method for debtDetail.
     *
     * @param aDebtDetail the new value for debtDetail
     */
    public void setDebtDetail(Set<DebtDetail> aDebtDetail) {
        debtDetail = aDebtDetail;
    }

    /**
     * Access method for drivingHourInfo.
     *
     * @return the current value of drivingHourInfo
     */
    public Set<DrivingHourInfo> getDrivingHourInfo() {
        return drivingHourInfo;
    }

    /**
     * Setter method for drivingHourInfo.
     *
     * @param aDrivingHourInfo the new value for drivingHourInfo
     */
    public void setDrivingHourInfo(Set<DrivingHourInfo> aDrivingHourInfo) {
        drivingHourInfo = aDrivingHourInfo;
    }

    /**
     * Access method for address.
     *
     * @return the current value of address
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Setter method for address.
     *
     * @param aAddress the new value for address
     */
    public void setAddress(Address aAddress) {
        address = aAddress;
    }

    /**
     * Access method for employeeAgreement.
     *
     * @return the current value of employeeAgreement
     */
    public Set<EmployeeAgreement> getEmployeeAgreement() {
        return employeeAgreement;
    }

    /**
     * Setter method for employeeAgreement.
     *
     * @param aEmployeeAgreement the new value for employeeAgreement
     */
    public void setEmployeeAgreement(Set<EmployeeAgreement> aEmployeeAgreement) {
        employeeAgreement = aEmployeeAgreement;
    }

    /**
     * Access method for partner.
     *
     * @return the current value of partner
     */
    public Partner getPartner() {
        return partner;
    }

    /**
     * Setter method for partner.
     *
     * @param aPartner the new value for partner
     */
    public void setPartner(Partner aPartner) {
        partner = aPartner;
    }

    /**
     * Access method for employeeRequestpermonth.
     *
     * @return the current value of employeeRequestpermonth
     */
    public Set<EmployeeRequestpermonth> getEmployeeRequestpermonth() {
        return employeeRequestpermonth;
    }

    /**
     * Setter method for employeeRequestpermonth.
     *
     * @param aEmployeeRequestpermonth the new value for employeeRequestpermonth
     */
    public void setEmployeeRequestpermonth(Set<EmployeeRequestpermonth> aEmployeeRequestpermonth) {
        employeeRequestpermonth = aEmployeeRequestpermonth;
    }

    /**
     * Access method for employeeShift.
     *
     * @return the current value of employeeShift
     */
    public Set<EmployeeShift> getEmployeeShift() {
        return employeeShift;
    }

    /**
     * Setter method for employeeShift.
     *
     * @param aEmployeeShift the new value for employeeShift
     */
    public void setEmployeeShift(Set<EmployeeShift> aEmployeeShift) {
        employeeShift = aEmployeeShift;
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
     * Access method for everageCustomerRating.
     *
     * @return the current value of everageCustomerRating
     */
    public Set<EverageCustomerRating> getEverageCustomerRating() {
        return everageCustomerRating;
    }

    /**
     * Setter method for everageCustomerRating.
     *
     * @param aEverageCustomerRating the new value for everageCustomerRating
     */
    public void setEverageCustomerRating(Set<EverageCustomerRating> aEverageCustomerRating) {
        everageCustomerRating = aEverageCustomerRating;
    }

    /**
     * Access method for limitDebt.
     *
     * @return the current value of limitDebt
     */
    public Set<LimitDebt> getLimitDebt() {
        return limitDebt;
    }

    /**
     * Setter method for limitDebt.
     *
     * @param aLimitDebt the new value for limitDebt
     */
    public void setLimitDebt(Set<LimitDebt> aLimitDebt) {
        limitDebt = aLimitDebt;
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
     * Compares the key for this instance with another Employee.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Employee and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Employee)) {
            return false;
        }
        Employee that = (Employee) other;
        Object myEmployeeId = this.getEmployeeId();
        Object yourEmployeeId = that.getEmployeeId();
        if (myEmployeeId==null ? yourEmployeeId!=null : !myEmployeeId.equals(yourEmployeeId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Employee.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Employee)) return false;
        return this.equalKeys(other) && ((Employee)other).equalKeys(this);
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
        if (getEmployeeId() == null) {
            i = 0;
        } else {
            i = getEmployeeId().hashCode();
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
        StringBuffer sb = new StringBuffer("[Employee |");
        sb.append(" employeeId=").append(getEmployeeId());
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
        ret.put("employeeId", getEmployeeId());
        return ret;
    }

}
