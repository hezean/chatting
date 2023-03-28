package cn.edu.sustech.cs209.chatting.common;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Message {

    private Long timestamp;

    private String sentBy;

    private String sendTo;

    private String data;
}
