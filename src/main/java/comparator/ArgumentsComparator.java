package comparator;

import edu.baylor.ecs.cil.ccmm.properties.MetaEntity;

import java.util.List;

public class ArgumentsComparator {

    private MetaEntityComparator metaEntityComparator;

    public ArgumentsComparator(MetaEntityComparator metaEntityComparator){
        this.metaEntityComparator = metaEntityComparator;
    }

    public int compare(List<MetaEntity> metaEntitiesA, List<MetaEntity> metaEntitiesB){
        int counter = 0;
        for (int i = 0; i < metaEntitiesA.size(); i++){
            for (int j = 0; j < metaEntitiesB.size(); j++){
                counter += metaEntityComparator.compare(metaEntitiesA.get(i), metaEntitiesB.get(j));
            }
        }
        return (counter > 0) ? 1 : 0;
    }

}
