package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.queries.messages.MessagesAddChatUserQuery;
import com.vk.api.sdk.queries.messages.MessagesCreateChatQuery;
import com.vk.api.sdk.queries.messages.MessagesDeleteChatPhotoQuery;
import com.vk.api.sdk.queries.messages.MessagesDeleteDialogQuery;
import com.vk.api.sdk.queries.messages.MessagesDeleteQuery;
import com.vk.api.sdk.queries.messages.MessagesEditChatQuery;
import com.vk.api.sdk.queries.messages.MessagesGetByIdQuery;
import com.vk.api.sdk.queries.messages.MessagesGetChatQuery;
import com.vk.api.sdk.queries.messages.MessagesGetChatQueryWithChatIds;
import com.vk.api.sdk.queries.messages.MessagesGetChatQueryWithChatIdsFields;
import com.vk.api.sdk.queries.messages.MessagesGetChatQueryWithFields;
import com.vk.api.sdk.queries.messages.MessagesGetChatUsersQuery;
import com.vk.api.sdk.queries.messages.MessagesGetChatUsersQueryWithChatIds;
import com.vk.api.sdk.queries.messages.MessagesGetChatUsersQueryWithChatIdsFields;
import com.vk.api.sdk.queries.messages.MessagesGetChatUsersQueryWithFields;
import com.vk.api.sdk.queries.messages.MessagesGetDialogsQuery;
import com.vk.api.sdk.queries.messages.MessagesGetHistoryAttachmentsQuery;
import com.vk.api.sdk.queries.messages.MessagesGetHistoryQuery;
import com.vk.api.sdk.queries.messages.MessagesGetLastActivityQuery;
import com.vk.api.sdk.queries.messages.MessagesGetLongPollHistoryQuery;
import com.vk.api.sdk.queries.messages.MessagesGetLongPollServerQuery;
import com.vk.api.sdk.queries.messages.MessagesGetQuery;
import com.vk.api.sdk.queries.messages.MessagesMarkAsImportantQuery;
import com.vk.api.sdk.queries.messages.MessagesMarkAsReadQuery;
import com.vk.api.sdk.queries.messages.MessagesRemoveChatUserQuery;
import com.vk.api.sdk.queries.messages.MessagesRestoreQuery;
import com.vk.api.sdk.queries.messages.MessagesSearchDialogsQuery;
import com.vk.api.sdk.queries.messages.MessagesSearchQuery;
import com.vk.api.sdk.queries.messages.MessagesSendQuery;
import com.vk.api.sdk.queries.messages.MessagesSetActivityQuery;
import com.vk.api.sdk.queries.messages.MessagesSetChatPhotoQuery;
import com.vk.api.sdk.queries.users.UserField;

import java.util.List;

/**
 * List of Messages methods
 */
public class Messages extends AbstractAction {

    /**
     * Constructor
     *
     * @param client vk api client
     */
    public Messages(VkApiClient client) {
        super(client);
    }

    /**
     * Returns a list of the current user's incoming or outgoing private messages.
     */
    public MessagesGetQuery get(Actor actor) {
        return new MessagesGetQuery(getClient(), actor);
    }

    /**
     * Returns a list of the current user's conversations.
     */
    public MessagesGetDialogsQuery getDialogs(Actor actor) {
        return new MessagesGetDialogsQuery(getClient(), actor);
    }

    /**
     * Returns messages by their IDs.
     */
    public MessagesGetByIdQuery getById(Actor actor, int... messageIds) {
        return new MessagesGetByIdQuery(getClient(), actor, messageIds);
    }

    /**
     * Returns messages by their IDs.
     */
    public MessagesGetByIdQuery getById(Actor actor, List<Integer> messageIds) {
        return new MessagesGetByIdQuery(getClient(), actor, messageIds);
    }

    /**
     * Returns a list of the current user's private messages that match search criteria.
     */
    public MessagesSearchQuery search(Actor actor) {
        return new MessagesSearchQuery(getClient(), actor);
    }

    /**
     * Returns message history for the specified user or group chat.
     */
    public MessagesGetHistoryQuery getHistory(Actor actor) {
        return new MessagesGetHistoryQuery(getClient(), actor);
    }

    /**
     * Returns media files from the dialog or group chat.
     */
    public MessagesGetHistoryAttachmentsQuery getHistoryAttachments(Actor actor, int peerId) {
        return new MessagesGetHistoryAttachmentsQuery(getClient(), actor, peerId);
    }

    /**
     * Sends a message.
     */
    public MessagesSendQuery send(Actor actor) {
        return new MessagesSendQuery(getClient(), actor);
    }

    /**
     * Deletes one or more messages.
     */
    public MessagesDeleteQuery delete(Actor actor) {
        return new MessagesDeleteQuery(getClient(), actor);
    }

    /**
     * Deletes all private messages in a conversation.
     */
    public MessagesDeleteDialogQuery deleteDialog(Actor actor) {
        return new MessagesDeleteDialogQuery(getClient(), actor);
    }

    /**
     * Restores a deleted message.
     */
    public MessagesRestoreQuery restore(Actor actor, int messageId) {
        return new MessagesRestoreQuery(getClient(), actor, messageId);
    }

    /**
     * Marks messages as read.
     */
    public MessagesMarkAsReadQuery markAsRead(Actor actor) {
        return new MessagesMarkAsReadQuery(getClient(), actor);
    }

    /**
     * Marks and unmarks messages as important (starred).
     */
    public MessagesMarkAsImportantQuery markAsImportant(Actor actor) {
        return new MessagesMarkAsImportantQuery(getClient(), actor);
    }

