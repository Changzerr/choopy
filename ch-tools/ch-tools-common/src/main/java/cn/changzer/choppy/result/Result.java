package cn.changzer.choppy.result;


import cn.changzer.choppy.enums.CommonCode;
import com.alibaba.fastjson.JSON;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

//@JsonInclude(JsonInclude.Include.NON_NULL)
@ToString
@Getter
@Setter
@Accessors(chain = true)
public class Result<T> extends JSON {
    /**
     * 状态码
     */
    @ApiModelProperty(value = "状态码")
    private Integer code;
    /**
     * 提示信息，如果有错误时，前端可以获取该字段进行提示
     */
    @ApiModelProperty(value = "提示信息")
    private String msg;
    /**
     * 查询到的结果数据，
     */
    @ApiModelProperty(value = "查询到的结果数据")
    private T data;

    @ApiModelProperty(value = "请求路径")
    private String path;

    public Result(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Result(Integer code, T data) {
        this.code = code;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Result(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Result(CommonCode commonCode, T data) {
        this.code = commonCode.getCode();
        this.msg = commonCode.getMsg();
        this.data = data;
    }

    public Result(CommonCode commonCode) {
        this.code = commonCode.getCode();
        this.msg = commonCode.getMsg();
    }

    public static <T> Result<T> result(int code, T data, String msg) {
        return new Result<T>(code, msg, data);
    }

}
