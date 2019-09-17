package edu.baylor.ecs.cil.gitanalysis.model;


import edu.baylor.ecs.cil.ccmm.AstRoot;
import edu.baylor.ecs.cil.gitanalysis.clonereasons.CloneReason;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

@Data
@AllArgsConstructor
public class CodeCloneMap {

    private AstRoot codeCloneA;
    private AstRoot codeCloneB;

    private Set<CloneReason> controllerCodeReasons;
    private Set<CloneReason> databaseCodeReasons;
    //private Set<CloneReason>
}
