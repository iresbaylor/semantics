package edu.baylor.ecs.cil.gitanalysis.clonereasons;

import edu.baylor.ecs.cil.ccmm.properties.HttpMethod;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class RestMethodsClone extends MethodsClone {

    private String ip;
    private String port;
    private String interfaceString;
    private HttpMethod httpMethod;
}
