package edu.baylor.ecs.cil.gitanalysis.clonereasons;

import edu.baylor.ecs.cil.ccmm.properties.DatabaseOperation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContextClones {
    private ControllerClone controllerClone;
    //Database
    private DatabaseOperation databaseOperation;
    //Rest service
    private RestServiceClone restServiceClone;
    //Normal services
    private ServiceClone serviceClone;

}
