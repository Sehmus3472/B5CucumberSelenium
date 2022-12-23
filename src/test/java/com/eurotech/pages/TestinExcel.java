package com.eurotech.pages;

import com.eurotech.utilities.ExcelUtil;

import java.util.List;
import java.util.Map;

public class TestinExcel {
    public static void main(String[] args) {

        ExcelUtil excelUtil=new ExcelUtil("src/test/resources/EurotechTestB5_-Last.xlsx","Test Data");
        List<Map<String,String>> dataList=excelUtil.getDataList();
        System.out.println("dataList = " + dataList);
        System.out.println("dataList.get(6).get(\"Name\") = " + dataList.get(6).get("Title")); // SDET yazdirir.
        System.out.println("dataList.get(5).get(Name) = " + dataList.get(5).get("Name")); // Ensar1905 yazdirir


    }


}
