package com.yee.rwsbp.controller;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import org.glassfish.jersey.server.ResourceConfig;

import javax.json.stream.JsonGenerator;

/**
 * Author: RogerYee
 */
public class ControllersConfiguration extends ResourceConfig
{
    public ControllersConfiguration()
    {
        // 加载Resource
        register(AccountController.class);

        // JSON Support
        register(JacksonJsonProvider.class);// For Jackson
        property(JsonGenerator.PRETTY_PRINTING, true);// For JSON-Processing
    }
}
