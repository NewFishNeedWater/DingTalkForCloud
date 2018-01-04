package com.sap.dingtalk.serviceImpl;


import com.sap.dingtalk.model.AccountGroup;
import com.sap.dingtalk.model.AccountGroupRepository;
import com.sap.dingtalk.service.AccountGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountGroupServiceBean implements AccountGroupService{

    @Autowired
    AccountGroupRepository accountGroupRepository;


    @Override
    public void save(AccountGroup accountGroup){

        accountGroupRepository.save(accountGroup);

    }

}