package com.tigrex.team.entity.vo;

import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author linus
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@ToString
public class TeamVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
}
