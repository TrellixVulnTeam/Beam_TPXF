package com.example.grace.messaging;
//
//
// Taken from
// http://www.devexchanges.info/2016/03/design-chat-bubble-ui-in-android.html
//
//

/**
 * Created by evanl on 28/09/2017.
 */

public class ChatMessage {

    private String content;
    private boolean isMine;
    private String targetUser;

    public ChatMessage(String content, boolean isMine) {
        this.content = content;
        this.isMine = isMine;
    }

    public ChatMessage(String content, boolean isMine, String targetUser){
        this.content = content;
        this.isMine = isMine;
        this.targetUser = targetUser;


    }

    public String getContent() {
        return content;
    }

    public boolean isMine() {
        return isMine;
    }
}
