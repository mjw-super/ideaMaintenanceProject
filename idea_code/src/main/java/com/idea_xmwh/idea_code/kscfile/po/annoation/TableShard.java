package com.idea_xmwh.idea_code.kscfile.po.annoation;


import com.idea_xmwh.idea_code.kscfile.shard.IShardStrategy;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 分表注解,作用在类上
 * @author 廖齐龙
 * @date 2019-7-3 10:47
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface TableShard {

    /**
     * 除去序号的表名
     */
    String tableBaseName();

    /**
     * 分表逻辑实现类
     */
    Class<? extends IShardStrategy> shardStrategy();
}
