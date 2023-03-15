/**
 * AssemblyUnbuild.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.inventory_2022_2;

public class AssemblyUnbuild  extends com.netsuite.webservices.platform.core_2022_2.Record  implements java.io.Serializable {
    private java.util.Calendar createdDate;

    private java.util.Calendar lastModifiedDate;

    private com.netsuite.webservices.platform.core_2022_2.RecordRef customForm;

    private java.util.Calendar tranDate;

    private com.netsuite.webservices.platform.core_2022_2.RecordRef postingPeriod;

    private java.lang.String tranId;

    private com.netsuite.webservices.platform.core_2022_2.RecordRef item;

    private java.lang.Double built;

    private java.lang.Double quantity;

    private com.netsuite.webservices.platform.core_2022_2.RecordRef units;

    private java.lang.Double total;

    private com.netsuite.webservices.platform.core_2022_2.RecordRef billOfMaterials;

    private com.netsuite.webservices.platform.core_2022_2.RecordRef billOfMaterialsRevision;

    private java.lang.String serialNumbers;

    private com.netsuite.webservices.platform.common_2022_2.InventoryDetail inventoryDetail;

    private java.lang.String binNumbers;

    private com.netsuite.webservices.platform.core_2022_2.RecordRef subsidiary;

    private com.netsuite.webservices.platform.core_2022_2.RecordRef department;

    private com.netsuite.webservices.platform.core_2022_2.RecordRef _class;

    private com.netsuite.webservices.platform.core_2022_2.RecordRef location;

    private java.lang.String memo;

    private com.netsuite.webservices.transactions.inventory_2022_2.AssemblyComponentList componentList;

    private com.netsuite.webservices.platform.common_2022_2.AccountingBookDetailList accountingBookDetailList;

    private com.netsuite.webservices.platform.core_2022_2.CustomFieldList customFieldList;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public AssemblyUnbuild() {
    }

    public AssemblyUnbuild(
           com.netsuite.webservices.platform.core_2022_2.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           java.util.Calendar createdDate,
           java.util.Calendar lastModifiedDate,
           com.netsuite.webservices.platform.core_2022_2.RecordRef customForm,
           java.util.Calendar tranDate,
           com.netsuite.webservices.platform.core_2022_2.RecordRef postingPeriod,
           java.lang.String tranId,
           com.netsuite.webservices.platform.core_2022_2.RecordRef item,
           java.lang.Double built,
           java.lang.Double quantity,
           com.netsuite.webservices.platform.core_2022_2.RecordRef units,
           java.lang.Double total,
           com.netsuite.webservices.platform.core_2022_2.RecordRef billOfMaterials,
           com.netsuite.webservices.platform.core_2022_2.RecordRef billOfMaterialsRevision,
           java.lang.String serialNumbers,
           com.netsuite.webservices.platform.common_2022_2.InventoryDetail inventoryDetail,
           java.lang.String binNumbers,
           com.netsuite.webservices.platform.core_2022_2.RecordRef subsidiary,
           com.netsuite.webservices.platform.core_2022_2.RecordRef department,
           com.netsuite.webservices.platform.core_2022_2.RecordRef _class,
           com.netsuite.webservices.platform.core_2022_2.RecordRef location,
           java.lang.String memo,
           com.netsuite.webservices.transactions.inventory_2022_2.AssemblyComponentList componentList,
           com.netsuite.webservices.platform.common_2022_2.AccountingBookDetailList accountingBookDetailList,
           com.netsuite.webservices.platform.core_2022_2.CustomFieldList customFieldList) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
        this.customForm = customForm;
        this.tranDate = tranDate;
        this.postingPeriod = postingPeriod;
        this.tranId = tranId;
        this.item = item;
        this.built = built;
        this.quantity = quantity;
        this.units = units;
        this.total = total;
        this.billOfMaterials = billOfMaterials;
        this.billOfMaterialsRevision = billOfMaterialsRevision;
        this.serialNumbers = serialNumbers;
        this.inventoryDetail = inventoryDetail;
        this.binNumbers = binNumbers;
        this.subsidiary = subsidiary;
        this.department = department;
        this._class = _class;
        this.location = location;
        this.memo = memo;
        this.componentList = componentList;
        this.accountingBookDetailList = accountingBookDetailList;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the createdDate value for this AssemblyUnbuild.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this AssemblyUnbuild.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the lastModifiedDate value for this AssemblyUnbuild.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this AssemblyUnbuild.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the customForm value for this AssemblyUnbuild.
     * 
     * @return customForm
     */
    public com.netsuite.webservices.platform.core_2022_2.RecordRef getCustomForm() {
        return customForm;
    }


    /**
     * Sets the customForm value for this AssemblyUnbuild.
     * 
     * @param customForm
     */
    public void setCustomForm(com.netsuite.webservices.platform.core_2022_2.RecordRef customForm) {
        this.customForm = customForm;
    }


    /**
     * Gets the tranDate value for this AssemblyUnbuild.
     * 
     * @return tranDate
     */
    public java.util.Calendar getTranDate() {
        return tranDate;
    }


    /**
     * Sets the tranDate value for this AssemblyUnbuild.
     * 
     * @param tranDate
     */
    public void setTranDate(java.util.Calendar tranDate) {
        this.tranDate = tranDate;
    }


    /**
     * Gets the postingPeriod value for this AssemblyUnbuild.
     * 
     * @return postingPeriod
     */
    public com.netsuite.webservices.platform.core_2022_2.RecordRef getPostingPeriod() {
        return postingPeriod;
    }


    /**
     * Sets the postingPeriod value for this AssemblyUnbuild.
     * 
     * @param postingPeriod
     */
    public void setPostingPeriod(com.netsuite.webservices.platform.core_2022_2.RecordRef postingPeriod) {
        this.postingPeriod = postingPeriod;
    }


    /**
     * Gets the tranId value for this AssemblyUnbuild.
     * 
     * @return tranId
     */
    public java.lang.String getTranId() {
        return tranId;
    }


    /**
     * Sets the tranId value for this AssemblyUnbuild.
     * 
     * @param tranId
     */
    public void setTranId(java.lang.String tranId) {
        this.tranId = tranId;
    }


    /**
     * Gets the item value for this AssemblyUnbuild.
     * 
     * @return item
     */
    public com.netsuite.webservices.platform.core_2022_2.RecordRef getItem() {
        return item;
    }


    /**
     * Sets the item value for this AssemblyUnbuild.
     * 
     * @param item
     */
    public void setItem(com.netsuite.webservices.platform.core_2022_2.RecordRef item) {
        this.item = item;
    }


    /**
     * Gets the built value for this AssemblyUnbuild.
     * 
     * @return built
     */
    public java.lang.Double getBuilt() {
        return built;
    }


    /**
     * Sets the built value for this AssemblyUnbuild.
     * 
     * @param built
     */
    public void setBuilt(java.lang.Double built) {
        this.built = built;
    }


    /**
     * Gets the quantity value for this AssemblyUnbuild.
     * 
     * @return quantity
     */
    public java.lang.Double getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this AssemblyUnbuild.
     * 
     * @param quantity
     */
    public void setQuantity(java.lang.Double quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the units value for this AssemblyUnbuild.
     * 
     * @return units
     */
    public com.netsuite.webservices.platform.core_2022_2.RecordRef getUnits() {
        return units;
    }


    /**
     * Sets the units value for this AssemblyUnbuild.
     * 
     * @param units
     */
    public void setUnits(com.netsuite.webservices.platform.core_2022_2.RecordRef units) {
        this.units = units;
    }


    /**
     * Gets the total value for this AssemblyUnbuild.
     * 
     * @return total
     */
    public java.lang.Double getTotal() {
        return total;
    }


    /**
     * Sets the total value for this AssemblyUnbuild.
     * 
     * @param total
     */
    public void setTotal(java.lang.Double total) {
        this.total = total;
    }


    /**
     * Gets the billOfMaterials value for this AssemblyUnbuild.
     * 
     * @return billOfMaterials
     */
    public com.netsuite.webservices.platform.core_2022_2.RecordRef getBillOfMaterials() {
        return billOfMaterials;
    }


    /**
     * Sets the billOfMaterials value for this AssemblyUnbuild.
     * 
     * @param billOfMaterials
     */
    public void setBillOfMaterials(com.netsuite.webservices.platform.core_2022_2.RecordRef billOfMaterials) {
        this.billOfMaterials = billOfMaterials;
    }


    /**
     * Gets the billOfMaterialsRevision value for this AssemblyUnbuild.
     * 
     * @return billOfMaterialsRevision
     */
    public com.netsuite.webservices.platform.core_2022_2.RecordRef getBillOfMaterialsRevision() {
        return billOfMaterialsRevision;
    }


    /**
     * Sets the billOfMaterialsRevision value for this AssemblyUnbuild.
     * 
     * @param billOfMaterialsRevision
     */
    public void setBillOfMaterialsRevision(com.netsuite.webservices.platform.core_2022_2.RecordRef billOfMaterialsRevision) {
        this.billOfMaterialsRevision = billOfMaterialsRevision;
    }


    /**
     * Gets the serialNumbers value for this AssemblyUnbuild.
     * 
     * @return serialNumbers
     */
    public java.lang.String getSerialNumbers() {
        return serialNumbers;
    }


    /**
     * Sets the serialNumbers value for this AssemblyUnbuild.
     * 
     * @param serialNumbers
     */
    public void setSerialNumbers(java.lang.String serialNumbers) {
        this.serialNumbers = serialNumbers;
    }


    /**
     * Gets the inventoryDetail value for this AssemblyUnbuild.
     * 
     * @return inventoryDetail
     */
    public com.netsuite.webservices.platform.common_2022_2.InventoryDetail getInventoryDetail() {
        return inventoryDetail;
    }


    /**
     * Sets the inventoryDetail value for this AssemblyUnbuild.
     * 
     * @param inventoryDetail
     */
    public void setInventoryDetail(com.netsuite.webservices.platform.common_2022_2.InventoryDetail inventoryDetail) {
        this.inventoryDetail = inventoryDetail;
    }


    /**
     * Gets the binNumbers value for this AssemblyUnbuild.
     * 
     * @return binNumbers
     */
    public java.lang.String getBinNumbers() {
        return binNumbers;
    }


    /**
     * Sets the binNumbers value for this AssemblyUnbuild.
     * 
     * @param binNumbers
     */
    public void setBinNumbers(java.lang.String binNumbers) {
        this.binNumbers = binNumbers;
    }


    /**
     * Gets the subsidiary value for this AssemblyUnbuild.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2022_2.RecordRef getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this AssemblyUnbuild.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(com.netsuite.webservices.platform.core_2022_2.RecordRef subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the department value for this AssemblyUnbuild.
     * 
     * @return department
     */
    public com.netsuite.webservices.platform.core_2022_2.RecordRef getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this AssemblyUnbuild.
     * 
     * @param department
     */
    public void setDepartment(com.netsuite.webservices.platform.core_2022_2.RecordRef department) {
        this.department = department;
    }


    /**
     * Gets the _class value for this AssemblyUnbuild.
     * 
     * @return _class
     */
    public com.netsuite.webservices.platform.core_2022_2.RecordRef get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this AssemblyUnbuild.
     * 
     * @param _class
     */
    public void set_class(com.netsuite.webservices.platform.core_2022_2.RecordRef _class) {
        this._class = _class;
    }


    /**
     * Gets the location value for this AssemblyUnbuild.
     * 
     * @return location
     */
    public com.netsuite.webservices.platform.core_2022_2.RecordRef getLocation() {
        return location;
    }


    /**
     * Sets the location value for this AssemblyUnbuild.
     * 
     * @param location
     */
    public void setLocation(com.netsuite.webservices.platform.core_2022_2.RecordRef location) {
        this.location = location;
    }


    /**
     * Gets the memo value for this AssemblyUnbuild.
     * 
     * @return memo
     */
    public java.lang.String getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this AssemblyUnbuild.
     * 
     * @param memo
     */
    public void setMemo(java.lang.String memo) {
        this.memo = memo;
    }


    /**
     * Gets the componentList value for this AssemblyUnbuild.
     * 
     * @return componentList
     */
    public com.netsuite.webservices.transactions.inventory_2022_2.AssemblyComponentList getComponentList() {
        return componentList;
    }


    /**
     * Sets the componentList value for this AssemblyUnbuild.
     * 
     * @param componentList
     */
    public void setComponentList(com.netsuite.webservices.transactions.inventory_2022_2.AssemblyComponentList componentList) {
        this.componentList = componentList;
    }


    /**
     * Gets the accountingBookDetailList value for this AssemblyUnbuild.
     * 
     * @return accountingBookDetailList
     */
    public com.netsuite.webservices.platform.common_2022_2.AccountingBookDetailList getAccountingBookDetailList() {
        return accountingBookDetailList;
    }


    /**
     * Sets the accountingBookDetailList value for this AssemblyUnbuild.
     * 
     * @param accountingBookDetailList
     */
    public void setAccountingBookDetailList(com.netsuite.webservices.platform.common_2022_2.AccountingBookDetailList accountingBookDetailList) {
        this.accountingBookDetailList = accountingBookDetailList;
    }


    /**
     * Gets the customFieldList value for this AssemblyUnbuild.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2022_2.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this AssemblyUnbuild.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2022_2.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the internalId value for this AssemblyUnbuild.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this AssemblyUnbuild.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this AssemblyUnbuild.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this AssemblyUnbuild.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AssemblyUnbuild)) return false;
        AssemblyUnbuild other = (AssemblyUnbuild) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.customForm==null && other.getCustomForm()==null) || 
             (this.customForm!=null &&
              this.customForm.equals(other.getCustomForm()))) &&
            ((this.tranDate==null && other.getTranDate()==null) || 
             (this.tranDate!=null &&
              this.tranDate.equals(other.getTranDate()))) &&
            ((this.postingPeriod==null && other.getPostingPeriod()==null) || 
             (this.postingPeriod!=null &&
              this.postingPeriod.equals(other.getPostingPeriod()))) &&
            ((this.tranId==null && other.getTranId()==null) || 
             (this.tranId!=null &&
              this.tranId.equals(other.getTranId()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem()))) &&
            ((this.built==null && other.getBuilt()==null) || 
             (this.built!=null &&
              this.built.equals(other.getBuilt()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.units==null && other.getUnits()==null) || 
             (this.units!=null &&
              this.units.equals(other.getUnits()))) &&
            ((this.total==null && other.getTotal()==null) || 
             (this.total!=null &&
              this.total.equals(other.getTotal()))) &&
            ((this.billOfMaterials==null && other.getBillOfMaterials()==null) || 
             (this.billOfMaterials!=null &&
              this.billOfMaterials.equals(other.getBillOfMaterials()))) &&
            ((this.billOfMaterialsRevision==null && other.getBillOfMaterialsRevision()==null) || 
             (this.billOfMaterialsRevision!=null &&
              this.billOfMaterialsRevision.equals(other.getBillOfMaterialsRevision()))) &&
            ((this.serialNumbers==null && other.getSerialNumbers()==null) || 
             (this.serialNumbers!=null &&
              this.serialNumbers.equals(other.getSerialNumbers()))) &&
            ((this.inventoryDetail==null && other.getInventoryDetail()==null) || 
             (this.inventoryDetail!=null &&
              this.inventoryDetail.equals(other.getInventoryDetail()))) &&
            ((this.binNumbers==null && other.getBinNumbers()==null) || 
             (this.binNumbers!=null &&
              this.binNumbers.equals(other.getBinNumbers()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              this.subsidiary.equals(other.getSubsidiary()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              this._class.equals(other.get_class()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.memo==null && other.getMemo()==null) || 
             (this.memo!=null &&
              this.memo.equals(other.getMemo()))) &&
            ((this.componentList==null && other.getComponentList()==null) || 
             (this.componentList!=null &&
              this.componentList.equals(other.getComponentList()))) &&
            ((this.accountingBookDetailList==null && other.getAccountingBookDetailList()==null) || 
             (this.accountingBookDetailList!=null &&
              this.accountingBookDetailList.equals(other.getAccountingBookDetailList()))) &&
            ((this.customFieldList==null && other.getCustomFieldList()==null) || 
             (this.customFieldList!=null &&
              this.customFieldList.equals(other.getCustomFieldList()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getCustomForm() != null) {
            _hashCode += getCustomForm().hashCode();
        }
        if (getTranDate() != null) {
            _hashCode += getTranDate().hashCode();
        }
        if (getPostingPeriod() != null) {
            _hashCode += getPostingPeriod().hashCode();
        }
        if (getTranId() != null) {
            _hashCode += getTranId().hashCode();
        }
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        if (getBuilt() != null) {
            _hashCode += getBuilt().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getUnits() != null) {
            _hashCode += getUnits().hashCode();
        }
        if (getTotal() != null) {
            _hashCode += getTotal().hashCode();
        }
        if (getBillOfMaterials() != null) {
            _hashCode += getBillOfMaterials().hashCode();
        }
        if (getBillOfMaterialsRevision() != null) {
            _hashCode += getBillOfMaterialsRevision().hashCode();
        }
        if (getSerialNumbers() != null) {
            _hashCode += getSerialNumbers().hashCode();
        }
        if (getInventoryDetail() != null) {
            _hashCode += getInventoryDetail().hashCode();
        }
        if (getBinNumbers() != null) {
            _hashCode += getBinNumbers().hashCode();
        }
        if (getSubsidiary() != null) {
            _hashCode += getSubsidiary().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (get_class() != null) {
            _hashCode += get_class().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getMemo() != null) {
            _hashCode += getMemo().hashCode();
        }
        if (getComponentList() != null) {
            _hashCode += getComponentList().hashCode();
        }
        if (getAccountingBookDetailList() != null) {
            _hashCode += getAccountingBookDetailList().hashCode();
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AssemblyUnbuild.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:inventory_2022_2.transactions.webservices.netsuite.com", "AssemblyUnbuild"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("internalId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "internalId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("externalId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "externalId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2022_2.transactions.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2022_2.transactions.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customForm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2022_2.transactions.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2022_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2022_2.transactions.webservices.netsuite.com", "tranDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postingPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2022_2.transactions.webservices.netsuite.com", "postingPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2022_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2022_2.transactions.webservices.netsuite.com", "tranId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2022_2.transactions.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2022_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("built");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2022_2.transactions.webservices.netsuite.com", "built"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2022_2.transactions.webservices.netsuite.com", "quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("units");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2022_2.transactions.webservices.netsuite.com", "units"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2022_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2022_2.transactions.webservices.netsuite.com", "total"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billOfMaterials");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2022_2.transactions.webservices.netsuite.com", "billOfMaterials"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2022_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billOfMaterialsRevision");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2022_2.transactions.webservices.netsuite.com", "billOfMaterialsRevision"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2022_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2022_2.transactions.webservices.netsuite.com", "serialNumbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inventoryDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2022_2.transactions.webservices.netsuite.com", "inventoryDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2022_2.platform.webservices.netsuite.com", "InventoryDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("binNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2022_2.transactions.webservices.netsuite.com", "binNumbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2022_2.transactions.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2022_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2022_2.transactions.webservices.netsuite.com", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2022_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2022_2.transactions.webservices.netsuite.com", "class"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2022_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2022_2.transactions.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2022_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2022_2.transactions.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("componentList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2022_2.transactions.webservices.netsuite.com", "componentList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:inventory_2022_2.transactions.webservices.netsuite.com", "AssemblyComponentList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountingBookDetailList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2022_2.transactions.webservices.netsuite.com", "accountingBookDetailList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2022_2.platform.webservices.netsuite.com", "AccountingBookDetailList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2022_2.transactions.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2022_2.platform.webservices.netsuite.com", "CustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
