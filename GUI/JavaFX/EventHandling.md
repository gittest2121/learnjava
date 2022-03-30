# Event Handling
* Button presses are handled using a class that implements the *EventHandler* interface. The type of event in cases like (such as user presses a button) is *ActionEvent.*

* EventHandler -- handle UI components when a certain event occurs
* ActionEvent -- action taken when event happened.
```
button.setOnAction(new EventHandler<ActionEvent>()) {

	@Override
	public void handle(ActionEvent event) {
		System.out.println("Pressed!");
	}
}

// using lambda expressions
// shorthand notations for anonymous methods that are not a part of a class or an interface (no owner)
button.setOnAction((event) -> {
	System.out.println("Pressed!");
});
```

* Event handlers attached to UI components, such as EventHandler used previously, are always connected to specific UI components.
* Whenever an action is performed on a UI component, each of the event handlers attached to that particular component is called and the functionality written for them is executed.
* The event handler beign used depends on what kind of UI component we attach it to.
* Listen to changes made to a text field character by character -- ChangeListener
```
leftText.Property().addListener(new ChangeListener<String>() {
	@Override
	public void changed(ObservableValue<? extends String> change, String old value, String newValue) {

		System.out.println(oldValue + " -> " + newValue);
		oldValue.setText(newValue);
	}
});

// using lambda expressions
leftText.textProperty().addListener((change, oldValue, newValue) -> {
	System.out.println(oldValue + " -> " + newValue);
	rightText.setText(newValue);
});


// statistics? Yes
leftText.textProperty().addListener((change, oldValue, newValue) -> {
	int characters = newValue.length();
	String[] parts = newValue.split(" ");
	int words = parts.length;
	String longest = Arrays.stream(parts)
		.sorted((s1, s2) -> s2.length() - s1.length())
		.findFirst();
		.get();
});
```
