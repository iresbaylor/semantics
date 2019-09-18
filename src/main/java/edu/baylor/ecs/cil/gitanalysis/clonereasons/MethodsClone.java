package edu.baylor.ecs.cil.gitanalysis.clonereasons;

import edu.baylor.ecs.cil.ccmm.properties.MetaEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MethodsClone {

    private MetaEntity a;
    private MetaEntity b;
    private ArgumentClone argumentClone;
    private ReturnEntityClone returnEntityClone;

}
