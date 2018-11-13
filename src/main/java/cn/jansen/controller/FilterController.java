package cn.jansen.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangxun
 * @email 1589666178@qq.com
 * @date 2018/11/13 21:04
 */
@RestController
public class FilterController {

    @GetMapping("/getMyFilter")
    public Map<String,Object> getMyFilter(){
        Map<String,Object> returnMap = new HashMap<String,Object>();
        returnMap.put("success",true);
        returnMap.put("message","MyFilter");
        return returnMap;
    }

}
