package org.seckill.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
public class SuccessKilled implements Serializable {
    private long seckillId;
    private long userPhone;
    private short state;
    private Date createTime;
    //多对一
    private Seckill seckill;
}
