package com.tigrex.team.client;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author linus
 */
@FeignClient(value = "team", contextId = "team")
public interface TeamClient {
}
