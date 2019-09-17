package edu.baylor.ecs.cil.gitanalysis.model;

import lombok.Data;

import java.util.List;

@Data
public class CodeCloneList {

    private List<CodeCloneMap> codeCloneMapList;

    public void add(CodeCloneMap codeCloneMap){
        this.codeCloneMapList.add(codeCloneMap);
    }
}
