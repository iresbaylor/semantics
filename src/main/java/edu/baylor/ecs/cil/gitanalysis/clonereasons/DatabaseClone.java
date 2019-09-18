package edu.baylor.ecs.cil.gitanalysis.clonereasons;

import edu.baylor.ecs.cil.ccmm.properties.DatabaseOperation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class DatabaseClone {
    // database operation, arguments, return entity
    private DatabaseOperation databaseOperation;
    private ArgumentClone argumentClone;
    private ReturnEntityClone returnEntityClone;
}
