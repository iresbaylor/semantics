package edu.baylor.ecs.cil.gitanalysis.clonereasons;

import edu.baylor.ecs.cil.ccmm.properties.HttpMethod;
import lombok.Data;

@Data
public class HttpMethodClone {
    private CloneReason cloneReason;
    private HttpMethod httpMethod;

    public HttpMethodClone(HttpMethod httpMethod){
        this.httpMethod = httpMethod;
        this.cloneReason = CloneReason.HTTP_METHOD;
    }
}
