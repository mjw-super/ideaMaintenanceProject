package com.idea_xmwh.idea_code.kscfile.po.annoation;

import java.lang.annotation.*;

/**
 *
 * 标记方法参数是否需要校验
 * @author 廖齐龙
 * @date 2019-7-3 10:47
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface AutoValid {

    /**
     * 是否需要校验
     * @return
     */
    boolean isNeedValid() default true;
}
