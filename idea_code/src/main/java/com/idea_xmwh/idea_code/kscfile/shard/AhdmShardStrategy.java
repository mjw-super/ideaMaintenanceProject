package com.idea_xmwh.idea_code.kscfile.shard;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

/**
 * ahdm分表策略
 * Created by 熊伟 on 2020/1/6.
 */
public class AhdmShardStrategy implements IShardStrategy {
    private static final Logger log = LoggerFactory.getLogger(AhdmShardStrategy.class);

    @Override
    public String generateTableName(String tableName, Object paramObject) {
        if (StringUtils.isEmpty(TableShardContext.getShardData())) {
            log.error(tableName + "未设置分表数据，请设置");
            return null;
        }
        String ahdm = TableShardContext.getShardData();
        tableName += "_" + ahdm.substring(ahdm.length()-1);
        return tableName;
    }
}
