

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

@Entity(name="SERVICEORDER")
public class Serviceorder implements Serializable {

    /** Primary key. */
    protected static final String PK = "serviceOrderId";

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
    private BigDecimal serviceOrderId;
    @Column(precision=10, scale=2)
    private BigDecimal collectionMoney;
    private String senderFullname;
    private String senderPhonenumber;
    private String receiverFullname;
    private String receiverPhonenumber;
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
    @OneToMany(mappedBy="serviceorder")
    private Set<DebtDetail> debtDetail;
    @OneToMany(mappedBy="serviceorder")
    private Set<Order> order;
    @OneToMany(mappedBy="serviceorder")
    private Set<RealDestinationService> realDestinationService;
    @ManyToOne(optional=false)
    @JoinColumn(name="coordinatorStoreId", nullable=false)
    private Store store2;
    @ManyToOne(optional=false)
    @JoinColumn(name="receiveAddress", nullable=false)
    private Address address;
    @ManyToOne(optional=false)
    @JoinColumn(name="senderStoreId", nullable=false)
    private Store store;
    @ManyToOne(optional=false)
    @JoinColumn(name="serviceTypeId", nullable=false)
    private Servicetype servicetype;
    @ManyToOne(optional=false)
    @JoinColumn(name="transportFormId", nullable=false)
    private TransportForm transportForm;
    @OneToMany(mappedBy="serviceorder")
    private Set<StopLocationService> stopLocationService;

    /** Default constructor. */
    public Serviceorder() {
        super();
    }

    /**
     * Access method for serviceOrderId.
     *
     * @return the current value of serviceOrderId
     */
    public BigDecimal getServiceOrderId() {
        return serviceOrderId;
    }

    /**
     * Setter method for serviceOrderId.
     *
     * @param aServiceOrderId the new value for serviceOrderId
     */
    public void setServiceOrderId(BigDecimal aServiceOrderId) {
        serviceOrderId = aServiceOrderId;
    }

    /**
     * Access method for collectionMoney.
     *
     * @return the current value of collectionMoney
     */
    public BigDecimal getCollectionMoney() {
        return collectionMoney;
    }

    /**
     * Setter method for collectionMoney.
     *
     * @param aCollectionMoney the new value for collectionMoney
     */
    public void setCollectionMoney(BigDecimal aCollectionMoney) {
        collectionMoney = aCollectionMoney;
    }

    /**
     * Access method for senderFullname.
     *
     * @return the current value of senderFullname
     */
    public String getSenderFullname() {
        return senderFullname;
    }

    /**
     * Setter method for senderFullname.
     *
     * @param aSenderFullname the new value for senderFullname
     */
    public void setSenderFullname(String aSenderFullname) {
        senderFullname = aSenderFullname;
    }

    /**
     * Access method for senderPhonenumber.
     *
     * @return the current value of senderPhonenumber
     */
    public String getSenderPhonenumber() {
        return senderPhonenumber;
    }

    /**
     * Setter method for senderPhonenumber.
     *
     * @param aSenderPhonenumber the new value for senderPhonenumber
     */
    public void setSenderPhonenumber(String aSenderPhonenumber) {
        senderPhonenumber = aSenderPhonenumber;
    }

    /**
     * Access method for receiverFullname.
     *
     * @return the current value of receiverFullname
     */
    public String getReceiverFullname() {
        return receiverFullname;
    }

    /**
     * Setter method for receiverFullname.
     *
     * @param aReceiverFullname the new value for receiverFullname
     */
    public void setReceiverFullname(String aReceiverFullname) {
        receiverFullname = aReceiverFullname;
    }

    /**
     * Access method for receiverPhonenumber.
     *
     * @return the current value of receiverPhonenumber
     */
    public String getReceiverPhonenumber() {
        return receiverPhonenumber;
    }

    /**
     * Setter method for receiverPhonenumber.
     *
     * @param aReceiverPhonenumber the new value for receiverPhonenumber
     */
    public void setReceiverPhonenumber(String aReceiverPhonenumber) {
        receiverPhonenumber = aReceiverPhonenumber;
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
     * Access method for order.
     *
     * @return the current value of order
     */
    public Set<Order> getOrder() {
        return order;
    }

    /**
     * Setter method for order.
     *
     * @param aOrder the new value for order
     */
    public void setOrder(Set<Order> aOrder) {
        order = aOrder;
    }

    /**
     * Access method for realDestinationService.
     *
     * @return the current value of realDestinationService
     */
    public Set<RealDestinationService> getRealDestinationService() {
        return realDestinationService;
    }

    /**
     * Setter method for realDestinationService.
     *
     * @param aRealDestinationService the new value for realDestinationService
     */
    public void setRealDestinationService(Set<RealDestinationService> aRealDestinationService) {
        realDestinationService = aRealDestinationService;
    }

    /**
     * Access method for store2.
     *
     * @return the current value of store2
     */
    public Store getStore2() {
        return store2;
    }

    /**
     * Setter method for store2.
     *
     * @param aStore2 the new value for store2
     */
    public void setStore2(Store aStore2) {
        store2 = aStore2;
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
     * Access method for transportForm.
     *
     * @return the current value of transportForm
     */
    public TransportForm getTransportForm() {
        return transportForm;
    }

    /**
     * Setter method for transportForm.
     *
     * @param aTransportForm the new value for transportForm
     */
    public void setTransportForm(TransportForm aTransportForm) {
        transportForm = aTransportForm;
    }

    /**
     * Access method for stopLocationService.
     *
     * @return the current value of stopLocationService
     */
    public Set<StopLocationService> getStopLocationService() {
        return stopLocationService;
    }

    /**
     * Setter method for stopLocationService.
     *
     * @param aStopLocationService the new value for stopLocationService
     */
    public void setStopLocationService(Set<StopLocationService> aStopLocationService) {
        stopLocationService = aStopLocationService;
    }

    /**
     * Compares the key for this instance with another Serviceorder.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Serviceorder and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Serviceorder)) {
            return false;
        }
        Serviceorder that = (Serviceorder) other;
        Object myServiceOrderId = this.getServiceOrderId();
        Object yourServiceOrderId = that.getServiceOrderId();
        if (myServiceOrderId==null ? yourServiceOrderId!=null : !myServiceOrderId.equals(yourServiceOrderId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Serviceorder.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Serviceorder)) return false;
        return this.equalKeys(other) && ((Serviceorder)other).equalKeys(this);
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
        if (getServiceOrderId() == null) {
            i = 0;
        } else {
            i = getServiceOrderId().hashCode();
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
        StringBuffer sb = new StringBuffer("[Serviceorder |");
        sb.append(" serviceOrderId=").append(getServiceOrderId());
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
        ret.put("serviceOrderId", getServiceOrderId());
        return ret;
    }

}
