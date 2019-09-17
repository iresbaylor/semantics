package model;


import edu.baylor.ecs.cil.ccmm.AstRoot;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CodeCloneMap {

    private AstRoot codeCloneA;
    private AstRoot codeCloneB;



}
