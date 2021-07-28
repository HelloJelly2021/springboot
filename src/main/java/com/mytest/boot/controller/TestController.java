package com.mytest.boot.controller;

import com.mytest.boot.bean.Car;
import com.mytest.boot.bean.Person;
import com.mytest.boot.bean.Person2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Yangjiali
 * @create 2021-04-16:18 16:18
 */
//@RestController
public class TestController {

    @Autowired
    public Car car;

    @GetMapping("/car/{name}/owner/{custname}")
    public Map<String, Object> car(@PathVariable("name") String name, @PathVariable("custname") String custName,
                                   @PathVariable Map<String, String> pvMap,
                                   @RequestHeader("User-Agent") String userAgent,
                                   @RequestHeader Map<String, String> headerMap,
                                   @RequestHeader MultiValueMap<String, String> mvHeaderMap,
                                   @RequestHeader HttpHeaders httpHeadersMap,
                                   @RequestParam("price") float price,
                                   @RequestParam Map<String, String> params) {
        HashMap<String, Object> ssMap = new HashMap<>();
        ssMap.put("carName", name);
        ssMap.put("custName", custName);
        ssMap.put("map", pvMap);
        ssMap.put("userAgent", userAgent);
        ssMap.put("headerMap", headerMap);
        ssMap.put("mvHeaderMap", mvHeaderMap);
        ssMap.put("httpHeadersMap", httpHeadersMap);
        ssMap.put("price", price);
        ssMap.put("params", params);
        return ssMap;
    }

    @PostMapping("/save/car")
    public Map<String, Object> postBody(@RequestBody String carName) {
        HashMap<String, Object> ssMap = new HashMap<>();
        ssMap.put("carName", carName);
        return ssMap;
    }

    @Autowired
    private Person person;

    @GetMapping("/person")
    public Person person() {
        return person;
    }

    @GetMapping("/springblade-framework.png")
    public String res1() {
        return "springblade-framework.png";
    }

    @PostMapping("/saveuser")
    public Person2 saveuser(Person2 person2) {
        return person2;
    }

}
