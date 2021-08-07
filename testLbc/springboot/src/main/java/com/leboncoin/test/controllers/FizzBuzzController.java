package com.leboncoin.test.controllers;

import com.leboncoin.test.libcommon.ListManipulation;
import org.junit.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
@RequestMapping("/fizz-buzz")
@ResponseBody
public class FizzBuzzController {

    List<String> userRequests = new ArrayList<>();
    @GetMapping("/query")
    @ResponseBody
    public ResponseEntity<List<String>> getQuery(@RequestParam int int1, @RequestParam("int2") int int2, @RequestParam("limit") int limit, @RequestParam("str1") String str1, @RequestParam("str2") String str2)
    {
        String newString = "int1 = " + int1 + " - int2 = " + int2 + " - limit = " + limit + " - str1 = " +  str1 + " - str2 = " + str2;
        userRequests.add(newString);
        List<String> fizzBuzzResult = new ArrayList<>();
        fizzBuzzResult = applyFizzBuzzToQuery(int1, int2, limit, str1, str2);

        return ResponseEntity.ok(fizzBuzzResult);
    }

    @GetMapping("/statistics")
    @ResponseBody
    public ResponseEntity<String> getMostAskedRequest()
    {
        String result = ListManipulation.mostCommon(userRequests);

        if (result == null)
        {
            result = "No query yet.";
        }
        return ResponseEntity.ok("The most frequent request is : " + result);
    }

    private List<String> applyFizzBuzzToQuery(int int1, int int2, int limit, String str1, String str2)
    {
        List<String> fizzBuzzResult = new ArrayList<>();
        for (int index = 1; index <= limit; index++)
        {
            if (index % int1 == 0 && index % int2 == 0)
            {
                fizzBuzzResult.add(str1 + str2);
            }
            else if (index % int1 == 0)
            {
                fizzBuzzResult.add(str1);
            }
            else if (index % int2 == 0)
            {
                fizzBuzzResult.add(str2);
            }
            else
            {
                fizzBuzzResult.add(String.valueOf(index));
            }
        }
        return fizzBuzzResult;
    }

    @Test
    public void mostCommonTest()
    {
        List<String> testList = new ArrayList<>();
        String testValue1 = "1";
        String testValue2 = "tutu";
        testList.add(testValue1);
        testList.add(testValue1);
        testList.add(testValue2);
        if (!ListManipulation.mostCommon(testList).equals(testValue1))
        {
            System.out.println("Test for mostCommon() in FizzBuzzController failed");
        }
    }
}
