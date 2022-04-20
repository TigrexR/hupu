package com.tigrex.team.controller;

import com.fasterxml.jackson.core.type.TypeReference;
import com.tigrex.core.utils.JacksonUtils;
import com.tigrex.team.entity.query.TeamQuery;
import com.tigrex.team.entity.vo.TeamVO;
import com.tigrex.team.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/team")
public class TeamController {

    @Autowired
    private TeamService service;

    @PostMapping(value = "list")
    public List<TeamVO> list(@RequestBody() TeamQuery query) {
        return JacksonUtils.getJackson().convertValue(service.list(query), new TypeReference<List<TeamVO>>() {});
    }
}
