package edu.baylor.ecs.cil.gitanalysis;

import edu.baylor.ecs.cil.gitanalysis.comparator.*;
import edu.baylor.ecs.cil.ccmm.AstMesh;
import edu.baylor.ecs.cil.ccmm.AstRoot;
import edu.baylor.ecs.cil.ccmm.properties.MetaEntityMapping;
import edu.baylor.ecs.cil.gitanalysis.model.CloneReason;
import edu.baylor.ecs.cil.gitanalysis.model.CodeCloneList;
import edu.baylor.ecs.cil.gitanalysis.model.CodeCloneMap;


import java.util.List;
import java.util.Set;

public class MainComparator {

    private ArgumentsComparator argumentsComparator;
    //private ArgumentsComparator argumentsComparator;
    private DatabaseComparator databaseComparator;
    private HttpMethodComparator httpMethodComparator;
    private ReturnEntityComparator returnEntityComparator;
    private SecurityRolesComparator securityRolesComparator;
    private MetaEntityComparator metaEntityComparator;

    public MainComparator(List<MetaEntityMapping> metaEntityMapping){
        this.metaEntityComparator = new MetaEntityComparator(metaEntityMapping);
        this.argumentsComparator = new ArgumentsComparator(this.metaEntityComparator);

    }

    public CodeCloneList getCodeClones(AstMesh astMesh){

        List<AstRoot> astRoots = astMesh.getAstRoots();

        CodeCloneList codeCloneList = new CodeCloneList();

        // compare one with the other
        for (int i = 0; i < astRoots.size(); i ++) {
            for (int j = i; j < astRoots.size(); j++){
                AstRoot a = astRoots.get(i);
                AstRoot b = astRoots.get(j);
                Set<CloneReason> cloneReasonsSet = getCloneReasons(a, b);
                if (isSemanticClone(cloneReasonsSet)){
                    codeCloneList.add(new CodeCloneMap(a, b));
                }
            }
        }

        return codeCloneList;
    }

    private boolean isSemanticClone(Set<CloneReason> cloneReasonsSet) {
        return false;
    }

    private Set<CloneReason> getCloneReasons(AstRoot a, AstRoot b) {
        return null;
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
