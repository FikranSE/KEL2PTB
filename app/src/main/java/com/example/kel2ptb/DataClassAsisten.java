package com.example.kel2ptb;

public class DataClassAsisten {

    private String dataName;
    private String dataDesc;
    private String dataImage;
    private String key;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getDataName() {
        return dataName;
    }

    public String getDataDesc() {
        return dataDesc;
    }


    public String getDataImage() {
        return dataImage;
    }

    public DataClassAsisten(String dataName, String dataDesc, String dataImage) {
        this.dataName = dataName;
        this.dataDesc = dataDesc;
        this.dataImage = dataImage;
    }

    public DataClassAsisten() {

    }
}
