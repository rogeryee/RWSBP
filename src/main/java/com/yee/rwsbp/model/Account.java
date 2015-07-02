package com.yee.rwsbp.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

/**
 * Author: RogerYee
 */
public class Account extends BaseModel
{
    private String name;
    private String password;

    @Field("is_locked")
    private Boolean isLocked;

    private Address[] addresses;


    @Override
    public String toString()
    {
        return "Account: id = " + getId() + ", name = " + getName() + ", password = " + getPassword() + ", isLocked = " + getLocked();
    }

    // Setters and Getters
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public Boolean getLocked()
    {
        return isLocked;
    }

    public void setLocked(Boolean locked)
    {
        isLocked = locked;
    }

    public Address[] getAddresses()
    {
        return addresses;
    }

    public void setAddresses(Address[] addresses)
    {
        this.addresses = addresses;
    }
}
