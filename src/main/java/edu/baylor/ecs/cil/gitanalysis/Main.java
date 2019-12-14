package edu.baylor.ecs.cil.gitanalysis;

import com.google.gson.Gson;
import edu.baylor.ecs.cil.ccmm.AstMesh;
import edu.baylor.ecs.cil.ccmm.properties.MetaEntityMapping;
import edu.baylor.ecs.cil.gitanalysis.model.CodeCloneList;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();
        List<MetaEntityMapping> metaEntityMappings = (List<MetaEntityMapping>) gson.fromJson("metaEntityMapping.json", List.class);
        MainComparator mainComparator = new MainComparator(metaEntityMappings);
        AstMesh astMesh = gson.fromJson("metaEntityMapping.json", AstMesh.class);
        CodeCloneList codeCloneList = mainComparator.getCodeClones(astMesh);
        

    }
}
