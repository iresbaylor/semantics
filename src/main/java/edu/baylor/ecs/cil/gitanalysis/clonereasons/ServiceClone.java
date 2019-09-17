package edu.baylor.ecs.cil.gitanalysis.clonereasons;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class ServiceClone {

    List<MethodsClone> methodsClones;
}
