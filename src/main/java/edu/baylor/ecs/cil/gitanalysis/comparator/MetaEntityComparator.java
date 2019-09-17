package edu.baylor.ecs.cil.gitanalysis.comparator;

import edu.baylor.ecs.cil.ccmm.properties.MetaEntity;
import edu.baylor.ecs.cil.ccmm.properties.MetaEntityMapping;

import java.util.List;

public class MetaEntityComparator{

    private List<MetaEntityMapping> metaEntityMappings;

    public MetaEntityComparator(List<MetaEntityMapping> metaEntityMapping){
        this.metaEntityMappings = metaEntityMapping;
    }

    public int compare(MetaEntity a, MetaEntity b) {
        return metaEntityMappings
                .stream()
                .filter(n -> (n.getA().equals(b) && n.getB().equals(a) ) || n.getA().equals(a) && n.getB().equals(b))
                .toArray()
                .length;
    }
}
