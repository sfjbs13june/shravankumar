package com.shravankumar.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionApp {

    public List<String> getListData() {
        List<String> data = new ArrayList<>();
        data.add("str1");
        data.add("str2");
        return data;
    }

    public Map<String, String> getMapData() {
        Map<String, String> data = new HashMap<>();
        data.put("1", "data1");
        data.put("2", "data1");
        data.put("3", "data2");
        return data;
    }
}