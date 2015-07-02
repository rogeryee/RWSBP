package com.yee.rwsbp.test;

/**
 * Author: RogerYee
 */
public class Test
{
    public static void main(String [] args)
    {
        B b = new B("123","Roger");
        System.out.println("id = " + b.getId() + ", name = " + b.getName());
    }
}

class A
{
    private String id;

    String getId()
    {
        return id;
    }

    void setId(String id)
    {
        this.id = id;
    }
}

class B extends A
{
    private String name;

    public B(String id, String name)
    {
        super();
        setId(id);
        setName(name);
    }

    String getName()
    {
        return name;
    }

    void setName(String name)
    {
        this.name = name;
    }
}
