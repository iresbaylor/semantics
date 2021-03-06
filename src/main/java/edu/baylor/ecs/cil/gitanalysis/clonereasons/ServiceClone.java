package edu.baylor.ecs.cil.gitanalysis.clonereasons;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServiceClone {

    private List<MethodsClone> methodsClones;
}
