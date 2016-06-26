package com.calin.modelview;

import java.util.ArrayList;

/**
 * Created by Calin on 6/26/2016.
 */
public class SplitResult {
    private ArrayList<PersonResult> personResults;

    public SplitResult(ArrayList<PersonResult> personResults) {
        this.personResults = personResults;
    }

    public SplitResult() {
    }

    public ArrayList<PersonResult> getPersonResults() {
        return personResults;
    }

    public void setPersonResults(ArrayList<PersonResult> personResults) {
        this.personResults = personResults;
    }
}
