package com.yee.rwsbp.dao.mongo;

import com.yee.rwsbp.dao.IAccountDAO;
import com.yee.rwsbp.model.Account;
import org.springframework.data.mongodb.core.query.Query;
import static org.springframework.data.mongodb.core.query.Criteria.where;

import java.util.List;

/**
 * Author: RogerYee
 */
public class AccountDAOImpl extends BaseDAO<Account> implements IAccountDAO<Account>
{

    @Override
    public List findAllAccounts()
    {
        return getMongoTemplate().findAll(getEntityClass(), getCollectionName());
    }

    @Override
    public Account findByName(String name)
    {
        return getMongoTemplate().findOne(Query.query(where("name").is(name)), getEntityClass(), getCollectionName());
    }

    @Override
    public void save(Account account)
    {
        getMongoTemplate().save(account, getCollectionName());
    }

    @Override
    public Class<Account> getEntityClass()
    {
        return Account.class;
    }

    @Override
    public String getCollectionName()
    {
        return "account";
    }
}
