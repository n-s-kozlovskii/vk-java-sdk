package com.vk.api.sdk.queries.execute;

import com.google.gson.JsonObject;
import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;

import java.util.Arrays;
import java.util.List;

/**
 * Query for execute by storage function
 */
public class ExecuteStorageFunctionQuery extends AbstractQueryBuilder<ExecuteStorageFunctionQuery, JsonObject> {

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public ExecuteStorageFunctionQuery(VkApiClient client, Actor actor, String storageFunctionName) {
        super(client, "execute." + storageFunctionName, JsonObject.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Function version
     *
     * @param value value of "code" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected ExecuteStorageFunctionQuery funcV(Integer value) {
        return unsafeParam("func_v", value);
    }

    @Override
    protected ExecuteStorageFunctionQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
