package edu.baylor.ecs.cil.gitanalysis;

import edu.baylor.ecs.cil.ccmm.actions.ControllerMethod;
import edu.baylor.ecs.cil.gitanalysis.comparator.*;
import edu.baylor.ecs.cil.ccmm.AstMesh;
import edu.baylor.ecs.cil.ccmm.AstRoot;
import edu.baylor.ecs.cil.ccmm.properties.MetaEntityMapping;
import edu.baylor.ecs.cil.gitanalysis.clonereasons.CloneReason;
import edu.baylor.ecs.cil.gitanalysis.model.CodeCloneList;
import edu.baylor.ecs.cil.gitanalysis.model.CodeCloneMap;


import java.util.HashSet;
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
        this.databaseComparator = new DatabaseComparator();

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
                    //codeCloneList.add(new CodeCloneMap(a, b));
                }
            }
        }

        return codeCloneList;
    }

    private boolean isSemanticClone(Set<CloneReason> cloneReasonsSet) {
        return false;
    }

    private Set<CloneReason> getCloneReasons(AstRoot a, AstRoot b) {

        Set<CloneReason> cloneReasons = new HashSet<>();



        return null;
    }

    // 1. controller
        // arguments, return entity, security roles, http method
    private Set<CloneReason> getControllerClones(ControllerMethod a, ControllerMethod b){
        Set<CloneReason> cloneReasons = new HashSet<>();

        if (this.argumentsComparator.compare(a.getArguments(), b.getArguments())) {
            cloneReasons.add(CloneReason.ARGUMENT);
        }

        //if ()

        this.returnEntityComparator.compare(a.getReturnEntity(), b.getReturnEntity());



        return null;
    }



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
