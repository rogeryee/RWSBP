package com.yee.rwsbp.service.impl;

import com.yee.rwsbp.dao.IAccountDAO;
import com.yee.rwsbp.model.Account;
import com.yee.rwsbp.model.Address;
import com.yee.rwsbp.service.IAccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Author: RogerYee
 */
public class AccountServiceImpl implements IAccountService
{
    static final Logger logger = LoggerFactory.getLogger(AccountServiceImpl.class);
    private IAccountDAO<Account> accountDAO;

    @Override
    public Account getAccount(String name)
    {
        Account account = this.accountDAO.findByName(name);
        logger.debug("account is {}", account);

        return account;
    }

    @Override
    public void createAccount(Account account)
    {
        this.accountDAO.save(account);

        logger.debug("after save: acct is " + account.toString());
    }

    // Getters and Setters
    public IAccountDAO<Account> getAccountDAO()
    {
        return accountDAO;
    }

    public void setAccountDAO(IAccountDAO<Account> accountDAO)
    {
        this.accountDAO = accountDAO;
    }
}
