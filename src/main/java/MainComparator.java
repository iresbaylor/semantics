import edu.baylor.ecs.cil.ccmm.AstMesh;
import edu.baylor.ecs.cil.ccmm.actions.IBaseStatement;
import model.CodeCloneList;

import java.util.List;

public class MainComparator {


    public CodeCloneList getCodeClones(AstMesh astMesh){

        List<IBaseStatement> astRoots = astMesh.getAstRoots();

        for (int i = 0; i < astRoots.size(); i ++) {
            for (int j = 0; j < astRoots.size(); j++){

            }
        }


    }

    // 1. controller

        // arguments, return entity, security roles, http method

    // 2. database

        // database operation, arguments, return entity

    // all methods non rest

        // arguments, return entity

    // all methods rest

        // ip, port, http type, arguments, return entity

    // isomorphic



    // are arguments same -> 0 / 1

    // are methods type same -> 0 / 1

    // are http types same -> 0 / 1

    // are decision types same -> 0 / 1

    // are isomorphic -> 0 / 2


}
