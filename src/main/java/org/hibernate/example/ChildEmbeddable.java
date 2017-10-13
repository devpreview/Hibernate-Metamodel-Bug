package org.hibernate.example;

import javax.persistence.Embeddable;

@Embeddable
public class ChildEmbeddable extends ParentEmbeddable<MyTypeImpl> {
}
