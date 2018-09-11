package com.houshl.mall.response;

import com.houshl.mall.common.Constants;

/**
 * Created by houshuanglong on 2018/7/23.
 */
public class ResponseUtils {

    public static ObjectResponse ok() {
        ObjectResponse response = new ObjectResponse(Constants.OK, "OK");
        return response;
    }

    public static ObjectResponse ok(Object data) {
        ObjectResponse response = new ObjectResponse(Constants.OK, "OK", data);
        return response;
    }

}
