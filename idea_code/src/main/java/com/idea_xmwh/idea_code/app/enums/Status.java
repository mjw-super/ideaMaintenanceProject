package com.idea_xmwh.idea_code.app.enums;

/**
 * @Description 返回结果枚举类
 * @ClassName Status
 * @Author Mengjw
 * @date 2020.09.05 10:49
 */
public enum Status {

    SUCCESS(1,"成功"),
    FAIL(0,"失败"),
    FAIL400(400,"参数不正确"),
    FAIL401(401,"认证信息错误"),
    FAIL403(403,"权限不足"),
    FAIL404(404,"访问资源不存在"),
    FAIL500(500,"内部错误");

    private int code;

    private String detail;

    public int getCode() {
        return code;
    }

    public String getDetail() {
        return detail;
    }

    Status(int code, String detail){
        this.code = code;
        this.detail = detail;
    }

}
