package com.example.kel2ptb;

public class DataClassPraktikan {

    private String dataName;
    private String dataKelas;
    private String dataNim;
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

    public String getDataKelas() {
        return dataKelas;
    }

    public String getDataNim() {
        return dataNim;
    }


    public String getDataImage() {
        return dataImage;
    }

    public DataClassPraktikan(String dataName,String dataKelas, String dataNim, String dataImage) {
        this.dataName = dataName;
        this.dataKelas = dataKelas;
        this.dataNim = dataNim;
        this.dataImage = dataImage;
    }

    public DataClassPraktikan() {

    }
}
