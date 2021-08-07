package com.leboncoin.test.libcommon;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListManipulation {
    public static <T> T mostCommon(List<T> list)
    {
        Map<T, Integer> mapOfValuePerCount = new HashMap<>();
        Map.Entry<T, Integer> max = null;

        for (T element : list)
        {
            Integer val = mapOfValuePerCount.get(element);
            mapOfValuePerCount.put(element, val == null ? 1 : val + 1);
        }

        for (Map.Entry<T, Integer> entry : mapOfValuePerCount.entrySet())
        {
            if (max == null || entry.getValue() > max.getValue())
            {
                max = entry;
            }
        }
        return max == null ? null : max.getKey();
    }
}
