package com.codewithmosh.mediator;

public class RegistrationForm {
    private TextBox usernameTextBox = new TextBox();
    private TextBox passwordTextBox = new TextBox();
    private CheckBox checkBox = new CheckBox();
    private Button button = new Button();

    public RegistrationForm() {
        this.usernameTextBox.addEventHandler(this::usernameEntered);
        this.passwordTextBox.addEventHandler(this::passwordEntered);
        this.checkBox.addEventHandler(this::checkBoxChecked);
    }

    private void checkBoxChecked() {
        if (!usernameTextBox.getContent().isEmpty()
                && !passwordTextBox.getContent().isEmpty()){
            button.setEnabled(true);
        }

    }

    private void passwordEntered() {
    }

    private void usernameEntered() {
    }

}