    /**
     * Returns data required for connection to a Long Poll server.
     */
    public MessagesGetLongPollServerQuery getLongPollServer(Actor actor) {
        return new MessagesGetLongPollServerQuery(getClient(), actor);
    }

    /**
     * Returns updates in user's private messages.
     */
    public MessagesGetLongPollHistoryQuery getLongPollHistory(Actor actor) {
        return new MessagesGetLongPollHistoryQuery(getClient(), actor);
    }

    /**
     * Returns information about a chat.
     */
    public MessagesGetChatQuery getChat(Actor actor) {
        return new MessagesGetChatQuery(getClient(), actor);
    }

    /**
     * Returns information about a chat.
     */
    public MessagesGetChatQueryWithFields getChat(Actor actor, UserField... fields) {
        return new MessagesGetChatQueryWithFields(getClient(), actor, fields);
    }

    /**
     * Returns information about a chat.
     */
    public MessagesGetChatQueryWithChatIds getChat(Actor actor, Integer... chatIds) {
        return new MessagesGetChatQueryWithChatIds(getClient(), actor, chatIds);
    }

    /**
     * Returns information about a chat.
     */
    public MessagesGetChatQueryWithChatIds getChat(Actor actor, List<Integer> chatIds) {
        return new MessagesGetChatQueryWithChatIds(getClient(), actor, chatIds);
    }

    /**
     * Returns information about a chat.
     */
    public MessagesGetChatQueryWithChatIdsFields getChat(Actor actor, List<Integer> chatIds, List<UserField> fields) {
        return new MessagesGetChatQueryWithChatIdsFields(getClient(), actor, chatIds, fields);
    }

    /**
     * Creates a chat with several participants.
     */
    public MessagesCreateChatQuery createChat(Actor actor, int... userIds) {
        return new MessagesCreateChatQuery(getClient(), actor, userIds);
    }

    /**
     * Creates a chat with several participants.
     */
    public MessagesCreateChatQuery createChat(Actor actor, List<Integer> userIds) {
        return new MessagesCreateChatQuery(getClient(), actor, userIds);
    }

    /**
     * Edits the title of a chat.
     */
    public MessagesEditChatQuery editChat(Actor actor, int chatId, String title) {
        return new MessagesEditChatQuery(getClient(), actor, chatId, title);
    }

    /**
     * Returns a list of IDs of users participating in a chat.
     */
    public MessagesGetChatUsersQuery getChatUsers(Actor actor) {
        return new MessagesGetChatUsersQuery(getClient(), actor);
    }

    /**
     * Returns a list of IDs of users participating in a chat.
     */
    public MessagesGetChatUsersQueryWithFields getChatUsers(Actor actor, UserField... fields) {
        return new MessagesGetChatUsersQueryWithFields(getClient(), actor, fields);
    }

    /**
     * Returns a list of IDs of users participating in a chat.
     */
    public MessagesGetChatUsersQueryWithFields getChatUsers(Actor actor, List<UserField> fields) {
        return new MessagesGetChatUsersQueryWithFields(getClient(), actor, fields);
    }

    /**
     * Returns a list of IDs of users participating in a chat.
     */
    public MessagesGetChatUsersQueryWithChatIds getChatUsers(Actor actor, Integer... chatIds) {
        return new MessagesGetChatUsersQueryWithChatIds(getClient(), actor, chatIds);
    }

    /**
     * Returns a list of IDs of users participating in a chat.
     */
    public MessagesGetChatUsersQueryWithChatIdsFields getChatUsers(Actor actor, List<Integer> chatIds, UserField... fields) {
        return new MessagesGetChatUsersQueryWithChatIdsFields(getClient(), actor, chatIds, fields);
    }

    /**
     * Returns a list of IDs of users participating in a chat.
     */
    public MessagesGetChatUsersQueryWithChatIdsFields getChatUsers(Actor actor, List<Integer> chatIds, List<UserField> fields) {
        return new MessagesGetChatUsersQueryWithChatIdsFields(getClient(), actor, chatIds, fields);
    }

    /**
     * Changes the status of a user as typing in a conversation.
     */
    public MessagesSetActivityQuery setActivity(Actor actor) {
        return new MessagesSetActivityQuery(getClient(), actor);
    }

    /**
     * Returns a list of the current user's conversations that match search criteria.
     */
    public MessagesSearchDialogsQuery searchDialogs(Actor actor) {
        return new MessagesSearchDialogsQuery(getClient(), actor);
    }

    /**
     * Adds a new user to a chat.
     */
    public MessagesAddChatUserQuery addChatUser(Actor actor, int chatId, int userId) {
        return new MessagesAddChatUserQuery(getClient(), actor, chatId, userId);
    }

    /**
     * Allows the current user to leave a chat or, if the current user started the chat, allows the user to remove another user from the chat.
     */
    public MessagesRemoveChatUserQuery removeChatUser(Actor actor, int chatId, String userId) {
        return new MessagesRemoveChatUserQuery(getClient(), actor, chatId, userId);
    }

    /**
     * Returns a user's current status and date of last activity.
     */
    public MessagesGetLastActivityQuery getLastActivity(Actor actor, int userId) {
        return new MessagesGetLastActivityQuery(getClient(), actor, userId);
    }

    /**
     * Sets a previously-uploaded picture as the cover picture of a chat.
     */
    public MessagesSetChatPhotoQuery setChatPhoto(Actor actor, String file) {
        return new MessagesSetChatPhotoQuery(getClient(), actor, file);
    }

    /**
     * Deletes a chat's cover picture.
     */
    public MessagesDeleteChatPhotoQuery deleteChatPhoto(Actor actor, int chatId) {
        return new MessagesDeleteChatPhotoQuery(getClient(), actor, chatId);
    }
}
