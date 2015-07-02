package com.yee.rwsbp.model;

import org.springframework.data.mongodb.core.mapping.Field;

/**
 * Author: RogerYee
 */
public class Address
{
    private String detailed;

    @Field("zip_code")
    private String zipCode;

    @Override
    public String toString()
    {
        return "Address: " + getDetailed() + ", zip code is " + getZipCode();
    }

    // Getters and Setters
    public String getDetailed()
    {
        return detailed;
    }

    public void setDetailed(String detailed)
    {
        this.detailed = detailed;
    }

    public String getZipCode()
    {
        return zipCode;
    }

    public void setZipCode(String zipCode)
    {
        this.zipCode = zipCode;
    }
}
