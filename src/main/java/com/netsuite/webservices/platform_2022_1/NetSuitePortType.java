/**
 * NetSuitePortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform_2022_1;

public interface NetSuitePortType extends java.rmi.Remote {
    public com.netsuite.webservices.platform.messages_2022_1.SessionResponse changePassword(com.netsuite.webservices.platform.core_2022_1.ChangePassword changePassword) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2022_1.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2022_1.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2022_1.InvalidAccountFault, com.netsuite.webservices.platform.faults_2022_1.InvalidVersionFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2022_1.InvalidSessionFault;
    public com.netsuite.webservices.platform.messages_2022_1.SessionResponse changeEmail(com.netsuite.webservices.platform.core_2022_1.ChangeEmail changeEmail) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2022_1.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2022_1.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2022_1.InvalidAccountFault, com.netsuite.webservices.platform.faults_2022_1.InvalidVersionFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2022_1.InvalidSessionFault;
    public com.netsuite.webservices.platform.messages_2022_1.WriteResponse add(com.netsuite.webservices.platform.core_2022_1.Record record) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2022_1.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2022_1.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2022_1.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2022_1.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2022_1.InvalidSessionFault;
    public com.netsuite.webservices.platform.messages_2022_1.WriteResponse delete(com.netsuite.webservices.platform.core_2022_1.BaseRef baseRef, com.netsuite.webservices.platform.core_2022_1.DeletionReason deletionReason) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2022_1.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2022_1.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2022_1.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2022_1.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2022_1.InvalidSessionFault;
    public com.netsuite.webservices.platform.core_2022_1.SearchResult search(com.netsuite.webservices.platform.core_2022_1.SearchRecord searchRecord) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2022_1.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2022_1.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2022_1.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2022_1.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2022_1.InvalidSessionFault;
    public com.netsuite.webservices.platform.core_2022_1.SearchResult searchMoreWithId(java.lang.String searchId, int pageIndex) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2022_1.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2022_1.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2022_1.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2022_1.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2022_1.InvalidSessionFault;
    public com.netsuite.webservices.platform.messages_2022_1.WriteResponse update(com.netsuite.webservices.platform.core_2022_1.Record record) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2022_1.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2022_1.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2022_1.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2022_1.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2022_1.InvalidSessionFault;
    public com.netsuite.webservices.platform.messages_2022_1.WriteResponse upsert(com.netsuite.webservices.platform.core_2022_1.Record record) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2022_1.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2022_1.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2022_1.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2022_1.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2022_1.InvalidSessionFault;
    public com.netsuite.webservices.platform.messages_2022_1.WriteResponseList addList(com.netsuite.webservices.platform.core_2022_1.Record[] record) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2022_1.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2022_1.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2022_1.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2022_1.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2022_1.InvalidSessionFault;
    public com.netsuite.webservices.platform.messages_2022_1.WriteResponseList deleteList(com.netsuite.webservices.platform.core_2022_1.BaseRef[] baseRef, com.netsuite.webservices.platform.core_2022_1.DeletionReason deletionReason) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2022_1.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2022_1.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2022_1.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2022_1.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2022_1.InvalidSessionFault;
    public com.netsuite.webservices.platform.messages_2022_1.WriteResponseList updateList(com.netsuite.webservices.platform.core_2022_1.Record[] record) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2022_1.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2022_1.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2022_1.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2022_1.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2022_1.InvalidSessionFault;
    public com.netsuite.webservices.platform.messages_2022_1.WriteResponseList upsertList(com.netsuite.webservices.platform.core_2022_1.Record[] record) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2022_1.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2022_1.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2022_1.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2022_1.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2022_1.InvalidSessionFault;
    public com.netsuite.webservices.platform.messages_2022_1.ReadResponse get(com.netsuite.webservices.platform.core_2022_1.BaseRef baseRef) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2022_1.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2022_1.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2022_1.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2022_1.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2022_1.InvalidSessionFault;
    public com.netsuite.webservices.platform.messages_2022_1.ReadResponseList getList(com.netsuite.webservices.platform.core_2022_1.BaseRef[] baseRef) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2022_1.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2022_1.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2022_1.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2022_1.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2022_1.InvalidSessionFault;
    public com.netsuite.webservices.platform.core_2022_1.GetAllResult getAll(com.netsuite.webservices.platform.core_2022_1.GetAllRecord record) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2022_1.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2022_1.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2022_1.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2022_1.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2022_1.InvalidSessionFault;
    public com.netsuite.webservices.platform.core_2022_1.GetSavedSearchResult getSavedSearch(com.netsuite.webservices.platform.core_2022_1.GetSavedSearchRecord record) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2022_1.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2022_1.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2022_1.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2022_1.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2022_1.InvalidSessionFault;
    public com.netsuite.webservices.platform.core_2022_1.GetCustomizationIdResult getCustomizationId(com.netsuite.webservices.platform.core_2022_1.CustomizationType customizationType, boolean includeInactives) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2022_1.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2022_1.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2022_1.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2022_1.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2022_1.InvalidSessionFault;
    public com.netsuite.webservices.platform.messages_2022_1.ReadResponse initialize(com.netsuite.webservices.platform.core_2022_1.InitializeRecord initializeRecord) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2022_1.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2022_1.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2022_1.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2022_1.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2022_1.InvalidSessionFault;
    public com.netsuite.webservices.platform.messages_2022_1.ReadResponseList initializeList(com.netsuite.webservices.platform.core_2022_1.InitializeRecord[] initializeRecord) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2022_1.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2022_1.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2022_1.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2022_1.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2022_1.InvalidSessionFault;
    public com.netsuite.webservices.platform.core_2022_1.GetSelectValueResult getSelectValue(com.netsuite.webservices.platform.core_2022_1.GetSelectValueFieldDescription fieldDescription, int pageIndex) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2022_1.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2022_1.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2022_1.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2022_1.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2022_1.InvalidSessionFault;
    public com.netsuite.webservices.platform.core_2022_1.GetItemAvailabilityResult getItemAvailability(com.netsuite.webservices.platform.core_2022_1.ItemAvailabilityFilter itemAvailabilityFilter) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2022_1.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2022_1.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2022_1.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2022_1.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2022_1.InvalidSessionFault;
    public com.netsuite.webservices.platform.core_2022_1.GetBudgetExchangeRateResult getBudgetExchangeRate(com.netsuite.webservices.platform.core_2022_1.BudgetExchangeRateFilter budgetExchangeRateFilter) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2022_1.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2022_1.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2022_1.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2022_1.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2022_1.InvalidSessionFault;
    public com.netsuite.webservices.platform.core_2022_1.GetCurrencyRateResult getCurrencyRate(com.netsuite.webservices.platform.core_2022_1.CurrencyRateFilter currencyRateFilter) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2022_1.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2022_1.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2022_1.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2022_1.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2022_1.InvalidSessionFault;
    public com.netsuite.webservices.platform.core_2022_1.GetDataCenterUrlsResult getDataCenterUrls(java.lang.String account) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2022_1.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2022_1.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2022_1.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2022_1.InvalidSessionFault;
    public com.netsuite.webservices.platform.core_2022_1.GetPostingTransactionSummaryResult getPostingTransactionSummary(com.netsuite.webservices.platform.core_2022_1.PostingTransactionSummaryField fields, com.netsuite.webservices.platform.core_2022_1.PostingTransactionSummaryFilter filters, int pageIndex, java.lang.String operationId) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2022_1.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2022_1.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2022_1.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2022_1.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2022_1.InvalidSessionFault;
    public com.netsuite.webservices.platform.core_2022_1.GetServerTimeResult getServerTime() throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2022_1.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2022_1.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2022_1.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2022_1.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2022_1.InvalidSessionFault;
    public com.netsuite.webservices.platform.messages_2022_1.WriteResponse attach(com.netsuite.webservices.platform.core_2022_1.AttachReference attachReference) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2022_1.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2022_1.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2022_1.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2022_1.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2022_1.InvalidSessionFault;
    public com.netsuite.webservices.platform.messages_2022_1.WriteResponse detach(com.netsuite.webservices.platform.core_2022_1.DetachReference detachReference) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2022_1.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2022_1.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2022_1.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2022_1.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2022_1.InvalidSessionFault;
    public com.netsuite.webservices.platform.messages_2022_1.WriteResponse updateInviteeStatus(com.netsuite.webservices.platform.core_2022_1.UpdateInviteeStatusReference updateInviteeStatusReference) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2022_1.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2022_1.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2022_1.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2022_1.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2022_1.InvalidSessionFault;
    public com.netsuite.webservices.platform.messages_2022_1.WriteResponseList updateInviteeStatusList(com.netsuite.webservices.platform.core_2022_1.UpdateInviteeStatusReference[] updateInviteeStatusReference) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2022_1.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2022_1.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2022_1.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2022_1.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2022_1.InvalidSessionFault;
    public com.netsuite.webservices.platform.core_2022_1.AsyncStatusResult asyncAddList(com.netsuite.webservices.platform.core_2022_1.Record[] record) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2022_1.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2022_1.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2022_1.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2022_1.InvalidSessionFault;
    public com.netsuite.webservices.platform.core_2022_1.AsyncStatusResult asyncUpdateList(com.netsuite.webservices.platform.core_2022_1.Record[] record) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2022_1.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2022_1.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2022_1.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2022_1.InvalidSessionFault;
    public com.netsuite.webservices.platform.core_2022_1.AsyncStatusResult asyncUpsertList(com.netsuite.webservices.platform.core_2022_1.Record[] record) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2022_1.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2022_1.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2022_1.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2022_1.InvalidSessionFault;
    public com.netsuite.webservices.platform.core_2022_1.AsyncStatusResult asyncDeleteList(com.netsuite.webservices.platform.core_2022_1.BaseRef[] baseRef, com.netsuite.webservices.platform.core_2022_1.DeletionReason deletionReason) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2022_1.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2022_1.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2022_1.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2022_1.InvalidSessionFault;
    public com.netsuite.webservices.platform.core_2022_1.AsyncStatusResult asyncGetList(com.netsuite.webservices.platform.core_2022_1.BaseRef[] baseRef) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2022_1.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2022_1.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2022_1.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2022_1.InvalidSessionFault;
    public com.netsuite.webservices.platform.core_2022_1.AsyncStatusResult asyncInitializeList(com.netsuite.webservices.platform.core_2022_1.InitializeRecord[] initializeRecord) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2022_1.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2022_1.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2022_1.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2022_1.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2022_1.InvalidSessionFault;
    public com.netsuite.webservices.platform.core_2022_1.AsyncStatusResult asyncSearch(com.netsuite.webservices.platform.core_2022_1.SearchRecord searchRecord) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2022_1.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2022_1.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2022_1.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2022_1.InvalidSessionFault;
    public com.netsuite.webservices.platform.messages_2022_1.AsyncResult getAsyncResult(java.lang.String jobId, int pageIndex) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2022_1.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2022_1.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2022_1.AsyncFault, com.netsuite.webservices.platform.faults_2022_1.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2022_1.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2022_1.InvalidSessionFault;
    public com.netsuite.webservices.platform.core_2022_1.AsyncStatusResult checkAsyncStatus(java.lang.String jobId) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2022_1.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2022_1.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2022_1.AsyncFault, com.netsuite.webservices.platform.faults_2022_1.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2022_1.InvalidSessionFault;
    public com.netsuite.webservices.platform.core_2022_1.GetDeletedResult getDeleted(com.netsuite.webservices.platform.core_2022_1.GetDeletedFilter getDeletedFilter, int pageIndex) throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2022_1.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2022_1.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2022_1.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRecordCountFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestSizeFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2022_1.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2022_1.InvalidSessionFault;
    public com.netsuite.webservices.platform.core_2022_1.GetAccountGovernanceInfoResult getAccountGovernanceInfo() throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2022_1.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2022_1.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2022_1.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2022_1.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2022_1.InvalidSessionFault;
    public com.netsuite.webservices.platform.core_2022_1.GetIntegrationGovernanceInfoResult getIntegrationGovernanceInfo() throws java.rmi.RemoteException, com.netsuite.webservices.platform.faults_2022_1.InsufficientPermissionFault, com.netsuite.webservices.platform.faults_2022_1.InvalidCredentialsFault, com.netsuite.webservices.platform.faults_2022_1.ExceededConcurrentRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededRequestLimitFault, com.netsuite.webservices.platform.faults_2022_1.ExceededUsageLimitFault, com.netsuite.webservices.platform.faults_2022_1.UnexpectedErrorFault, com.netsuite.webservices.platform.faults_2022_1.InvalidSessionFault;
}
