package com.sup.practice.prototype;

import javax.management.remote.SubjectDelegationPermission;

/**
 * Created by ACER on 08-02-2017.
 */
public abstract class Shape implements Cloneable{
    private String id;
    protected String type;

    abstract void draw();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object clone(){
        Object clone = null;
        try {
            clone = super.clone();
        }catch (CloneNotSupportedException exception){
            exception.printStackTrace();
        }
        return clone;
    }
}
