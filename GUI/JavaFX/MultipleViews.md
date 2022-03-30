# Multiple Views
* Generally, the views are created as Scene objects and transitioning between them happens with events bound to the application.
```
public void start(Stage window) {
	Button back = new Button("Back ..");
	Button forth = new Button(".. forth");

	Scene first = new Scene(back);
	Scene second = new Scene(first);

	back.setOnAction((event) -> {
		window.setScene(second);
	});

	forth.setOnAction((event) -> {
		window.setScene(first);
	});

	window.setScene(first);
	window.show();
}
```
