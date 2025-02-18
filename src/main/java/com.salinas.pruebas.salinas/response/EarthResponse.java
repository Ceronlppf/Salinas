package com.salinas.pruebas.salinas.response;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EarthResponse {

    public Date date;
    public String id;
    public ResourceResponse resourceResponse;
    public String service_version;
    public String url;

}
