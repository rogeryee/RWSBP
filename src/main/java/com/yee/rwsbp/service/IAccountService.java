package com.yee.rwsbp.service;

import com.yee.rwsbp.model.Account;

public interface IAccountService
{
    public Account getAccount(String name);

    public void createAccount(Account account);
}
