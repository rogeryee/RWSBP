package com.yee.rwsbp.model;

/**
 * Author: RogerYee
 */
public class EntityResponse<T>
{
    private T entity;

    public EntityResponse(T entity)
    {
        this.entity = entity;
    }

    public T getEntity()
    {
        return entity;
    }
}
