package edu.baylor.ecs.cil.gitanalysis.comparator;

import edu.baylor.ecs.cil.ccmm.properties.MetaEntity;

import java.util.ArrayList;
import java.util.List;

public class ArgumentsComparator {

    private MetaEntityComparator metaEntityComparator;

    public ArgumentsComparator(MetaEntityComparator metaEntityComparator){
        this.metaEntityComparator = metaEntityComparator;
    }

    public List<MetaEntity> compare(List<MetaEntity> metaEntitiesA, List<MetaEntity> metaEntitiesB){
        List<MetaEntity> same = new ArrayList<>();
        for (int i = 0; i < metaEntitiesA.size(); i++){
            for (int j = 0; j < metaEntitiesB.size(); j++){
                 if (metaEntityComparator.compare(metaEntitiesA.get(i), metaEntitiesB.get(j)) > 0){
                     same.addAll(metaEntitiesA);
                 }
            }
        }
        return same;
    }

}
