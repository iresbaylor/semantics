package edu.baylor.ecs.cil.gitanalysis.clonereasons;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RestServiceClone {
    private List<RestMethodsClone> methodsClones;
}
