package cn.changzer.choppy.enums;



public enum CommonCode {

    SUCCESS(20000,"操作成功"),

    SUCCESS_LOGIN(20001,"登录成功"),

    SUCCESS_LOGOUT(20002,"注销成功"),

    SUCCESS_REGISTRATION(20003,"注册成功"),

    FAILURE(50000,"操作失败"),

    FAILURE_ADD_STUDENT(500001,"添加学生失败,学号已存在"),

    FAILURE_UPDATE_PASSWORD(50002,"操作失败,信息不存在"),

    FAILURE_APPLICATION(50003,"操作失败,本学期已申请"),

    FAILURE_SEMESTER_EXIST(50004,"操作失败,该学期已存在"),

    FAILURE_UPLOAD_IMG(50005,"图片上传失败"),

    NUMBER_OF_FULL(50006,"操作失败,人数已满!!!"),

    FAILURE_TO_LOGIN(50007,"登录失败，学号或者密码错误"),

    FAILURE_TO_LOGIN_ADMIN(50008,"登录失败，学工号错误"),

    FAILURE_TO_ORDER(50009,"当前人数过多，请重试!"),

    FAILURE_TO_CHANGE_PASSWORD(50010,"修改密码失败，旧密码错误"),
    OLD_PASSWORD_EQULS_NEW(50011,"新密码与旧密码相同"),

    VALIDATE_FAILED(40000,"参数验证失败"),
    PARAM_EX(40000, "参数类型解析异常"),
    ILLEGALA_ARGUMENT_EX(40000, "无效参数异常"),
    NULL_POINT_EX(40000, "空指针异常"),
    MEDIA_TYPE_EX(40000, "请求类型异常"),
    REQUIRED_FILE_PARAM_EX(40000, "请求中必须至少包含一个有效文件"),
    SYSTEM_BUSY(40000, "系统繁忙~请稍后再试~"),
    BASE_VALID_PARAM(40000, "统一验证参数异常"),
    METHOD_NOT_ALLOWED(40000, "不支持当前请求类型"),
    SQL_EX(40000, "运行SQL出现异常"),
    LOGIN_DATE(40001,"登录过期，请重新登录"),

    FAILED_REGISTRATION(40002,"注册失败，该用户已存在"),

    FORBIDDEN(40003,"没有操作权限"),

    FAILED_AUTHORIZED(40004,"授权失败"),

    UNAUTHORIZED(40005,"认证失败请重新登录"),
    TOKEN_ILLEGAL(10000,"token过期,请重新登录");




    private Integer code;
    private String msg;

    private CommonCode(Integer code, String msg){
        this.code = code;
        this.msg = msg;
    }


    public Integer getCode() {
        return this.code;
    }


    public String getMsg() {
        return this.msg;
    }
}

