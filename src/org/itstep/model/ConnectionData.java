package org.itstep.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor


public class ConnectionData {

    private Integer sessionId;
    private String ip;
    private Long time;
    private String userLogin;
}
