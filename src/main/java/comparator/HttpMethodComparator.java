package comparator;

import edu.baylor.ecs.cil.ccmm.properties.HttpMethod;

public class HttpMethodComparator {

    public int compare(HttpMethod a, HttpMethod b){
        return (a.equals(b)) ? 1 : 0;
    }

}
