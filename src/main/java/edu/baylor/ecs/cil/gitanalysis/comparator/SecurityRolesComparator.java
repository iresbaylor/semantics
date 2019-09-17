package edu.baylor.ecs.cil.gitanalysis.comparator;

import java.util.List;

public class SecurityRolesComparator {

    public int compare(List<String> rolesA, List<String> rolesB){
        int counter = 0;
        for (int i = 0; i < rolesA.size(); i++){
            for (int j = 0; j < rolesB.size(); j++){
                counter += (rolesA.get(i).equals(rolesB.get(j))) ? 1 : 0;
            }
        }
        return (counter > 0) ? 1 : 0;
    }

}
