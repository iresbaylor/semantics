package edu.baylor.ecs.cil.gitanalysis.clonereasons;

import edu.baylor.ecs.cil.ccmm.properties.DatabaseOperation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DatabaseOperationClone {
    private DatabaseOperation databaseOperation;
    private CloneReason cloneReason;

    public DatabaseOperationClone(DatabaseOperation databaseOperation){
        this.databaseOperation = databaseOperation;
        this.cloneReason = CloneReason.HTTP_METHOD;
    }

}
