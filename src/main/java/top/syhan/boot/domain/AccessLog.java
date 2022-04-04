package top.syhan.boot.domain;

import lombok.Data;

import java.util.Date;

/**
 * @program: boot-filter-interceptor
 * @description: 访问日志内容记录实体类
 * @author: SYH
 * @create: 2022-04-04 14:34
 **/
@Data
public class AccessLog {

    /**
     * 访问用户名
     */
    private String username;

    /**
     * 请求路径
     */
    private String url;

    /**
     * 请求消耗时长
     */
    private Integer duration;

    /**
     * http 方法: GET、POST等
     */
    private String httpMethod;

    /**
     * http 请求响应状态码
     */
    private Integer httpStatus;

    /**
     * 访问者ip
     */
    private String ip;

    /**
     * 此条记录的创建时间
     */
    private Date createTime;

    @Override
    public String toString() {
        return "{" +
                "username='" + this.username + '\'' +
                ", url='" + this.url + '\'' +
                ", duration=" + this.duration +
                ", httpMethod='" + this.httpMethod + '\'' +
                ", httpStatus=" + this.httpStatus +
                ", ip='" + this.ip + '\'' +
                ", createTime=" + this.createTime +
                '}';
    }
}
