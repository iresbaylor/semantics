package edu.baylor.ecs.cil.gitanalysis.clonereasons;

import lombok.Data;
import java.util.List;

@Data
public class SecurityRolesClone {
    private CloneReason cloneReason;
    private List<String> securityRoles;

    public SecurityRolesClone(List<String> securityRoles){
        this.securityRoles = securityRoles;
        this.cloneReason = CloneReason.SECURITY_ROLES;
    }
}
