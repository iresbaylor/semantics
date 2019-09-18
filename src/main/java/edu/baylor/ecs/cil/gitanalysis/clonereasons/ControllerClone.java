package edu.baylor.ecs.cil.gitanalysis.clonereasons;

import lombok.Data;

@Data
public class ControllerClone {
    //arguments, return entity, security roles, http method
    private ArgumentClone argumentClone;
    private ReturnEntityClone returnEntityClone;
    private SecurityRolesClone securityRolesClone;
    private HttpMethodClone httpMethodClone;
}
