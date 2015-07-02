package com.yee.rwsbp.model;

import org.springframework.data.annotation.Id;

/**
 * Author: RogerYee
 */
public abstract class BaseModel
{
    @Id
    private String id;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }
}
