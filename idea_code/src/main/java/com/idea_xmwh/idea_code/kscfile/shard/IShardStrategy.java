package com.idea_xmwh.idea_code.kscfile.shard;

/**
 * 分表逻辑接口
 * Project Name:stzx
 * File Name:IShardStrategy
 * Package Name:com.zjpth.jzgl.bp.service.impl
 * Copyright (c) 2019,南京通达海信息科技有限公司 All Rights Reserved.
 * <p>
 * Modification History:
 * Date             @author      Version     Description
 * ------------------------------------------------------------------
 * 2019-7-3 10:30         廖齐龙      1.0        1.0 Version
 **/
public interface IShardStrategy {

    /**
     * 生成分表名称
     * @param tableName   表名
     * @param paramObject DAO层方法参数
     * @return: java.lang.String
     * @author 廖齐龙
     * @date 2019-7-3 10:34
     */
    String generateTableName(String tableName, Object paramObject);
}
