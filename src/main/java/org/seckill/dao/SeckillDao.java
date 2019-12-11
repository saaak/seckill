package org.seckill.dao;

import org.apache.ibatis.annotations.*;
import org.seckill.entity.Seckill;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
@Repository
public interface SeckillDao {
    /**
     * 减库存
     * @param seckillId
     * @param killTime
     * @return
     */
    @Update("UPDATE seckill set NUMBER = NUMBER-1 WHERE seckill_id = #{seckillId} and start_time <=#{killTime} and end_time >=#{killTime} and number>0;")
    int reduceNumber(@Param("seckillId") long seckillId,@Param("killTime") Date killTime);

    @Select("select seckill_id,name,number,start_time,end_time from seckill where seckill_id = #{seckillId}")
    @ResultMap("seckill")
    Seckill queryById(long seckillId);

    @Select("select seckill_id,name,number,start_time,end_time,create_time from seckill limit #{offset},#{limit}")
    @Results(id = "seckill",value = {@Result(property = "startTime",column = "start_time"),
              @Result(property = "endTime",column = "end_time"),
              @Result(property = "createTime",column = "create_time"),
            @Result(property = "seckillId",column = "seckill_id")
    })
    List<Seckill> queryAll(@Param("offset") int offset,@Param("limit") int limit);
}
