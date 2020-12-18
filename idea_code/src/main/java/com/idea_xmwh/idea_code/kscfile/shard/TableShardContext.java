package com.idea_xmwh.idea_code.kscfile.shard;

/**
 * Description:分表信息
 * Project Name:stzx
 * File Name:TableShardContext
 * Package Name:com.zjpth.stzx.core.context
 * Copyright (c) 2019,南京通达海信息科技有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             @author      Version     Description
 * ------------------------------------------------------------------
 * 2019-7-4 21:05         廖齐龙      1.0        1.0 Version
 **/
public class TableShardContext {

    private static ThreadLocal<String> contextLocal = new ThreadLocal();

    private TableShardContext() {

    }

    /**
     * 获取分表业务数据
     * @param
     * @return: java.lang.String
     * @author 廖齐龙
     * @date 2019-7-5 8:42
     */
    public static String getShardData() {
        return contextLocal.get();
    }

    /**
     * 设置分表业务数据
     * @param data
     * @return: void
     * @author 廖齐龙
     * @date 2019-7-5 8:42
     */
    public static void setShardData(String data) {
        contextLocal.set(data);
    }

    public static void cleanContext() {
        contextLocal.remove();
    }
}
