package com.yee.rwsbp.controller;

import com.yee.rwsbp.model.Account;
import com.yee.rwsbp.model.EntityResponse;
import com.yee.rwsbp.service.IAccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Component
@Path("account")
public class AccountController
{
    static final Logger logger = LoggerFactory.getLogger(AccountController.class);

    private IAccountService accountService;

    @GET
    @Path("{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public EntityResponse<Account> getAccountByName(@PathParam("name") String name)
    {
        Account acct = this.accountService.getAccount(name);
        return new EntityResponse<Account>(acct);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public EntityResponse<Account> createAccount(Account acct)
    {
        this.accountService.createAccount(acct);
        return new EntityResponse<Account>(acct);
    }

    // Getter and Setters
    public IAccountService getAccountService()
    {
        return accountService;
    }

    public void setAccountService(IAccountService accountService)
    {
        this.accountService = accountService;
    }
}
