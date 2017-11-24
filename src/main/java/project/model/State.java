package project.model;

public enum State {
    INICIADO("INICIADO"), PENDENTE("PENDENTE"), CANCELADO("CANCELADO"), FINALIZADO("FINALIZADO");

    private String state;
    State(String state) {
        this.state = state;
    }

    public String getState(){
        return this.state;
    }
}
