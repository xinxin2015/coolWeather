package com.coolweather.android.db;


import org.litepal.crud.DataSupport;

/**
 * Created by admin on 2017/5/18.
 */

public class Province extends DataSupport{
    //集成DataSupport类
    private int id;//每个实体类应有的字段
    private String provinceName;//记录省的名字
    private int provinceCode;//记录省的代号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
