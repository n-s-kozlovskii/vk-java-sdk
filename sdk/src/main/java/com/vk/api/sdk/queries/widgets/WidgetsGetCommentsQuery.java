package com.vk.api.sdk.queries.widgets;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.objects.widgets.responses.GetCommentsResponse;
import com.vk.api.sdk.queries.EnumParam;

import java.util.Collections;
import java.util.List;

/**
 * Query for Widgets.getComments method
 */
public class WidgetsGetCommentsQuery extends AbstractQueryBuilder<WidgetsGetCommentsQuery, GetCommentsResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public WidgetsGetCommentsQuery(VkApiClient client, Actor actor) {
        super(client, "widgets.getComments", GetCommentsResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     */
    public WidgetsGetCommentsQuery(VkApiClient client) {
        super(client, "widgets.getComments", GetCommentsResponse.class);
    }

    /**
     * Set widget api id
     *
     * @param value value of "widget api id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WidgetsGetCommentsQuery widgetApiId(Integer value) {
        return unsafeParam("widget_api_id", value);
    }

    /**
     * Set url
     *
     * @param value value of "url" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WidgetsGetCommentsQuery url(String value) {
        return unsafeParam("url", value);
    }

    /**
     * Set page id
     *
     * @param value value of "page id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WidgetsGetCommentsQuery pageId(String value) {
        return unsafeParam("page_id", value);
    }

    /**
     * Set order
     *
     * @param value value of "order" parameter. By default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WidgetsGetCommentsQuery order(String value) {
        return unsafeParam("order", value);
    }

    /**
     * Set fields
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WidgetsGetCommentsQuery fields(EnumParam... value) {
        return unsafeParam("fields", value);
    }

    /**
     * Set fields
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WidgetsGetCommentsQuery fields(List<EnumParam> value) {
        return unsafeParam("fields", value);
    }

    /**
     * Set count
     *
     * @param value value of "count" parameter. Maximum is 200. Minimum is 10. By default 10.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WidgetsGetCommentsQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    @Override
    protected WidgetsGetCommentsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Collections.EMPTY_LIST;
    }
}
