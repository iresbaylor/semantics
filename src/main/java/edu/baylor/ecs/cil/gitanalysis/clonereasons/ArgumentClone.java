package edu.baylor.ecs.cil.gitanalysis.clonereasons;

import edu.baylor.ecs.cil.ccmm.properties.MetaEntity;
import lombok.Data;
import java.util.List;

@Data
public class ArgumentClone {
    private CloneReason cloneReason;
    private List<MetaEntity> sameArguments;

    public ArgumentClone(List<MetaEntity> sameArguments){
        this.sameArguments = sameArguments;
        this.cloneReason = CloneReason.ARGUMENT;
    }


}
