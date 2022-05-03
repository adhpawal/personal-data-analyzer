package checks;

import org.sonar.check.Rule;
import org.sonar.plugins.java.api.IssuableSubscriptionVisitor;
import org.sonar.plugins.java.api.tree.Tree.Kind;


import java.util.Collections;
import java.util.List;

@Rule(key = "PersonalDataRule")
public class PersonalDataRule extends IssuableSubscriptionVisitor {

    @Override
    public List<Kind> nodesToVisit() {
        return Collections.emptyList();
    }
}
