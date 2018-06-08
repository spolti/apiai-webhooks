package br.com.spolti.persistence;

import java.io.Serializable;

public class WriteObject implements Serializable {

    private String id;
    private String value;

    public WriteObject(String id, String value) {
        this.id = id;
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "{" +
                "id='" + id + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
