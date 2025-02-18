package com.salinas.pruebas.salinas.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DonkiResponse {

    public String messageType;
    public String messageID;
    public String messageURL;
    public String messageIssueTime;
    public String messageBody;

}
