package com.tigrex.team.service;

import com.tigrex.team.entity.bo.TeamBO;
import com.tigrex.team.entity.query.TeamQuery;

import java.util.List;

/**
 * @author linus
 */
public interface TeamService {

    /**
     * list
     * @param query query
     * @return list
     */
    List<TeamBO> list(TeamQuery query);
}
