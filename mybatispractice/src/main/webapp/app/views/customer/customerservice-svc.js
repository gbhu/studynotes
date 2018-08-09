/**
 * Created by pulem3t on 06.03.16.
 */
'use strict';
App.factory('CustomerSvcService', ['$resource', function ($resource) {
    return $resource("", {}, {
        create: {
            method: 'POST',
            responseType: 'json',
            url: 'CustomerServiceExt/insert',
            cache: false,
            isArray: false
        },
        update: {
            method: 'POST',
            responseType: 'json',
            url: 'CustomerServiceExt/customer/edit',
            cache: false,
            isArray: false
        },
        query: {
            method: 'GET',
            responseType: 'json',
            url: 'CustomerServiceExt/customer/query',
            cache: false,
            isArray: false
        },
        queryCustomerNameList: {
            method: 'GET',
            responseType: 'json',
            url: 'CustomerServiceExt/customer/queryNameList',
            cache: false,
            isArray: false
        },
        list: {
            method: 'GET',
            responseType: 'json',
            url: 'CustomerServiceExt/customer/listByHql',
            cache: false,
            isArray: false
        },
        customerUpdateApplyList: {
            method: 'GET',
            responseType: 'json',
            url: 'CustomerServiceExt/CustomerUpdateApply/list',
            cache: false,
            isArray: false
        },
        customerListForRaiseOrder: {
            method: 'GET',
            responseType: 'json',
            url: 'CustomerServiceExt/customer/listv1',
            cache: false,
            isArray: false
        },
        customerListForAssign: {
            method: 'GET',
            responseType: 'json',
            url: 'CustomerServiceExt/customerAssign/list',
            cache: false,
            isArray: false
        },
        customerAssignList: {
            method: 'GET',
            responseType: 'json',
            url: 'CustomerServiceExt/customerAssignList/list',
            cache: false,
            isArray: false
        },
        customerFollowListByCustomerId: {
            method: 'GET',
            responseType: 'json',
            url: 'CustomerServiceExt/customerFollow/list/byCustomerId',
            cache: false,
            isArray: false
        },
        customerFollowAdd: {
            method: 'POST',
            responseType: 'json',
            url: 'CustomerServiceExt/customerFollow/add',
            cache: false,
            isArray: false
        },
        customerAssignAdd: {
            method: 'GET',
            responseType: 'json',
            url: 'CustomerServiceExt/customerAssign/add',
            cache: false,
            isArray: false
        },
        customerUpdateApplyAdd: {
            method: 'POST',
            responseType: 'json',
            url: 'CustomerServiceExt/CustomerUpdateApply/insert',
            cache: false,
            isArray: false
        },
        customerUpdateApplyUpdate: {
            method: 'POST',
            responseType: 'json',
            url: 'CustomerServiceExt/CustomerUpdateApply/update',
            cache: false,
            isArray: false
        },
        delectCustomerUpdateApply: {
            method: 'POST',
            responseType: 'json',
            url: 'CustomerServiceExt/CustomerUpdateApply/delect',
            cache: false,
            isArray: false
        },
        customerUpdateApplyUpdateState: {
            method: 'POST',
            responseType: 'json',
            url: 'CustomerServiceExt/CustomerUpdateApplyState/update',
            cache: false,
            isArray: false
        },
        checkNumber: {//电话号码/证件号码校验
            method: 'GET',
            responseType: 'json',
            url: 'CustomerServiceExt/customer/check',
            cache: false,
            isArray: false
        },
        checkCustomerUpdateApplyNumber: {//客户信息修改申请单电话号码校验
            method: 'GET',
            responseType: 'json',
            url: 'CustomerServiceExt/CustomerUpdateApply/check',
            cache: false,
            isArray: false
        },
        checkCustomerReceiptState: {//检验客户收款状态
            method: 'GET',
            responseType: 'json',
            url: 'ReceiptSvcExt/interface/receipts/list',
            cache: false,
            isArray: true
        },
        checkCustomerUpdateApplySatus: {//检验客户信息修改申请单审批状态
            method: 'GET',
            responseType: 'json',
            url: 'CustomerServiceExt/CustomerUpdateApply/checkApprovalSatus',
            cache: false,
            isArray: false
        },
        queryCustomerUpdateApply: {
            method: 'GET',
            responseType: 'json',
            url: 'CustomerServiceExt/CustomerUpdateApply/query',
            cache: false,
            isArray: false
        },
        insertQrCode: {
            method: 'GET',
            responseType: 'json',
            url: 'QrCodeSvcExt/QrCode/generate',
            cache: false,
            isArray: false
        },
        updateConsultant: {
            method: 'POST',
            responseType: 'json',
            url: 'CustomerServiceExt/updateSalesMan',
            cache: false,
            isArray: false
        }
    });
}]);







