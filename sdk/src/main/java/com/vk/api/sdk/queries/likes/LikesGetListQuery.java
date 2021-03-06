package com.vk.api.sdk.queries.likes;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.objects.likes.responses.GetListResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Likes.getList method
 */
public class LikesGetListQuery extends AbstractQueryBuilder<LikesGetListQuery, GetListResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     * @param type   value of "type" parameter.
     */
    public LikesGetListQuery(VkApiClient client, Actor actor, LikesType type) {
        super(client, "likes.getList", GetListResponse.class);
        accessToken(actor.getAccessToken());
        type(type);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param type   value of "type" parameter.
     */
    public LikesGetListQuery(VkApiClient client, LikesType type) {
        super(client, "likes.getList", GetListResponse.class);
        type(type);
    }

    /**
     * Type
     *
     * @param value value of "type" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected LikesGetListQuery type(LikesType value) {
        return unsafeParam("type", value);
    }

    /**
     * ID of the user, community, or application that owns the object. If the "type" parameter is set as "sitepage", the application ID is passed as "owner_id". Use negative value for a community id. If the "type" parameter is not set, the "owner_id" is assumed to be either the current user or the same application ID as if the "type" parameter was set to "sitepage".
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public LikesGetListQuery ownerId(Integer value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Object ID. If "type" is set as "sitepage", "item_id" can include the "page_id" parameter value used during initialization of the Like widget.
     *
     * @param value value of "item id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public LikesGetListQuery itemId(Integer value) {
        return unsafeParam("item_id", value);
    }

    /**
     * URL of the page where the Like widget is installed. Used instead of the "item_id" parameter.
     *
     * @param value value of "page url" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public LikesGetListQuery pageUrl(String value) {
        return unsafeParam("page_url", value);
    }

    /**
     * Filters to apply:
     * "likes" - returns information about all users who liked the object (default)
     * "copies" - returns information only about users who told their friends about the object
     *
     * @param value value of "filter" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public LikesGetListQuery filter(LikesGetListFilter value) {
        return unsafeParam("filter", value);
    }

    /**
     * Return only the current user's friends
     *
     * @param value value of "friends only" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public LikesGetListQuery friendsOnly(Boolean value) {
        return unsafeParam("friends_only", value);
    }

    /**
     * Offset needed to select a specific subset of users.
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public LikesGetListQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Number of user IDs to return (maximum "1000").
     * Default is "100" if "friends_only" is set to  "0"; otherwise, the default is "10" if "friends_only" is set to "1".
     *
     * @param value value of "count" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public LikesGetListQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * Set skip own
     *
     * @param value value of "skip own" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public LikesGetListQuery skipOwn(Boolean value) {
        return unsafeParam("skip_own", value);
    }

    @Override
    protected LikesGetListQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("type");
    }
}
