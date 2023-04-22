package com.techacademy;

import java.time.LocalDate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController {

    //http://localhost:8080/dayofweek/指定日
    @GetMapping("dayofweek/{day}")
    public String dispDayOfWeek(@PathVariable String day) {
        int year = Integer.parseInt(day.substring(0,4));
        int month = Integer.parseInt(day.substring(4,6));
        int da = Integer.parseInt(day.substring(6,8));

        LocalDate ld = LocalDate.of(year,month,da);
        final var week = ld.getDayOfWeek();

        return week.toString();
    }
    /*
     * 日付をLocalDate型に変換
     * LocalDate ld = LocalDate.of(year,month,day);
     * 曜日を取得
     * DayOfWeek w ＝　ld.getDayOfWeek();
     * System.out.println(w);
     */



    //http://localhost:8080/plus/数値１/数値2    足し算    calcPlus
    @GetMapping("/plus/{val1}/{val2}")
    public String calcPlus(@PathVariable int val1,@PathVariable int val2) {
        int res = 0;

        res = val1 +val2;
        return "実行結果:" + res;
    }

    //http://localhost:8080/minus/数値１/数値2   引き算   calcMinus
    @GetMapping("/minus/{val1}/{val2}")
    public String calcMinus(@PathVariable int val1,@PathVariable int val2) {
        int res = 0;

        res = val1 - val2;
        return "実行結果:" + res;
    }
    //http://localhost:8080/times/数値１/数値2   掛け算   calcTimes
    @GetMapping("/times/{val1}/{val2}")
    public String calcTimes(@PathVariable int val1,@PathVariable int val2) {
        int res = 0;

        res = val1 * val2;
        return "実行結果:" + res;
    }
    //http://localhost:8080/divide/数値１/数値2  割り算  calcDivide
    @GetMapping("/divide/{val1}/{val2}")
    public String calcDIvide(@PathVariable int val1,@PathVariable int val2) {
        int res = 0;

        res = val1 / val2;
        return "実行結果:" + res;
    }

}

