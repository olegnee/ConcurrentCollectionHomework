package com.company;

public class ClientsProblem {
    private boolean isSolved;

    public ClientsProblem(boolean isSolved) {
        this.isSolved = isSolved;
    }

    public boolean isSolved() {
        return isSolved;
    }

    public void setSolved(boolean solved) {
        isSolved = solved;
    }
}
