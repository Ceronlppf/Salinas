package com.salinas.pruebas.salinas.response;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InsightResponse {

    public String context;
    public String id;
    public String type;
    public int totalItems;
    public List<MemberResponse> memberResponseList;
    public ParametersResponse parametersResponse;
    public ViewResponse viewResponse;

}



