package com.salinas.pruebas.salinas.response;


import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberResponse {

    public String id;
    public String type;
    public int satelliteId;
    public String name;
    public Date date;
    public String line1;
    public String line2;

}
