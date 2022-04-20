package com.tigrex.team.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tigrex.team.entity.po.TeamDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author linus
 */
@Mapper
public interface TeamMapper extends BaseMapper<TeamDO> {
}
