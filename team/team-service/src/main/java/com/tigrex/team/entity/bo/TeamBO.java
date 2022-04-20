package com.tigrex.team.entity.bo;

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
public class TeamBO implements Serializable {

    private static final long serialVersionUID = 1L;
}
