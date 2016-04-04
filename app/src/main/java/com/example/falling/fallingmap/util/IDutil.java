package com.example.falling.fallingmap.util;

import com.example.falling.fallingmap.R;

/**
 * Created by falling on 16/4/4.
 */
public class IDutil {
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
