package com.weather.data.cma;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/cma")
public class WeatherCMA {

    @RequestMapping("/hello")
    public ModelAndView hello(){
        ModelAndView mav = new ModelAndView();
        mav.addObject("msg","Hello World!");
        mav.setViewName("/hello");
        return mav;
    }

    @RequestMapping("/index")
    public ModelAndView index(){
        ModelAndView mav = new ModelAndView();
        mav.addObject("msg","Hello World!");
        mav.setViewName("/index");
        return mav;
    }

    @RequestMapping("/path1")
    public String indexPath1() {
        return "ok";
    }

    @RequestMapping("/path2")
    public String indexPath2(Model model) {
        return "path2";
    }

    @RequestMapping("/{variable}")
    @ResponseBody
    public String indexVarialble(@PathVariable("variable")String variable) {
        return variable;
    }

    @RequestMapping("/path3")
    @ResponseBody
    public String indexPath3(@RequestBody String body) {
        //对body进行解析即可
        return "success";
    }
}
