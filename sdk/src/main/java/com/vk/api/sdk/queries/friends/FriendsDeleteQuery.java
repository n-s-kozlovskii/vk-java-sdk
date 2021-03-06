package com.vk.api.sdk.queries.friends;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.objects.friends.responses.DeleteResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Friends.delete method
 */
public class FriendsDeleteQuery extends AbstractQueryBuilder<FriendsDeleteQuery, DeleteResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     * @param userId value of "user id" parameter. Minimum is 0.
     */
    public FriendsDeleteQuery(VkApiClient client, Actor actor, int userId) {
        super(client, "friends.delete", DeleteResponse.class);
        accessToken(actor.getAccessToken());
        userId(userId);
    }

    /**
     * ID of the user whose friend request is to be declined or who is to be deleted from the current user's friend list.
     *
     * @param value value of "user id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected FriendsDeleteQuery userId(int value) {
        return unsafeParam("user_id", value);
    }

    @Override
    protected FriendsDeleteQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("user_id", "access_token");
    }
}
