// Generated with g9.

package com.phat.ctrs.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
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

@Entity(name="EMPLOYEE_AGREEMENT")
public class EmployeeAgreement implements Serializable {

    /** Primary key. */
    protected static final String PK = "employeeAgreementId";

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
    private BigDecimal employeeAgreementId;
    private String agreementName;
    private LocalDate signDate;
    private LocalDate effectDate;
    private LocalDate expireDate;
    @Column(length=1)
    private boolean isExtend;
    @Column(length=1)
    private boolean isLiquidation;
    private LocalDate liquidationDate;
    @Column(precision=4)
    private BigDecimal minimumServiceOrder;
    @Column(length=1)
    private boolean agreementCanceled;
    @Column(precision=3)
    private BigDecimal partnerCapacity;
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
    @OneToMany(mappedBy="employeeAgreement")
    private Set<DriverPriceDetail> driverPriceDetail;
    @OneToMany(mappedBy="employeeAgreement")
    private Set<DriverResource> driverResource;
    @ManyToOne
    @JoinColumn(name="employeeAgreementTypeID")
    private EmployeeAgreementType employeeAgreementType;
    @ManyToOne
    @JoinColumn(name="employeeId")
    private Employee employee;
    @ManyToOne
    @JoinColumn(name="partnerId")
    private Partner partner;
    @ManyToOne
    @JoinColumn(name="serviceTypeId")
    private Servicetype servicetype;
    @ManyToOne
    @JoinColumn(name="storeId")
    private Store store;
    @OneToMany(mappedBy="employeeAgreement")
    private Set<ResourcePriceApply> resourcePriceApply;

    /** Default constructor. */
    public EmployeeAgreement() {
        super();
    }

    /**
     * Access method for employeeAgreementId.
     *
     * @return the current value of employeeAgreementId
     */
    public BigDecimal getEmployeeAgreementId() {
        return employeeAgreementId;
    }

    /**
     * Setter method for employeeAgreementId.
     *
     * @param aEmployeeAgreementId the new value for employeeAgreementId
     */
    public void setEmployeeAgreementId(BigDecimal aEmployeeAgreementId) {
        employeeAgreementId = aEmployeeAgreementId;
    }

    /**
     * Access method for agreementName.
     *
     * @return the current value of agreementName
     */
    public String getAgreementName() {
        return agreementName;
    }

    /**
     * Setter method for agreementName.
     *
     * @param aAgreementName the new value for agreementName
     */
    public void setAgreementName(String aAgreementName) {
        agreementName = aAgreementName;
    }

    /**
     * Access method for signDate.
     *
     * @return the current value of signDate
     */
    public LocalDate getSignDate() {
        return signDate;
    }

    /**
     * Setter method for signDate.
     *
     * @param aSignDate the new value for signDate
     */
    public void setSignDate(LocalDate aSignDate) {
        signDate = aSignDate;
    }

    /**
     * Access method for effectDate.
     *
     * @return the current value of effectDate
     */
    public LocalDate getEffectDate() {
        return effectDate;
    }

    /**
     * Setter method for effectDate.
     *
     * @param aEffectDate the new value for effectDate
     */
    public void setEffectDate(LocalDate aEffectDate) {
        effectDate = aEffectDate;
    }

    /**
     * Access method for expireDate.
     *
     * @return the current value of expireDate
     */
    public LocalDate getExpireDate() {
        return expireDate;
    }

    /**
     * Setter method for expireDate.
     *
     * @param aExpireDate the new value for expireDate
     */
    public void setExpireDate(LocalDate aExpireDate) {
        expireDate = aExpireDate;
    }

    /**
     * Access method for isExtend.
     *
     * @return true if and only if isExtend is currently true
     */
    public boolean getIsExtend() {
        return isExtend;
    }

    /**
     * Setter method for isExtend.
     *
     * @param aIsExtend the new value for isExtend
     */
    public void setIsExtend(boolean aIsExtend) {
        isExtend = aIsExtend;
    }

    /**
     * Access method for isLiquidation.
     *
     * @return true if and only if isLiquidation is currently true
     */
    public boolean getIsLiquidation() {
        return isLiquidation;
    }

    /**
     * Setter method for isLiquidation.
     *
     * @param aIsLiquidation the new value for isLiquidation
     */
    public void setIsLiquidation(boolean aIsLiquidation) {
        isLiquidation = aIsLiquidation;
    }

    /**
     * Access method for liquidationDate.
     *
     * @return the current value of liquidationDate
     */
    public LocalDate getLiquidationDate() {
        return liquidationDate;
    }

    /**
     * Setter method for liquidationDate.
     *
     * @param aLiquidationDate the new value for liquidationDate
     */
    public void setLiquidationDate(LocalDate aLiquidationDate) {
        liquidationDate = aLiquidationDate;
    }

