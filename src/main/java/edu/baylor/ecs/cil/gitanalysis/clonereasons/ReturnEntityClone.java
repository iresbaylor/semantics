package edu.baylor.ecs.cil.gitanalysis.clonereasons;

import edu.baylor.ecs.cil.ccmm.properties.MetaEntity;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ReturnEntityClone {

    private CloneReason cloneReason;
    private MetaEntity returnEntity;

    public ReturnEntityClone(MetaEntity returnEntity){
        this.returnEntity = returnEntity;
        this.cloneReason = CloneReason.RETURN_ENTITY;
    }

}
