package org.seckill.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.seckill.entity.SuccessKilled;
import org.springframework.stereotype.Repository;

@Repository
public interface SuccessKilledDao {
    /**
     * 插入购买明细
     * @param seckillId
     * @param userPhone
     * @return
     */
    @Insert("insert ignore INTO success_killed(seckill_id,user_phone,state) value(#{arg0},#{arg1},0)")
    int insertSuccessKilled(long seckillId,long userPhone);

    @Select("select sk.seckill_id,sk.user_phone,sk.state,sk.create_time, " +
            "s.name 'seckill.name',s.number 'seckill.number',s.start_time 'seckill.start_time',s.end_time 'seckill.end_time',s.create_time 'seckill.create_time' " +
            "from success_killed sk INNER join seckill s ON sk.seckill_id=s.seckill_id " +
            "where sk.seckill_id = #{seckillId} and sk.user_phone=#{userPhone};")
    SuccessKilled queryByIdWithSeckill(@Param("seckillId")long seckillId,@Param("userPhone") long userPhone);
}
