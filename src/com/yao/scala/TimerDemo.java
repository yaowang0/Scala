package com.yao.scala;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 定时器演示：周末爬香山
 * @author Administrator
 *
 */
public class TimerDemo {

    public static void main(String[] args) {
        //1.创建定时器对象
        Timer timer=new Timer();
        //2.设置日期为本周六
        Calendar cal=new GregorianCalendar();
        cal.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
        Date date=cal.getTime();
        //3.设置任务
        //在指定时间执行计划任务的run()方法
        timer.schedule(new TimerTask()
        {
            public void run()
            {
                System.out.println("去爬香山！");
            }
        },date);

    }

}