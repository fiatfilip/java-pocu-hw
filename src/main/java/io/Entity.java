package io;

import java.io.Serializable;

public class Entity implements Serializable {
    public static final long serialVersionUID = 6562679617599437617l;
    public static String some;
    private String name;
    private transient Integer size;

    public Entity(String name, Integer size){
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public Integer getSize() {
        return size;
    }
}
