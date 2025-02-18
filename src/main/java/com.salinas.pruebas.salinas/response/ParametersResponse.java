package com.salinas.pruebas.salinas.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ParametersResponse {

    public String search;
    public String sort;
    public String sortdir;
    public int page;
    public int pagesize;

}
