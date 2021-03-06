package com.vk.api.sdk.queries.market;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.objects.market.responses.GetCategoriesResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Market.getCategories method
 */
public class MarketGetCategoriesQuery extends AbstractQueryBuilder<MarketGetCategoriesQuery, GetCategoriesResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public MarketGetCategoriesQuery(VkApiClient client, Actor actor) {
        super(client, "market.getCategories", GetCategoriesResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Set count
     *
     * @param value value of "count" parameter. Maximum is 1000. Minimum is 0. By default 10.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MarketGetCategoriesQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * Set offset
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MarketGetCategoriesQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    @Override
    protected MarketGetCategoriesQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
