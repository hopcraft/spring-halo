package io.hopcraft.halo.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.function.Function;

import javax.servlet.http.HttpSession;

import com.alibaba.fastjson.JSONObject;

import io.hopcraft.halo.returnJson.ReturnObject;

@RestController
public class LambdaController {
    
    @FunctionalInterface
    public interface ThrowingFunction<T, R, E extends Throwable> {
        static <T, R, E extends Throwable> Function<T, R> unchecked(ThrowingFunction<T, R, E> f) {
            return t -> {
                try {
                    return f.apply(t);
                } catch (Throwable e) {
                    throw new RuntimeException(e);
                }
            };
        }

        R apply(T t) throws E;
    }

    @RequestMapping("/lambda")
    public String lambda(HttpSession session) {
        HashMap<String, String> map = new HashMap<>();
        map.put("key", "世界表达式");

        ReturnObject returnObject = new ReturnObject(map);
        return JSONObject.toJSONString(returnObject);
    }
}
