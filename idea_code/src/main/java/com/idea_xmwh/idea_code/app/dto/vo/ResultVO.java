package com.idea_xmwh.idea_code.app.dto.vo;


import com.idea_xmwh.idea_code.app.enums.Status;

/**
 * 通用返回结果对象
 *
 */
public class ResultVO<T> {

    /**
     * 处理结果
     */
    private Integer code;

    /**
     * 处理信息
     */
    private String message;

    /**
     * 返回数据
     */
    private T data;

    /**
     * 总页码
     */
    private long total;

    /**
     * 返回成功状态，不带数据
     * @return
     */
    public ResultVO<T> success(){
        this.success(null);
        return this;
    }

    /**
     * 返回成功状态，带数据
     * @param data 泛型数据
     * @return
     */
    public ResultVO<T> success(T data){
        this.code = Status.SUCCESS.getCode();
        this.data = data;
        this.message = Status.SUCCESS.getDetail();
        return this;
    }

    public ResultVO<T> success(T data, String message){
        this.success(data);
        this.message = message;
        return this;
    }

    public ResultVO<T> fail(String detail){
        this.code = Status.FAIL.getCode();
        this.message = detail;
        return this;
    }

    public ResultVO<T> fail(T data){
        this.code = Status.FAIL.getCode();
        this.data = data;
        this.message = Status.FAIL.getDetail();
        return this;
    }

    public ResultVO<T> fail(T data, String message){
        this.fail(data);
        this.message = message;
        return this;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
