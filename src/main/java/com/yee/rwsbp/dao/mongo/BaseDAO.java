package com.yee.rwsbp.dao.mongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

/**
 * Author: RogerYee
 */
public abstract class BaseDAO<T>
{
    private MongoTemplate mongoTemplate;

    public abstract Class<T> getEntityClass();

    public abstract String getCollectionName();

    public MongoTemplate getMongoTemplate()
    {
        return mongoTemplate;
    }

    public void setMongoTemplate(MongoTemplate mongoTemplate)
    {
        this.mongoTemplate = mongoTemplate;
    }
}
