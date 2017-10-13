package org.hibernate.example;

import javax.persistence.Embeddable;

@Embeddable
public class OtherEmbeddable {
    private String myField;

    public String getMyField() {
        return myField;
    }

    public void setMyField(String myField) {
        this.myField = myField;
    }
}
