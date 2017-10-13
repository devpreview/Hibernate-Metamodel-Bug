package org.hibernate.example;

import javax.persistence.Embeddable;
import java.util.Set;

@Embeddable
public class ParentEmbeddable<MyType extends MyTypeInterface> {
    private Set<MyType> fields;

    public Set<MyType> getFields() {
        return fields;
    }

    public void setFields(Set<MyType> fields) {
        this.fields = fields;
    }

}
