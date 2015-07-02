package com.yee.rwsbp.dao;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: RogerYee
 * Date: 6/29/15
 * Time: 14:29
 * To change this template use File | Settings | File Templates.
 */
public interface IAccountDAO<T>
{
    List<T> findAllAccounts();

    T findByName(String name);

    void save(T t);
}