    /**
     * Access method for minimumServiceOrder.
     *
     * @return the current value of minimumServiceOrder
     */
    public BigDecimal getMinimumServiceOrder() {
        return minimumServiceOrder;
    }

    /**
     * Setter method for minimumServiceOrder.
     *
     * @param aMinimumServiceOrder the new value for minimumServiceOrder
     */
    public void setMinimumServiceOrder(BigDecimal aMinimumServiceOrder) {
        minimumServiceOrder = aMinimumServiceOrder;
    }

    /**
     * Access method for agreementCanceled.
     *
     * @return true if and only if agreementCanceled is currently true
     */
    public boolean getAgreementCanceled() {
        return agreementCanceled;
    }

    /**
     * Setter method for agreementCanceled.
     *
     * @param aAgreementCanceled the new value for agreementCanceled
     */
    public void setAgreementCanceled(boolean aAgreementCanceled) {
        agreementCanceled = aAgreementCanceled;
    }

    /**
     * Access method for partnerCapacity.
     *
     * @return the current value of partnerCapacity
     */
    public BigDecimal getPartnerCapacity() {
        return partnerCapacity;
    }

    /**
     * Setter method for partnerCapacity.
     *
     * @param aPartnerCapacity the new value for partnerCapacity
     */
    public void setPartnerCapacity(BigDecimal aPartnerCapacity) {
        partnerCapacity = aPartnerCapacity;
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
     * Access method for driverPriceDetail.
     *
     * @return the current value of driverPriceDetail
     */
    public Set<DriverPriceDetail> getDriverPriceDetail() {
        return driverPriceDetail;
    }

    /**
     * Setter method for driverPriceDetail.
     *
     * @param aDriverPriceDetail the new value for driverPriceDetail
     */
    public void setDriverPriceDetail(Set<DriverPriceDetail> aDriverPriceDetail) {
        driverPriceDetail = aDriverPriceDetail;
    }

    /**
     * Access method for driverResource.
     *
     * @return the current value of driverResource
     */
    public Set<DriverResource> getDriverResource() {
        return driverResource;
    }

    /**
     * Setter method for driverResource.
     *
     * @param aDriverResource the new value for driverResource
     */
    public void setDriverResource(Set<DriverResource> aDriverResource) {
        driverResource = aDriverResource;
    }

    /**
     * Access method for employeeAgreementType.
     *
     * @return the current value of employeeAgreementType
     */
    public EmployeeAgreementType getEmployeeAgreementType() {
        return employeeAgreementType;
    }

    /**
     * Setter method for employeeAgreementType.
     *
     * @param aEmployeeAgreementType the new value for employeeAgreementType
     */
    public void setEmployeeAgreementType(EmployeeAgreementType aEmployeeAgreementType) {
        employeeAgreementType = aEmployeeAgreementType;
    }

    /**
     * Access method for employee.
     *
     * @return the current value of employee
     */
    public Employee getEmployee() {
        return employee;
    }

    /**
     * Setter method for employee.
     *
     * @param aEmployee the new value for employee
     */
    public void setEmployee(Employee aEmployee) {
        employee = aEmployee;
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
     * Access method for resourcePriceApply.
     *
     * @return the current value of resourcePriceApply
     */
    public Set<ResourcePriceApply> getResourcePriceApply() {
        return resourcePriceApply;
    }

    /**
     * Setter method for resourcePriceApply.
     *
     * @param aResourcePriceApply the new value for resourcePriceApply
     */
    public void setResourcePriceApply(Set<ResourcePriceApply> aResourcePriceApply) {
        resourcePriceApply = aResourcePriceApply;
    }

    /**
     * Compares the key for this instance with another EmployeeAgreement.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EmployeeAgreement and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EmployeeAgreement)) {
            return false;
        }
        EmployeeAgreement that = (EmployeeAgreement) other;
        Object myEmployeeAgreementId = this.getEmployeeAgreementId();
        Object yourEmployeeAgreementId = that.getEmployeeAgreementId();
        if (myEmployeeAgreementId==null ? yourEmployeeAgreementId!=null : !myEmployeeAgreementId.equals(yourEmployeeAgreementId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EmployeeAgreement.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EmployeeAgreement)) return false;
        return this.equalKeys(other) && ((EmployeeAgreement)other).equalKeys(this);
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
        if (getEmployeeAgreementId() == null) {
            i = 0;
        } else {
            i = getEmployeeAgreementId().hashCode();
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
        StringBuffer sb = new StringBuffer("[EmployeeAgreement |");
        sb.append(" employeeAgreementId=").append(getEmployeeAgreementId());
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
        ret.put("employeeAgreementId", getEmployeeAgreementId());
        return ret;
    }

}
