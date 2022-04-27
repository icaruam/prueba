package com.dailycodebuffer.springsecurityclient.event;


import com.dailycodebuffer.springsecurityclient.entity.User;
import lombok.*;
import org.springframework.context.ApplicationEvent;

@Getter
@Setter
public class RegistrationCompleteEvent extends ApplicationEvent {

    private final User user;
    private final String applicationUrl;

    public RegistrationCompleteEvent(User user, String applicationUrl) {
        super(user);
        this.user = user;
        this.applicationUrl = applicationUrl;
    }
}