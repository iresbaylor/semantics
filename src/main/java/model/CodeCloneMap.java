package model;


import edu.baylor.ecs.cil.ccmm.actions.IBaseStatement;
import lombok.Data;

@Data
public class CodeCloneMap {

    private IBaseStatement codeCloneA;
    private IBaseStatement codeCloneB;

}
