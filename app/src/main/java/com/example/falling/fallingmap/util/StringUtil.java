package com.example.falling.fallingmap.util;

import com.example.falling.fallingmap.R;

import java.text.DecimalFormat;

/**
 * Created by falling on 16/4/2.
 * 数值处理
 */
public class StringUtil {

    /**
     * 将秒数转换成合适的小时数 或分钟数
     * @param second
     * @return 表示时间的String
     */
    public static String getFriendlyTime(int second) {
        if (second > 3600) {
            int hour = second / 3600;
            int miniate = (second % 3600) / 60;
            return hour + "小时" + miniate + "分钟";
        }
        if (second >= 60) {
            int miniate = second / 60;
            return miniate + "分钟";
        }
        return second + "秒";
    }

    /**
     * 将距离的米数，转换成合适的单位数值
     * @param lenMeter
     * @return 长度的String
     */
    public static String getFriendlyLength(int lenMeter) {
        if (lenMeter > 10000) // 10 km
        {
            int dis = lenMeter / 1000;
            return dis + "公里";
        }

        if (lenMeter > 1000) {
            float dis = (float) lenMeter / 1000;
            DecimalFormat fnum = new DecimalFormat("##0.0");
            String dstr = fnum.format(dis);
            return dstr + "公里";
        }

        if (lenMeter > 100) {
            int dis = lenMeter / 50 * 50;
            return dis + "米";
        }

        int dis = lenMeter / 10 * 10;
        if (dis == 0) {
            dis = 10;
        }

        return dis + "米";
    }


    public static int getDriveActionID(String actionName) {
        if (actionName == null || actionName.equals("")) {
            return R.drawable.dir_ahead;
        }
        if ("左转".equals(actionName)) {
            return R.drawable.dir_left;
        }
        if ("右转".equals(actionName)) {
            return R.drawable.dir_right;
        }
        if ("向左前方行驶".equals(actionName) || "靠左".equals(actionName)) {
            return R.drawable.dir_with_left;
        }
        if ("向右前方行驶".equals(actionName) || "靠右".equals(actionName)) {
            return R.drawable.dir_with_right;
        }
        if ("向左后方行驶".equals(actionName) || "左转调头".equals(actionName)) {
            return R.drawable.dir_turn_back_left;
        }
        if ("向右后方行驶".equals(actionName)) {
            return R.drawable.dir_turn_back_right;
        }
        if ("直行".equals(actionName)) {
            return R.drawable.dir_ahead;
        }
        if ("减速行驶".equals(actionName)) {
            return R.drawable.dir_ahead_slowly;
        }
        return R.drawable.dir_ahead;
    }
}
